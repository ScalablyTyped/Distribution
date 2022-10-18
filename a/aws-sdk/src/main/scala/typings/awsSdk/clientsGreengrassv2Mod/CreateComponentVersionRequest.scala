package typings.awsSdk.clientsGreengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateComponentVersionRequest extends StObject {
  
  /**
    * A unique, case-sensitive identifier that you can provide to ensure that the request is idempotent. Idempotency means that the request is successfully processed only once, even if you send the request multiple times. When a request succeeds, and you specify the same client token for subsequent successful requests, the IoT Greengrass V2 service returns the successful response that it caches from the previous request. IoT Greengrass V2 caches successful responses for idempotent requests for up to 8 hours.
    */
  var clientToken: js.UndefOr[ClientTokenString] = js.undefined
  
  /**
    * The recipe to use to create the component. The recipe defines the component's metadata, parameters, dependencies, lifecycle, artifacts, and platform compatibility. You must specify either inlineRecipe or lambdaFunction.
    */
  var inlineRecipe: js.UndefOr[RecipeBlob] = js.undefined
  
  /**
    * The parameters to create a component from a Lambda function. You must specify either inlineRecipe or lambdaFunction.
    */
  var lambdaFunction: js.UndefOr[LambdaFunctionRecipeSource] = js.undefined
  
  /**
    * A list of key-value pairs that contain metadata for the resource. For more information, see Tag your resources in the IoT Greengrass V2 Developer Guide.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object CreateComponentVersionRequest {
  
  inline def apply(): CreateComponentVersionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateComponentVersionRequest]
  }
  
  extension [Self <: CreateComponentVersionRequest](x: Self) {
    
    inline def setClientToken(value: ClientTokenString): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setInlineRecipe(value: RecipeBlob): Self = StObject.set(x, "inlineRecipe", value.asInstanceOf[js.Any])
    
    inline def setInlineRecipeUndefined: Self = StObject.set(x, "inlineRecipe", js.undefined)
    
    inline def setLambdaFunction(value: LambdaFunctionRecipeSource): Self = StObject.set(x, "lambdaFunction", value.asInstanceOf[js.Any])
    
    inline def setLambdaFunctionUndefined: Self = StObject.set(x, "lambdaFunction", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
