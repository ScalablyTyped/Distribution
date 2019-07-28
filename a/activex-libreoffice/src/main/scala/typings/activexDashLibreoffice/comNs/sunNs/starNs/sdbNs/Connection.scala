package typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XChild
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XMultiServiceFactory
import typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcxNs.DatabaseDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** extends the {@link com.sun.star.sdbc.Connection} of SDBC by providing the data definitions of a connected database. */
@js.native
trait Connection
  extends typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcNs.Connection
     with XChild
     with XCommandPreparation
     with DatabaseDefinition
     with XQueriesSupplier
     with XSQLQueryComposerFactory
     with XMultiServiceFactory

