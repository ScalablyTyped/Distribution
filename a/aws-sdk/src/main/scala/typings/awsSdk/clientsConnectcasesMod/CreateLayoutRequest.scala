package typings.awsSdk.clientsConnectcasesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLayoutRequest extends StObject {
  
  /**
    * Information about which fields will be present in the layout, and information about the order of the fields.
    */
  var content: LayoutContent
  
  /**
    * The unique identifier of the Cases domain. 
    */
  var domainId: DomainId
  
  /**
    * The name of the layout. It must be unique for the Cases domain.
    */
  var name: LayoutName
}
object CreateLayoutRequest {
  
  inline def apply(content: LayoutContent, domainId: DomainId, name: LayoutName): CreateLayoutRequest = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], domainId = domainId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLayoutRequest]
  }
  
  extension [Self <: CreateLayoutRequest](x: Self) {
    
    inline def setContent(value: LayoutContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setDomainId(value: DomainId): Self = StObject.set(x, "domainId", value.asInstanceOf[js.Any])
    
    inline def setName(value: LayoutName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
