package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunctionSummary extends StObject {
  
  /**
    * Contains configuration information about a CloudFront function.
    */
  var FunctionConfig: typings.awsSdk.clientsCloudfrontMod.FunctionConfig
  
  /**
    * Contains metadata about a CloudFront function.
    */
  var FunctionMetadata: typings.awsSdk.clientsCloudfrontMod.FunctionMetadata
  
  /**
    * The name of the CloudFront function.
    */
  var Name: FunctionName
  
  /**
    * The status of the CloudFront function.
    */
  var Status: js.UndefOr[String] = js.undefined
}
object FunctionSummary {
  
  inline def apply(FunctionConfig: FunctionConfig, FunctionMetadata: FunctionMetadata, Name: FunctionName): FunctionSummary = {
    val __obj = js.Dynamic.literal(FunctionConfig = FunctionConfig.asInstanceOf[js.Any], FunctionMetadata = FunctionMetadata.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionSummary]
  }
  
  extension [Self <: FunctionSummary](x: Self) {
    
    inline def setFunctionConfig(value: FunctionConfig): Self = StObject.set(x, "FunctionConfig", value.asInstanceOf[js.Any])
    
    inline def setFunctionMetadata(value: FunctionMetadata): Self = StObject.set(x, "FunctionMetadata", value.asInstanceOf[js.Any])
    
    inline def setName(value: FunctionName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
