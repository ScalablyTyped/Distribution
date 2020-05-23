package typings.activexLibreoffice.com_.sun.star.xml.crypto

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
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
trait XDigestContext extends XInterface {
  /** finalizes digest and disposes context. */
  def finalizeDigestAndDispose(): SafeArray[Double]
  /**
    * update the digest with the given data.
    * @param aData data that should be used to update the digest
    */
  def updateDigest(aData: SeqEquiv[Double]): Unit
}

object XDigestContext {
  @scala.inline
  def apply(
    acquire: () => Unit,
    finalizeDigestAndDispose: () => SafeArray[Double],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    updateDigest: SeqEquiv[Double] => Unit
  ): XDigestContext = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), finalizeDigestAndDispose = js.Any.fromFunction0(finalizeDigestAndDispose), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), updateDigest = js.Any.fromFunction1(updateDigest))
    __obj.asInstanceOf[XDigestContext]
  }
}

