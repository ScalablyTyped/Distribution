package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationResponse extends StObject {
  
  /**
    * An object that contains details about an aggregation response based on Amazon Web Services account IDs.
    */
  var accountAggregation: js.UndefOr[AccountAggregationResponse] = js.undefined
  
  /**
    * An object that contains details about an aggregation response based on Amazon Machine Images (AMIs).
    */
  var amiAggregation: js.UndefOr[AmiAggregationResponse] = js.undefined
  
  /**
    * An object that contains details about an aggregation response based on Amazon ECR container images.
    */
  var awsEcrContainerAggregation: js.UndefOr[AwsEcrContainerAggregationResponse] = js.undefined
  
  /**
    * An object that contains details about an aggregation response based on Amazon EC2 instances.
    */
  var ec2InstanceAggregation: js.UndefOr[Ec2InstanceAggregationResponse] = js.undefined
  
  /**
    * An object that contains details about an aggregation response based on finding types.
    */
  var findingTypeAggregation: js.UndefOr[FindingTypeAggregationResponse] = js.undefined
  
  /**
    * An object that contains details about an aggregation response based on container image layers.
    */
  var imageLayerAggregation: js.UndefOr[ImageLayerAggregationResponse] = js.undefined
  
  /**
    * An object that contains details about an aggregation response based on operating system package type.
    */
  var packageAggregation: js.UndefOr[PackageAggregationResponse] = js.undefined
  
  /**
    * An object that contains details about an aggregation response based on Amazon ECR repositories.
    */
  var repositoryAggregation: js.UndefOr[RepositoryAggregationResponse] = js.undefined
  
  /**
    * An object that contains details about an aggregation response based on finding title.
    */
  var titleAggregation: js.UndefOr[TitleAggregationResponse] = js.undefined
}
object AggregationResponse {
  
  inline def apply(): AggregationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationResponse]
  }
  
  extension [Self <: AggregationResponse](x: Self) {
    
    inline def setAccountAggregation(value: AccountAggregationResponse): Self = StObject.set(x, "accountAggregation", value.asInstanceOf[js.Any])
    
    inline def setAccountAggregationUndefined: Self = StObject.set(x, "accountAggregation", js.undefined)
    
    inline def setAmiAggregation(value: AmiAggregationResponse): Self = StObject.set(x, "amiAggregation", value.asInstanceOf[js.Any])
    
    inline def setAmiAggregationUndefined: Self = StObject.set(x, "amiAggregation", js.undefined)
    
    inline def setAwsEcrContainerAggregation(value: AwsEcrContainerAggregationResponse): Self = StObject.set(x, "awsEcrContainerAggregation", value.asInstanceOf[js.Any])
    
    inline def setAwsEcrContainerAggregationUndefined: Self = StObject.set(x, "awsEcrContainerAggregation", js.undefined)
    
    inline def setEc2InstanceAggregation(value: Ec2InstanceAggregationResponse): Self = StObject.set(x, "ec2InstanceAggregation", value.asInstanceOf[js.Any])
    
    inline def setEc2InstanceAggregationUndefined: Self = StObject.set(x, "ec2InstanceAggregation", js.undefined)
    
    inline def setFindingTypeAggregation(value: FindingTypeAggregationResponse): Self = StObject.set(x, "findingTypeAggregation", value.asInstanceOf[js.Any])
    
    inline def setFindingTypeAggregationUndefined: Self = StObject.set(x, "findingTypeAggregation", js.undefined)
    
    inline def setImageLayerAggregation(value: ImageLayerAggregationResponse): Self = StObject.set(x, "imageLayerAggregation", value.asInstanceOf[js.Any])
    
    inline def setImageLayerAggregationUndefined: Self = StObject.set(x, "imageLayerAggregation", js.undefined)
    
    inline def setPackageAggregation(value: PackageAggregationResponse): Self = StObject.set(x, "packageAggregation", value.asInstanceOf[js.Any])
    
    inline def setPackageAggregationUndefined: Self = StObject.set(x, "packageAggregation", js.undefined)
    
    inline def setRepositoryAggregation(value: RepositoryAggregationResponse): Self = StObject.set(x, "repositoryAggregation", value.asInstanceOf[js.Any])
    
    inline def setRepositoryAggregationUndefined: Self = StObject.set(x, "repositoryAggregation", js.undefined)
    
    inline def setTitleAggregation(value: TitleAggregationResponse): Self = StObject.set(x, "titleAggregation", value.asInstanceOf[js.Any])
    
    inline def setTitleAggregationUndefined: Self = StObject.set(x, "titleAggregation", js.undefined)
  }
}
