package typings.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachToIndexResponse extends StObject {
  
  /**
    * The ObjectIdentifier of the object that was attached to the index.
    */
  var AttachedObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined
}
object AttachToIndexResponse {
  
  inline def apply(): AttachToIndexResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachToIndexResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttachToIndexResponse] (val x: Self) extends AnyVal {
    
    inline def setAttachedObjectIdentifier(value: ObjectIdentifier): Self = StObject.set(x, "AttachedObjectIdentifier", value.asInstanceOf[js.Any])
    
    inline def setAttachedObjectIdentifierUndefined: Self = StObject.set(x, "AttachedObjectIdentifier", js.undefined)
  }
}
