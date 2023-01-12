package typings.awsSdk.clientsRobomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimulationJobSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the simulation job.
    */
  var arn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The compute type for the simulation job summary.
    */
  var computeType: js.UndefOr[ComputeType] = js.undefined
  
  /**
    * The names of the data sources.
    */
  var dataSourceNames: js.UndefOr[DataSourceNames] = js.undefined
  
  /**
    * The time, in milliseconds since the epoch, when the simulation job was last updated.
    */
  var lastUpdatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the simulation job.
    */
  var name: js.UndefOr[Name] = js.undefined
  
  /**
    * A list of simulation job robot application names.
    */
  var robotApplicationNames: js.UndefOr[RobotApplicationNames] = js.undefined
  
  /**
    * A list of simulation job simulation application names.
    */
  var simulationApplicationNames: js.UndefOr[SimulationApplicationNames] = js.undefined
  
  /**
    * The status of the simulation job.
    */
  var status: js.UndefOr[SimulationJobStatus] = js.undefined
}
object SimulationJobSummary {
  
  inline def apply(): SimulationJobSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimulationJobSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SimulationJobSummary] (val x: Self) extends AnyVal {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setComputeType(value: ComputeType): Self = StObject.set(x, "computeType", value.asInstanceOf[js.Any])
    
    inline def setComputeTypeUndefined: Self = StObject.set(x, "computeType", js.undefined)
    
    inline def setDataSourceNames(value: DataSourceNames): Self = StObject.set(x, "dataSourceNames", value.asInstanceOf[js.Any])
    
    inline def setDataSourceNamesUndefined: Self = StObject.set(x, "dataSourceNames", js.undefined)
    
    inline def setDataSourceNamesVarargs(value: Name*): Self = StObject.set(x, "dataSourceNames", js.Array(value*))
    
    inline def setLastUpdatedAt(value: js.Date): Self = StObject.set(x, "lastUpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedAtUndefined: Self = StObject.set(x, "lastUpdatedAt", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRobotApplicationNames(value: RobotApplicationNames): Self = StObject.set(x, "robotApplicationNames", value.asInstanceOf[js.Any])
    
    inline def setRobotApplicationNamesUndefined: Self = StObject.set(x, "robotApplicationNames", js.undefined)
    
    inline def setRobotApplicationNamesVarargs(value: Name*): Self = StObject.set(x, "robotApplicationNames", js.Array(value*))
    
    inline def setSimulationApplicationNames(value: SimulationApplicationNames): Self = StObject.set(x, "simulationApplicationNames", value.asInstanceOf[js.Any])
    
    inline def setSimulationApplicationNamesUndefined: Self = StObject.set(x, "simulationApplicationNames", js.undefined)
    
    inline def setSimulationApplicationNamesVarargs(value: Name*): Self = StObject.set(x, "simulationApplicationNames", js.Array(value*))
    
    inline def setStatus(value: SimulationJobStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
