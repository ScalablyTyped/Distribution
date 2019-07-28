package typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.documentNs.OfficeDocument
import typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs.XLoadable
import typings.activexDashLibreoffice.comNs.sunNs.starNs.scriptNs.providerNs.XScriptProviderSupplier
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XCloseable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a office database document which is a storable document.
  *
  * These documents contain information about forms, and reports, and the properties of a data source.
  *
  * The database document contains no data per default. The following is stored inside the document: formsreportsThe table settings defined in {@link
  * DataSettings}The query settings defined in {@link DataSettings}All properties of the service {@link DataSource}
  * @see com.sun.star.sdb.XOfficeDatabaseDocument
  * @see com.sun.star.document.OfficeDocument
  * @since OOo 2.0
  */
@js.native
trait OfficeDatabaseDocument
  extends OfficeDocument
     with XOfficeDatabaseDocument
     with XScriptProviderSupplier
     with XLoadable
     with XCloseable

