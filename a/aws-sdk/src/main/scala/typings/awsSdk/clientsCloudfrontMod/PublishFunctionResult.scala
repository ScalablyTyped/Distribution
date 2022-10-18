package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublishFunctionResult extends StObject {
  
  /**
    * Contains configuration information and metadata about a CloudFront function.
    */
  var FunctionSummary: js.UndefOr[typings.awsSdk.clientsCloudfrontMod.FunctionSummary] = js.undefined
}
object PublishFunctionResult {
  
  inline def apply(): PublishFunctionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublishFunctionResult]
  }
  
  extension [Self <: PublishFunctionResult](x: Self) {
    
    inline def setFunctionSummary(value: FunctionSummary): Self = StObject.set(x, "FunctionSummary", value.asInstanceOf[js.Any])
    
    inline def setFunctionSummaryUndefined: Self = StObject.set(x, "FunctionSummary", js.undefined)
  }
}
