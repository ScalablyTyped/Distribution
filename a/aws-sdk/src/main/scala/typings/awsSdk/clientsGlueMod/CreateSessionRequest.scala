package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSessionRequest extends StObject {
  
  /**
    * The SessionCommand that runs the job. 
    */
  var Command: SessionCommand
  
  /**
    * The number of connections to use for the session. 
    */
  var Connections: js.UndefOr[ConnectionsList] = js.undefined
  
  /**
    * A map array of key-value pairs. Max is 75 pairs. 
    */
  var DefaultArguments: js.UndefOr[OrchestrationArgumentsMap] = js.undefined
  
  /**
    * The description of the session. 
    */
  var Description: js.UndefOr[DescriptionString] = js.undefined
  
  /**
    * The Glue version determines the versions of Apache Spark and Python that Glue supports. The GlueVersion must be greater than 2.0. 
    */
  var GlueVersion: js.UndefOr[GlueVersionString] = js.undefined
  
  /**
    * The ID of the session request. 
    */
  var Id: NameString
  
  /**
    * The number of seconds when idle before request times out. 
    */
  var IdleTimeout: js.UndefOr[Timeout] = js.undefined
  
  /**
    * The number of Glue data processing units (DPUs) that can be allocated when the job runs. A DPU is a relative measure of processing power that consists of 4 vCPUs of compute capacity and 16 GB memory. 
    */
  var MaxCapacity: js.UndefOr[NullableDouble] = js.undefined
  
  /**
    * The number of workers of a defined WorkerType to use for the session. 
    */
  var NumberOfWorkers: js.UndefOr[NullableInteger] = js.undefined
  
  /**
    * The origin of the request. 
    */
  var RequestOrigin: js.UndefOr[OrchestrationNameString] = js.undefined
  
  /**
    * The IAM Role ARN 
    */
  var Role: OrchestrationRoleArn
  
  /**
    * The name of the SecurityConfiguration structure to be used with the session 
    */
  var SecurityConfiguration: js.UndefOr[NameString] = js.undefined
  
  /**
    * The map of key value pairs (tags) belonging to the session.
    */
  var Tags: js.UndefOr[TagsMap] = js.undefined
  
  /**
    * The number of seconds before request times out. 
    */
  var Timeout: js.UndefOr[typings.awsSdk.clientsGlueMod.Timeout] = js.undefined
  
  /**
    * The type of predefined worker that is allocated to use for the session. Accepts a value of Standard, G.1X, G.2X, or G.025X.   For the Standard worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB disk, and 2 executors per worker.   For the G.1X worker type, each worker maps to 1 DPU (4 vCPU, 16 GB of memory, 64 GB disk), and provides 1 executor per worker. We recommend this worker type for memory-intensive jobs.   For the G.2X worker type, each worker maps to 2 DPU (8 vCPU, 32 GB of memory, 128 GB disk), and provides 1 executor per worker. We recommend this worker type for memory-intensive jobs.   For the G.025X worker type, each worker maps to 0.25 DPU (2 vCPU, 4 GB of memory, 64 GB disk), and provides 1 executor per worker. We recommend this worker type for low volume streaming jobs. This worker type is only available for Glue version 3.0 streaming jobs.  
    */
  var WorkerType: js.UndefOr[typings.awsSdk.clientsGlueMod.WorkerType] = js.undefined
}
object CreateSessionRequest {
  
  inline def apply(Command: SessionCommand, Id: NameString, Role: OrchestrationRoleArn): CreateSessionRequest = {
    val __obj = js.Dynamic.literal(Command = Command.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Role = Role.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSessionRequest]
  }
  
  extension [Self <: CreateSessionRequest](x: Self) {
    
    inline def setCommand(value: SessionCommand): Self = StObject.set(x, "Command", value.asInstanceOf[js.Any])
    
    inline def setConnections(value: ConnectionsList): Self = StObject.set(x, "Connections", value.asInstanceOf[js.Any])
    
    inline def setConnectionsUndefined: Self = StObject.set(x, "Connections", js.undefined)
    
    inline def setDefaultArguments(value: OrchestrationArgumentsMap): Self = StObject.set(x, "DefaultArguments", value.asInstanceOf[js.Any])
    
    inline def setDefaultArgumentsUndefined: Self = StObject.set(x, "DefaultArguments", js.undefined)
    
    inline def setDescription(value: DescriptionString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setGlueVersion(value: GlueVersionString): Self = StObject.set(x, "GlueVersion", value.asInstanceOf[js.Any])
    
    inline def setGlueVersionUndefined: Self = StObject.set(x, "GlueVersion", js.undefined)
    
    inline def setId(value: NameString): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdleTimeout(value: Timeout): Self = StObject.set(x, "IdleTimeout", value.asInstanceOf[js.Any])
    
    inline def setIdleTimeoutUndefined: Self = StObject.set(x, "IdleTimeout", js.undefined)
    
    inline def setMaxCapacity(value: NullableDouble): Self = StObject.set(x, "MaxCapacity", value.asInstanceOf[js.Any])
    
    inline def setMaxCapacityUndefined: Self = StObject.set(x, "MaxCapacity", js.undefined)
    
    inline def setNumberOfWorkers(value: NullableInteger): Self = StObject.set(x, "NumberOfWorkers", value.asInstanceOf[js.Any])
    
    inline def setNumberOfWorkersUndefined: Self = StObject.set(x, "NumberOfWorkers", js.undefined)
    
    inline def setRequestOrigin(value: OrchestrationNameString): Self = StObject.set(x, "RequestOrigin", value.asInstanceOf[js.Any])
    
    inline def setRequestOriginUndefined: Self = StObject.set(x, "RequestOrigin", js.undefined)
    
    inline def setRole(value: OrchestrationRoleArn): Self = StObject.set(x, "Role", value.asInstanceOf[js.Any])
    
    inline def setSecurityConfiguration(value: NameString): Self = StObject.set(x, "SecurityConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSecurityConfigurationUndefined: Self = StObject.set(x, "SecurityConfiguration", js.undefined)
    
    inline def setTags(value: TagsMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTimeout(value: Timeout): Self = StObject.set(x, "Timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "Timeout", js.undefined)
    
    inline def setWorkerType(value: WorkerType): Self = StObject.set(x, "WorkerType", value.asInstanceOf[js.Any])
    
    inline def setWorkerTypeUndefined: Self = StObject.set(x, "WorkerType", js.undefined)
  }
}
