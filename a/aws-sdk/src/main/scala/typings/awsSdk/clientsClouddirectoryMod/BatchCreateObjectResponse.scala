package typings.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchCreateObjectResponse extends StObject {
  
  /**
    * The ID that is associated with the object.
    */
  var ObjectIdentifier: js.UndefOr[typings.awsSdk.clientsClouddirectoryMod.ObjectIdentifier] = js.undefined
}
object BatchCreateObjectResponse {
  
  inline def apply(): BatchCreateObjectResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchCreateObjectResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchCreateObjectResponse] (val x: Self) extends AnyVal {
    
    inline def setObjectIdentifier(value: ObjectIdentifier): Self = StObject.set(x, "ObjectIdentifier", value.asInstanceOf[js.Any])
    
    inline def setObjectIdentifierUndefined: Self = StObject.set(x, "ObjectIdentifier", js.undefined)
  }
}
