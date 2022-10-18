package typings.awsSdk.clientsBraketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobSummary extends StObject {
  
  /**
    * The date and time that the Amazon Braket job was created.
    */
  var createdAt: js.Date
  
  /**
    * Provides summary information about the primary device used by an Amazon Braket job.
    */
  var device: String256
  
  /**
    * The date and time that the Amazon Braket job ended.
    */
  var endedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ARN of the Amazon Braket job.
    */
  var jobArn: JobArn
  
  /**
    * The name of the Amazon Braket job.
    */
  var jobName: String
  
  /**
    * The date and time that the Amazon Braket job was started.
    */
  var startedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The status of the Amazon Braket job.
    */
  var status: JobPrimaryStatus
  
  /**
    * A tag object that consists of a key and an optional value, used to manage metadata for Amazon Braket resources.
    */
  var tags: js.UndefOr[TagsMap] = js.undefined
}
object JobSummary {
  
  inline def apply(createdAt: js.Date, device: String256, jobArn: JobArn, jobName: String, status: JobPrimaryStatus): JobSummary = {
    val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], device = device.asInstanceOf[js.Any], jobArn = jobArn.asInstanceOf[js.Any], jobName = jobName.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobSummary]
  }
  
  extension [Self <: JobSummary](x: Self) {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setDevice(value: String256): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setEndedAt(value: js.Date): Self = StObject.set(x, "endedAt", value.asInstanceOf[js.Any])
    
    inline def setEndedAtUndefined: Self = StObject.set(x, "endedAt", js.undefined)
    
    inline def setJobArn(value: JobArn): Self = StObject.set(x, "jobArn", value.asInstanceOf[js.Any])
    
    inline def setJobName(value: String): Self = StObject.set(x, "jobName", value.asInstanceOf[js.Any])
    
    inline def setStartedAt(value: js.Date): Self = StObject.set(x, "startedAt", value.asInstanceOf[js.Any])
    
    inline def setStartedAtUndefined: Self = StObject.set(x, "startedAt", js.undefined)
    
    inline def setStatus(value: JobPrimaryStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagsMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
