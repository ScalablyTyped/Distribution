package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolvedAttributes extends StObject {
  
  var AutoMLJobObjective: js.UndefOr[typings.awsSdk.clientsSagemakerMod.AutoMLJobObjective] = js.undefined
  
  var CompletionCriteria: js.UndefOr[AutoMLJobCompletionCriteria] = js.undefined
  
  /**
    * The problem type.
    */
  var ProblemType: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ProblemType] = js.undefined
}
object ResolvedAttributes {
  
  inline def apply(): ResolvedAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolvedAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResolvedAttributes] (val x: Self) extends AnyVal {
    
    inline def setAutoMLJobObjective(value: AutoMLJobObjective): Self = StObject.set(x, "AutoMLJobObjective", value.asInstanceOf[js.Any])
    
    inline def setAutoMLJobObjectiveUndefined: Self = StObject.set(x, "AutoMLJobObjective", js.undefined)
    
    inline def setCompletionCriteria(value: AutoMLJobCompletionCriteria): Self = StObject.set(x, "CompletionCriteria", value.asInstanceOf[js.Any])
    
    inline def setCompletionCriteriaUndefined: Self = StObject.set(x, "CompletionCriteria", js.undefined)
    
    inline def setProblemType(value: ProblemType): Self = StObject.set(x, "ProblemType", value.asInstanceOf[js.Any])
    
    inline def setProblemTypeUndefined: Self = StObject.set(x, "ProblemType", js.undefined)
  }
}
