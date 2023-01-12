package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LifeCycle extends StObject {
  
  /**
    * Lifecycle added to service data and time.
    */
  var addedToServiceDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined
  
  /**
    * Lifecycle elapsed time and duration.
    */
  var elapsedReplicationDuration: js.UndefOr[ISO8601DurationString] = js.undefined
  
  /**
    * Lifecycle replication initiation date and time.
    */
  var firstByteDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined
  
  /**
    * Lifecycle last Cutover.
    */
  var lastCutover: js.UndefOr[LifeCycleLastCutover] = js.undefined
  
  /**
    * Lifecycle last seen date and time.
    */
  var lastSeenByServiceDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined
  
  /**
    * Lifecycle last Test.
    */
  var lastTest: js.UndefOr[LifeCycleLastTest] = js.undefined
  
  /**
    * Lifecycle state.
    */
  var state: js.UndefOr[LifeCycleState] = js.undefined
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
    
    inline def setLastCutover(value: LifeCycleLastCutover): Self = StObject.set(x, "lastCutover", value.asInstanceOf[js.Any])
    
    inline def setLastCutoverUndefined: Self = StObject.set(x, "lastCutover", js.undefined)
    
    inline def setLastSeenByServiceDateTime(value: ISO8601DatetimeString): Self = StObject.set(x, "lastSeenByServiceDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastSeenByServiceDateTimeUndefined: Self = StObject.set(x, "lastSeenByServiceDateTime", js.undefined)
    
    inline def setLastTest(value: LifeCycleLastTest): Self = StObject.set(x, "lastTest", value.asInstanceOf[js.Any])
    
    inline def setLastTestUndefined: Self = StObject.set(x, "lastTest", js.undefined)
    
    inline def setState(value: LifeCycleState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
