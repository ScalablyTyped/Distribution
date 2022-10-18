package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFleetsInput extends StObject {
  
  /**
    * A unique identifier for the build to request fleets for. Use this parameter to return only fleets using a specified build. Use either the build ID or ARN value.
    */
  var BuildId: js.UndefOr[BuildIdOrArn] = js.undefined
  
  /**
    * The maximum number of results to return. Use this parameter with NextToken to get results as a set of sequential pages.
    */
  var Limit: js.UndefOr[PositiveInteger] = js.undefined
  
  /**
    * A token that indicates the start of the next sequential page of results. Use the token that is returned with a previous call to this operation. To start at the beginning of the result set, do not specify a value.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
  
  /**
    * A unique identifier for the Realtime script to request fleets for. Use this parameter to return only fleets using a specified script. Use either the script ID or ARN value.
    */
  var ScriptId: js.UndefOr[ScriptIdOrArn] = js.undefined
}
object ListFleetsInput {
  
  inline def apply(): ListFleetsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFleetsInput]
  }
  
  extension [Self <: ListFleetsInput](x: Self) {
    
    inline def setBuildId(value: BuildIdOrArn): Self = StObject.set(x, "BuildId", value.asInstanceOf[js.Any])
    
    inline def setBuildIdUndefined: Self = StObject.set(x, "BuildId", js.undefined)
    
    inline def setLimit(value: PositiveInteger): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    inline def setNextToken(value: NonZeroAndMaxString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setScriptId(value: ScriptIdOrArn): Self = StObject.set(x, "ScriptId", value.asInstanceOf[js.Any])
    
    inline def setScriptIdUndefined: Self = StObject.set(x, "ScriptId", js.undefined)
  }
}
