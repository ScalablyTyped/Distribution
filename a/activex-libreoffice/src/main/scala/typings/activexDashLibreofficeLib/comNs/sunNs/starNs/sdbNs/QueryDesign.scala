package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * implements a component which allows the creation of SQL statements.
  *
  * This service implements a user interface for creating SQL statements either through a graphical design interface or simply to enter the SQL statement
  * directly.
  *
  * The design view of the {@link QueryDesign} is divided into two parts. The first part contains the table windows where columns can be selected for the
  * SQL statement. The second part contains the columns which should appear in the selection of the SQL statement or criteria which narrow the query.
  *
  * **Operation Modes**
  *
  * A `QueryDesign` component has 3 operation modes, which control what kind of object is edited: **Query Mode**
  *
  * In `Query Mode` , the designer is used to modify an existing or create a new client-side query.
  *
  *
  *
  * <a name="view_mode" **View Mode**
  *
  * In `View Mode` , the designer is used to modify an existing or create a new server-side view.
  *
  *
  *
  * The view which is being designed must support the {@link com.sun.star.sdbcx.XAlterView} interface, except when a new view is being designed. In the
  * latter case, the designer closes itself automatically when `XAlterView` is not supported, and the view has been saved.
  *
  *
  *
  * <a name="command_mode" **Command Mode**
  *
  * In `Command Mode` , the designer is used to design an standalone SQL command.
  *
  *
  *
  * The client of the designer is then responsible to listen at changes in the {@link ActiveCommand} and {@link EscapeProcessing} members, which are
  * updated every time the user saves the command.
  *
  *
  *
  * ** Initialization**
  *
  * Initialization is done using the {@link com.sun.star.lang.XInitialization} interface, which expects a sequence of objects being either
  * com::sun::star::beans::NamedValues or {@link com.sun.star.beans.PropertyValues} . The following parameters are supported at initialization time:
  * **Frame**;  has to be an {@link com.sun.star.frame.XFrame} interface specifying the frame to plug the {@link QueryDesign} component into. ;  This
  * parameter is mandatory.
  *
  * **DataSourceName**;  specifies the name of the globally registered {@link DataSource} for which a query, view, or SQL command is to be designed. ;
  * The DataSourceName may be omitted if and only if a valid [ActiveConnection]{@link url="#active_connection"} parameter is present. ;  If both
  * `DataSourceName` and `ActiveConnection` are present, the former is ignored.
  *
  * **ActiveConnection**;  specifies the connection to work with. ;  May be omitted if and only if a valid [DataSourceName]{@link url="#data_source"}
  * parameter is supplied.
  *
  * **Command**;  specifies the name of the query or view to design, or, in case of the [CommandType]{@link url="#command_type"} being {@link
  * CommandType.COMMAND} , the initial SQL command. ;  If this parameter is not present, a new query/view will be designed, respectively the initial
  * command will be empty.
  *
  * **CommandType**;  specifies the type of object which should be designed. The following options are supported: {@link CommandType.QUERY} specifies the
  * designer should operate in [query mode]{@link url="#query_mode"} , that is, an existing client-side query should be designed, or a new query should be
  * created, depending on the presence of the [Command]{@link url="#command"} parameter. ;  If the [DataSourceName]{@link url="#data_source"} parameter is
  * present, the query is looked up in the specified data source. Otherwise, the designer tries to determine the data source which the
  * [ActiveConnection]{@link url="#active_connection"} belongs to, and looks up the query there.
  *
  * {@link CommandType.COMMAND} specifies the designer should operate in [command mode]{@link url="#command_mode"} , that is, a standalone SQL command
  * should be designed. When the user attempts to save the designed SQL statement, the {@link ActiveCommand} and {@link EscapeProcessing} properties of
  * the designer are updated.
  *
  * {@link CommandType.TABLE} specifies the designer should operate in [view mode]{@link url="#view_mode"} , that is, an existing or a new server-side
  * view should be designed, depending on the presence of the [Command]{@link url="#command"} parameter. ;  If the [DataSourceName]{@link
  * url="#data_source"} parameter is present, the view is looked up in a newly created connection for the specified data source. Otherwise, it is looked
  * up in the connection given as [ActiveConnection]{@link url="#active_connection"} . If not present, this parameter defaults to {@link
  * CommandType.QUERY} .
  *
  * **EscapeProcessing**;  Specifies whether or not escape processing should be initially enabled in the query designer. If set to `FALSE` , then the
  * designer can operate in text view only (as opposed to the graphical view). The [GraphicalDesign]{@link url="#graphical_design"} parameter will be
  * ignored then, and assumed to be `FALSE` . ;  If not present, `TRUE` is assumed for this parameter.
  *
  * **GraphicalDesign**;  This value indicates whether the designer should be opened in the graphical design view ( `TRUE` ) or in the text view ( `FALSE`
  * ). ;  If not present, `FALSE` is assumed for this parameter.
  *
  * There's a number of legacy settings which are recognized for compatibility reasons, though you're discouraged from using them: **CurrentQuery**;  is
  * the same as Command, and implies a [CommandType]{@link url="#command_type"} of {@link CommandType.QUERY}
  *
  * **QueryDesignView**;  is the same as [GraphicalDesign]{@link url="#graphical_design"} .
  *
  * **IndependentSQLCommand**;  is the same as Command, and implies a [CommandType]{@link url="#command_type"} of {@link CommandType.COMMAND}
  *
  * **CreateView**;  implies a [CommandType]{@link url="#command_type"} of {@link CommandType.TABLE}
  * @see com.sun.star.sdb.ContentLoader
  */
trait QueryDesign
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XController
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XInitialization {
  /** reflects the designed SQL command at the moment it was last saved by the user. */
  var ActiveCommand: java.lang.String
  /**
    * specifies whether the user enabled escape processing for the statement being designed.
    * @see DataAccessDescriptor.EscapeProcessing
    * @since OOo 2.4
    */
  var EscapeProcessing: scala.Boolean
}

object QueryDesign {
  @scala.inline
  def apply(
    ActiveCommand: java.lang.String,
    EscapeProcessing: scala.Boolean,
    Frame: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XFrame,
    Model: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XModel,
    ViewData: js.Any,
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    attachFrame: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XFrame, scala.Unit],
    attachModel: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XModel, scala.Boolean],
    dispose: js.Function0[scala.Unit],
    getFrame: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XFrame],
    getModel: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XModel],
    getViewData: js.Function0[js.Any],
    initialize: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    restoreViewData: js.Function1[js.Any, scala.Unit],
    suspend: js.Function1[scala.Boolean, scala.Boolean]
  ): QueryDesign = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ActiveCommand")(ActiveCommand)
    __obj.updateDynamic("EscapeProcessing")(EscapeProcessing)
    __obj.updateDynamic("Frame")(Frame)
    __obj.updateDynamic("Model")(Model)
    __obj.updateDynamic("ViewData")(ViewData)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("attachFrame")(attachFrame)
    __obj.updateDynamic("attachModel")(attachModel)
    __obj.updateDynamic("dispose")(dispose)
    __obj.updateDynamic("getFrame")(getFrame)
    __obj.updateDynamic("getModel")(getModel)
    __obj.updateDynamic("getViewData")(getViewData)
    __obj.updateDynamic("initialize")(initialize)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("restoreViewData")(restoreViewData)
    __obj.updateDynamic("suspend")(suspend)
    __obj.asInstanceOf[QueryDesign]
  }
}

