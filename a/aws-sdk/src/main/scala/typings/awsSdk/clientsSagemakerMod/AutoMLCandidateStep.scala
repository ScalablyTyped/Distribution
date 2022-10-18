package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoMLCandidateStep extends StObject {
  
  /**
    * The ARN for the candidate's step.
    */
  var CandidateStepArn: typings.awsSdk.clientsSagemakerMod.CandidateStepArn
  
  /**
    * The name for the candidate's step.
    */
  var CandidateStepName: typings.awsSdk.clientsSagemakerMod.CandidateStepName
  
  /**
    * Whether the candidate is at the transform, training, or processing step.
    */
  var CandidateStepType: typings.awsSdk.clientsSagemakerMod.CandidateStepType
}
object AutoMLCandidateStep {
  
  inline def apply(
    CandidateStepArn: CandidateStepArn,
    CandidateStepName: CandidateStepName,
    CandidateStepType: CandidateStepType
  ): AutoMLCandidateStep = {
    val __obj = js.Dynamic.literal(CandidateStepArn = CandidateStepArn.asInstanceOf[js.Any], CandidateStepName = CandidateStepName.asInstanceOf[js.Any], CandidateStepType = CandidateStepType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoMLCandidateStep]
  }
  
  extension [Self <: AutoMLCandidateStep](x: Self) {
    
    inline def setCandidateStepArn(value: CandidateStepArn): Self = StObject.set(x, "CandidateStepArn", value.asInstanceOf[js.Any])
    
    inline def setCandidateStepName(value: CandidateStepName): Self = StObject.set(x, "CandidateStepName", value.asInstanceOf[js.Any])
    
    inline def setCandidateStepType(value: CandidateStepType): Self = StObject.set(x, "CandidateStepType", value.asInstanceOf[js.Any])
  }
}
