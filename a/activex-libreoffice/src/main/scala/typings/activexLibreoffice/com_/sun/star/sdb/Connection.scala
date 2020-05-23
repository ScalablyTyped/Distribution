package typings.activexLibreoffice.com_.sun.star.sdb

import typings.activexLibreoffice.com_.sun.star.container.XChild
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.activexLibreoffice.com_.sun.star.lang.XMultiServiceFactory
import typings.activexLibreoffice.com_.sun.star.sdbc.XConnection
import typings.activexLibreoffice.com_.sun.star.sdbc.XWarningsSupplier
import typings.activexLibreoffice.com_.sun.star.sdbcx.XGroupsSupplier
import typings.activexLibreoffice.com_.sun.star.sdbcx.XTablesSupplier
import typings.activexLibreoffice.com_.sun.star.sdbcx.XUsersSupplier
import typings.activexLibreoffice.com_.sun.star.sdbcx.XViewsSupplier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** extends the {@link com.sun.star.sdbc.Connection} of SDBC by providing the data definitions of a connected database. */
@js.native
trait Connection
  extends XConnection
     with XComponent
     with XWarningsSupplier
     with XChild
     with XCommandPreparation
     with XTablesSupplier
     with XViewsSupplier
     with XUsersSupplier
     with XGroupsSupplier
     with XQueriesSupplier
     with XSQLQueryComposerFactory
     with XMultiServiceFactory

