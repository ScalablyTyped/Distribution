package typings.activexDashLibreoffice.comNs.sunNs.starNs.reportNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.Point
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.Size
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XIndexAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.documentNs.XDocumentSubStorageSupplier
import typings.activexDashLibreoffice.comNs.sunNs.starNs.documentNs.XEventBroadcaster
import typings.activexDashLibreoffice.comNs.sunNs.starNs.documentNs.XStorageBasedDocument
import typings.activexDashLibreoffice.comNs.sunNs.starNs.documentNs.XStorageChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.documentNs.XViewDataSupplier
import typings.activexDashLibreoffice.comNs.sunNs.starNs.embedNs.VisualRepresentation
import typings.activexDashLibreoffice.comNs.sunNs.starNs.embedNs.XStorage
import typings.activexDashLibreoffice.comNs.sunNs.starNs.embedNs.XVisualObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs.XController
import typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs.XLoadable
import typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs.XModel
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcNs.XConnection
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.XStyleFamiliesSupplier
import typings.activexDashLibreoffice.comNs.sunNs.starNs.uiNs.XUIConfigurationManager
import typings.activexDashLibreoffice.comNs.sunNs.starNs.uiNs.XUIConfigurationManagerSupplier
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XCloneable
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XCloseListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XCloseable
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XModifiable2
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XModifyListener
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
  var ActiveConnection: XConnection
  /** returns a sequence of the currently supported output formats. */
  val AvailableMimeTypes: SafeArray[String]
  /** Represents the title of the report in print preview. */
  var Caption: String
  /**
    * is the command which should be executed, the type of command depends on the CommandType.
    *
    * In case of a {@link CommandType} of CommandType::COMMAND, means in case the {@link Command} specifies an SQL statement, the inherited {@link
    * com.sun.star.sdbc.RowSet.EscapeProcessing} becomes relevant: ;  It then can be to used to specify whether the SQL statement should be analyzed on the
    * client side before sending it to the database server. ;  The default value for {@link com.sun.star.sdbc.RowSet.EscapeProcessing} is `TRUE` . By
    * switching it to `FALSE` , you can pass backend-specific SQL statements, which are not standard SQL, to your database.
    * @see com.sun.star.sdb.CommandType
    */
  var Command: String
  /**
    * specifies the type of the command to be executed to retrieve a result set.
    *
    * {@link Command} needs to be interpreted depending on the value of this property.
    *
    * This property is only meaningful together with the {@link Command} property, thus either **both** or **none** of them are present.
    * @see com.sun.star.sdb.CommandType
    */
  var CommandType: Double
  /** is the name of the datasource to use, this could be a named datasource or the URL of a data access component. */
  var DataSourceName: String
  /**
    * returns the detail section.
    * @see XSection
    */
  var Detail: XSection
  /**
    * specifies if the {@link Command} should be analyzed on the client side before sending it to the database server.
    *
    * The default value of this property is `TRUE` . By switching it to `FALSE` , you can pass backend-specific SQL statements, which are not standard SQL,
    * to your database.
    *
    * This property is usually present together with the {@link Command} and {@link CommandType} properties, and is evaluated if and only if {@link
    * CommandType} equals CommandType::COMMAND.
    */
  var EscapeProcessing: Boolean
  /**
    * makes it possible to register listeners which are called whenever a document event occurs. This is a workaround due to the fact that this interface
    * can not be directly inherited from {@link com.sun.star.document.XEventBroadcaster} because the methods addEventListener and removeEventListener are
    * already defined in {@link com.sun.star.lang.XComponent} . A queryInterface call is still supported to the {@link
    * com.sun.star.document.XEventBroadcaster} interface.
    */
  val EventBroadcaster: XEventBroadcaster
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
  var Filter: String
  /**
    * Specifies whether groups in a multi column report are kept together.
    * @see com.sun.star.report.GroupKeepTogether
    */
  var GroupKeepTogether: Double
  /** Represents the groups of the report. */
  var Groups: XGroups
  /** Represents the output format (media (mime) type) of the resulting document when executing this report. */
  var MimeType: String
  /**
    * returns the page footer if the {@link PageFooterOn} is `TRUE` .
    * @see XSection
    * @throws com::sun::star::container::NoSuchElementException If the report has the page footer disabled.
    */
  var PageFooter: XSection
  /** Defines that the page footer is on. Default is `TRUE` . */
  var PageFooterOn: Boolean
  /**
    * Represents the location of the page footer.
    * @see ReportPrintOption
    */
  var PageFooterOption: Double
  /**
    * returns the page header if the {@link PageHeaderOn} is `TRUE` .
    * @see XSection
    * @throws com::sun::star::container::NoSuchElementException If the report has the page header disabled.
    */
  var PageHeader: XSection
  /** Defines that the page header is on. Default is `TRUE` . */
  var PageHeaderOn: Boolean
  /**
    * Represents the location of the page header.
    * @see ReportPrintOption
    */
  var PageHeaderOption: Double
  /**
    * returns the report footer if the {@link ReportFooterOn} is `TRUE` .
    * @see XSection
    * @throws com::sun::star::container::NullPointerException If the report has the report footer disabled.
    */
  var ReportFooter: XSection
  /** Defines that the report footer is on. Default is `FALSE` . */
  var ReportFooterOn: Boolean
  /**
    * returns the report header if the {@link ReportHeaderOn} is `TRUE` .
    * @see XSection
    * @throws com::sun::star::container::NoSuchElementException If the report has the report header disabled.
    */
  var ReportHeader: XSection
  /** Defines that the report header is on. Default is `FALSE` . */
  var ReportHeaderOn: Boolean
  /** returns a sequence of the currently supported output formats. */
  def getAvailableMimeTypes(): SafeArray[String]
  /**
    * makes it possible to register listeners which are called whenever a document event occurs. This is a workaround due to the fact that this interface
    * can not be directly inherited from {@link com.sun.star.document.XEventBroadcaster} because the methods addEventListener and removeEventListener are
    * already defined in {@link com.sun.star.lang.XComponent} . A queryInterface call is still supported to the {@link
    * com.sun.star.document.XEventBroadcaster} interface.
    */
  def getEventBroadcaster(): XEventBroadcaster
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
    val __obj = js.Dynamic.literal(ActiveConnection = ActiveConnection, Args = Args, AvailableMimeTypes = AvailableMimeTypes, Caption = Caption, Command = Command, CommandType = CommandType, ControlBorder = ControlBorder, ControlBorderColor = ControlBorderColor, CurrentController = CurrentController, CurrentSelection = CurrentSelection, DataSourceName = DataSourceName, Detail = Detail, DetailFields = DetailFields, DocumentStorage = DocumentStorage, DocumentSubStoragesNames = DocumentSubStoragesNames, EscapeProcessing = EscapeProcessing, EventBroadcaster = EventBroadcaster, Filter = Filter, Functions = Functions, GroupKeepTogether = GroupKeepTogether, Groups = Groups, Height = Height, MasterFields = MasterFields, MimeType = MimeType, Name = Name, PageFooter = PageFooter, PageFooterOn = PageFooterOn, PageFooterOption = PageFooterOption, PageHeader = PageHeader, PageHeaderOn = PageHeaderOn, PageHeaderOption = PageHeaderOption, Parent = Parent, Position = Position, PositionX = PositionX, PositionY = PositionY, PrintRepeatedValues = PrintRepeatedValues, PropertySetInfo = PropertySetInfo, ReportFooter = ReportFooter, ReportFooterOn = ReportFooterOn, ReportHeader = ReportHeader, ReportHeaderOn = ReportHeaderOn, Section = Section, ShapeType = ShapeType, Size = Size, StyleFamilies = StyleFamilies, UIConfigurationManager = UIConfigurationManager, URL = URL, ViewData = ViewData, Width = Width, acquire = js.Any.fromFunction0(acquire), addCloseListener = js.Any.fromFunction1(addCloseListener), addEventListener = js.Any.fromFunction1(addEventListener), addModifyListener = js.Any.fromFunction1(addModifyListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addStorageChangeListener = js.Any.fromFunction1(addStorageChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), attachResource = js.Any.fromFunction2(attachResource), close = js.Any.fromFunction1(close), connectController = js.Any.fromFunction1(connectController), createClone = js.Any.fromFunction0(createClone), disableSetModified = js.Any.fromFunction0(disableSetModified), disconnectController = js.Any.fromFunction1(disconnectController), dispose = js.Any.fromFunction0(dispose), enableSetModified = js.Any.fromFunction0(enableSetModified), getArgs = js.Any.fromFunction0(getArgs), getAvailableMimeTypes = js.Any.fromFunction0(getAvailableMimeTypes), getCurrentController = js.Any.fromFunction0(getCurrentController), getCurrentSelection = js.Any.fromFunction0(getCurrentSelection), getDocumentStorage = js.Any.fromFunction0(getDocumentStorage), getDocumentSubStorage = js.Any.fromFunction2(getDocumentSubStorage), getDocumentSubStoragesNames = js.Any.fromFunction0(getDocumentSubStoragesNames), getEventBroadcaster = js.Any.fromFunction0(getEventBroadcaster), getMapUnit = js.Any.fromFunction1(getMapUnit), getParent = js.Any.fromFunction0(getParent), getPosition = js.Any.fromFunction0(getPosition), getPreferredVisualRepresentation = js.Any.fromFunction1(getPreferredVisualRepresentation), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getShapeType = js.Any.fromFunction0(getShapeType), getSize = js.Any.fromFunction0(getSize), getStyleFamilies = js.Any.fromFunction0(getStyleFamilies), getUIConfigurationManager = js.Any.fromFunction0(getUIConfigurationManager), getURL = js.Any.fromFunction0(getURL), getViewData = js.Any.fromFunction0(getViewData), getVisualAreaSize = js.Any.fromFunction1(getVisualAreaSize), hasControllersLocked = js.Any.fromFunction0(hasControllersLocked), initNew = js.Any.fromFunction0(initNew), isModified = js.Any.fromFunction0(isModified), isSetModifiedEnabled = js.Any.fromFunction0(isSetModifiedEnabled), load = js.Any.fromFunction1(load), loadFromStorage = js.Any.fromFunction2(loadFromStorage), lockControllers = js.Any.fromFunction0(lockControllers), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeCloseListener = js.Any.fromFunction1(removeCloseListener), removeEventListener = js.Any.fromFunction1(removeEventListener), removeModifyListener = js.Any.fromFunction1(removeModifyListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeStorageChangeListener = js.Any.fromFunction1(removeStorageChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setCurrentController = js.Any.fromFunction1(setCurrentController), setModified = js.Any.fromFunction1(setModified), setParent = js.Any.fromFunction1(setParent), setPosition = js.Any.fromFunction1(setPosition), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setSize = js.Any.fromFunction1(setSize), setViewData = js.Any.fromFunction1(setViewData), setVisualAreaSize = js.Any.fromFunction2(setVisualAreaSize), storeToStorage = js.Any.fromFunction2(storeToStorage), switchToStorage = js.Any.fromFunction1(switchToStorage), unlockControllers = js.Any.fromFunction0(unlockControllers))
  
    __obj.asInstanceOf[XReportDefinition]
  }
}

