package typings.atvlegacycontentkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The callback for the fetch assets request.
  */
// tslint:disable-next-line:strict-export-declare-modifiers
trait ATVSecureKeyFetchAssetCallback extends StObject {
  
  /**
    * The asset was was not able to be retrieved, so return an error.
    * @param error The error message to print to the log.
    */
  def failure(error: String): Unit
  
  /**
    * The asset ID was successfully extracted, so return it.
    * @param assetID The asset ID.
    * @param needsBase64Decoded If the asset ID needs to be Base64 decoded before it can be used, then this must be true.
    */
  def success(assetID: String, needsBase64Decoded: Boolean): Unit
}
object ATVSecureKeyFetchAssetCallback {
  
  inline def apply(failure: String => Unit, success: (String, Boolean) => Unit): ATVSecureKeyFetchAssetCallback = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction2(success))
    __obj.asInstanceOf[ATVSecureKeyFetchAssetCallback]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ATVSecureKeyFetchAssetCallback] (val x: Self) extends AnyVal {
    
    inline def setFailure(value: String => Unit): Self = StObject.set(x, "failure", js.Any.fromFunction1(value))
    
    inline def setSuccess(value: (String, Boolean) => Unit): Self = StObject.set(x, "success", js.Any.fromFunction2(value))
  }
}
