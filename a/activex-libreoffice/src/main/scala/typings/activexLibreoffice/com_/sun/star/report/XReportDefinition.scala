package typings.activexLibreoffice.com_.sun.star.report

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.Point
import typings.activexLibreoffice.com_.sun.star.awt.Size
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.activexLibreoffice.com_.sun.star.document.XDocumentSubStorageSupplier
import typings.activexLibreoffice.com_.sun.star.document.XEventBroadcaster
import typings.activexLibreoffice.com_.sun.star.document.XStorageBasedDocument
import typings.activexLibreoffice.com_.sun.star.document.XStorageChangeListener
import typings.activexLibreoffice.com_.sun.star.document.XViewDataSupplier
import typings.activexLibreoffice.com_.sun.star.embed.VisualRepresentation
import typings.activexLibreoffice.com_.sun.star.embed.XStorage
import typings.activexLibreoffice.com_.sun.star.embed.XVisualObject
import typings.activexLibreoffice.com_.sun.star.frame.XController
import typings.activexLibreoffice.com_.sun.star.frame.XLoadable
import typings.activexLibreoffice.com_.sun.star.frame.XModel
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.sdbc.XConnection
import typings.activexLibreoffice.com_.sun.star.style.XStyleFamiliesSupplier
import typings.activexLibreoffice.com_.sun.star.ui.XUIConfigurationManager
import typings.activexLibreoffice.com_.sun.star.ui.XUIConfigurationManagerSupplier
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.activexLibreoffice.com_.sun.star.util.XCloneable
import typings.activexLibreoffice.com_.sun.star.util.XCloseListener
import typings.activexLibreoffice.com_.sun.star.util.XCloseable
import typings.activexLibreoffice.com_.sun.star.util.XModifiable2
import typings.activexLibreoffice.com_.sun.star.util.XModifyListener
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * identifies a {@link XReportComponent} as being a (sub-) report.
  *
  * This interface does not really provide an own functionality, it is only for easier runtime identification of report components.
  *
  * A report fulfills several tasks, like storing the structure of its report components and it provides the event environment for its contained elements.
  * @see XReportComponent
  */
