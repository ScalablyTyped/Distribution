package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetWorkflowRequest extends StObject {
  
  /**
    * Specifies whether to include a graph when returning the workflow resource metadata.
    */
  var IncludeGraph: js.UndefOr[NullableBoolean] = js.undefined
  
  /**
    * The name of the workflow to retrieve.
    */
  var Name: NameString
}
object GetWorkflowRequest {
  
  inline def apply(Name: NameString): GetWorkflowRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWorkflowRequest]
  }
  
  extension [Self <: GetWorkflowRequest](x: Self) {
    
    inline def setIncludeGraph(value: NullableBoolean): Self = StObject.set(x, "IncludeGraph", value.asInstanceOf[js.Any])
    
    inline def setIncludeGraphUndefined: Self = StObject.set(x, "IncludeGraph", js.undefined)
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
