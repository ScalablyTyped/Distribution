package typings.awsSdk.clientsCustomerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectTypeField extends StObject {
  
  /**
    * The content type of the field. Used for determining equality when searching.
    */
  var ContentType: js.UndefOr[FieldContentType] = js.undefined
  
  /**
    * A field of a ProfileObject. For example: _source.FirstName, where “_source” is a ProfileObjectType of a Zendesk user and “FirstName” is a field in that ObjectType.
    */
  var Source: js.UndefOr[text] = js.undefined
  
  /**
    * The location of the data in the standard ProfileObject model. For example: _profile.Address.PostalCode.
    */
  var Target: js.UndefOr[text] = js.undefined
}
object ObjectTypeField {
  
  inline def apply(): ObjectTypeField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectTypeField]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObjectTypeField] (val x: Self) extends AnyVal {
    
    inline def setContentType(value: FieldContentType): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "ContentType", js.undefined)
    
    inline def setSource(value: text): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "Source", js.undefined)
    
    inline def setTarget(value: text): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "Target", js.undefined)
  }
}
