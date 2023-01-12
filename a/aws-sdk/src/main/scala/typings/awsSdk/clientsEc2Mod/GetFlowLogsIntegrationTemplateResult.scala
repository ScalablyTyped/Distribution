package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFlowLogsIntegrationTemplateResult extends StObject {
  
  /**
    * The generated CloudFormation template.
    */
  var Result: js.UndefOr[String] = js.undefined
}
object GetFlowLogsIntegrationTemplateResult {
  
  inline def apply(): GetFlowLogsIntegrationTemplateResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFlowLogsIntegrationTemplateResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetFlowLogsIntegrationTemplateResult] (val x: Self) extends AnyVal {
    
    inline def setResult(value: String): Self = StObject.set(x, "Result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "Result", js.undefined)
  }
}
