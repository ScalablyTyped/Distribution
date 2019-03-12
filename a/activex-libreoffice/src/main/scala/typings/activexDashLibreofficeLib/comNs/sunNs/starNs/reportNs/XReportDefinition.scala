package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reportNs

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
     with activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XModel
     with activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XLoadable
     with activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XVisualObject
     with activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.XStorageBasedDocument
     with activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.XViewDataSupplier
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XCloseable
     with activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.XUIConfigurationManagerSupplier
     with activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.XDocumentSubStorageSupplier
     with activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.XStyleFamiliesSupplier
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModifiable2
     with XFunctionsSupplier {
  /** specifies the active connection which is used to create the resulting report. */
  var ActiveConnection: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XConnection
  /** returns a sequence of the currently supported output formats. */
  val AvailableMimeTypes: stdLib.SafeArray[java.lang.String]
  /** Represents the title of the report in print preview. */
  var Caption: java.lang.String
  /**
    * is the command which should be executed, the type of command depends on the CommandType.
    *
    * In case of a {@link CommandType} of CommandType::COMMAND, means in case the {@link Command} specifies an SQL statement, the inherited {@link
    * com.sun.star.sdbc.RowSet.EscapeProcessing} becomes relevant: ;  It then can be to used to specify whether the SQL statement should be analyzed on the
    * client side before sending it to the database server. ;  The default value for {@link com.sun.star.sdbc.RowSet.EscapeProcessing} is `TRUE` . By
    * switching it to `FALSE` , you can pass backend-specific SQL statements, which are not standard SQL, to your database.
    * @see com.sun.star.sdb.CommandType
    */
  var Command: java.lang.String
  /**
    * specifies the type of the command to be executed to retrieve a result set.
    *
    * {@link Command} needs to be interpreted depending on the value of this property.
    *
    * This property is only meaningful together with the {@link Command} property, thus either **both** or **none** of them are present.
    * @see com.sun.star.sdb.CommandType
    */
  var CommandType: scala.Double
  /** is the name of the datasource to use, this could be a named datasource or the URL of a data access component. */
  var DataSourceName: java.lang.String
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
  var EscapeProcessing: scala.Boolean
  /**
    * makes it possible to register listeners which are called whenever a document event occurs. This is a workaround due to the fact that this interface
    * can not be directly inherited from {@link com.sun.star.document.XEventBroadcaster} because the methods addEventListener and removeEventListener are
    * already defined in {@link com.sun.star.lang.XComponent} . A queryInterface call is still supported to the {@link
    * com.sun.star.document.XEventBroadcaster} interface.
    */
  val EventBroadcaster: activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.XEventBroadcaster
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
  var Filter: java.lang.String
  /**
    * Specifies whether groups in a multi column report are kept together.
    * @see com.sun.star.report.GroupKeepTogether
    */
  var GroupKeepTogether: scala.Double
  /** Represents the groups of the report. */
  var Groups: XGroups
  /** Represents the output format (media (mime) type) of the resulting document when executing this report. */
  var MimeType: java.lang.String
  /**
    * returns the page footer if the {@link PageFooterOn} is `TRUE` .
    * @see XSection
    * @throws com::sun::star::container::NoSuchElementException If the report has the page footer disabled.
    */
  var PageFooter: XSection
  /** Defines that the page footer is on. Default is `TRUE` . */
  var PageFooterOn: scala.Boolean
  /**
    * Represents the location of the page footer.
    * @see ReportPrintOption
    */
  var PageFooterOption: scala.Double
  /**
    * returns the page header if the {@link PageHeaderOn} is `TRUE` .
    * @see XSection
    * @throws com::sun::star::container::NoSuchElementException If the report has the page header disabled.
    */
  var PageHeader: XSection
  /** Defines that the page header is on. Default is `TRUE` . */
  var PageHeaderOn: scala.Boolean
  /**
    * Represents the location of the page header.
    * @see ReportPrintOption
    */
  var PageHeaderOption: scala.Double
  /**
    * returns the report footer if the {@link ReportFooterOn} is `TRUE` .
    * @see XSection
    * @throws com::sun::star::container::NullPointerException If the report has the report footer disabled.
    */
  var ReportFooter: XSection
  /** Defines that the report footer is on. Default is `FALSE` . */
  var ReportFooterOn: scala.Boolean
  /**
    * returns the report header if the {@link ReportHeaderOn} is `TRUE` .
    * @see XSection
    * @throws com::sun::star::container::NoSuchElementException If the report has the report header disabled.
    */
  var ReportHeader: XSection
  /** Defines that the report header is on. Default is `FALSE` . */
  var ReportHeaderOn: scala.Boolean
  /** returns a sequence of the currently supported output formats. */
  def getAvailableMimeTypes(): stdLib.SafeArray[java.lang.String]
  /**
    * makes it possible to register listeners which are called whenever a document event occurs. This is a workaround due to the fact that this interface
    * can not be directly inherited from {@link com.sun.star.document.XEventBroadcaster} because the methods addEventListener and removeEventListener are
    * already defined in {@link com.sun.star.lang.XComponent} . A queryInterface call is still supported to the {@link
    * com.sun.star.document.XEventBroadcaster} interface.
    */
  def getEventBroadcaster(): activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.XEventBroadcaster
}

