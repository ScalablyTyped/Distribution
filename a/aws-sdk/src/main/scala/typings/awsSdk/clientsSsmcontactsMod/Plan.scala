package typings.awsSdk.clientsSsmcontactsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Plan extends StObject {
  
  /**
    * A list of stages that the escalation plan or engagement plan uses to engage contacts and contact methods.
    */
  var Stages: StagesList
}
object Plan {
  
  inline def apply(Stages: StagesList): Plan = {
    val __obj = js.Dynamic.literal(Stages = Stages.asInstanceOf[js.Any])
    __obj.asInstanceOf[Plan]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Plan] (val x: Self) extends AnyVal {
    
    inline def setStages(value: StagesList): Self = StObject.set(x, "Stages", value.asInstanceOf[js.Any])
    
    inline def setStagesVarargs(value: Stage*): Self = StObject.set(x, "Stages", js.Array(value*))
  }
}
