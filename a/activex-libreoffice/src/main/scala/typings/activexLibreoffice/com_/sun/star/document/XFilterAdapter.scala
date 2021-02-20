package typings.activexLibreoffice.com_.sun.star.document

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.io.XInputStream
import typings.activexLibreoffice.com_.sun.star.io.XOutputStream
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class XFilterAdapterMutableBuilder[Self <: XFilterAdapter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConvert(value: (XInputStream, XOutputStream, Boolean, String, String) => Unit): Self = StObject.set(x, "convert", js.Any.fromFunction5(value))
  }
}
