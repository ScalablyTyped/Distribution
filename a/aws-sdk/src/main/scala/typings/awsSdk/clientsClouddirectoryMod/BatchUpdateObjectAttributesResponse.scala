package typings.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchUpdateObjectAttributesResponse extends StObject {
  
  /**
    * ID that is associated with the object.
    */
  var ObjectIdentifier: js.UndefOr[typings.awsSdk.clientsClouddirectoryMod.ObjectIdentifier] = js.undefined
}
object BatchUpdateObjectAttributesResponse {
  
  inline def apply(): BatchUpdateObjectAttributesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchUpdateObjectAttributesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchUpdateObjectAttributesResponse] (val x: Self) extends AnyVal {
    
    inline def setObjectIdentifier(value: ObjectIdentifier): Self = StObject.set(x, "ObjectIdentifier", value.asInstanceOf[js.Any])
    
    inline def setObjectIdentifierUndefined: Self = StObject.set(x, "ObjectIdentifier", js.undefined)
  }
}
