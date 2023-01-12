package typings.awsSdk.clientsLambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFunctionResponse extends StObject {
  
  /**
    * The deployment package of the function or version.
    */
  var Code: js.UndefOr[FunctionCodeLocation] = js.undefined
  
  /**
    * The function's reserved concurrency.
    */
  var Concurrency: js.UndefOr[typings.awsSdk.clientsLambdaMod.Concurrency] = js.undefined
  
  /**
    * The configuration of the function or version.
    */
  var Configuration: js.UndefOr[FunctionConfiguration] = js.undefined
  
  /**
    * The function's tags.
    */
  var Tags: js.UndefOr[typings.awsSdk.clientsLambdaMod.Tags] = js.undefined
}
object GetFunctionResponse {
  
  inline def apply(): GetFunctionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFunctionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetFunctionResponse] (val x: Self) extends AnyVal {
    
    inline def setCode(value: FunctionCodeLocation): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    inline def setConcurrency(value: Concurrency): Self = StObject.set(x, "Concurrency", value.asInstanceOf[js.Any])
    
    inline def setConcurrencyUndefined: Self = StObject.set(x, "Concurrency", js.undefined)
    
    inline def setConfiguration(value: FunctionConfiguration): Self = StObject.set(x, "Configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationUndefined: Self = StObject.set(x, "Configuration", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
