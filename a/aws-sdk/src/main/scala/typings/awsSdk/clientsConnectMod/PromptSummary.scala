package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PromptSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the prompt.
    */
  var Arn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The identifier of the prompt.
    */
  var Id: js.UndefOr[PromptId] = js.undefined
  
  /**
    * The name of the prompt.
    */
  var Name: js.UndefOr[PromptName] = js.undefined
}
object PromptSummary {
  
  inline def apply(): PromptSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PromptSummary]
  }
  
  extension [Self <: PromptSummary](x: Self) {
    
    inline def setArn(value: ARN): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setId(value: PromptId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setName(value: PromptName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
