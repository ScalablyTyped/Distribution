package typings.atvlegacycontentkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The callback for the get keys and certificate requests.
  */
// tslint:disable-next-line:strict-export-declare-modifiers
trait ATVSecureKeyGenericCallback extends StObject {
  
  /**
    * The item was was not able to be retrieved, so return an error.
    * @param error The error message to print to the log.
    */
  def failure(error: String): Unit
  
  /**
    * The asset ID was successfully retrieved, so return it.
    * @param assetID The certificate or the key, in Base64 format.
    */
  def success(dataBase64: String): Unit
}
object ATVSecureKeyGenericCallback {
  
  inline def apply(failure: String => Unit, success: String => Unit): ATVSecureKeyGenericCallback = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[ATVSecureKeyGenericCallback]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ATVSecureKeyGenericCallback] (val x: Self) extends AnyVal {
    
    inline def setFailure(value: String => Unit): Self = StObject.set(x, "failure", js.Any.fromFunction1(value))
    
    inline def setSuccess(value: String => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
