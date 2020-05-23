package typings.activexLibreoffice.com_.sun.star.sdb

import typings.activexLibreoffice.com_.sun.star.awt.XTabControllerModel
import typings.activexLibreoffice.com_.sun.star.container.XChild
import typings.activexLibreoffice.com_.sun.star.container.XEnumerationAccess
import typings.activexLibreoffice.com_.sun.star.form.XConfirmDeleteBroadcaster
import typings.activexLibreoffice.com_.sun.star.form.XDatabaseParameterBroadcaster
import typings.activexLibreoffice.com_.sun.star.form.XFormController
import typings.activexLibreoffice.com_.sun.star.frame.XController
import typings.activexLibreoffice.com_.sun.star.frame.XDispatchProvider
import typings.activexLibreoffice.com_.sun.star.frame.XModel
import typings.activexLibreoffice.com_.sun.star.lang.XInitialization
import typings.activexLibreoffice.com_.sun.star.ui.XContextMenuInterception
import typings.activexLibreoffice.com_.sun.star.util.XModifyBroadcaster
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * implements a component which allows browsing the data sources registered on the system.
  *
  * This service implements a user interface for browsing data sources registered on the {@link com.sun.star.sdb.DatabaseContext} instance of the system.
  *
  * It is possible to navigate through all the data sources, it's queries and it's tables. The queries/tables can be displayed in a grid-like view, where
  * functionality for searching, sorting, filtering, and such is provided.
  *
  * Usually, you won't instantiate this service directly, instead you use the dispatch mechanisms of the application framework to load the URL
  * **.component:DB/DataSourceBrowser** into an arbitrary frame. This should involve a {@link com.sun.star.sdb.ContentLoader} service, which creates and
  * initializes the browser.
  *
  * Some aspects of the browser can be controlled from outside, e.g., it is possible to dispatch a sort or filter request, if a table or query is being
  * displayed.
  *
  * The communication between the browser and external instances works in two ways. ;  The way **in** is provided by the {@link
  * com.sun.star.frame.XDispatchProvider} interface the service exports (Please see below for more details on this). ;  The way **out** works in another
  * way. There are several URLs which an external instance can provide dispatches for (usually by implementing a {@link
  * com.sun.star.frame.XDispatchProviderInterceptor} for the parent frame of the browser), thus indicating that the browser should provide special
  * functionality. ;  In this case, the browser displays and maintains some additional slots (to be more concrete: toolbox items), which, upon triggering,
  * call the {@link com.sun.star.frame.XDispatch.dispatch()} method of the object provided by the external instance.
  *
  * In particular, the supported URLs for communicating to an external instance are: **.uno:DataSourceBrowser/InsertColumns**;  Available whenever an
  * external instance provides a dispatcher ( {@link com.sun.star.frame.XDispatch} ) for this URL. ;  Enabled, if at least one row in the grid view of a
  * table or query is selected. ;  It is the task of the external instance to provide functionality for this URL, but usually it is used to implement some
  * kind of "Data To Text" functionality. ; **.uno:DataSourceBrowser/InsertContent**;  Available whenever an external instance provides a dispatcher(
  * {@link com.sun.star.frame.XDispatch} ) for this URL. ;  Enabled, if at least one row in the grid view of a table or query is selected. ;  It is the
  * task of the external instance to provide functionality for this URL, but usually it is used to implement some kind of "Data To Fields" functionality.
  * ; **.uno:DataSourceBrowser/FormLetter**;  Available whenever an external instance provides a dispatcher ( {@link com.sun.star.frame.XDispatch} ) for
  * this URL. ;  It is the task of the external instance to provide functionality for this URL, but usually it is used to implement some kind of "Form
  * Letter" functionality. ;
  *
  * For all kinds of URLs, the parameters supplied during dispatching build up a {@link DataAccessDescriptor} , where the following properties are
  * present: {@link DataAccessDescriptor.DataSourceName}{@link DataAccessDescriptor.Command}{@link DataAccessDescriptor.CommandType}**optional**{@link
  * DataAccessDescriptor.Selection}**optional**{@link DataAccessDescriptor.BookmarkSelection}**optional**{@link DataAccessDescriptor.ResultSet}
  *
  * The default for {@link DataAccessDescriptor.Selection} is to contain bookmarks, if not specified otherwise by {@link
  * DataAccessDescriptor.BookmarkSelection} .
  * @see com.sun.star.sdb.ContentLoader
  * @see com.sun.star.sdb.DatabaseContext
  * @see com.sun.star.sdb.DataSource
  * @see com.sun.star.frame.XDispatch
  * @see com.sun.star.frame.XDispatchProvider
  * @see com.sun.star.frame.XDispatchProviderInterceptor
  */
@js.native
trait DataSourceBrowser
  extends XFormController
     with XDispatchProvider
     with XChild
     with XEnumerationAccess
     with XModifyBroadcaster
     with XConfirmDeleteBroadcaster
     with XSQLErrorBroadcaster
     with XRowSetApproveBroadcaster
     with XDatabaseParameterBroadcaster
     with XController
     with XInitialization
     with XContextMenuInterception {
  /** returns the tab controller model. */
  /* InferMemberOverrides */
  override def getModel(): XTabControllerModel with XModel = js.native
  @JSName("getModel")
  def getModel_XTabControllerModel(): XTabControllerModel = js.native
}

