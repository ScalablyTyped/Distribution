package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkflowParameter extends StObject {
  
  /**
    * The parameter's description.
    */
  var description: js.UndefOr[WorkflowParameterDescription] = js.undefined
  
  /**
    * Whether the parameter is optional.
    */
  var optional: js.UndefOr[Boolean] = js.undefined
}
object WorkflowParameter {
  
  inline def apply(): WorkflowParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkflowParameter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkflowParameter] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: WorkflowParameterDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
  }
}
