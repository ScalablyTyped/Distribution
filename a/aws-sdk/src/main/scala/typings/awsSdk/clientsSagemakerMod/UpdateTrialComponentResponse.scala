package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTrialComponentResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the trial component.
    */
  var TrialComponentArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.TrialComponentArn] = js.undefined
}
object UpdateTrialComponentResponse {
  
  inline def apply(): UpdateTrialComponentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateTrialComponentResponse]
  }
  
  extension [Self <: UpdateTrialComponentResponse](x: Self) {
    
    inline def setTrialComponentArn(value: TrialComponentArn): Self = StObject.set(x, "TrialComponentArn", value.asInstanceOf[js.Any])
    
    inline def setTrialComponentArnUndefined: Self = StObject.set(x, "TrialComponentArn", js.undefined)
  }
}
