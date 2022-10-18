package typings.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateObjectAttributesResponse extends StObject {
  
  /**
    * The ObjectIdentifier of the updated object.
    */
  var ObjectIdentifier: js.UndefOr[typings.awsSdk.clientsClouddirectoryMod.ObjectIdentifier] = js.undefined
}
object UpdateObjectAttributesResponse {
  
  inline def apply(): UpdateObjectAttributesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateObjectAttributesResponse]
  }
  
  extension [Self <: UpdateObjectAttributesResponse](x: Self) {
    
    inline def setObjectIdentifier(value: ObjectIdentifier): Self = StObject.set(x, "ObjectIdentifier", value.asInstanceOf[js.Any])
    
    inline def setObjectIdentifierUndefined: Self = StObject.set(x, "ObjectIdentifier", js.undefined)
  }
}
