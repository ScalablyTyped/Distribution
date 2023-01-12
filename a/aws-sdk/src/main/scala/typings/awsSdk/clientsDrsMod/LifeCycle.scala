package typings.awsSdk.clientsDrsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LifeCycle extends StObject {
  
  /**
    * The date and time of when the Source Server was added to the service.
    */
  var addedToServiceDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined
  
  /**
    * The amount of time that the Source Server has been replicating for.
    */
  var elapsedReplicationDuration: js.UndefOr[ISO8601DurationString] = js.undefined
  
  /**
    * The date and time of the first byte that was replicated from the Source Server.
    */
  var firstByteDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined
  
  /**
    * An object containing information regarding the last launch of the Source Server.
    */
  var lastLaunch: js.UndefOr[LifeCycleLastLaunch] = js.undefined
  
  /**
    * The date and time this Source Server was last seen by the service.
    */
  var lastSeenByServiceDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined
}
object LifeCycle {
  
  inline def apply(): LifeCycle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LifeCycle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LifeCycle] (val x: Self) extends AnyVal {
    
    inline def setAddedToServiceDateTime(value: ISO8601DatetimeString): Self = StObject.set(x, "addedToServiceDateTime", value.asInstanceOf[js.Any])
    
    inline def setAddedToServiceDateTimeUndefined: Self = StObject.set(x, "addedToServiceDateTime", js.undefined)
    
    inline def setElapsedReplicationDuration(value: ISO8601DurationString): Self = StObject.set(x, "elapsedReplicationDuration", value.asInstanceOf[js.Any])
    
    inline def setElapsedReplicationDurationUndefined: Self = StObject.set(x, "elapsedReplicationDuration", js.undefined)
    
    inline def setFirstByteDateTime(value: ISO8601DatetimeString): Self = StObject.set(x, "firstByteDateTime", value.asInstanceOf[js.Any])
    
    inline def setFirstByteDateTimeUndefined: Self = StObject.set(x, "firstByteDateTime", js.undefined)
    
    inline def setLastLaunch(value: LifeCycleLastLaunch): Self = StObject.set(x, "lastLaunch", value.asInstanceOf[js.Any])
    
    inline def setLastLaunchUndefined: Self = StObject.set(x, "lastLaunch", js.undefined)
    
    inline def setLastSeenByServiceDateTime(value: ISO8601DatetimeString): Self = StObject.set(x, "lastSeenByServiceDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastSeenByServiceDateTimeUndefined: Self = StObject.set(x, "lastSeenByServiceDateTime", js.undefined)
  }
}
