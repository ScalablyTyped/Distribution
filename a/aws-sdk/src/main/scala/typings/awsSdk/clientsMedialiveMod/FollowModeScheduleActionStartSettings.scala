package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FollowModeScheduleActionStartSettings extends StObject {
  
  /**
    * Identifies whether this action starts relative to the start or relative to the end of the reference action.
    */
  var FollowPoint: typings.awsSdk.clientsMedialiveMod.FollowPoint
  
  /**
    * The action name of another action that this one refers to.
    */
  var ReferenceActionName: string
}
object FollowModeScheduleActionStartSettings {
  
  inline def apply(FollowPoint: FollowPoint, ReferenceActionName: string): FollowModeScheduleActionStartSettings = {
    val __obj = js.Dynamic.literal(FollowPoint = FollowPoint.asInstanceOf[js.Any], ReferenceActionName = ReferenceActionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FollowModeScheduleActionStartSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FollowModeScheduleActionStartSettings] (val x: Self) extends AnyVal {
    
    inline def setFollowPoint(value: FollowPoint): Self = StObject.set(x, "FollowPoint", value.asInstanceOf[js.Any])
    
    inline def setReferenceActionName(value: string): Self = StObject.set(x, "ReferenceActionName", value.asInstanceOf[js.Any])
  }
}
