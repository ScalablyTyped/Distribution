package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTrialResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the trial.
    */
  var TrialArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.TrialArn] = js.undefined
}
object CreateTrialResponse {
  
  inline def apply(): CreateTrialResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTrialResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateTrialResponse] (val x: Self) extends AnyVal {
    
    inline def setTrialArn(value: TrialArn): Self = StObject.set(x, "TrialArn", value.asInstanceOf[js.Any])
    
    inline def setTrialArnUndefined: Self = StObject.set(x, "TrialArn", js.undefined)
  }
}
