package typings.awsSdk.clientsEsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCompatibleElasticsearchVersionsRequest extends StObject {
  
  var DomainName: js.UndefOr[typings.awsSdk.clientsEsMod.DomainName] = js.undefined
}
object GetCompatibleElasticsearchVersionsRequest {
  
  inline def apply(): GetCompatibleElasticsearchVersionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCompatibleElasticsearchVersionsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetCompatibleElasticsearchVersionsRequest] (val x: Self) extends AnyVal {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setDomainNameUndefined: Self = StObject.set(x, "DomainName", js.undefined)
  }
}