object XReportDefinition {
  @scala.inline
  def apply(
    ActiveConnection: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XConnection,
    Args: stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    AvailableMimeTypes: stdLib.SafeArray[java.lang.String],
    Caption: java.lang.String,
    Command: java.lang.String,
    CommandType: scala.Double,
    ControlBorder: scala.Double,
    ControlBorderColor: scala.Double,
    CurrentController: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XController,
    CurrentSelection: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    DataSourceName: java.lang.String,
    Detail: XSection,
    DetailFields: stdLib.SafeArray[java.lang.String],
    DocumentStorage: activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage,
    DocumentSubStoragesNames: stdLib.SafeArray[java.lang.String],
    EscapeProcessing: scala.Boolean,
    EventBroadcaster: activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.XEventBroadcaster,
    Filter: java.lang.String,
    Functions: XFunctions,
    GroupKeepTogether: scala.Double,
    Groups: XGroups,
    Height: scala.Double,
    MasterFields: stdLib.SafeArray[java.lang.String],
    MimeType: java.lang.String,
    Name: java.lang.String,
    PageFooter: XSection,
    PageFooterOn: scala.Boolean,
    PageFooterOption: scala.Double,
    PageHeader: XSection,
    PageHeaderOn: scala.Boolean,
    PageHeaderOption: scala.Double,
    Parent: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    Position: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point,
    PositionX: scala.Double,
    PositionY: scala.Double,
    PrintRepeatedValues: scala.Boolean,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    ReportFooter: XSection,
    ReportFooterOn: scala.Boolean,
    ReportHeader: XSection,
    ReportHeaderOn: scala.Boolean,
    Section: XSection,
    ShapeType: java.lang.String,
    Size: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size,
    StyleFamilies: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    UIConfigurationManager: activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.XUIConfigurationManager,
    URL: java.lang.String,
    ViewData: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess,
    Width: scala.Double,
    acquire: () => scala.Unit,
    addCloseListener: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XCloseListener => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    addModifyListener: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModifyListener => scala.Unit,
    addPropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    addStorageChangeListener: activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.XStorageChangeListener => scala.Unit,
    addVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    attachResource: (java.lang.String, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]) => scala.Boolean,
    close: scala.Boolean => scala.Unit,
    connectController: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XController => scala.Unit,
    createClone: () => activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XCloneable,
    disableSetModified: () => scala.Boolean,
    disconnectController: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XController => scala.Unit,
    dispose: () => scala.Unit,
    enableSetModified: () => scala.Boolean,
    getArgs: () => stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    getAvailableMimeTypes: () => stdLib.SafeArray[java.lang.String],
    getCurrentController: () => activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XController,
    getCurrentSelection: () => activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    getDocumentStorage: () => activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage,
    getDocumentSubStorage: (java.lang.String, scala.Double) => activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage,
    getDocumentSubStoragesNames: () => stdLib.SafeArray[java.lang.String],
    getEventBroadcaster: () => activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.XEventBroadcaster,
    getMapUnit: scala.Double => scala.Double,
    getParent: () => activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    getPosition: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point,
    getPreferredVisualRepresentation: scala.Double => activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.VisualRepresentation,
    getPropertySetInfo: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    getPropertyValue: java.lang.String => js.Any,
    getShapeType: () => java.lang.String,
    getSize: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size,
    getStyleFamilies: () => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    getUIConfigurationManager: () => activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.XUIConfigurationManager,
    getURL: () => java.lang.String,
    getViewData: () => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess,
    getVisualAreaSize: scala.Double => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size,
    hasControllersLocked: () => scala.Boolean,
    initNew: () => scala.Unit,
    isModified: () => scala.Boolean,
    isSetModifiedEnabled: () => scala.Boolean,
    load: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue] => scala.Unit,
    loadFromStorage: (activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]) => scala.Unit,
    lockControllers: () => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeCloseListener: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XCloseListener => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    removeModifyListener: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModifyListener => scala.Unit,
    removePropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    removeStorageChangeListener: activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.XStorageChangeListener => scala.Unit,
    removeVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    setCurrentController: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XController => scala.Unit,
    setModified: scala.Boolean => scala.Unit,
    setParent: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface => scala.Unit,
    setPosition: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point => scala.Unit,
    setPropertyValue: (java.lang.String, js.Any) => scala.Unit,
    setSize: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size => scala.Unit,
    setViewData: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess => scala.Unit,
    setVisualAreaSize: (scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size) => scala.Unit,
    storeToStorage: (activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]) => scala.Unit,
    switchToStorage: activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage => scala.Unit,
    unlockControllers: () => scala.Unit
  ): XReportDefinition = {
    val __obj = js.Dynamic.literal(ActiveConnection = ActiveConnection, Args = Args, AvailableMimeTypes = AvailableMimeTypes, Caption = Caption, Command = Command, CommandType = CommandType, ControlBorder = ControlBorder, ControlBorderColor = ControlBorderColor, CurrentController = CurrentController, CurrentSelection = CurrentSelection, DataSourceName = DataSourceName, Detail = Detail, DetailFields = DetailFields, DocumentStorage = DocumentStorage, DocumentSubStoragesNames = DocumentSubStoragesNames, EscapeProcessing = EscapeProcessing, EventBroadcaster = EventBroadcaster, Filter = Filter, Functions = Functions, GroupKeepTogether = GroupKeepTogether, Groups = Groups, Height = Height, MasterFields = MasterFields, MimeType = MimeType, Name = Name, PageFooter = PageFooter, PageFooterOn = PageFooterOn, PageFooterOption = PageFooterOption, PageHeader = PageHeader, PageHeaderOn = PageHeaderOn, PageHeaderOption = PageHeaderOption, Parent = Parent, Position = Position, PositionX = PositionX, PositionY = PositionY, PrintRepeatedValues = PrintRepeatedValues, PropertySetInfo = PropertySetInfo, ReportFooter = ReportFooter, ReportFooterOn = ReportFooterOn, ReportHeader = ReportHeader, ReportHeaderOn = ReportHeaderOn, Section = Section, ShapeType = ShapeType, Size = Size, StyleFamilies = StyleFamilies, UIConfigurationManager = UIConfigurationManager, URL = URL, ViewData = ViewData, Width = Width, acquire = js.Any.fromFunction0(acquire), addCloseListener = js.Any.fromFunction1(addCloseListener), addEventListener = js.Any.fromFunction1(addEventListener), addModifyListener = js.Any.fromFunction1(addModifyListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addStorageChangeListener = js.Any.fromFunction1(addStorageChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), attachResource = js.Any.fromFunction2(attachResource), close = js.Any.fromFunction1(close), connectController = js.Any.fromFunction1(connectController), createClone = js.Any.fromFunction0(createClone), disableSetModified = js.Any.fromFunction0(disableSetModified), disconnectController = js.Any.fromFunction1(disconnectController), dispose = js.Any.fromFunction0(dispose), enableSetModified = js.Any.fromFunction0(enableSetModified), getArgs = js.Any.fromFunction0(getArgs), getAvailableMimeTypes = js.Any.fromFunction0(getAvailableMimeTypes), getCurrentController = js.Any.fromFunction0(getCurrentController), getCurrentSelection = js.Any.fromFunction0(getCurrentSelection), getDocumentStorage = js.Any.fromFunction0(getDocumentStorage), getDocumentSubStorage = js.Any.fromFunction2(getDocumentSubStorage), getDocumentSubStoragesNames = js.Any.fromFunction0(getDocumentSubStoragesNames), getEventBroadcaster = js.Any.fromFunction0(getEventBroadcaster), getMapUnit = js.Any.fromFunction1(getMapUnit), getParent = js.Any.fromFunction0(getParent), getPosition = js.Any.fromFunction0(getPosition), getPreferredVisualRepresentation = js.Any.fromFunction1(getPreferredVisualRepresentation), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getShapeType = js.Any.fromFunction0(getShapeType), getSize = js.Any.fromFunction0(getSize), getStyleFamilies = js.Any.fromFunction0(getStyleFamilies), getUIConfigurationManager = js.Any.fromFunction0(getUIConfigurationManager), getURL = js.Any.fromFunction0(getURL), getViewData = js.Any.fromFunction0(getViewData), getVisualAreaSize = js.Any.fromFunction1(getVisualAreaSize), hasControllersLocked = js.Any.fromFunction0(hasControllersLocked), initNew = js.Any.fromFunction0(initNew), isModified = js.Any.fromFunction0(isModified), isSetModifiedEnabled = js.Any.fromFunction0(isSetModifiedEnabled), load = js.Any.fromFunction1(load), loadFromStorage = js.Any.fromFunction2(loadFromStorage), lockControllers = js.Any.fromFunction0(lockControllers), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeCloseListener = js.Any.fromFunction1(removeCloseListener), removeEventListener = js.Any.fromFunction1(removeEventListener), removeModifyListener = js.Any.fromFunction1(removeModifyListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeStorageChangeListener = js.Any.fromFunction1(removeStorageChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setCurrentController = js.Any.fromFunction1(setCurrentController), setModified = js.Any.fromFunction1(setModified), setParent = js.Any.fromFunction1(setParent), setPosition = js.Any.fromFunction1(setPosition), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setSize = js.Any.fromFunction1(setSize), setViewData = js.Any.fromFunction1(setViewData), setVisualAreaSize = js.Any.fromFunction2(setVisualAreaSize), storeToStorage = js.Any.fromFunction2(storeToStorage), switchToStorage = js.Any.fromFunction1(switchToStorage), unlockControllers = js.Any.fromFunction0(unlockControllers))
  
    __obj.asInstanceOf[XReportDefinition]
  }
}

