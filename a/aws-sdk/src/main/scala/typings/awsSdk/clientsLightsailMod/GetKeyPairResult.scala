package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetKeyPairResult extends StObject {
  
  /**
    * An array of key-value pairs containing information about the key pair.
    */
  var keyPair: js.UndefOr[KeyPair] = js.undefined
}
object GetKeyPairResult {
  
  inline def apply(): GetKeyPairResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetKeyPairResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetKeyPairResult] (val x: Self) extends AnyVal {
    
    inline def setKeyPair(value: KeyPair): Self = StObject.set(x, "keyPair", value.asInstanceOf[js.Any])
    
    inline def setKeyPairUndefined: Self = StObject.set(x, "keyPair", js.undefined)
  }
}
