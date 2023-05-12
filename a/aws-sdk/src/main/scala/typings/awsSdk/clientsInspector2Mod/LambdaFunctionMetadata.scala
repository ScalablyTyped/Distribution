package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LambdaFunctionMetadata extends StObject {
  
  /**
    * The name of a function.
    */
  var functionName: js.UndefOr[String] = js.undefined
  
  /**
    * The resource tags on an AWS Lambda function.
    */
  var functionTags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The layers for an AWS Lambda function. A Lambda function can have up to five layers.
    */
  var layers: js.UndefOr[LambdaLayerList] = js.undefined
  
  /**
    * An AWS Lambda function's runtime.
    */
  var runtime: js.UndefOr[Runtime] = js.undefined
}
object LambdaFunctionMetadata {
  
  inline def apply(): LambdaFunctionMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LambdaFunctionMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LambdaFunctionMetadata] (val x: Self) extends AnyVal {
    
    inline def setFunctionName(value: String): Self = StObject.set(x, "functionName", value.asInstanceOf[js.Any])
    
    inline def setFunctionNameUndefined: Self = StObject.set(x, "functionName", js.undefined)
    
    inline def setFunctionTags(value: TagMap): Self = StObject.set(x, "functionTags", value.asInstanceOf[js.Any])
    
    inline def setFunctionTagsUndefined: Self = StObject.set(x, "functionTags", js.undefined)
    
    inline def setLayers(value: LambdaLayerList): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
    
    inline def setLayersVarargs(value: String*): Self = StObject.set(x, "layers", js.Array(value*))
    
    inline def setRuntime(value: Runtime): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    
    inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
  }
}
