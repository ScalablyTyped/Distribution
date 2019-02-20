package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.applicationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait CopyTableWizard extends XCopyTableWizard {
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
  def create(
    Source: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    Destination: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  ): scala.Unit
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
  def createWithInteractionHandler(
    Source: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    Destination: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    InteractionHandler: activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XInteractionHandler
  ): scala.Unit
}

