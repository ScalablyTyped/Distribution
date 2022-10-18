package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateClassificationJobRequest extends StObject {
  
  /**
    * An array of unique identifiers, one for each allow list for the job to use when it analyzes data.
    */
  var allowListIds: js.UndefOr[listOfString] = js.undefined
  
  /**
    * A unique, case-sensitive token that you provide to ensure the idempotency of the request.
    */
  var clientToken: string
  
  /**
    * An array of unique identifiers, one for each custom data identifier for the job to use when it analyzes data. To use only managed data identifiers, don't specify a value for this property and specify a value other than NONE for the managedDataIdentifierSelector property.
    */
  var customDataIdentifierIds: js.UndefOr[listOfString] = js.undefined
  
  /**
    * A custom description of the job. The description can contain as many as 200 characters.
    */
  var description: js.UndefOr[string] = js.undefined
  
  /**
    * For a recurring job, specifies whether to analyze all existing, eligible objects immediately after the job is created (true). To analyze only those objects that are created or changed after you create the job and before the job's first scheduled run, set this value to false. If you configure the job to run only once, don't specify a value for this property.
    */
  var initialRun: js.UndefOr[boolean] = js.undefined
  
  /**
    * The schedule for running the job. Valid values are: ONE_TIME - Run the job only once. If you specify this value, don't specify a value for the scheduleFrequency property. SCHEDULED - Run the job on a daily, weekly, or monthly basis. If you specify this value, use the scheduleFrequency property to define the recurrence pattern for the job.
    */
  var jobType: JobType
  
  /**
    * An array of unique identifiers, one for each managed data identifier for the job to include (use) or exclude (not use) when it analyzes data. Inclusion or exclusion depends on the managed data identifier selection type that you specify for the job (managedDataIdentifierSelector). To retrieve a list of valid values for this property, use the ListManagedDataIdentifiers operation.
    */
  var managedDataIdentifierIds: js.UndefOr[listOfString] = js.undefined
  
  /**
    * The selection type to apply when determining which managed data identifiers the job uses to analyze data. Valid values are: ALL - Use all the managed data identifiers that Amazon Macie provides. If you specify this value, don't specify any values for the managedDataIdentifierIds property. EXCLUDE - Use all the managed data identifiers that Macie provides except the managed data identifiers specified by the managedDataIdentifierIds property. INCLUDE - Use only the managed data identifiers specified by the managedDataIdentifierIds property. NONE - Don't use any managed data identifiers. If you specify this value, specify at least one custom data identifier for the job (customDataIdentifierIds) and don't specify any values for the managedDataIdentifierIds property. If you don't specify a value for this property, the job uses all managed data identifiers. If you don't specify a value for this property or you specify ALL or EXCLUDE for a recurring job, the job also uses new managed data identifiers as they are released.
    */
  var managedDataIdentifierSelector: js.UndefOr[ManagedDataIdentifierSelector] = js.undefined
  
  /**
    * A custom name for the job. The name can contain as many as 500 characters.
    */
  var name: string
  
  /**
    * The S3 buckets that contain the objects to analyze, and the scope of that analysis.
    */
  var s3JobDefinition: S3JobDefinition
  
  /**
    * The sampling depth, as a percentage, for the job to apply when processing objects. This value determines the percentage of eligible objects that the job analyzes. If this value is less than 100, Amazon Macie selects the objects to analyze at random, up to the specified percentage, and analyzes all the data in those objects.
    */
  var samplingPercentage: js.UndefOr[integer] = js.undefined
  
  /**
    * The recurrence pattern for running the job. To run the job only once, don't specify a value for this property and set the value for the jobType property to ONE_TIME.
    */
  var scheduleFrequency: js.UndefOr[JobScheduleFrequency] = js.undefined
  
  /**
    * A map of key-value pairs that specifies the tags to associate with the job. A job can have a maximum of 50 tags. Each tag consists of a tag key and an associated tag value. The maximum length of a tag key is 128 characters. The maximum length of a tag value is 256 characters.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object CreateClassificationJobRequest {
  
  inline def apply(clientToken: string, jobType: JobType, name: string, s3JobDefinition: S3JobDefinition): CreateClassificationJobRequest = {
    val __obj = js.Dynamic.literal(clientToken = clientToken.asInstanceOf[js.Any], jobType = jobType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], s3JobDefinition = s3JobDefinition.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateClassificationJobRequest]
  }
  
  extension [Self <: CreateClassificationJobRequest](x: Self) {
    
    inline def setAllowListIds(value: listOfString): Self = StObject.set(x, "allowListIds", value.asInstanceOf[js.Any])
    
    inline def setAllowListIdsUndefined: Self = StObject.set(x, "allowListIds", js.undefined)
    
    inline def setAllowListIdsVarargs(value: string*): Self = StObject.set(x, "allowListIds", js.Array(value*))
    
    inline def setClientToken(value: string): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setCustomDataIdentifierIds(value: listOfString): Self = StObject.set(x, "customDataIdentifierIds", value.asInstanceOf[js.Any])
    
    inline def setCustomDataIdentifierIdsUndefined: Self = StObject.set(x, "customDataIdentifierIds", js.undefined)
    
    inline def setCustomDataIdentifierIdsVarargs(value: string*): Self = StObject.set(x, "customDataIdentifierIds", js.Array(value*))
    
    inline def setDescription(value: string): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setInitialRun(value: boolean): Self = StObject.set(x, "initialRun", value.asInstanceOf[js.Any])
    
    inline def setInitialRunUndefined: Self = StObject.set(x, "initialRun", js.undefined)
    
    inline def setJobType(value: JobType): Self = StObject.set(x, "jobType", value.asInstanceOf[js.Any])
    
    inline def setManagedDataIdentifierIds(value: listOfString): Self = StObject.set(x, "managedDataIdentifierIds", value.asInstanceOf[js.Any])
    
    inline def setManagedDataIdentifierIdsUndefined: Self = StObject.set(x, "managedDataIdentifierIds", js.undefined)
    
    inline def setManagedDataIdentifierIdsVarargs(value: string*): Self = StObject.set(x, "managedDataIdentifierIds", js.Array(value*))
    
    inline def setManagedDataIdentifierSelector(value: ManagedDataIdentifierSelector): Self = StObject.set(x, "managedDataIdentifierSelector", value.asInstanceOf[js.Any])
    
    inline def setManagedDataIdentifierSelectorUndefined: Self = StObject.set(x, "managedDataIdentifierSelector", js.undefined)
    
    inline def setName(value: string): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setS3JobDefinition(value: S3JobDefinition): Self = StObject.set(x, "s3JobDefinition", value.asInstanceOf[js.Any])
    
    inline def setSamplingPercentage(value: integer): Self = StObject.set(x, "samplingPercentage", value.asInstanceOf[js.Any])
    
    inline def setSamplingPercentageUndefined: Self = StObject.set(x, "samplingPercentage", js.undefined)
    
    inline def setScheduleFrequency(value: JobScheduleFrequency): Self = StObject.set(x, "scheduleFrequency", value.asInstanceOf[js.Any])
    
    inline def setScheduleFrequencyUndefined: Self = StObject.set(x, "scheduleFrequency", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
