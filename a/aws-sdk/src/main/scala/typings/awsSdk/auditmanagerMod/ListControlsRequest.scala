package typings.awsSdk.auditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListControlsRequest extends StObject {
  
  /**
    *  The type of control, such as a standard control or a custom control. 
    */
  var controlType: ControlType
  
  /**
    *  Represents the maximum number of results on a page or for an API request call. 
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    *  The pagination token that's used to fetch the next set of results. 
    */
  var nextToken: js.UndefOr[Token] = js.undefined
}
object ListControlsRequest {
  
  inline def apply(controlType: ControlType): ListControlsRequest = {
    val __obj = js.Dynamic.literal(controlType = controlType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListControlsRequest]
  }
  
  extension [Self <: ListControlsRequest](x: Self) {
    
    inline def setControlType(value: ControlType): Self = StObject.set(x, "controlType", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
