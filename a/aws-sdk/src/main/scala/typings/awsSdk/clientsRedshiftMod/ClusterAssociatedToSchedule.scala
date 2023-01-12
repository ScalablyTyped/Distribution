package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterAssociatedToSchedule extends StObject {
  
  /**
    * 
    */
  var ClusterIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * 
    */
  var ScheduleAssociationState: js.UndefOr[ScheduleState] = js.undefined
}
object ClusterAssociatedToSchedule {
  
  inline def apply(): ClusterAssociatedToSchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterAssociatedToSchedule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClusterAssociatedToSchedule] (val x: Self) extends AnyVal {
    
    inline def setClusterIdentifier(value: String): Self = StObject.set(x, "ClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setClusterIdentifierUndefined: Self = StObject.set(x, "ClusterIdentifier", js.undefined)
    
    inline def setScheduleAssociationState(value: ScheduleState): Self = StObject.set(x, "ScheduleAssociationState", value.asInstanceOf[js.Any])
    
    inline def setScheduleAssociationStateUndefined: Self = StObject.set(x, "ScheduleAssociationState", js.undefined)
  }
}
