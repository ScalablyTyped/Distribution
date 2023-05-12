package typings.awsSdk.clientsSagemakergeospatialMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListVectorEnrichmentJobOutputConfig extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the list of the Vector Enrichment jobs.
    */
  var Arn: VectorEnrichmentJobArn
  
  /**
    * The creation time.
    */
  var CreationTime: js.Date
  
  /**
    * The duration of the session, in seconds.
    */
  var DurationInSeconds: Integer
  
  /**
    * The names of the Vector Enrichment jobs in the list.
    */
  var Name: String
  
  /**
    * The status of the Vector Enrichment jobs list. 
    */
  var Status: VectorEnrichmentJobStatus
  
  /**
    * Each tag consists of a key and a value.
    */
  var Tags: js.UndefOr[typings.awsSdk.clientsSagemakergeospatialMod.Tags] = js.undefined
  
  /**
    * The type of the list of Vector Enrichment jobs.
    */
  var Type: VectorEnrichmentJobType
}
object ListVectorEnrichmentJobOutputConfig {
  
  inline def apply(
    Arn: VectorEnrichmentJobArn,
    CreationTime: js.Date,
    DurationInSeconds: Integer,
    Name: String,
    Status: VectorEnrichmentJobStatus,
    Type: VectorEnrichmentJobType
  ): ListVectorEnrichmentJobOutputConfig = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], CreationTime = CreationTime.asInstanceOf[js.Any], DurationInSeconds = DurationInSeconds.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListVectorEnrichmentJobOutputConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListVectorEnrichmentJobOutputConfig] (val x: Self) extends AnyVal {
    
    inline def setArn(value: VectorEnrichmentJobArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setDurationInSeconds(value: Integer): Self = StObject.set(x, "DurationInSeconds", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: VectorEnrichmentJobStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setType(value: VectorEnrichmentJobType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
