package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the action.
    */
  var ActionArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ActionArn] = js.undefined
  
  /**
    * The name of the action.
    */
  var ActionName: js.UndefOr[ExperimentEntityName] = js.undefined
  
  /**
    * The type of the action.
    */
  var ActionType: js.UndefOr[String64] = js.undefined
  
  /**
    * When the action was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * When the action was last modified.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The source of the action.
    */
  var Source: js.UndefOr[ActionSource] = js.undefined
  
  /**
    * The status of the action.
    */
  var Status: js.UndefOr[ActionStatus] = js.undefined
}
object ActionSummary {
  
  inline def apply(): ActionSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActionSummary] (val x: Self) extends AnyVal {
    
    inline def setActionArn(value: ActionArn): Self = StObject.set(x, "ActionArn", value.asInstanceOf[js.Any])
    
    inline def setActionArnUndefined: Self = StObject.set(x, "ActionArn", js.undefined)
    
    inline def setActionName(value: ExperimentEntityName): Self = StObject.set(x, "ActionName", value.asInstanceOf[js.Any])
    
    inline def setActionNameUndefined: Self = StObject.set(x, "ActionName", js.undefined)
    
    inline def setActionType(value: String64): Self = StObject.set(x, "ActionType", value.asInstanceOf[js.Any])
    
    inline def setActionTypeUndefined: Self = StObject.set(x, "ActionType", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setSource(value: ActionSource): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "Source", js.undefined)
    
    inline def setStatus(value: ActionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
