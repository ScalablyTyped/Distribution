package typings.awsSdk.clientsSsmcontactsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Stage extends StObject {
  
  /**
    * The time to wait until beginning the next stage. The duration can only be set to 0 if a target is specified.
    */
  var DurationInMinutes: StageDurationInMins
  
  /**
    * The contacts or contact methods that the escalation plan or engagement plan is engaging.
    */
  var Targets: TargetsList
}
object Stage {
  
  inline def apply(DurationInMinutes: StageDurationInMins, Targets: TargetsList): Stage = {
    val __obj = js.Dynamic.literal(DurationInMinutes = DurationInMinutes.asInstanceOf[js.Any], Targets = Targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stage]
  }
  
  extension [Self <: Stage](x: Self) {
    
    inline def setDurationInMinutes(value: StageDurationInMins): Self = StObject.set(x, "DurationInMinutes", value.asInstanceOf[js.Any])
    
    inline def setTargets(value: TargetsList): Self = StObject.set(x, "Targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsVarargs(value: Target*): Self = StObject.set(x, "Targets", js.Array(value*))
  }
}
