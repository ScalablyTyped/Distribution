package typings.awsSdk.accessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAccessPreviewRequest extends StObject {
  
  /**
    * The ARN of the account analyzer used to generate the access preview. You can only create an access preview for analyzers with an Account type and Active status.
    */
  var analyzerArn: AnalyzerArn
  
  /**
    * A client token.
    */
  var clientToken: js.UndefOr[String] = js.undefined
  
  /**
    * Access control configuration for your resource that is used to generate the access preview. The access preview includes findings for external access allowed to the resource with the proposed access control configuration. The configuration must contain exactly one element.
    */
  var configurations: ConfigurationsMap
}
object CreateAccessPreviewRequest {
  
  inline def apply(analyzerArn: AnalyzerArn, configurations: ConfigurationsMap): CreateAccessPreviewRequest = {
    val __obj = js.Dynamic.literal(analyzerArn = analyzerArn.asInstanceOf[js.Any], configurations = configurations.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAccessPreviewRequest]
  }
  
  extension [Self <: CreateAccessPreviewRequest](x: Self) {
    
    inline def setAnalyzerArn(value: AnalyzerArn): Self = StObject.set(x, "analyzerArn", value.asInstanceOf[js.Any])
    
    inline def setClientToken(value: String): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setConfigurations(value: ConfigurationsMap): Self = StObject.set(x, "configurations", value.asInstanceOf[js.Any])
  }
}
