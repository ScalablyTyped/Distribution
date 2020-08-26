package typings.activexLibreoffice.com_.sun.star.document

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.io.XInputStream
import typings.activexLibreoffice.com_.sun.star.io.XOutputStream
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is an interface that can be used to link a filter to the {@link FilterAdapter}
  * @since OOo 1.1.2
  * @throws com::sun::star::uno::RuntimeException
  */
@js.native
trait XFilterAdapter extends XInterface {
  def convert(
    xml: XInputStream,
    device: XOutputStream,
    convertToOffice: Boolean,
    pluginUrl: String,
    fileName: String
  ): Unit = js.native
}

object XFilterAdapter {
  @scala.inline
  def apply(
    acquire: () => Unit,
    convert: (XInputStream, XOutputStream, Boolean, String, String) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XFilterAdapter = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), convert = js.Any.fromFunction5(convert), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XFilterAdapter]
  }
  @scala.inline
  implicit class XFilterAdapterOps[Self <: XFilterAdapter] (val x: Self) extends AnyVal {
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
    def setConvert(value: (XInputStream, XOutputStream, Boolean, String, String) => Unit): Self = this.set("convert", js.Any.fromFunction5(value))
  }
  
}

