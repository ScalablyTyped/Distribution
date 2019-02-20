package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * encapsulate a type detection service and provide read/write access on it's configuration data.
  *
  * It's possible to make a "flat" detection which may use internal configuration data only - or a "deep" detection which use special {@link
  * ExtendedTypeDetection} services to look into the document stream. Last mode can be suppressed to perform the operation. Of course the results can't be
  * guaranteed then. (e.g. in case the extension was changed)
  */
trait TypeDetection
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer
     with XTypeDetection
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XContainerQuery
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XFlushable

