package typings.awsSdk.clientsSimspaceweaverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartSimulationOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the simulation. For more information about ARNs, see Amazon Resource Names (ARNs) in the Amazon Web Services General Reference.
    */
  var Arn: js.UndefOr[SimSpaceWeaverArn] = js.undefined
  
  /**
    * The time when the simulation was created, expressed as the number of seconds and milliseconds in UTC since the Unix epoch (0:0:0.000, January 1, 1970).
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A universally unique identifier (UUID) for this simulation.
    */
  var ExecutionId: js.UndefOr[UUID] = js.undefined
}
object StartSimulationOutput {
  
  inline def apply(): StartSimulationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartSimulationOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartSimulationOutput] (val x: Self) extends AnyVal {
    
    inline def setArn(value: SimSpaceWeaverArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setExecutionId(value: UUID): Self = StObject.set(x, "ExecutionId", value.asInstanceOf[js.Any])
    
    inline def setExecutionIdUndefined: Self = StObject.set(x, "ExecutionId", js.undefined)
  }
}
