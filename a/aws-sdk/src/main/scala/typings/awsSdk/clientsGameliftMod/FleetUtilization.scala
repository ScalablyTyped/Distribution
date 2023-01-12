package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FleetUtilization extends StObject {
  
  /**
    * The number of active game sessions that are currently being hosted across all instances in the fleet location.
    */
  var ActiveGameSessionCount: js.UndefOr[WholeNumber] = js.undefined
  
  /**
    * The number of server processes in ACTIVE status that are currently running across all instances in the fleet location. 
    */
  var ActiveServerProcessCount: js.UndefOr[WholeNumber] = js.undefined
  
  /**
    * The number of active player sessions that are currently being hosted across all instances in the fleet location.
    */
  var CurrentPlayerSessionCount: js.UndefOr[WholeNumber] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) that is assigned to a GameLift fleet resource and uniquely identifies it. ARNs are unique across all Regions. Format is arn:aws:gamelift:&lt;region&gt;::fleet/fleet-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912.
    */
  var FleetArn: js.UndefOr[typings.awsSdk.clientsGameliftMod.FleetArn] = js.undefined
  
  /**
    * A unique identifier for the fleet associated with the location.
    */
  var FleetId: js.UndefOr[typings.awsSdk.clientsGameliftMod.FleetId] = js.undefined
  
  /**
    * The fleet location for the fleet utilization information, expressed as an Amazon Web Services Region code, such as us-west-2. 
    */
  var Location: js.UndefOr[LocationStringModel] = js.undefined
  
  /**
    * The maximum number of players allowed across all game sessions that are currently being hosted across all instances in the fleet location.
    */
  var MaximumPlayerSessionCount: js.UndefOr[WholeNumber] = js.undefined
}
object FleetUtilization {
  
  inline def apply(): FleetUtilization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FleetUtilization]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FleetUtilization] (val x: Self) extends AnyVal {
    
    inline def setActiveGameSessionCount(value: WholeNumber): Self = StObject.set(x, "ActiveGameSessionCount", value.asInstanceOf[js.Any])
    
    inline def setActiveGameSessionCountUndefined: Self = StObject.set(x, "ActiveGameSessionCount", js.undefined)
    
    inline def setActiveServerProcessCount(value: WholeNumber): Self = StObject.set(x, "ActiveServerProcessCount", value.asInstanceOf[js.Any])
    
    inline def setActiveServerProcessCountUndefined: Self = StObject.set(x, "ActiveServerProcessCount", js.undefined)
    
    inline def setCurrentPlayerSessionCount(value: WholeNumber): Self = StObject.set(x, "CurrentPlayerSessionCount", value.asInstanceOf[js.Any])
    
    inline def setCurrentPlayerSessionCountUndefined: Self = StObject.set(x, "CurrentPlayerSessionCount", js.undefined)
    
    inline def setFleetArn(value: FleetArn): Self = StObject.set(x, "FleetArn", value.asInstanceOf[js.Any])
    
    inline def setFleetArnUndefined: Self = StObject.set(x, "FleetArn", js.undefined)
    
    inline def setFleetId(value: FleetId): Self = StObject.set(x, "FleetId", value.asInstanceOf[js.Any])
    
    inline def setFleetIdUndefined: Self = StObject.set(x, "FleetId", js.undefined)
    
    inline def setLocation(value: LocationStringModel): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "Location", js.undefined)
    
    inline def setMaximumPlayerSessionCount(value: WholeNumber): Self = StObject.set(x, "MaximumPlayerSessionCount", value.asInstanceOf[js.Any])
    
    inline def setMaximumPlayerSessionCountUndefined: Self = StObject.set(x, "MaximumPlayerSessionCount", js.undefined)
  }
}
