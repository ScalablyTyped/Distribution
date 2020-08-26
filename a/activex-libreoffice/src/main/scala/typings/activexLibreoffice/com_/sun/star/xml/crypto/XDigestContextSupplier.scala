package typings.activexLibreoffice.com_.sun.star.xml.crypto

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.NamedValue
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface allows to get an object to generate a digest of a specified format.
  * @since OOo 3.4
  */
@js.native
trait XDigestContextSupplier extends XInterface {
  /**
    * returns an object that allows to generate the specified digest.
    * @param nDigestID the internal ID specifying the algorithm, should take value from {@link DigestID}
    * @param aParams optional parameters that could be used to initialize the digest, for example, it could contain a key and etc.
    * @throws com::sun::star::lang::IllegalArgumentException one of provided arguments is illegal
    */
  def getDigestContext(nDigestID: Double, aParams: SeqEquiv[NamedValue]): XDigestContext = js.native
}

object XDigestContextSupplier {
  @scala.inline
  def apply(
    acquire: () => Unit,
    getDigestContext: (Double, SeqEquiv[NamedValue]) => XDigestContext,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDigestContextSupplier = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getDigestContext = js.Any.fromFunction2(getDigestContext), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDigestContextSupplier]
  }
  @scala.inline
  implicit class XDigestContextSupplierOps[Self <: XDigestContextSupplier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetDigestContext(value: (Double, SeqEquiv[NamedValue]) => XDigestContext): Self = this.set("getDigestContext", js.Any.fromFunction2(value))
  }
  
}

