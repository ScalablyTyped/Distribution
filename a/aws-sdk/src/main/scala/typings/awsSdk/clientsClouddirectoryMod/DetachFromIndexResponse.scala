package typings.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetachFromIndexResponse extends StObject {
  
  /**
    * The ObjectIdentifier of the object that was detached from the index.
    */
  var DetachedObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined
}
object DetachFromIndexResponse {
  
  inline def apply(): DetachFromIndexResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetachFromIndexResponse]
  }
  
  extension [Self <: DetachFromIndexResponse](x: Self) {
    
    inline def setDetachedObjectIdentifier(value: ObjectIdentifier): Self = StObject.set(x, "DetachedObjectIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDetachedObjectIdentifierUndefined: Self = StObject.set(x, "DetachedObjectIdentifier", js.undefined)
  }
}
