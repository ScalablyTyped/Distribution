package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterTimeline extends StObject {
  
  /**
    * The creation date and time of the cluster.
    */
  var CreationDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The date and time when the cluster was terminated.
    */
  var EndDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The date and time when the cluster was ready to run steps.
    */
  var ReadyDateTime: js.UndefOr[js.Date] = js.undefined
}
object ClusterTimeline {
  
  inline def apply(): ClusterTimeline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterTimeline]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClusterTimeline] (val x: Self) extends AnyVal {
    
    inline def setCreationDateTime(value: js.Date): Self = StObject.set(x, "CreationDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreationDateTimeUndefined: Self = StObject.set(x, "CreationDateTime", js.undefined)
    
    inline def setEndDateTime(value: js.Date): Self = StObject.set(x, "EndDateTime", value.asInstanceOf[js.Any])
    
    inline def setEndDateTimeUndefined: Self = StObject.set(x, "EndDateTime", js.undefined)
    
    inline def setReadyDateTime(value: js.Date): Self = StObject.set(x, "ReadyDateTime", value.asInstanceOf[js.Any])
    
    inline def setReadyDateTimeUndefined: Self = StObject.set(x, "ReadyDateTime", js.undefined)
  }
}
