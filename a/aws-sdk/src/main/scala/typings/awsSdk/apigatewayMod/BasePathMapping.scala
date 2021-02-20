package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BasePathMapping extends StObject {
  
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
  implicit class BasePathMappingMutableBuilder[Self <: BasePathMapping] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
    
    @scala.inline
    def setRestApiId(value: String): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestApiIdUndefined: Self = StObject.set(x, "restApiId", js.undefined)
    
    @scala.inline
    def setStage(value: String): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStageUndefined: Self = StObject.set(x, "stage", js.undefined)
  }
}
