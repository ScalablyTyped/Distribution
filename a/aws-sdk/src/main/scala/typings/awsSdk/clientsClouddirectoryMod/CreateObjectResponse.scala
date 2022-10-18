package typings.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateObjectResponse extends StObject {
  
  /**
    * The identifier that is associated with the object.
    */
  var ObjectIdentifier: js.UndefOr[typings.awsSdk.clientsClouddirectoryMod.ObjectIdentifier] = js.undefined
}
object CreateObjectResponse {
  
  inline def apply(): CreateObjectResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateObjectResponse]
  }
  
  extension [Self <: CreateObjectResponse](x: Self) {
    
    inline def setObjectIdentifier(value: ObjectIdentifier): Self = StObject.set(x, "ObjectIdentifier", value.asInstanceOf[js.Any])
    
    inline def setObjectIdentifierUndefined: Self = StObject.set(x, "ObjectIdentifier", js.undefined)
  }
}
