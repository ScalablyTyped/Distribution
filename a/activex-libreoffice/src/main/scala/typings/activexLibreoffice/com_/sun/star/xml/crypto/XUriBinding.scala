package typings.activexLibreoffice.com_.sun.star.xml.crypto

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.io.XInputStream
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface of Uri Binding.
  *
  * This interface is used to dynamically bind a uri with a XInputStream interface.
  */
trait XUriBinding
  extends StObject
     with XInterface {
  
  /**
    * Gets the XInputStream interface for a uri.
    * @param uri the uri whose binding is to get
    * @returns the XInputStream bound with the uri
    */
  def getUriBinding(uri: String): XInputStream
  
  /**
    * Sets the XInputStream interface for a uri.
    * @param uri the uri to bind
    * @param InputStream the XInputStream to be bound
    */
  def setUriBinding(uri: String, InputStream: XInputStream): Unit
}
object XUriBinding {
  
  inline def apply(
    acquire: () => Unit,
    getUriBinding: String => XInputStream,
    queryInterface: `type` => Any,
    release: () => Unit,
    setUriBinding: (String, XInputStream) => Unit
  ): XUriBinding = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getUriBinding = js.Any.fromFunction1(getUriBinding), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setUriBinding = js.Any.fromFunction2(setUriBinding))
    __obj.asInstanceOf[XUriBinding]
  }
  
  extension [Self <: XUriBinding](x: Self) {
    
    inline def setGetUriBinding(value: String => XInputStream): Self = StObject.set(x, "getUriBinding", js.Any.fromFunction1(value))
    
    inline def setSetUriBinding(value: (String, XInputStream) => Unit): Self = StObject.set(x, "setUriBinding", js.Any.fromFunction2(value))
  }
}
