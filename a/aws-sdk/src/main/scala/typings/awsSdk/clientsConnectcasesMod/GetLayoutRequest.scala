package typings.awsSdk.clientsConnectcasesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLayoutRequest extends StObject {
  
  /**
    * The unique identifier of the Cases domain. 
    */
  var domainId: DomainId
  
  /**
    * The unique identifier of the layout.
    */
  var layoutId: LayoutId
}
object GetLayoutRequest {
  
  inline def apply(domainId: DomainId, layoutId: LayoutId): GetLayoutRequest = {
    val __obj = js.Dynamic.literal(domainId = domainId.asInstanceOf[js.Any], layoutId = layoutId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLayoutRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetLayoutRequest] (val x: Self) extends AnyVal {
    
    inline def setDomainId(value: DomainId): Self = StObject.set(x, "domainId", value.asInstanceOf[js.Any])
    
    inline def setLayoutId(value: LayoutId): Self = StObject.set(x, "layoutId", value.asInstanceOf[js.Any])
  }
}
