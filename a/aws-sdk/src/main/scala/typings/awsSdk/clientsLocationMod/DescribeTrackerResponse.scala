package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTrackerResponse extends StObject {
  
  /**
    * The timestamp for when the tracker resource was created in  ISO 8601 format: YYYY-MM-DDThh:mm:ss.sssZ. 
    */
  var CreateTime: js.Date
  
  /**
    * The optional description for the tracker resource.
    */
  var Description: ResourceDescription
  
  /**
    * A key identifier for an Amazon Web Services KMS customer managed key assigned to the Amazon Location resource.
    */
  var KmsKeyId: js.UndefOr[typings.awsSdk.clientsLocationMod.KmsKeyId] = js.undefined
  
  /**
    * The position filtering method of the tracker resource.
    */
  var PositionFiltering: js.UndefOr[typings.awsSdk.clientsLocationMod.PositionFiltering] = js.undefined
  
  /**
    * Always returns RequestBasedUsage.
    */
  var PricingPlan: js.UndefOr[typings.awsSdk.clientsLocationMod.PricingPlan] = js.undefined
  
  /**
    * No longer used. Always returns an empty string.
    */
  var PricingPlanDataSource: js.UndefOr[String] = js.undefined
  
  /**
    * The tags associated with the tracker resource.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for the tracker resource. Used when you need to specify a resource across all Amazon Web Services.   Format example: arn:aws:geo:region:account-id:tracker/ExampleTracker   
    */
  var TrackerArn: Arn
  
  /**
    * The name of the tracker resource.
    */
  var TrackerName: ResourceName
  
  /**
    * The timestamp for when the tracker resource was last updated in  ISO 8601 format: YYYY-MM-DDThh:mm:ss.sssZ. 
    */
  var UpdateTime: js.Date
}
object DescribeTrackerResponse {
  
  inline def apply(
    CreateTime: js.Date,
    Description: ResourceDescription,
    TrackerArn: Arn,
    TrackerName: ResourceName,
    UpdateTime: js.Date
  ): DescribeTrackerResponse = {
    val __obj = js.Dynamic.literal(CreateTime = CreateTime.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], TrackerArn = TrackerArn.asInstanceOf[js.Any], TrackerName = TrackerName.asInstanceOf[js.Any], UpdateTime = UpdateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTrackerResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeTrackerResponse] (val x: Self) extends AnyVal {
    
    inline def setCreateTime(value: js.Date): Self = StObject.set(x, "CreateTime", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: ResourceDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setPositionFiltering(value: PositionFiltering): Self = StObject.set(x, "PositionFiltering", value.asInstanceOf[js.Any])
    
    inline def setPositionFilteringUndefined: Self = StObject.set(x, "PositionFiltering", js.undefined)
    
    inline def setPricingPlan(value: PricingPlan): Self = StObject.set(x, "PricingPlan", value.asInstanceOf[js.Any])
    
    inline def setPricingPlanDataSource(value: String): Self = StObject.set(x, "PricingPlanDataSource", value.asInstanceOf[js.Any])
    
    inline def setPricingPlanDataSourceUndefined: Self = StObject.set(x, "PricingPlanDataSource", js.undefined)
    
    inline def setPricingPlanUndefined: Self = StObject.set(x, "PricingPlan", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTrackerArn(value: Arn): Self = StObject.set(x, "TrackerArn", value.asInstanceOf[js.Any])
    
    inline def setTrackerName(value: ResourceName): Self = StObject.set(x, "TrackerName", value.asInstanceOf[js.Any])
    
    inline def setUpdateTime(value: js.Date): Self = StObject.set(x, "UpdateTime", value.asInstanceOf[js.Any])
  }
}
