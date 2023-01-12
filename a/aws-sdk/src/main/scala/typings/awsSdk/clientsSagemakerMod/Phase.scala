package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Phase extends StObject {
  
  /**
    * Specifies how long traffic phase should be.
    */
  var DurationInSeconds: js.UndefOr[TrafficDurationInSeconds] = js.undefined
  
  /**
    * Specifies how many concurrent users to start with.
    */
  var InitialNumberOfUsers: js.UndefOr[typings.awsSdk.clientsSagemakerMod.InitialNumberOfUsers] = js.undefined
  
  /**
    * Specified how many new users to spawn in a minute.
    */
  var SpawnRate: js.UndefOr[typings.awsSdk.clientsSagemakerMod.SpawnRate] = js.undefined
}
object Phase {
  
  inline def apply(): Phase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Phase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Phase] (val x: Self) extends AnyVal {
    
    inline def setDurationInSeconds(value: TrafficDurationInSeconds): Self = StObject.set(x, "DurationInSeconds", value.asInstanceOf[js.Any])
    
    inline def setDurationInSecondsUndefined: Self = StObject.set(x, "DurationInSeconds", js.undefined)
    
    inline def setInitialNumberOfUsers(value: InitialNumberOfUsers): Self = StObject.set(x, "InitialNumberOfUsers", value.asInstanceOf[js.Any])
    
    inline def setInitialNumberOfUsersUndefined: Self = StObject.set(x, "InitialNumberOfUsers", js.undefined)
    
    inline def setSpawnRate(value: SpawnRate): Self = StObject.set(x, "SpawnRate", value.asInstanceOf[js.Any])
    
    inline def setSpawnRateUndefined: Self = StObject.set(x, "SpawnRate", js.undefined)
  }
}
