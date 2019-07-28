package typings.activexDashLibreoffice.comNs.sunNs.starNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.UnoControl
import typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs.FrameLoader
import typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs.XController2
import typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcNs.SQLException
import typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcxNs.XRename
import typings.activexDashLibreoffice.comNs.sunNs.starNs.taskNs.XInteractionHandler
import typings.activexDashLibreoffice.comNs.sunNs.starNs.taskNs.XInteractionHandler2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sdbNs {
  /** specifies a column descriptor control. */
  type ColumnDescriptorControl = UnoControl
  /** @since LibreOffice 4.1 */
  type CommandDefinition = XRename
  /**
    * implements a loader for various datasource-related user interface components.
    *
    * Usually, you don't deal with this loader directly. Instead, use an instance with the {@link com.sun.star.frame.XComponentLoader} interface, and pass
    * one of the below-mentioned URLs to it.
    * @see com.sun.star.frame.XComponentLoader
    * @see com.sun.star.frame.Desktop
    */
  type ContentLoader = FrameLoader
  /** allows creating instances of the {@link DataAccessDescriptor} service. */
  type DataAccessDescriptorFactory = XDataAccessDescriptorFactory
  /**
    * is the context for accessing datasource.
    *
    * A datasource contains information how to create a connection to a database, such as, which database driver should be used, for which user should a
    * connection be established, etc. ;  The context stores datasources under a given name.
    * @see com.sun.star.sdb.DataSource
    */
  type DatabaseContext = XDatabaseContext
  /**
    * describes a service which is able to handle database-related interactions.
    *
    * Usually, you will not instantiate this service directly. Instead, you'll instantiate a generic {@link com.sun.star.task.InteractionHandler} service,
    * and pass it your request. Based on configuration data, this implementation will decide where to forward the request to.
    *
    * By default, the `DatabaseInteractionHandler` feels responsible (as per configuration) for the following interaction types: **database related
    * errors**;  The general structure to transport such errors is the {@link com.sun.star.sdbc.SQLException} , and if your interaction request supplies
    * such a `SQLException` (or an instance of any derived class), the handler will display a generic error dialog, which is able to travel the object chain
    * which may be contained in the exception.**parameter requests**;  If your interaction request supplies an {@link com.sun.star.sdb.ParametersRequest} ,
    * the handler will open a standard dialog asking the user to fill in parameter values. ;  In the case you want to use this feature of the handler, you
    * should supply a special continuation ( {@link com.sun.star.sdb.XInteractionSupplyParameters} ) as well, so the handler can return the entered
    * information.
    */
  type DatabaseInteractionHandler = XInteractionHandler2
  /**
    * describes a container which provides access to database forms.
    * @see com.sun.star.sdb.DocumentDefinition
    */
  type Forms = DocumentContainer
  /**
    * is a service for user interaction for databases.
    * @deprecated DeprecatedDo not use this service anymore. Instead, create a generic com::sun::star::task::InteractionHandler instance, and pass it your request.
    */
  type InteractionHandler = XInteractionHandler
  /**
    * is a stored definition of a SQL "Select statement".
    *
    * It can be used, if there is a need to execute SQL statement more than once.
    */
  type QueryDefinition = XQueryDefinition
  /**
    * This interface could be incomplete since I derived it from its sole place of use.
    * @since LibreOffice 4.1
    */
  type ReportDesign = XController2
  /**
    * describes a container which provides access to database reports.
    * @see com.sun.star.sdb.DocumentDefinition
    */
  type Reports = DocumentContainer
  /**
    * is an exception fired whenever a row set operation was cancelled because of of a veto of an approved listener.
    * @see com.sun.star.sdb.XRowSetApproveListener
    */
  type RowSetVetoException = SQLException
  /** @since LibreOffice 4.1 */
  type TextConnectionSettings = XTextConnectionSettings
}
