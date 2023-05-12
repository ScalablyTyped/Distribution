package typings.awsSdk.clientsSimspaceweaverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimulationMetadata extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the simulation. For more information about ARNs, see Amazon Resource Names (ARNs) in the Amazon Web Services General Reference.
    */
  var Arn: js.UndefOr[SimSpaceWeaverArn] = js.undefined
  
  /**
    * The time when the simulation was created, expressed as the number of seconds and milliseconds in UTC since the Unix epoch (0:0:0.000, January 1, 1970).
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the simulation.
    */
  var Name: js.UndefOr[SimSpaceWeaverResourceName] = js.undefined
  
  /**
    * The current status of the simulation.
    */
  var Status: js.UndefOr[SimulationStatus] = js.undefined
  
  /**
    * The desired status of the simulation.
    */
  var TargetStatus: js.UndefOr[SimulationTargetStatus] = js.undefined
}
object SimulationMetadata {
  
  inline def apply(): SimulationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimulationMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SimulationMetadata] (val x: Self) extends AnyVal {
    
    inline def setArn(value: SimSpaceWeaverArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setName(value: SimSpaceWeaverResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setStatus(value: SimulationStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTargetStatus(value: SimulationTargetStatus): Self = StObject.set(x, "TargetStatus", value.asInstanceOf[js.Any])
    
    inline def setTargetStatusUndefined: Self = StObject.set(x, "TargetStatus", js.undefined)
  }
}
