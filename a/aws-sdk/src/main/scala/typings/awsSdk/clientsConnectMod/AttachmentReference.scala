package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachmentReference extends StObject {
  
  /**
    * Identifier of the attachment reference.
    */
  var Name: js.UndefOr[ReferenceKey] = js.undefined
  
  /**
    * Status of the attachment reference type.
    */
  var Status: js.UndefOr[ReferenceStatus] = js.undefined
  
  /**
    * The location path of the attachment reference.
    */
  var Value: js.UndefOr[ReferenceValue] = js.undefined
}
object AttachmentReference {
  
  inline def apply(): AttachmentReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachmentReference]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttachmentReference] (val x: Self) extends AnyVal {
    
    inline def setName(value: ReferenceKey): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setStatus(value: ReferenceStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setValue(value: ReferenceValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
