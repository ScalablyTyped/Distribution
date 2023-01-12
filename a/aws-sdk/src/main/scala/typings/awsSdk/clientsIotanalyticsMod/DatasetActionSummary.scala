package typings.awsSdk.clientsIotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatasetActionSummary extends StObject {
  
  /**
    * The name of the action that automatically creates the dataset's contents.
    */
  var actionName: js.UndefOr[DatasetActionName] = js.undefined
  
  /**
    * The type of action by which the dataset's contents are automatically created.
    */
  var actionType: js.UndefOr[DatasetActionType] = js.undefined
}
object DatasetActionSummary {
  
  inline def apply(): DatasetActionSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatasetActionSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DatasetActionSummary] (val x: Self) extends AnyVal {
    
    inline def setActionName(value: DatasetActionName): Self = StObject.set(x, "actionName", value.asInstanceOf[js.Any])
    
    inline def setActionNameUndefined: Self = StObject.set(x, "actionName", js.undefined)
    
    inline def setActionType(value: DatasetActionType): Self = StObject.set(x, "actionType", value.asInstanceOf[js.Any])
    
    inline def setActionTypeUndefined: Self = StObject.set(x, "actionType", js.undefined)
  }
}
