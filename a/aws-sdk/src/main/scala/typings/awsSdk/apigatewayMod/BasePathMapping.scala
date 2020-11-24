package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BasePathMapping extends js.Object {
  
  /**
    * The base path name that callers of the API must provide as part of the URL after the domain name.
    */
  var basePath: js.UndefOr[String] = js.native
  
  /**
    * The string identifier of the associated RestApi.
    */
  var restApiId: js.UndefOr[String] = js.native
  
  /**
    * The name of the associated stage.
    */
  var stage: js.UndefOr[String] = js.native
}
object BasePathMapping {
  
  @scala.inline
  def apply(): BasePathMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasePathMapping]
  }
  
  @scala.inline
  implicit class BasePathMappingOps[Self <: BasePathMapping] (val x: Self) extends AnyVal {
    
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
    def setBasePath(value: String): Self = this.set("basePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBasePath: Self = this.set("basePath", js.undefined)
    
    @scala.inline
    def setRestApiId(value: String): Self = this.set("restApiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestApiId: Self = this.set("restApiId", js.undefined)
    
    @scala.inline
    def setStage(value: String): Self = this.set("stage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStage: Self = this.set("stage", js.undefined)
  }
}
