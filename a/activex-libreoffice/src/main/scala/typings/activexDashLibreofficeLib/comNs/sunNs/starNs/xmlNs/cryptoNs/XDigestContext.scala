package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface allows to generate the digest.
  *
  * The algorithm to generate the digest is specified on object creation.
  * @see XDigestContextSupplier
  * @since OOo 3.4
  */
trait XDigestContext
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** finalizes digest and disposes context. */
  def finalizeDigestAndDispose(): activexDashInteropLib.SafeArray[scala.Double]
  /**
    * update the digest with the given data.
    * @param aData data that should be used to update the digest
    */
  def updateDigest(aData: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]): scala.Unit
}

