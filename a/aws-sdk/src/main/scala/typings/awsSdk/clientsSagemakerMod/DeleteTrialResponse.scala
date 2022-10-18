package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTrialResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the trial that is being deleted.
    */
  var TrialArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.TrialArn] = js.undefined
}
object DeleteTrialResponse {
  
  inline def apply(): DeleteTrialResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteTrialResponse]
  }
  
  extension [Self <: DeleteTrialResponse](x: Self) {
    
    inline def setTrialArn(value: TrialArn): Self = StObject.set(x, "TrialArn", value.asInstanceOf[js.Any])
    
    inline def setTrialArnUndefined: Self = StObject.set(x, "TrialArn", js.undefined)
  }
}
