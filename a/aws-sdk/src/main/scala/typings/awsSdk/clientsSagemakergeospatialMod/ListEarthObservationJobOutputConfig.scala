package typings.awsSdk.clientsSagemakergeospatialMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEarthObservationJobOutputConfig extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the list of the Earth Observation jobs.
    */
  var Arn: String
  
  /**
    * The creation time.
    */
  var CreationTime: js.Date
  
  /**
    * The duration of the session, in seconds.
    */
  var DurationInSeconds: Integer
  
  /**
    * The names of the Earth Observation jobs in the list.
    */
  var Name: String
  
  /**
    * The operation type for an Earth Observation job.
    */
  var OperationType: String
  
  /**
    * The status of the list of the Earth Observation jobs.
    */
  var Status: EarthObservationJobStatus
  
  /**
    * Each tag consists of a key and a value.
    */
  var Tags: js.UndefOr[typings.awsSdk.clientsSagemakergeospatialMod.Tags] = js.undefined
}
object ListEarthObservationJobOutputConfig {
  
  inline def apply(
    Arn: String,
    CreationTime: js.Date,
    DurationInSeconds: Integer,
    Name: String,
    OperationType: String,
    Status: EarthObservationJobStatus
  ): ListEarthObservationJobOutputConfig = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], CreationTime = CreationTime.asInstanceOf[js.Any], DurationInSeconds = DurationInSeconds.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], OperationType = OperationType.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEarthObservationJobOutputConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListEarthObservationJobOutputConfig] (val x: Self) extends AnyVal {
    
    inline def setArn(value: String): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setDurationInSeconds(value: Integer): Self = StObject.set(x, "DurationInSeconds", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOperationType(value: String): Self = StObject.set(x, "OperationType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: EarthObservationJobStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