@js.native
trait XReportDefinition
  extends XReportComponent
     with XModel
     with XLoadable
     with XVisualObject
     with XStorageBasedDocument
     with XViewDataSupplier
     with XCloseable
     with XUIConfigurationManagerSupplier
     with XDocumentSubStorageSupplier
     with XStyleFamiliesSupplier
     with XModifiable2
     with XFunctionsSupplier {
  /** specifies the active connection which is used to create the resulting report. */
  var ActiveConnection: XConnection = js.native
  /** returns a sequence of the currently supported output formats. */
  val AvailableMimeTypes: SafeArray[String] = js.native
  /** Represents the title of the report in print preview. */
  var Caption: String = js.native
  /**
    * is the command which should be executed, the type of command depends on the CommandType.
    *
    * In case of a {@link CommandType} of CommandType::COMMAND, means in case the {@link Command} specifies an SQL statement, the inherited {@link
    * com.sun.star.sdbc.RowSet.EscapeProcessing} becomes relevant: ;  It then can be to used to specify whether the SQL statement should be analyzed on the
    * client side before sending it to the database server. ;  The default value for {@link com.sun.star.sdbc.RowSet.EscapeProcessing} is `TRUE` . By
    * switching it to `FALSE` , you can pass backend-specific SQL statements, which are not standard SQL, to your database.
    * @see com.sun.star.sdb.CommandType
    */
  var Command: String = js.native
  /**
    * specifies the type of the command to be executed to retrieve a result set.
    *
    * {@link Command} needs to be interpreted depending on the value of this property.
    *
    * This property is only meaningful together with the {@link Command} property, thus either **both** or **none** of them are present.
    * @see com.sun.star.sdb.CommandType
    */
  var CommandType: Double = js.native
  /** is the name of the datasource to use, this could be a named datasource or the URL of a data access component. */
  var DataSourceName: String = js.native
  /**
    * returns the detail section.
    * @see XSection
    */
  var Detail: XSection = js.native
  /**
    * specifies if the {@link Command} should be analyzed on the client side before sending it to the database server.
    *
    * The default value of this property is `TRUE` . By switching it to `FALSE` , you can pass backend-specific SQL statements, which are not standard SQL,
    * to your database.
    *
    * This property is usually present together with the {@link Command} and {@link CommandType} properties, and is evaluated if and only if {@link
    * CommandType} equals CommandType::COMMAND.
    */
  var EscapeProcessing: Boolean = js.native
  /**
    * makes it possible to register listeners which are called whenever a document event occurs. This is a workaround due to the fact that this interface
    * can not be directly inherited from {@link com.sun.star.document.XEventBroadcaster} because the methods addEventListener and removeEventListener are
    * already defined in {@link com.sun.star.lang.XComponent} . A queryInterface call is still supported to the {@link
    * com.sun.star.document.XEventBroadcaster} interface.
    */
  val EventBroadcaster: XEventBroadcaster = js.native
  /**
    * specifies an additional filter to optionally use.
    *
    * The Filter string has to form a SQL WHERE-clause, **without** the WHERE-string itself.
    *
    * If a {@link DataSourceName} , {@link Command} and {@link CommandType} are specified, a RowSet can be created with this information. If the results
    * provided by the row set are to be additionally filtered, the Filter property can be used.
    *
    * Note that the Filter property does not make sense if a ResultSet has been specified in the DataAccessDescriptor.
    * @see com.sun.star.sdb.RowSet
    * @see ResultSet
    */
  var Filter: String = js.native
  /**
    * Specifies whether groups in a multi column report are kept together.
    * @see com.sun.star.report.GroupKeepTogether
    */
  var GroupKeepTogether: Double = js.native
  /** Represents the groups of the report. */
  var Groups: XGroups = js.native
  /** Represents the output format (media (mime) type) of the resulting document when executing this report. */
  var MimeType: String = js.native
  /**
    * returns the page footer if the {@link PageFooterOn} is `TRUE` .
    * @see XSection
    * @throws com::sun::star::container::NoSuchElementException If the report has the page footer disabled.
    */
  var PageFooter: XSection = js.native
  /** Defines that the page footer is on. Default is `TRUE` . */
  var PageFooterOn: Boolean = js.native
  /**
    * Represents the location of the page footer.
    * @see ReportPrintOption
    */
  var PageFooterOption: Double = js.native
  /**
    * returns the page header if the {@link PageHeaderOn} is `TRUE` .
    * @see XSection
    * @throws com::sun::star::container::NoSuchElementException If the report has the page header disabled.
    */
  var PageHeader: XSection = js.native
  /** Defines that the page header is on. Default is `TRUE` . */
  var PageHeaderOn: Boolean = js.native
  /**
    * Represents the location of the page header.
    * @see ReportPrintOption
    */
  var PageHeaderOption: Double = js.native
  /**
    * returns the report footer if the {@link ReportFooterOn} is `TRUE` .
    * @see XSection
    * @throws com::sun::star::container::NullPointerException If the report has the report footer disabled.
    */
  var ReportFooter: XSection = js.native
  /** Defines that the report footer is on. Default is `FALSE` . */
  var ReportFooterOn: Boolean = js.native
  /**
    * returns the report header if the {@link ReportHeaderOn} is `TRUE` .
    * @see XSection
    * @throws com::sun::star::container::NoSuchElementException If the report has the report header disabled.
    */
  var ReportHeader: XSection = js.native
  /** Defines that the report header is on. Default is `FALSE` . */
  var ReportHeaderOn: Boolean = js.native
  /** returns a sequence of the currently supported output formats. */
  def getAvailableMimeTypes(): SafeArray[String] = js.native
  /**
    * makes it possible to register listeners which are called whenever a document event occurs. This is a workaround due to the fact that this interface
    * can not be directly inherited from {@link com.sun.star.document.XEventBroadcaster} because the methods addEventListener and removeEventListener are
    * already defined in {@link com.sun.star.lang.XComponent} . A queryInterface call is still supported to the {@link
    * com.sun.star.document.XEventBroadcaster} interface.
    */
  def getEventBroadcaster(): XEventBroadcaster = js.native
}

