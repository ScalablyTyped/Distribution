package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePipelineResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the created pipeline.
    */
  var PipelineArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.PipelineArn] = js.undefined
}
object CreatePipelineResponse {
  
  inline def apply(): CreatePipelineResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePipelineResponse]
  }
  
  extension [Self <: CreatePipelineResponse](x: Self) {
    
    inline def setPipelineArn(value: PipelineArn): Self = StObject.set(x, "PipelineArn", value.asInstanceOf[js.Any])
    
    inline def setPipelineArnUndefined: Self = StObject.set(x, "PipelineArn", js.undefined)
  }
}
