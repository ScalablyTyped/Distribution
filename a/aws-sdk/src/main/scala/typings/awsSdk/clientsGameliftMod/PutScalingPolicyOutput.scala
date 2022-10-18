package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutScalingPolicyOutput extends StObject {
  
  /**
    * A descriptive label that is associated with a fleet's scaling policy. Policy names do not need to be unique.
    */
  var Name: js.UndefOr[NonZeroAndMaxString] = js.undefined
}
object PutScalingPolicyOutput {
  
  inline def apply(): PutScalingPolicyOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutScalingPolicyOutput]
  }
  
  extension [Self <: PutScalingPolicyOutput](x: Self) {
    
    inline def setName(value: NonZeroAndMaxString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
