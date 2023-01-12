package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateWorkflowResponse extends StObject {
  
  /**
    * The name of the workflow which was specified in input.
    */
  var Name: js.UndefOr[NameString] = js.undefined
}
object UpdateWorkflowResponse {
  
  inline def apply(): UpdateWorkflowResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateWorkflowResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateWorkflowResponse] (val x: Self) extends AnyVal {
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
