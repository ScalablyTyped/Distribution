package typings.awsSdk.clientsApprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-sdk/clients/apprunner", JSImport.Namespace)
@js.native
/**
  * Constructs a service object. This object has one method for each API operation.
  */
open class ^ ()
  extends StObject
     with AppRunner {
  def this(options: ClientConfiguration) = this()
  
  /**
    * Summary information for the App Runner automatic scaling configuration resource that's associated with this service.
    */
  /* CompleteClass */
  var AutoScalingConfigurationSummary: typings.awsSdk.clientsApprunnerMod.AutoScalingConfigurationSummary = js.native
  
  /**
    * The time when the App Runner service was created. It's in the Unix time stamp format.
    */
  /* CompleteClass */
  var CreatedAt: js.Date = js.native
  
  /**
    * The runtime configuration of instances (scaling units) of this service.
    */
  /* CompleteClass */
  var InstanceConfiguration: typings.awsSdk.clientsApprunnerMod.InstanceConfiguration = js.native
  
  /**
    * Configuration settings related to network traffic of the web application that this service runs.
    */
  /* CompleteClass */
  var NetworkConfiguration: typings.awsSdk.clientsApprunnerMod.NetworkConfiguration = js.native
  
  /**
    * The Amazon Resource Name (ARN) of this service.
    */
  /* CompleteClass */
  var ServiceArn: AppRunnerResourceArn = js.native
  
  /**
    * An ID that App Runner generated for this service. It's unique within the Amazon Web Services Region.
    */
  /* CompleteClass */
  var ServiceId: typings.awsSdk.clientsApprunnerMod.ServiceId = js.native
  
  /**
    * The customer-provided service name.
    */
  /* CompleteClass */
  var ServiceName: typings.awsSdk.clientsApprunnerMod.ServiceName = js.native
  
  /**
    * The source deployed to the App Runner service. It can be a code or an image repository.
    */
  /* CompleteClass */
  var SourceConfiguration: typings.awsSdk.clientsApprunnerMod.SourceConfiguration = js.native
  
  /**
    * The current state of the App Runner service. These particular values mean the following.    CREATE_FAILED – The service failed to create. To troubleshoot this failure, read the failure events and logs, change any parameters that need to be fixed, and retry the call to create the service. The failed service isn't usable, and still counts towards your service quota. When you're done analyzing the failure, delete the service.    DELETE_FAILED – The service failed to delete and can't be successfully recovered. Retry the service deletion call to ensure that all related resources are removed.  
    */
  /* CompleteClass */
  var Status: ServiceStatus = js.native
  
  /**
    * The time when the App Runner service was last updated at. It's in the Unix time stamp format.
    */
  /* CompleteClass */
  var UpdatedAt: js.Date = js.native
}
