package typings.awsSdk.clientsConnectcasesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateLayoutRequest extends StObject {
  
  /**
    * Information about which fields will be present in the layout, the order of the fields, and a read-only attribute of the field. 
    */
  var content: js.UndefOr[LayoutContent] = js.undefined
  
  /**
    * The unique identifier of the Cases domain. 
    */
  var domainId: DomainId
  
  /**
    * The unique identifier of the layout.
    */
  var layoutId: LayoutId
  
  /**
    * The name of the layout. It must be unique per domain.
    */
  var name: js.UndefOr[LayoutName] = js.undefined
}
object UpdateLayoutRequest {
  
  inline def apply(domainId: DomainId, layoutId: LayoutId): UpdateLayoutRequest = {
    val __obj = js.Dynamic.literal(domainId = domainId.asInstanceOf[js.Any], layoutId = layoutId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateLayoutRequest]
  }
  
  extension [Self <: UpdateLayoutRequest](x: Self) {
    
    inline def setContent(value: LayoutContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setDomainId(value: DomainId): Self = StObject.set(x, "domainId", value.asInstanceOf[js.Any])
    
    inline def setLayoutId(value: LayoutId): Self = StObject.set(x, "layoutId", value.asInstanceOf[js.Any])
    
    inline def setName(value: LayoutName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
