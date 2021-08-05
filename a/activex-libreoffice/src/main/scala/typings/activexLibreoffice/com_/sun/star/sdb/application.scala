package typings.activexLibreoffice.com_.sun.star.sdb

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.activexLibreofficeNumbers.`0`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1000`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1001`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1002`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1003`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1004`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1005`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1006`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1007`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1008`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2`
import typings.activexLibreoffice.activexLibreofficeNumbers.`3`
import typings.activexLibreoffice.com_.sun.star.awt.XKeyHandler
import typings.activexLibreoffice.com_.sun.star.awt.XMouseClickHandler
import typings.activexLibreoffice.com_.sun.star.awt.XWindow
import typings.activexLibreoffice.com_.sun.star.beans.Optional
import typings.activexLibreoffice.com_.sun.star.beans.Pair
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.datatransfer.XTransferable
import typings.activexLibreoffice.com_.sun.star.frame.Controller
import typings.activexLibreoffice.com_.sun.star.frame.DispatchDescriptor
import typings.activexLibreoffice.com_.sun.star.frame.XDispatch
import typings.activexLibreoffice.com_.sun.star.frame.XFrame
import typings.activexLibreoffice.com_.sun.star.frame.XModel
import typings.activexLibreoffice.com_.sun.star.frame.XTitle
import typings.activexLibreoffice.com_.sun.star.frame.XTitleChangeBroadcaster
import typings.activexLibreoffice.com_.sun.star.frame.XTitleChangeListener
import typings.activexLibreoffice.com_.sun.star.graphic.XGraphic
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.sdbc.XConnection
import typings.activexLibreoffice.com_.sun.star.sdbc.XDataSource
import typings.activexLibreoffice.com_.sun.star.sdbc.XResultSet
import typings.activexLibreoffice.com_.sun.star.task.XInteractionHandler
import typings.activexLibreoffice.com_.sun.star.ui.XContextMenuInterceptor
import typings.activexLibreoffice.com_.sun.star.ui.dialogs.XExecutableDialog
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.activexLibreoffice.com_.sun.star.util.URL
import typings.activexLibreoffice.com_.sun.star.view.XSelectionChangeListener
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object application {
  
  object CopyTableContinuation {
    
    /* Rewritten from type alias, can be one of: 
      - typings.activexLibreoffice.activexLibreofficeNumbers.`3`
      - typings.activexLibreoffice.activexLibreofficeNumbers.`1`
      - typings.activexLibreoffice.activexLibreofficeNumbers.`2`
      - typings.activexLibreoffice.activexLibreofficeNumbers.`0`
    */
    trait Constants extends StObject
    object Constants {
      
      inline def AskUser: `3` = 3.asInstanceOf[`3`]
      
      inline def CallNextHandler: `1` = 1.asInstanceOf[`1`]
      
      inline def Cancel: `2` = 2.asInstanceOf[`2`]
      
      inline def Proceed: `0` = 0.asInstanceOf[`0`]
    }
  }
  
  object CopyTableOperation {
    
    /* Rewritten from type alias, can be one of: 
      - typings.activexLibreoffice.activexLibreofficeNumbers.`3`
      - typings.activexLibreoffice.activexLibreofficeNumbers.`0`
      - typings.activexLibreoffice.activexLibreofficeNumbers.`1`
      - typings.activexLibreoffice.activexLibreofficeNumbers.`2`
    */
    trait Constants extends StObject
    object Constants {
      
      inline def AppendData: `3` = 3.asInstanceOf[`3`]
      
      inline def CopyDefinitionAndData: `0` = 0.asInstanceOf[`0`]
      
      inline def CopyDefinitionOnly: `1` = 1.asInstanceOf[`1`]
      
      inline def CreateAsView: `2` = 2.asInstanceOf[`2`]
    }
  }
  
  /**
    * specifies an event happening while copying table data between databases.
    *
    * Whenever this event is fired to an {@link XCopyTableListener} , {@link com.sun.star.lang.EventObject.Source} contains the wizard instance which
    * actually does the copying.
    * @see CopyTableWizard
    */
  trait CopyTableRowEvent
    extends StObject
       with EventObject {
    
    /**
      * denotes the error which happened while copying the data.
      *
      * Usually, this contains an instance of {@link com.sun.star.sdbc.SQLException} .
      */
    var Error: js.Any
    
    /** contains the result set which is being copied by the wizard currently. */
    var SourceData: XResultSet
  }
  object CopyTableRowEvent {
    
    inline def apply(Error: js.Any, Source: XInterface, SourceData: XResultSet): CopyTableRowEvent = {
      val __obj = js.Dynamic.literal(Error = Error.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any], SourceData = SourceData.asInstanceOf[js.Any])
      __obj.asInstanceOf[CopyTableRowEvent]
    }
    
    extension [Self <: CopyTableRowEvent](x: Self) {
      
      inline def setError(value: js.Any): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
      
      inline def setSourceData(value: XResultSet): Self = StObject.set(x, "SourceData", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * describes a wizard which can be used to copy table like data from one database to another.
    *
    * **Interactions**: ; There are various cases where the wizard needs to interact with the user (except of course the obvious case to display and operate
    * the wizard dialog itself). For those cases, an interaction handler is needed, which is used for fulfilling parameter requests. This might become
    * necessary if the copy source describes a parametrized query.user interaction in case copying a row fails. If no copy table listener is registered at
    * the wizard, or none of the registered listener handles an error during copying a row, or a registered listeners explicitly tells the wizard to ask the
    * user how to handle the error, then the interaction handler is used together with the error (an `SQLException` , usually) that happened.displaying
    * other errors which happen during copying, in particular errors in creating the target table or view.; ; ; When you do not specify an interaction
    * handler by using the {@link createWithInteractionHandler()} constructor, the wizard will use the interaction handler associated with the copy target,
    * i.e. the interaction handler specified when loading the document which the copy target refers to. If the copy target cannot be associated with a
    * database document (e.g. because it is a mere `ConnectionResource` , or a connection not obtained from a data source), or if the copy target's database
    * document cannot provide an interaction handler, a newly-created instance of an interaction handler is used.; ; ; There's one exception to the above,
    * however: Upon creating the copy table wizard, the copy source and the copy target descriptors are used to create a {@link Connection} . For any
    * interaction during this phase - including, for instance, necessary authentication -, the interaction handler of the respective data source is used, no
    * matter what you specified in {@link createWithInteractionHandler()} . Only if there is no such interaction handler, the processing described above, to
    * find another handler, is applied.;
    * @see com.sun.star.sdb.ParametersRequest
    * @see XCopyTableWizard.addCopyTableListener
    * @see CopyTableContinuation
    * @see com.sun.star.document.MediaDescriptor.InteractionHandler
    * @see com.sun.star.sdb.DatabaseDocument
    * @see com.sun.star.sdb.DataSource
    * @see com.sun.star.sdb.DataAccessDescriptor.ConnectionResource
    * @see com.sun.star.sdb.InteractionHandler
    * @since OOo 2.4
    */
  trait CopyTableWizard
    extends StObject
       with XCopyTableWizard {
    
    /**
      * creates an executable wizard dialog, which is to guide the user through copying a table from one database to another.
      *
      * At creation time, an attempt will be made to obtain the connections described by Source resp. Dest. Failing to do so will result in an exception.
      *
      * If the connection has been newly created by the wizard (e.g. because the data access descriptor specified a `DataSource` instead of an
      * `ActiveConnection` ), then this connection will be disposed upon disposal of the wizard.
      * @param Source the {@link com.sun.star.sdb.DataAccessDescriptor} describing the data to copy.  The following members of the `DataAccessDescriptor` are su
      * @param Destination the {@link com.sun.star.sdb.DataAccessDescriptor} describing the target for the copy operation.  Only `DataSourceName` , `DatabaseLoc
      * @see com.sun.star.sdb.DataAccessDescriptor
      * @throws com::sun::star::lang::IllegalArgumentException if either `Source` or `Destination` is `NULL`either `Source` or `Destination` are not sufficient t
      * @throws com::sun::star::sdbc::SQLException if an error occurs during obtaining the source or destination connection. Those errors are passed unchanged to
      * @throws com::sun::star::lang::WrappedTargetException if an error other than the ones mentioned above occurs while extracting the necessary information fr
      */
    def create(Source: XPropertySet, Destination: XPropertySet): Unit
    
    /**
      * creates an executable wizard dialog, which is to guide the user through copying a table from one database to another.
      *
      * The only difference to the {@link create()} constructor is that `createWithInteractionHandler` takes an additional argument, which can be used to
      * intercept interactions (such as error messages) during the wizard run.
      * @param Source the {@link com.sun.star.sdb.DataAccessDescriptor} describing the target for the copy operation.
      * @param Destination the {@link com.sun.star.sdb.DataAccessDescriptor} describing the target for the copy operation.
      * @param InteractionHandler specifies an interaction handler to use when user input is required.  When specifying this parameter, you should use an implem
      * @see com.sun.star.sdb.InteractionHandler
      */
    def createWithInteractionHandler(Source: XPropertySet, Destination: XPropertySet, InteractionHandler: XInteractionHandler): Unit
  }
  object CopyTableWizard {
    
    inline def apply(
      CreatePrimaryKey: Optional[String],
      DestinationTableName: String,
      Operation: Double,
      UseHeaderLineAsColumnNames: Boolean,
      acquire: () => Unit,
      addCopyTableListener: XCopyTableListener => Unit,
      create: (XPropertySet, XPropertySet) => Unit,
      createWithInteractionHandler: (XPropertySet, XPropertySet, XInteractionHandler) => Unit,
      execute: () => Double,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      removeCopyTableListener: XCopyTableListener => Unit,
      setTitle: String => Unit
    ): CopyTableWizard = {
      val __obj = js.Dynamic.literal(CreatePrimaryKey = CreatePrimaryKey.asInstanceOf[js.Any], DestinationTableName = DestinationTableName.asInstanceOf[js.Any], Operation = Operation.asInstanceOf[js.Any], UseHeaderLineAsColumnNames = UseHeaderLineAsColumnNames.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addCopyTableListener = js.Any.fromFunction1(addCopyTableListener), create = js.Any.fromFunction2(create), createWithInteractionHandler = js.Any.fromFunction3(createWithInteractionHandler), execute = js.Any.fromFunction0(execute), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeCopyTableListener = js.Any.fromFunction1(removeCopyTableListener), setTitle = js.Any.fromFunction1(setTitle))
      __obj.asInstanceOf[CopyTableWizard]
    }
    
    extension [Self <: CopyTableWizard](x: Self) {
      
      inline def setCreate(value: (XPropertySet, XPropertySet) => Unit): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
      
      inline def setCreateWithInteractionHandler(value: (XPropertySet, XPropertySet, XInteractionHandler) => Unit): Self = StObject.set(x, "createWithInteractionHandler", js.Any.fromFunction3(value))
    }
  }
  
  object DatabaseObject {
    
    /* Rewritten from type alias, can be one of: 
      - typings.activexLibreoffice.activexLibreofficeNumbers.`2`
      - typings.activexLibreoffice.activexLibreofficeNumbers.`3`
    */
    trait Constants extends StObject
    object Constants {
      
      inline def FORM: `2` = 2.asInstanceOf[`2`]
      
      inline def REPORT: `3` = 3.asInstanceOf[`3`]
    }
  }
  
  object DatabaseObjectContainer {
    
    /* Rewritten from type alias, can be one of: 
      - typings.activexLibreoffice.activexLibreofficeNumbers.`1005`
      - typings.activexLibreoffice.activexLibreofficeNumbers.`1004`
      - typings.activexLibreoffice.activexLibreofficeNumbers.`1002`
      - typings.activexLibreoffice.activexLibreofficeNumbers.`1007`
      - typings.activexLibreoffice.activexLibreofficeNumbers.`1001`
      - typings.activexLibreoffice.activexLibreofficeNumbers.`1003`
      - typings.activexLibreoffice.activexLibreofficeNumbers.`1008`
      - typings.activexLibreoffice.activexLibreofficeNumbers.`1006`
      - typings.activexLibreoffice.activexLibreofficeNumbers.`1000`
    */
    trait Constants extends StObject
    object Constants {
      
      inline def CATALOG: `1005` = 1005.asInstanceOf[`1005`]
      
      inline def DATA_SOURCE: `1004` = 1004.asInstanceOf[`1004`]
      
      inline def FORMS: `1002` = 1002.asInstanceOf[`1002`]
      
      inline def FORMS_FOLDER: `1007` = 1007.asInstanceOf[`1007`]
      
      inline def QUERIES: `1001` = 1001.asInstanceOf[`1001`]
      
      inline def REPORTS: `1003` = 1003.asInstanceOf[`1003`]
      
      inline def REPORTS_FOLDER: `1008` = 1008.asInstanceOf[`1008`]
      
      inline def SCHEMA: `1006` = 1006.asInstanceOf[`1006`]
      
      inline def TABLES: `1000` = 1000.asInstanceOf[`1000`]
    }
  }
  
  /** is the default controller implementation for OpenOffice.org's database application. */
  trait DefaultViewController
    extends StObject
       with Controller
       with XTitle
       with XTitleChangeBroadcaster
       with XDatabaseDocumentUI
  object DefaultViewController {
    
    inline def apply(
      ActiveConnection: XConnection,
      ApplicationMainWindow: XWindow,
      DataSource: XDataSource,
      Frame: XFrame,
      Model: XModel,
      Selection: js.Any,
      SubComponents: SafeArray[XComponent],
      Title: String,
      Transferable: XTransferable,
      ViewData: js.Any,
      acquire: () => Unit,
      addEventListener: XEventListener => Unit,
      addKeyHandler: XKeyHandler => Unit,
      addMouseClickHandler: XMouseClickHandler => Unit,
      addSelectionChangeListener: XSelectionChangeListener => Unit,
      addTitleChangeListener: XTitleChangeListener => Unit,
      attachFrame: XFrame => Unit,
      attachModel: XModel => Boolean,
      closeSubComponents: () => Boolean,
      connect: () => Unit,
      createComponent: (Double, js.Array[XComponent]) => XComponent,
      createComponentWithArguments: (Double, SeqEquiv[PropertyValue], js.Array[XComponent]) => XComponent,
      dispose: () => Unit,
      getFrame: () => XFrame,
      getModel: () => XModel,
      getSelection: () => js.Any,
      getTitle: () => String,
      getTransferable: () => XTransferable,
      getViewData: () => js.Any,
      identifySubComponent: XComponent => Pair[Double, String],
      insertTransferable: XTransferable => Unit,
      isConnected: () => Boolean,
      loadComponent: (Double, String, Boolean) => XComponent,
      loadComponentWithArguments: (Double, String, Boolean, SeqEquiv[PropertyValue]) => XComponent,
      queryDispatch: (URL, String, Double) => XDispatch,
      queryDispatches: SeqEquiv[DispatchDescriptor] => SafeArray[XDispatch],
      queryInterface: `type` => js.Any,
      registerContextMenuInterceptor: XContextMenuInterceptor => Unit,
      release: () => Unit,
      releaseContextMenuInterceptor: XContextMenuInterceptor => Unit,
      removeEventListener: XEventListener => Unit,
      removeKeyHandler: XKeyHandler => Unit,
      removeMouseClickHandler: XMouseClickHandler => Unit,
      removeSelectionChangeListener: XSelectionChangeListener => Unit,
      removeTitleChangeListener: XTitleChangeListener => Unit,
      restoreViewData: js.Any => Unit,
      select: js.Any => Boolean,
      setTitle: String => Unit,
      suspend: Boolean => Boolean
    ): DefaultViewController = {
      val __obj = js.Dynamic.literal(ActiveConnection = ActiveConnection.asInstanceOf[js.Any], ApplicationMainWindow = ApplicationMainWindow.asInstanceOf[js.Any], DataSource = DataSource.asInstanceOf[js.Any], Frame = Frame.asInstanceOf[js.Any], Model = Model.asInstanceOf[js.Any], Selection = Selection.asInstanceOf[js.Any], SubComponents = SubComponents.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], Transferable = Transferable.asInstanceOf[js.Any], ViewData = ViewData.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addKeyHandler = js.Any.fromFunction1(addKeyHandler), addMouseClickHandler = js.Any.fromFunction1(addMouseClickHandler), addSelectionChangeListener = js.Any.fromFunction1(addSelectionChangeListener), addTitleChangeListener = js.Any.fromFunction1(addTitleChangeListener), attachFrame = js.Any.fromFunction1(attachFrame), attachModel = js.Any.fromFunction1(attachModel), closeSubComponents = js.Any.fromFunction0(closeSubComponents), connect = js.Any.fromFunction0(connect), createComponent = js.Any.fromFunction2(createComponent), createComponentWithArguments = js.Any.fromFunction3(createComponentWithArguments), dispose = js.Any.fromFunction0(dispose), getFrame = js.Any.fromFunction0(getFrame), getModel = js.Any.fromFunction0(getModel), getSelection = js.Any.fromFunction0(getSelection), getTitle = js.Any.fromFunction0(getTitle), getTransferable = js.Any.fromFunction0(getTransferable), getViewData = js.Any.fromFunction0(getViewData), identifySubComponent = js.Any.fromFunction1(identifySubComponent), insertTransferable = js.Any.fromFunction1(insertTransferable), isConnected = js.Any.fromFunction0(isConnected), loadComponent = js.Any.fromFunction3(loadComponent), loadComponentWithArguments = js.Any.fromFunction4(loadComponentWithArguments), queryDispatch = js.Any.fromFunction3(queryDispatch), queryDispatches = js.Any.fromFunction1(queryDispatches), queryInterface = js.Any.fromFunction1(queryInterface), registerContextMenuInterceptor = js.Any.fromFunction1(registerContextMenuInterceptor), release = js.Any.fromFunction0(release), releaseContextMenuInterceptor = js.Any.fromFunction1(releaseContextMenuInterceptor), removeEventListener = js.Any.fromFunction1(removeEventListener), removeKeyHandler = js.Any.fromFunction1(removeKeyHandler), removeMouseClickHandler = js.Any.fromFunction1(removeMouseClickHandler), removeSelectionChangeListener = js.Any.fromFunction1(removeSelectionChangeListener), removeTitleChangeListener = js.Any.fromFunction1(removeTitleChangeListener), restoreViewData = js.Any.fromFunction1(restoreViewData), select = js.Any.fromFunction1(select), setTitle = js.Any.fromFunction1(setTitle), suspend = js.Any.fromFunction1(suspend))
      __obj.asInstanceOf[DefaultViewController]
    }
  }
  
  /** @since LibreOffice 4.1 */
  trait MacroMigrationWizard
    extends StObject
       with XExecutableDialog {
    
    def createWithDocument(Document: XOfficeDatabaseDocument): Unit
  }
  object MacroMigrationWizard {
    
    inline def apply(
      acquire: () => Unit,
      createWithDocument: XOfficeDatabaseDocument => Unit,
      execute: () => Double,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      setTitle: String => Unit
    ): MacroMigrationWizard = {
      val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createWithDocument = js.Any.fromFunction1(createWithDocument), execute = js.Any.fromFunction0(execute), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setTitle = js.Any.fromFunction1(setTitle))
      __obj.asInstanceOf[MacroMigrationWizard]
    }
    
    extension [Self <: MacroMigrationWizard](x: Self) {
      
      inline def setCreateWithDocument(value: XOfficeDatabaseDocument => Unit): Self = StObject.set(x, "createWithDocument", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * denotes a named database object, or a named folder of database objects
    * @since OOo 3.0
    */
  trait NamedDatabaseObject extends StObject {
    
    /**
      * denotes the name of the object
      *
      * In case of forms, reports, form folders and report folders, this is the hierarchical path to the object, where the path elements are separated by a
      * slash ( `/` ).
      *
      * In case of tables, this is the fully qualified name of the table, as required by the database's table name composition rules.
      *
      * In case of queries, this is the name of the query.
      *
      * In case of virtual folders denoted by {@link DatabaseObjectContainer.CATALOG} and {@link DatabaseObjectContainer.SCHEMA} , it is `<schema>` , if the
      * database supports schemas only`<catalog>` , if the database supports catalogs only`<catalog>.<schema>` , if the database supports both catalogs and
      * schemas, and catalogs are to appear at the beginning of an identifier.`<schema>.<catalog>` , if the database supports both catalogs and schemas, and
      * catalogs are to appear at the end of an identifier.
      *
      * In case of the virtual folders denoted by {@link DatabaseObjectContainer.TABLES} , {@link DatabaseObjectContainer.QUERIES} , {@link
      * DatabaseObjectContainer.DATA_SOURCE} , {@link DatabaseObjectContainer.FORMS} or {@link DatabaseObjectContainer.REPORTS} , this denotes the name of the
      * data source (as denoted by {@link com.sun.star.sdb.DataSource.Name} )
      * @see XDatabaseMetaData.isCatalogAtStart
      * @see DatabaseObjectContainer
      */
    var Name: String
    
    /**
      * denotes the type of the object.
      *
      * This member is one of the {@link DatabaseObject} or {@link DatabaseObjectContainer} constants.
      */
    var Type: Double
  }
  object NamedDatabaseObject {
    
    inline def apply(Name: String, Type: Double): NamedDatabaseObject = {
      val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
      __obj.asInstanceOf[NamedDatabaseObject]
    }
    
    extension [Self <: NamedDatabaseObject](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      inline def setType(value: Double): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * specifies the interface required to listen for progress in copying table rows via a `CopyTableWizard` .
    * @see CopyTableRowEvent
    * @see CopyTableWizard
    */
  trait XCopyTableListener
    extends StObject
       with XEventListener {
    
    /**
      * is called when a row was successfully copied.
      *
      * This method is called right after a row has been successfully copied. It might be used, for instance, to update a progress indicator.
      * @param Event describes the current state of the copy operation. {@link CopyTableRowEvent.SourceData} is positioned at the row which was just copied to t
      */
    def copiedRow(Event: CopyTableRowEvent): Unit
    
    /**
      * is called when copying a row failed.
      * @param Event describes the current state of the copy operation. {@link CopyTableRowEvent.SourceData} is positioned at the row which was attempted to be
      * @returns how to continue with copying. Must be one of the {@link CopyTableContinuation} constants.
      */
    def copyRowError(Event: CopyTableRowEvent): Double
    
    /**
      * is called when a row is about to be copied.
      *
      * This method is called immediately before a row is copied. It might be used, for instance, to update a progress indicator.
      * @param Event describes the current state of the copy operation. {@link CopyTableRowEvent.SourceData} is positioned at the row which is about to be copied.
      */
    def copyingRow(Event: CopyTableRowEvent): Unit
  }
  object XCopyTableListener {
    
    inline def apply(
      acquire: () => Unit,
      copiedRow: CopyTableRowEvent => Unit,
      copyRowError: CopyTableRowEvent => Double,
      copyingRow: CopyTableRowEvent => Unit,
      disposing: EventObject => Unit,
      queryInterface: `type` => js.Any,
      release: () => Unit
    ): XCopyTableListener = {
      val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), copiedRow = js.Any.fromFunction1(copiedRow), copyRowError = js.Any.fromFunction1(copyRowError), copyingRow = js.Any.fromFunction1(copyingRow), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
      __obj.asInstanceOf[XCopyTableListener]
    }
    
    extension [Self <: XCopyTableListener](x: Self) {
      
      inline def setCopiedRow(value: CopyTableRowEvent => Unit): Self = StObject.set(x, "copiedRow", js.Any.fromFunction1(value))
      
      inline def setCopyRowError(value: CopyTableRowEvent => Double): Self = StObject.set(x, "copyRowError", js.Any.fromFunction1(value))
      
      inline def setCopyingRow(value: CopyTableRowEvent => Unit): Self = StObject.set(x, "copyingRow", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * describes a wizard which can be used to copy table like data from one database to another.
    *
    * Copying table data between databases can be a complex task. Especially when it comes to matching field types in the source and in the target database,
    * some heuristics, and sometimes support from the user doing the operation, are required.
    *
    * The `copy table wizard` described by this interfaces cares for those, and other, settings.
    * @since OOo 2.4
    */
  trait XCopyTableWizard
    extends StObject
       with XExecutableDialog {
    
    /**
      * specifies that a new primary key is to be created in the target database
      *
      * At initialization time, you can specify the initial settings for the primary key in the UI.
      *
      * You cannot use this attribute to determine the primary key, possibly created by the wizard, after it finished. The reason is that during the wizard
      * run, the user can define an arbitrarily complex primary key, e.g. including multiple columns, which cannot be represented in this simple attribute
      * anymore.
      *
      * This attribute is ignored if {@link Operation} is {@link CopyTableOperation.AppendData} .
      *
      * Changing this attribute while the dialog is running is not supported, the result of such an attempt is undefined.
      *
      * When a primary key is to be created by the wizard, it will be an auto-increment column, if possible.
      * @throws com::sun::star::lang::IllegalArgumentException if the target database does not support primary keys
      */
    var CreatePrimaryKey: Optional[String]
    
    /**
      * specifies the name of the table in the destination database.
      *
      * At initialization time, you can use this attribute to control the initial table name as suggested to the user.
      *
      * After the wizard has finished, you can use this attribute to determine what table was actually created resp. to which existing table the source
      * table's data was appended.
      *
      * Changing this attribute while the dialog is running is not supported, the result of such an attempt is undefined.
      */
    var DestinationTableName: String
    
    /**
      * specifies the basic operation for the wizard to execute.
      *
      * This must be one of the {@link CopyTableOperation} constants.
      *
      * At initialization time, you can use this attribute to control the initial operation in the wizard.
      *
      * After the wizard has finished, you can use this attribute to determine what operation was actually executed.
      *
      * Changing this attribute while the dialog is running is not supported, the result of such an attempt is undefined.
      * @throws IllegalArgumentException if you attempt to set an invalid operation, or if the given operation is not supported by the target database type, e.g.
      */
    var Operation: Double
    
    /**
      * specifies that the first row should be used to identify column names.
      *
      * This attribute is ignored when the source defines the column names which isn't the case when only a part of a table should be copied e.g. in the RTF
      * format or in the HTML format.
      */
    var UseHeaderLineAsColumnNames: Boolean
    
    /** adds a listener which is to be notified of progress in the copy operation */
    def addCopyTableListener(Listener: XCopyTableListener): Unit
    
    /** removes a listener */
    def removeCopyTableListener(Listener: XCopyTableListener): Unit
  }
  object XCopyTableWizard {
    
    inline def apply(
      CreatePrimaryKey: Optional[String],
      DestinationTableName: String,
      Operation: Double,
      UseHeaderLineAsColumnNames: Boolean,
      acquire: () => Unit,
      addCopyTableListener: XCopyTableListener => Unit,
      execute: () => Double,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      removeCopyTableListener: XCopyTableListener => Unit,
      setTitle: String => Unit
    ): XCopyTableWizard = {
      val __obj = js.Dynamic.literal(CreatePrimaryKey = CreatePrimaryKey.asInstanceOf[js.Any], DestinationTableName = DestinationTableName.asInstanceOf[js.Any], Operation = Operation.asInstanceOf[js.Any], UseHeaderLineAsColumnNames = UseHeaderLineAsColumnNames.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addCopyTableListener = js.Any.fromFunction1(addCopyTableListener), execute = js.Any.fromFunction0(execute), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeCopyTableListener = js.Any.fromFunction1(removeCopyTableListener), setTitle = js.Any.fromFunction1(setTitle))
      __obj.asInstanceOf[XCopyTableWizard]
    }
    
    extension [Self <: XCopyTableWizard](x: Self) {
      
      inline def setAddCopyTableListener(value: XCopyTableListener => Unit): Self = StObject.set(x, "addCopyTableListener", js.Any.fromFunction1(value))
      
      inline def setCreatePrimaryKey(value: Optional[String]): Self = StObject.set(x, "CreatePrimaryKey", value.asInstanceOf[js.Any])
      
      inline def setDestinationTableName(value: String): Self = StObject.set(x, "DestinationTableName", value.asInstanceOf[js.Any])
      
      inline def setOperation(value: Double): Self = StObject.set(x, "Operation", value.asInstanceOf[js.Any])
      
      inline def setRemoveCopyTableListener(value: XCopyTableListener => Unit): Self = StObject.set(x, "removeCopyTableListener", js.Any.fromFunction1(value))
      
      inline def setUseHeaderLineAsColumnNames(value: Boolean): Self = StObject.set(x, "UseHeaderLineAsColumnNames", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * provides access to the user interface of a database document
    *
    * This interface is available when a database document has been loaded into a frame, at the controller of this frame.
    * @see com.sun.star.frame.Controller
    * @see com.sun.star.sdb.DatabaseDocument
    * @since OOo 2.2
    */
  trait XDatabaseDocumentUI extends StObject {
    
    /**
      * provides access to the current connection of the application
      *
      * Note that the connection returned here is really the working connection of the application. Clients should not misuse it, in particular, closing the
      * connection can yield unexpected results and should definitely be avoided. If you need a separate connection to the data source, use {@link
      * com.sun.star.sdbc.XDataSource.getConnection()} .
      */
    var ActiveConnection: XConnection
    
    /**
      * provides access to the application's main window
      *
      * Note that reading this attribute is equivalent to querying the component for the {@link com.sun.star.frame.XController} interface, asking the
      * controller for its frame, and asking this frame for its container window.
      * @see com.sun.star.frame.XController
      * @see com.sun.star.frame.XFrame
      */
    var ApplicationMainWindow: XWindow
    
    /** provides access to the data source belong to the database document */
    var DataSource: XDataSource
    
    /**
      * contains all sub components of the database document
      *
      * During working with the database, the user might open different sub components: forms, reports, tables, queries. Those components are tracked by the
      * application, and provided in this attribute.
      *
      * The components here might either be documents ( {@link com.sun.star.frame.XModel} ), controllers ( {@link com.sun.star.frame.XController} ), or frames
      * ( {@link com.sun.star.frame.XFrame} ).
      * @since OOo 3.0
      */
    var SubComponents: SafeArray[XComponent]
    
    /**
      * closes all sub components of the database document.
      *
      * During working with the database, the user might open different sub components: forms, reports, tables, queries. If you need to close all those
      * documents, use `closeSubComponents` , which will gracefully do this.
      *
      * In a first step, the sub components will be suspended ( {@link com.sun.star.frame.XController.suspend()} ). There are basically two reasons why
      * suspending a single sub component can fail: The user might veto it (they've asked if the document is currently modified), and the component might be
      * uncloseable currently, e.g. due to an open modal dialog, or a long-lasting operation running currently (e.g. printing).
      *
      * Once all sub components have been suspended, they will, in a second step, be closed. Again, closing might be vetoed by other instances, e.g. by a
      * close listener registered at the component.
      * @returns `TRUE` if and only if both suspending and closing all sub components succeeds.
      * @since OOo 3.0
      */
    def closeSubComponents(): Boolean
    
    /**
      * lets the application connect to the database
      *
      * If the application is already connected, nothing happens. If it is not connected, the application will try to establish a connection by using {@link
      * com.sun.star.sdbc.XDataSource.getConnection()} with the current settings, as specified in the {@link com.sun.star.sdb.DataSource.Settings} member.
      *
      * If the connection cannot be established, the respective error message is shown in the application window.
      * @throws com::sun::star::sdbc::SQLException if the connection cannot be established
      */
    def connect(): Unit
    
    /**
      * creates a new sub component of the given type
      * @param ObjectType specifies the type of the object, must be one of the {@link DatabaseObject} constants.
      * @param DocumentDefinition Upon successful return, and if and only if ObjectType equals {@link DatabaseObject.FORM} or {@link DatabaseObject.REPORT} , th
      */
    def createComponent(ObjectType: Double, DocumentDefinition: js.Array[XComponent]): XComponent
    
    /**
      * creates a new sub component of the given type
      *
      * In opposite to {@link createComponent()} , this method allows you to specify additional arguments which are passed to the to-be-loaded component.
      * @param ObjectType specifies the type of the object, must be one of the {@link DatabaseObject} constants.
      * @param Arguments The meaning of the arguments is defined at the service which is effectively created. See the [above table]{@link url="#component_types"
      * @param DocumentDefinition Upon successful return, and if and only if ObjectType equals {@link DatabaseObject.FORM} or {@link DatabaseObject.REPORT} , th
      */
    def createComponentWithArguments(ObjectType: Double, Arguments: SeqEquiv[PropertyValue], DocumentDefinition: js.Array[XComponent]): XComponent
    
    /**
      * identifies the given sub component
      * @param SubComponent the component to identify. Must be one of the components in {@link SubComponents} .
      * @returns a record describing the sub component. The first element of the returned pair is the type of the component, denoted by one of the {@link Database
      * @throws com::sun::star::lang::IllegalArgumentException if the given component is not one of the controller's sub components
      */
    def identifySubComponent(SubComponent: XComponent): Pair[Double, String]
    
    /** determines whether the application is currently connected to the database */
    def isConnected(): Boolean
    
    /**
      * loads the given sub component of the database document
      *
      * This method allows programmatic access to the functionality which is present in the UI: it allows opening a table, query, form, or report for either
      * editing or viewing.
      *
      * This method is a convenience wrapper for API which is also available otherwise. For instance, for loading forms and reports, you could use the {@link
      * com.sun.star.frame.XComponentLoader} interface of the {@link com.sun.star.sdb.Forms} resp. {@link com.sun.star.sdb.Reports} collections.
      *
      * Note there must exist a connection to the database before you can call this method.
      *
      * If an error occurs opening the given object, then this is reported to the user via an error dialog.
      * @param ObjectType specifies the type of the object, must be one of the {@link DatabaseObject} constants.
      * @param ObjectName specifies the name of the object. In case hierarchical objects are supported (as is the case form forms and reports), hierarchical nam
      * @param ForEditing specifies whether the object should be opened for editing ( `TRUE` ) or viewing ( `FALSE` ).  For the different object types, this mea
      * @returns the component which has been loaded. This is either an {@link com.sun.star.frame.XModel} , or an {@link com.sun.star.frame.XController} if the co
      * @see isConnected
      * @see connect
      * @throws com::sun::star::lang::IllegalArgumentException if ObjectType denotes an invalid object type
      * @throws com::sun::star::container::NoSuchElementException if an object with the given name and of the given type does not exist
      * @throws com::sun::star::sdbc::SQLException if there is no connection to the database at the time the method is called.
      */
    def loadComponent(ObjectType: Double, ObjectName: String, ForEditing: Boolean): XComponent
    
    /**
      * loads the given sub component of the database document
      *
      * In opposite to {@link loadComponent()} , this method allows you to specify additional arguments which are passed to the to-be-loaded component.
      *
      * The meaning of the arguments is defined at the service which is effectively created. See the [above table]{@link url="#component_types"} for a list of
      * those services.
      */
    def loadComponentWithArguments(ObjectType: Double, ObjectName: String, ForEditing: Boolean, Arguments: SeqEquiv[PropertyValue]): XComponent
  }
  object XDatabaseDocumentUI {
    
    inline def apply(
      ActiveConnection: XConnection,
      ApplicationMainWindow: XWindow,
      DataSource: XDataSource,
      SubComponents: SafeArray[XComponent],
      closeSubComponents: () => Boolean,
      connect: () => Unit,
      createComponent: (Double, js.Array[XComponent]) => XComponent,
      createComponentWithArguments: (Double, SeqEquiv[PropertyValue], js.Array[XComponent]) => XComponent,
      identifySubComponent: XComponent => Pair[Double, String],
      isConnected: () => Boolean,
      loadComponent: (Double, String, Boolean) => XComponent,
      loadComponentWithArguments: (Double, String, Boolean, SeqEquiv[PropertyValue]) => XComponent
    ): XDatabaseDocumentUI = {
      val __obj = js.Dynamic.literal(ActiveConnection = ActiveConnection.asInstanceOf[js.Any], ApplicationMainWindow = ApplicationMainWindow.asInstanceOf[js.Any], DataSource = DataSource.asInstanceOf[js.Any], SubComponents = SubComponents.asInstanceOf[js.Any], closeSubComponents = js.Any.fromFunction0(closeSubComponents), connect = js.Any.fromFunction0(connect), createComponent = js.Any.fromFunction2(createComponent), createComponentWithArguments = js.Any.fromFunction3(createComponentWithArguments), identifySubComponent = js.Any.fromFunction1(identifySubComponent), isConnected = js.Any.fromFunction0(isConnected), loadComponent = js.Any.fromFunction3(loadComponent), loadComponentWithArguments = js.Any.fromFunction4(loadComponentWithArguments))
      __obj.asInstanceOf[XDatabaseDocumentUI]
    }
    
    extension [Self <: XDatabaseDocumentUI](x: Self) {
      
      inline def setActiveConnection(value: XConnection): Self = StObject.set(x, "ActiveConnection", value.asInstanceOf[js.Any])
      
      inline def setApplicationMainWindow(value: XWindow): Self = StObject.set(x, "ApplicationMainWindow", value.asInstanceOf[js.Any])
      
      inline def setCloseSubComponents(value: () => Boolean): Self = StObject.set(x, "closeSubComponents", js.Any.fromFunction0(value))
      
      inline def setConnect(value: () => Unit): Self = StObject.set(x, "connect", js.Any.fromFunction0(value))
      
      inline def setCreateComponent(value: (Double, js.Array[XComponent]) => XComponent): Self = StObject.set(x, "createComponent", js.Any.fromFunction2(value))
      
      inline def setCreateComponentWithArguments(value: (Double, SeqEquiv[PropertyValue], js.Array[XComponent]) => XComponent): Self = StObject.set(x, "createComponentWithArguments", js.Any.fromFunction3(value))
      
      inline def setDataSource(value: XDataSource): Self = StObject.set(x, "DataSource", value.asInstanceOf[js.Any])
      
      inline def setIdentifySubComponent(value: XComponent => Pair[Double, String]): Self = StObject.set(x, "identifySubComponent", js.Any.fromFunction1(value))
      
      inline def setIsConnected(value: () => Boolean): Self = StObject.set(x, "isConnected", js.Any.fromFunction0(value))
      
      inline def setLoadComponent(value: (Double, String, Boolean) => XComponent): Self = StObject.set(x, "loadComponent", js.Any.fromFunction3(value))
      
      inline def setLoadComponentWithArguments(value: (Double, String, Boolean, SeqEquiv[PropertyValue]) => XComponent): Self = StObject.set(x, "loadComponentWithArguments", js.Any.fromFunction4(value))
      
      inline def setSubComponents(value: SafeArray[XComponent]): Self = StObject.set(x, "SubComponents", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * is used by the database application to obtain non-default user interface information and/or components for database tables.
    * @see com.sun.star.sdb.Connection
    * @since OOo 2.2
    */
  trait XTableUIProvider extends StObject {
    
    /**
      * returns a component which can be used to edit the definition of an existing table.
      * @param DocumentUI provides access to the UI in which the database document is currently displayed. ;  In particular, this parameter provides access to t
      * @param TableName denotes the fully qualified name of an existing table.
      * @returns a component which can be used to edit the definition of an existing table, or `NULL` if the default component should be used. ;  Two component ty
      * @throws com::sun::star::lang::IllegalArgumentException if the given TableName does not denote an existing table
      * @throws com::sun::star::lang::WrappedTargetException if an error occurs while creating the table editor component.
      */
    def getTableEditor(DocumentUI: XDatabaseDocumentUI, TableName: String): XInterface
    
    /**
      * provides the icon which should be used to represent the table in the database application window.
      *
      * The icon will usually be requested once per table, and cached. It might be requested again if the application settings change, for instance, if
      * another desktop theme has been activated.
      * @param TableName denotes the fully qualified name of the database table.
      * @param ColorMode denotes the color mode of the graphic to retrieve, being one of the {@link com.sun.star.graphic.GraphicColorMode} constants.
      * @returns the icon which should be used to represent the table in the database application window, or `NULL` if the default icon should be used.
      */
    def getTableIcon(TableName: String, ColorMode: Double): XGraphic
  }
  object XTableUIProvider {
    
    inline def apply(
      getTableEditor: (XDatabaseDocumentUI, String) => XInterface,
      getTableIcon: (String, Double) => XGraphic
    ): XTableUIProvider = {
      val __obj = js.Dynamic.literal(getTableEditor = js.Any.fromFunction2(getTableEditor), getTableIcon = js.Any.fromFunction2(getTableIcon))
      __obj.asInstanceOf[XTableUIProvider]
    }
    
    extension [Self <: XTableUIProvider](x: Self) {
      
      inline def setGetTableEditor(value: (XDatabaseDocumentUI, String) => XInterface): Self = StObject.set(x, "getTableEditor", js.Any.fromFunction2(value))
      
      inline def setGetTableIcon(value: (String, Double) => XGraphic): Self = StObject.set(x, "getTableIcon", js.Any.fromFunction2(value))
    }
  }
}
