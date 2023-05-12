package typings.awsSdk.clientsOamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutSinkPolicyOutput extends StObject {
  
  /**
    * The policy that you specified.
    */
  var Policy: js.UndefOr[String] = js.undefined
  
  /**
    * The ARN of the sink.
    */
  var SinkArn: js.UndefOr[String] = js.undefined
  
  /**
    * The random ID string that Amazon Web Services generated as part of the sink ARN.
    */
  var SinkId: js.UndefOr[String] = js.undefined
}
object PutSinkPolicyOutput {
  
  inline def apply(): PutSinkPolicyOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutSinkPolicyOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutSinkPolicyOutput] (val x: Self) extends AnyVal {
    
    inline def setPolicy(value: String): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
    
    inline def setSinkArn(value: String): Self = StObject.set(x, "SinkArn", value.asInstanceOf[js.Any])
    
    inline def setSinkArnUndefined: Self = StObject.set(x, "SinkArn", js.undefined)
    
    inline def setSinkId(value: String): Self = StObject.set(x, "SinkId", value.asInstanceOf[js.Any])
    
    inline def setSinkIdUndefined: Self = StObject.set(x, "SinkId", js.undefined)
  }
}
