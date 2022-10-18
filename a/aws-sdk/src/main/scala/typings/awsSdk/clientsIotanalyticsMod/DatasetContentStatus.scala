package typings.awsSdk.clientsIotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatasetContentStatus extends StObject {
  
  /**
    * The reason the dataset contents are in this state.
    */
  var reason: js.UndefOr[Reason] = js.undefined
  
  /**
    * The state of the dataset contents. Can be one of READY, CREATING, SUCCEEDED, or FAILED.
    */
  var state: js.UndefOr[DatasetContentState] = js.undefined
}
object DatasetContentStatus {
  
  inline def apply(): DatasetContentStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatasetContentStatus]
  }
  
  extension [Self <: DatasetContentStatus](x: Self) {
    
    inline def setReason(value: Reason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setState(value: DatasetContentState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
