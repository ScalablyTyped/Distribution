package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFunctionResult extends StObject {
  
  /**
    * The version identifier for the current version of the CloudFront function.
    */
  var ETag: js.UndefOr[String] = js.undefined
  
  /**
    * Contains configuration information and metadata about a CloudFront function.
    */
  var FunctionSummary: js.UndefOr[typings.awsSdk.clientsCloudfrontMod.FunctionSummary] = js.undefined
}
object UpdateFunctionResult {
  
  inline def apply(): UpdateFunctionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateFunctionResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateFunctionResult] (val x: Self) extends AnyVal {
    
    inline def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    inline def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
    
    inline def setFunctionSummary(value: FunctionSummary): Self = StObject.set(x, "FunctionSummary", value.asInstanceOf[js.Any])
    
    inline def setFunctionSummaryUndefined: Self = StObject.set(x, "FunctionSummary", js.undefined)
  }
}
