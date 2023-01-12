package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectMitigationActionsTaskStatistics extends StObject {
  
  /**
    *  The actions that were performed. 
    */
  var actionsExecuted: js.UndefOr[GenericLongValue] = js.undefined
  
  /**
    *  The actions that failed. 
    */
  var actionsFailed: js.UndefOr[GenericLongValue] = js.undefined
  
  /**
    *  The actions that were skipped. 
    */
  var actionsSkipped: js.UndefOr[GenericLongValue] = js.undefined
}
object DetectMitigationActionsTaskStatistics {
  
  inline def apply(): DetectMitigationActionsTaskStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectMitigationActionsTaskStatistics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DetectMitigationActionsTaskStatistics] (val x: Self) extends AnyVal {
    
    inline def setActionsExecuted(value: GenericLongValue): Self = StObject.set(x, "actionsExecuted", value.asInstanceOf[js.Any])
    
    inline def setActionsExecutedUndefined: Self = StObject.set(x, "actionsExecuted", js.undefined)
    
    inline def setActionsFailed(value: GenericLongValue): Self = StObject.set(x, "actionsFailed", value.asInstanceOf[js.Any])
    
    inline def setActionsFailedUndefined: Self = StObject.set(x, "actionsFailed", js.undefined)
    
    inline def setActionsSkipped(value: GenericLongValue): Self = StObject.set(x, "actionsSkipped", value.asInstanceOf[js.Any])
    
    inline def setActionsSkippedUndefined: Self = StObject.set(x, "actionsSkipped", js.undefined)
  }
}
