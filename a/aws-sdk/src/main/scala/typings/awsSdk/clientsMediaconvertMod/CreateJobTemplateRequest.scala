package typings.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateJobTemplateRequest extends StObject {
  
  /**
    * Accelerated transcoding can significantly speed up jobs with long, visually complex content. Outputs that use this feature incur pro-tier pricing. For information about feature limitations, see the AWS Elemental MediaConvert User Guide.
    */
  var AccelerationSettings: js.UndefOr[typings.awsSdk.clientsMediaconvertMod.AccelerationSettings] = js.undefined
  
  /**
    * Optional. A category for the job template you are creating
    */
  var Category: js.UndefOr[string] = js.undefined
  
  /**
    * Optional. A description of the job template you are creating.
    */
  var Description: js.UndefOr[string] = js.undefined
  
  /**
    * Optional. Use queue hopping to avoid overly long waits in the backlog of the queue that you submit your job to. Specify an alternate queue and the maximum time that your job will wait in the initial queue before hopping. For more information about this feature, see the AWS Elemental MediaConvert User Guide.
    */
  var HopDestinations: js.UndefOr[listOfHopDestination] = js.undefined
  
  /**
    * The name of the job template you are creating.
    */
  var Name: string
  
  /**
    * Specify the relative priority for this job. In any given queue, the service begins processing the job with the highest value first. When more than one job has the same priority, the service begins processing the job that you submitted first. If you don't specify a priority, the service uses the default value 0.
    */
  var Priority: js.UndefOr[integerMinNegative50Max50] = js.undefined
  
  /**
    * Optional. The queue that jobs created from this template are assigned to. If you don't specify this, jobs will go to the default queue.
    */
  var Queue: js.UndefOr[string] = js.undefined
  
  /**
    * JobTemplateSettings contains all the transcode settings saved in the template that will be applied to jobs created from it.
    */
  var Settings: JobTemplateSettings
  
  /**
    * Specify how often MediaConvert sends STATUS_UPDATE events to Amazon CloudWatch Events. Set the interval, in seconds, between status updates. MediaConvert sends an update at this interval from the time the service begins processing your job to the time it completes the transcode or encounters an error.
    */
  var StatusUpdateInterval: js.UndefOr[typings.awsSdk.clientsMediaconvertMod.StatusUpdateInterval] = js.undefined
  
  /**
    * The tags that you want to add to the resource. You can tag resources with a key-value pair or with only a key.
    */
  var Tags: js.UndefOr[mapOfString] = js.undefined
}
object CreateJobTemplateRequest {
  
  inline def apply(Name: string, Settings: JobTemplateSettings): CreateJobTemplateRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Settings = Settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateJobTemplateRequest]
  }
  
  extension [Self <: CreateJobTemplateRequest](x: Self) {
    
    inline def setAccelerationSettings(value: AccelerationSettings): Self = StObject.set(x, "AccelerationSettings", value.asInstanceOf[js.Any])
    
    inline def setAccelerationSettingsUndefined: Self = StObject.set(x, "AccelerationSettings", js.undefined)
    
    inline def setCategory(value: string): Self = StObject.set(x, "Category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "Category", js.undefined)
    
    inline def setDescription(value: string): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setHopDestinations(value: listOfHopDestination): Self = StObject.set(x, "HopDestinations", value.asInstanceOf[js.Any])
    
    inline def setHopDestinationsUndefined: Self = StObject.set(x, "HopDestinations", js.undefined)
    
    inline def setHopDestinationsVarargs(value: HopDestination*): Self = StObject.set(x, "HopDestinations", js.Array(value*))
    
    inline def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setPriority(value: integerMinNegative50Max50): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "Priority", js.undefined)
    
    inline def setQueue(value: string): Self = StObject.set(x, "Queue", value.asInstanceOf[js.Any])
    
    inline def setQueueUndefined: Self = StObject.set(x, "Queue", js.undefined)
    
    inline def setSettings(value: JobTemplateSettings): Self = StObject.set(x, "Settings", value.asInstanceOf[js.Any])
    
    inline def setStatusUpdateInterval(value: StatusUpdateInterval): Self = StObject.set(x, "StatusUpdateInterval", value.asInstanceOf[js.Any])
    
    inline def setStatusUpdateIntervalUndefined: Self = StObject.set(x, "StatusUpdateInterval", js.undefined)
    
    inline def setTags(value: mapOfString): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
