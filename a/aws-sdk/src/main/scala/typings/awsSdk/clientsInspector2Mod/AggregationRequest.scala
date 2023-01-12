package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationRequest extends StObject {
  
  /**
    * An object that contains details about an aggregation request based on Amazon Web Services account IDs.
    */
  var accountAggregation: js.UndefOr[AccountAggregation] = js.undefined
  
  /**
    * An object that contains details about an aggregation request based on Amazon Machine Images (AMIs).
    */
  var amiAggregation: js.UndefOr[AmiAggregation] = js.undefined
  
  /**
    * An object that contains details about an aggregation request based on Amazon ECR container images.
    */
  var awsEcrContainerAggregation: js.UndefOr[AwsEcrContainerAggregation] = js.undefined
  
  /**
    * An object that contains details about an aggregation request based on Amazon EC2 instances.
    */
  var ec2InstanceAggregation: js.UndefOr[Ec2InstanceAggregation] = js.undefined
  
  /**
    * An object that contains details about an aggregation request based on finding types.
    */
  var findingTypeAggregation: js.UndefOr[FindingTypeAggregation] = js.undefined
  
  /**
    * An object that contains details about an aggregation request based on container image layers.
    */
  var imageLayerAggregation: js.UndefOr[ImageLayerAggregation] = js.undefined
  
  /**
    * An object that contains details about an aggregation request based on operating system package type.
    */
  var packageAggregation: js.UndefOr[PackageAggregation] = js.undefined
  
  /**
    * An object that contains details about an aggregation request based on Amazon ECR repositories.
    */
  var repositoryAggregation: js.UndefOr[RepositoryAggregation] = js.undefined
  
  /**
    * An object that contains details about an aggregation request based on finding title.
    */
  var titleAggregation: js.UndefOr[TitleAggregation] = js.undefined
}
object AggregationRequest {
  
  inline def apply(): AggregationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationRequest] (val x: Self) extends AnyVal {
    
    inline def setAccountAggregation(value: AccountAggregation): Self = StObject.set(x, "accountAggregation", value.asInstanceOf[js.Any])
    
    inline def setAccountAggregationUndefined: Self = StObject.set(x, "accountAggregation", js.undefined)
    
    inline def setAmiAggregation(value: AmiAggregation): Self = StObject.set(x, "amiAggregation", value.asInstanceOf[js.Any])
    
    inline def setAmiAggregationUndefined: Self = StObject.set(x, "amiAggregation", js.undefined)
    
    inline def setAwsEcrContainerAggregation(value: AwsEcrContainerAggregation): Self = StObject.set(x, "awsEcrContainerAggregation", value.asInstanceOf[js.Any])
    
    inline def setAwsEcrContainerAggregationUndefined: Self = StObject.set(x, "awsEcrContainerAggregation", js.undefined)
    
    inline def setEc2InstanceAggregation(value: Ec2InstanceAggregation): Self = StObject.set(x, "ec2InstanceAggregation", value.asInstanceOf[js.Any])
    
    inline def setEc2InstanceAggregationUndefined: Self = StObject.set(x, "ec2InstanceAggregation", js.undefined)
    
    inline def setFindingTypeAggregation(value: FindingTypeAggregation): Self = StObject.set(x, "findingTypeAggregation", value.asInstanceOf[js.Any])
    
    inline def setFindingTypeAggregationUndefined: Self = StObject.set(x, "findingTypeAggregation", js.undefined)
    
    inline def setImageLayerAggregation(value: ImageLayerAggregation): Self = StObject.set(x, "imageLayerAggregation", value.asInstanceOf[js.Any])
    
    inline def setImageLayerAggregationUndefined: Self = StObject.set(x, "imageLayerAggregation", js.undefined)
    
    inline def setPackageAggregation(value: PackageAggregation): Self = StObject.set(x, "packageAggregation", value.asInstanceOf[js.Any])
    
    inline def setPackageAggregationUndefined: Self = StObject.set(x, "packageAggregation", js.undefined)
    
    inline def setRepositoryAggregation(value: RepositoryAggregation): Self = StObject.set(x, "repositoryAggregation", value.asInstanceOf[js.Any])
    
    inline def setRepositoryAggregationUndefined: Self = StObject.set(x, "repositoryAggregation", js.undefined)
    
    inline def setTitleAggregation(value: TitleAggregation): Self = StObject.set(x, "titleAggregation", value.asInstanceOf[js.Any])
    
    inline def setTitleAggregationUndefined: Self = StObject.set(x, "titleAggregation", js.undefined)
  }
}