object XReportDefinition {
  @scala.inline
  def apply(
    ActiveConnection: XConnection,
    Args: SafeArray[PropertyValue],
    AvailableMimeTypes: SafeArray[String],
    Caption: String,
    Command: String,
    CommandType: Double,
    ControlBorder: Double,
    ControlBorderColor: Double,
    CurrentController: XController,
    CurrentSelection: XInterface,
    DataSourceName: String,
    Detail: XSection,
    DetailFields: SafeArray[String],
    DocumentStorage: XStorage,
    DocumentSubStoragesNames: SafeArray[String],
    EscapeProcessing: Boolean,
    EventBroadcaster: XEventBroadcaster,
    Filter: String,
    Functions: XFunctions,
    GroupKeepTogether: Double,
    Groups: XGroups,
    Height: Double,
    MasterFields: SafeArray[String],
    MimeType: String,
    Name: String,
    PageFooter: XSection,
    PageFooterOn: Boolean,
    PageFooterOption: Double,
    PageHeader: XSection,
    PageHeaderOn: Boolean,
    PageHeaderOption: Double,
    Parent: XInterface,
    Position: Point,
    PositionX: Double,
    PositionY: Double,
    PrintRepeatedValues: Boolean,
    PropertySetInfo: XPropertySetInfo,
    ReportFooter: XSection,
    ReportFooterOn: Boolean,
    ReportHeader: XSection,
    ReportHeaderOn: Boolean,
    Section: XSection,
    ShapeType: String,
    Size: Size,
    StyleFamilies: XNameAccess,
    UIConfigurationManager: XUIConfigurationManager,
    URL: String,
    ViewData: XIndexAccess,
    Width: Double,
    acquire: () => Unit,
    addCloseListener: XCloseListener => Unit,
    addEventListener: XEventListener => Unit,
    addModifyListener: XModifyListener => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addStorageChangeListener: XStorageChangeListener => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    attachResource: (String, SeqEquiv[PropertyValue]) => Boolean,
    close: Boolean => Unit,
    connectController: XController => Unit,
    createClone: () => XCloneable,
    disableSetModified: () => Boolean,
    disconnectController: XController => Unit,
    dispose: () => Unit,
    enableSetModified: () => Boolean,
    getArgs: () => SafeArray[PropertyValue],
    getAvailableMimeTypes: () => SafeArray[String],
    getCurrentController: () => XController,
    getCurrentSelection: () => XInterface,
    getDocumentStorage: () => XStorage,
    getDocumentSubStorage: (String, Double) => XStorage,
    getDocumentSubStoragesNames: () => SafeArray[String],
    getEventBroadcaster: () => XEventBroadcaster,
    getMapUnit: Double => Double,
    getParent: () => XInterface,
    getPosition: () => Point,
    getPreferredVisualRepresentation: Double => VisualRepresentation,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    getShapeType: () => String,
    getSize: () => Size,
    getStyleFamilies: () => XNameAccess,
    getUIConfigurationManager: () => XUIConfigurationManager,
    getURL: () => String,
    getViewData: () => XIndexAccess,
    getVisualAreaSize: Double => Size,
    hasControllersLocked: () => Boolean,
    initNew: () => Unit,
    isModified: () => Boolean,
    isSetModifiedEnabled: () => Boolean,
    load: SeqEquiv[PropertyValue] => Unit,
    loadFromStorage: (XStorage, SeqEquiv[PropertyValue]) => Unit,
    lockControllers: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeCloseListener: XCloseListener => Unit,
    removeEventListener: XEventListener => Unit,
    removeModifyListener: XModifyListener => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeStorageChangeListener: XStorageChangeListener => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setCurrentController: XController => Unit,
    setModified: Boolean => Unit,
    setParent: XInterface => Unit,
    setPosition: Point => Unit,
    setPropertyValue: (String, js.Any) => Unit,
    setSize: Size => Unit,
    setViewData: XIndexAccess => Unit,
    setVisualAreaSize: (Double, Size) => Unit,
    storeToStorage: (XStorage, SeqEquiv[PropertyValue]) => Unit,
    switchToStorage: XStorage => Unit,
    unlockControllers: () => Unit
  ): XReportDefinition = {
    val __obj = js.Dynamic.literal(ActiveConnection = ActiveConnection.asInstanceOf[js.Any], Args = Args.asInstanceOf[js.Any], AvailableMimeTypes = AvailableMimeTypes.asInstanceOf[js.Any], Caption = Caption.asInstanceOf[js.Any], Command = Command.asInstanceOf[js.Any], CommandType = CommandType.asInstanceOf[js.Any], ControlBorder = ControlBorder.asInstanceOf[js.Any], ControlBorderColor = ControlBorderColor.asInstanceOf[js.Any], CurrentController = CurrentController.asInstanceOf[js.Any], CurrentSelection = CurrentSelection.asInstanceOf[js.Any], DataSourceName = DataSourceName.asInstanceOf[js.Any], Detail = Detail.asInstanceOf[js.Any], DetailFields = DetailFields.asInstanceOf[js.Any], DocumentStorage = DocumentStorage.asInstanceOf[js.Any], DocumentSubStoragesNames = DocumentSubStoragesNames.asInstanceOf[js.Any], EscapeProcessing = EscapeProcessing.asInstanceOf[js.Any], EventBroadcaster = EventBroadcaster.asInstanceOf[js.Any], Filter = Filter.asInstanceOf[js.Any], Functions = Functions.asInstanceOf[js.Any], GroupKeepTogether = GroupKeepTogether.asInstanceOf[js.Any], Groups = Groups.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], MasterFields = MasterFields.asInstanceOf[js.Any], MimeType = MimeType.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PageFooter = PageFooter.asInstanceOf[js.Any], PageFooterOn = PageFooterOn.asInstanceOf[js.Any], PageFooterOption = PageFooterOption.asInstanceOf[js.Any], PageHeader = PageHeader.asInstanceOf[js.Any], PageHeaderOn = PageHeaderOn.asInstanceOf[js.Any], PageHeaderOption = PageHeaderOption.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], PositionX = PositionX.asInstanceOf[js.Any], PositionY = PositionY.asInstanceOf[js.Any], PrintRepeatedValues = PrintRepeatedValues.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], ReportFooter = ReportFooter.asInstanceOf[js.Any], ReportFooterOn = ReportFooterOn.asInstanceOf[js.Any], ReportHeader = ReportHeader.asInstanceOf[js.Any], ReportHeaderOn = ReportHeaderOn.asInstanceOf[js.Any], Section = Section.asInstanceOf[js.Any], ShapeType = ShapeType.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], StyleFamilies = StyleFamilies.asInstanceOf[js.Any], UIConfigurationManager = UIConfigurationManager.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any], ViewData = ViewData.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addCloseListener = js.Any.fromFunction1(addCloseListener), addEventListener = js.Any.fromFunction1(addEventListener), addModifyListener = js.Any.fromFunction1(addModifyListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addStorageChangeListener = js.Any.fromFunction1(addStorageChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), attachResource = js.Any.fromFunction2(attachResource), close = js.Any.fromFunction1(close), connectController = js.Any.fromFunction1(connectController), createClone = js.Any.fromFunction0(createClone), disableSetModified = js.Any.fromFunction0(disableSetModified), disconnectController = js.Any.fromFunction1(disconnectController), dispose = js.Any.fromFunction0(dispose), enableSetModified = js.Any.fromFunction0(enableSetModified), getArgs = js.Any.fromFunction0(getArgs), getAvailableMimeTypes = js.Any.fromFunction0(getAvailableMimeTypes), getCurrentController = js.Any.fromFunction0(getCurrentController), getCurrentSelection = js.Any.fromFunction0(getCurrentSelection), getDocumentStorage = js.Any.fromFunction0(getDocumentStorage), getDocumentSubStorage = js.Any.fromFunction2(getDocumentSubStorage), getDocumentSubStoragesNames = js.Any.fromFunction0(getDocumentSubStoragesNames), getEventBroadcaster = js.Any.fromFunction0(getEventBroadcaster), getMapUnit = js.Any.fromFunction1(getMapUnit), getParent = js.Any.fromFunction0(getParent), getPosition = js.Any.fromFunction0(getPosition), getPreferredVisualRepresentation = js.Any.fromFunction1(getPreferredVisualRepresentation), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getShapeType = js.Any.fromFunction0(getShapeType), getSize = js.Any.fromFunction0(getSize), getStyleFamilies = js.Any.fromFunction0(getStyleFamilies), getUIConfigurationManager = js.Any.fromFunction0(getUIConfigurationManager), getURL = js.Any.fromFunction0(getURL), getViewData = js.Any.fromFunction0(getViewData), getVisualAreaSize = js.Any.fromFunction1(getVisualAreaSize), hasControllersLocked = js.Any.fromFunction0(hasControllersLocked), initNew = js.Any.fromFunction0(initNew), isModified = js.Any.fromFunction0(isModified), isSetModifiedEnabled = js.Any.fromFunction0(isSetModifiedEnabled), load = js.Any.fromFunction1(load), loadFromStorage = js.Any.fromFunction2(loadFromStorage), lockControllers = js.Any.fromFunction0(lockControllers), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeCloseListener = js.Any.fromFunction1(removeCloseListener), removeEventListener = js.Any.fromFunction1(removeEventListener), removeModifyListener = js.Any.fromFunction1(removeModifyListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeStorageChangeListener = js.Any.fromFunction1(removeStorageChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setCurrentController = js.Any.fromFunction1(setCurrentController), setModified = js.Any.fromFunction1(setModified), setParent = js.Any.fromFunction1(setParent), setPosition = js.Any.fromFunction1(setPosition), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setSize = js.Any.fromFunction1(setSize), setViewData = js.Any.fromFunction1(setViewData), setVisualAreaSize = js.Any.fromFunction2(setVisualAreaSize), storeToStorage = js.Any.fromFunction2(storeToStorage), switchToStorage = js.Any.fromFunction1(switchToStorage), unlockControllers = js.Any.fromFunction0(unlockControllers))
    __obj.asInstanceOf[XReportDefinition]
  }
  @scala.inline
  implicit class XReportDefinitionOps[Self <: XReportDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActiveConnection(value: XConnection): Self = this.set("ActiveConnection", value.asInstanceOf[js.Any])
    @scala.inline
    def setAvailableMimeTypes(value: SafeArray[String]): Self = this.set("AvailableMimeTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def setCaption(value: String): Self = this.set("Caption", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommand(value: String): Self = this.set("Command", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommandType(value: Double): Self = this.set("CommandType", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataSourceName(value: String): Self = this.set("DataSourceName", value.asInstanceOf[js.Any])
    @scala.inline
    def setDetail(value: XSection): Self = this.set("Detail", value.asInstanceOf[js.Any])
    @scala.inline
    def setEscapeProcessing(value: Boolean): Self = this.set("EscapeProcessing", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventBroadcaster(value: XEventBroadcaster): Self = this.set("EventBroadcaster", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilter(value: String): Self = this.set("Filter", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroupKeepTogether(value: Double): Self = this.set("GroupKeepTogether", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroups(value: XGroups): Self = this.set("Groups", value.asInstanceOf[js.Any])
    @scala.inline
    def setMimeType(value: String): Self = this.set("MimeType", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageFooter(value: XSection): Self = this.set("PageFooter", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageFooterOn(value: Boolean): Self = this.set("PageFooterOn", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageFooterOption(value: Double): Self = this.set("PageFooterOption", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageHeader(value: XSection): Self = this.set("PageHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageHeaderOn(value: Boolean): Self = this.set("PageHeaderOn", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageHeaderOption(value: Double): Self = this.set("PageHeaderOption", value.asInstanceOf[js.Any])
    @scala.inline
    def setReportFooter(value: XSection): Self = this.set("ReportFooter", value.asInstanceOf[js.Any])
    @scala.inline
    def setReportFooterOn(value: Boolean): Self = this.set("ReportFooterOn", value.asInstanceOf[js.Any])
    @scala.inline
    def setReportHeader(value: XSection): Self = this.set("ReportHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def setReportHeaderOn(value: Boolean): Self = this.set("ReportHeaderOn", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetAvailableMimeTypes(value: () => SafeArray[String]): Self = this.set("getAvailableMimeTypes", js.Any.fromFunction0(value))
    @scala.inline
    def setGetEventBroadcaster(value: () => XEventBroadcaster): Self = this.set("getEventBroadcaster", js.Any.fromFunction0(value))
  }
  
}

