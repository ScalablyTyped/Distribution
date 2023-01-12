package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFlowSourceResponse extends StObject {
  
  /**
    * The ARN of the flow that you want to update.
    */
  var FlowArn: js.UndefOr[string] = js.undefined
  
  /**
    * The settings for the source of the flow.
    */
  var Source: js.UndefOr[typings.awsSdk.clientsMediaconnectMod.Source] = js.undefined
}
object UpdateFlowSourceResponse {
  
  inline def apply(): UpdateFlowSourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateFlowSourceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateFlowSourceResponse] (val x: Self) extends AnyVal {
    
    inline def setFlowArn(value: string): Self = StObject.set(x, "FlowArn", value.asInstanceOf[js.Any])
    
    inline def setFlowArnUndefined: Self = StObject.set(x, "FlowArn", js.undefined)
    
    inline def setSource(value: Source): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "Source", js.undefined)
  }
}
