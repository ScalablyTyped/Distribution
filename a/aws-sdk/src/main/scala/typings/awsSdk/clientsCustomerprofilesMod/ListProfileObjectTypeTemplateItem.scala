package typings.awsSdk.clientsCustomerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListProfileObjectTypeTemplateItem extends StObject {
  
  /**
    * The name of the source of the object template.
    */
  var SourceName: js.UndefOr[name] = js.undefined
  
  /**
    * The source of the object template.
    */
  var SourceObject: js.UndefOr[name] = js.undefined
  
  /**
    * A unique identifier for the object template.
    */
  var TemplateId: js.UndefOr[name] = js.undefined
}
object ListProfileObjectTypeTemplateItem {
  
  inline def apply(): ListProfileObjectTypeTemplateItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProfileObjectTypeTemplateItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListProfileObjectTypeTemplateItem] (val x: Self) extends AnyVal {
    
    inline def setSourceName(value: name): Self = StObject.set(x, "SourceName", value.asInstanceOf[js.Any])
    
    inline def setSourceNameUndefined: Self = StObject.set(x, "SourceName", js.undefined)
    
    inline def setSourceObject(value: name): Self = StObject.set(x, "SourceObject", value.asInstanceOf[js.Any])
    
    inline def setSourceObjectUndefined: Self = StObject.set(x, "SourceObject", js.undefined)
    
    inline def setTemplateId(value: name): Self = StObject.set(x, "TemplateId", value.asInstanceOf[js.Any])
    
    inline def setTemplateIdUndefined: Self = StObject.set(x, "TemplateId", js.undefined)
  }
}
