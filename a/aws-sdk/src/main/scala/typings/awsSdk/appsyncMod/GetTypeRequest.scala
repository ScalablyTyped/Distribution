package typings.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetTypeRequest extends js.Object {
  
  /**
    * The API ID.
    */
  var apiId: String = js.native
  
  /**
    * The type format: SDL or JSON.
    */
  var format: TypeDefinitionFormat = js.native
  
  /**
    * The type name.
    */
  var typeName: ResourceName = js.native
}
object GetTypeRequest {
  
  @scala.inline
  def apply(apiId: String, format: TypeDefinitionFormat, typeName: ResourceName): GetTypeRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTypeRequest]
  }
  
  @scala.inline
  implicit class GetTypeRequestOps[Self <: GetTypeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApiId(value: String): Self = this.set("apiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: TypeDefinitionFormat): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeName(value: ResourceName): Self = this.set("typeName", value.asInstanceOf[js.Any])
  }
}
