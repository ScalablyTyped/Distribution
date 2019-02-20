package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs

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
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.OfficeDocument
     with XOfficeDatabaseDocument
     with activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.providerNs.XScriptProviderSupplier
     with activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XLoadable
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XCloseable

