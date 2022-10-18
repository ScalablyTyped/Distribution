package typings.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDetachObjectResponse extends StObject {
  
  /**
    * The ObjectIdentifier of the detached object.
    */
  var detachedObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined
}
object BatchDetachObjectResponse {
  
  inline def apply(): BatchDetachObjectResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDetachObjectResponse]
  }
  
  extension [Self <: BatchDetachObjectResponse](x: Self) {
    
    inline def setDetachedObjectIdentifier(value: ObjectIdentifier): Self = StObject.set(x, "detachedObjectIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDetachedObjectIdentifierUndefined: Self = StObject.set(x, "detachedObjectIdentifier", js.undefined)
  }
}
