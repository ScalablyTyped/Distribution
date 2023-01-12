package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTemplateAliasResponse extends StObject {
  
  /**
    * The Amazon Web Services request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.undefined
  
  /**
    * Information about the template alias.
    */
  var TemplateAlias: js.UndefOr[typings.awsSdk.clientsQuicksightMod.TemplateAlias] = js.undefined
}
object CreateTemplateAliasResponse {
  
  inline def apply(): CreateTemplateAliasResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTemplateAliasResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateTemplateAliasResponse] (val x: Self) extends AnyVal {
    
    inline def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    inline def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTemplateAlias(value: TemplateAlias): Self = StObject.set(x, "TemplateAlias", value.asInstanceOf[js.Any])
    
    inline def setTemplateAliasUndefined: Self = StObject.set(x, "TemplateAlias", js.undefined)
  }
}
