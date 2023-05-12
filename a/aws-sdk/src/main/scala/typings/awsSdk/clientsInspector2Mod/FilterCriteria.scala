package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterCriteria extends StObject {
  
  /**
    * Details of the Amazon Web Services account IDs used to filter findings.
    */
  var awsAccountId: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * Details of the component IDs used to filter findings.
    */
  var componentId: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * Details of the component types used to filter findings.
    */
  var componentType: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * Details of the Amazon EC2 instance image IDs used to filter findings.
    */
  var ec2InstanceImageId: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * Details of the Amazon EC2 instance subnet IDs used to filter findings.
    */
  var ec2InstanceSubnetId: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * Details of the Amazon EC2 instance VPC IDs used to filter findings.
    */
  var ec2InstanceVpcId: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * Details of the Amazon ECR image architecture types used to filter findings.
    */
  var ecrImageArchitecture: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * Details of the Amazon ECR image hashes used to filter findings.
    */
  var ecrImageHash: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * Details on the Amazon ECR image push date and time used to filter findings.
    */
  var ecrImagePushedAt: js.UndefOr[DateFilterList] = js.undefined
  
  /**
    * Details on the Amazon ECR registry used to filter findings.
    */
  var ecrImageRegistry: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * Details on the name of the Amazon ECR repository used to filter findings.
    */
  var ecrImageRepositoryName: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * The tags attached to the Amazon ECR container image.
    */
  var ecrImageTags: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * Filters the list of AWS Lambda findings by the availability of exploits.
    */
  var exploitAvailable: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * Details on the finding ARNs used to filter findings.
    */
  var findingArn: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * Details on the finding status types used to filter findings.
    */
  var findingStatus: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * Details on the finding types used to filter findings.
    */
  var findingType: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * Details on the date and time a finding was first seen used to filter findings.
    */
  var firstObservedAt: js.UndefOr[DateFilterList] = js.undefined
  
  /**
    * Details on whether a fix is available through a version update. This value can be YES, NO, or PARTIAL. A PARTIAL fix means that some, but not all, of the packages identified in the finding have fixes available through updated versions.
    */
  var fixAvailable: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * The Amazon Inspector score to filter on.
    */
  var inspectorScore: js.UndefOr[NumberFilterList] = js.undefined
  
  /**
    * Filters the list of AWS Lambda functions by execution role.
    */
  var lambdaFunctionExecutionRoleArn: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * Filters the list of AWS Lambda functions by the date and time that a user last updated the configuration, in ISO 8601 format 
    */
  var lambdaFunctionLastModifiedAt: js.UndefOr[DateFilterList] = js.undefined
  
  /**
    * Filters the list of AWS Lambda functions by the function's  layers. A Lambda function can have up to five layers.
    */
  var lambdaFunctionLayers: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * Filters the list of AWS Lambda functions by the name of the function.
    */
  var lambdaFunctionName: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * Filters the list of AWS Lambda functions by the runtime environment for the Lambda function.
    */
  var lambdaFunctionRuntime: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * Details on the date and time a finding was last seen used to filter findings.
    */
  var lastObservedAt: js.UndefOr[DateFilterList] = js.undefined
  
  /**
    * Details on the ingress source addresses used to filter findings.
    */
  var networkProtocol: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * Details on the port ranges used to filter findings.
    */
  var portRange: js.UndefOr[PortRangeFilterList] = js.undefined
  
  /**
    * Details on the related vulnerabilities used to filter findings.
    */
  var relatedVulnerabilities: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * Details on the resource IDs used to filter findings.
    */
  var resourceId: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * Details on the resource tags used to filter findings.
    */
  var resourceTags: js.UndefOr[MapFilterList] = js.undefined
  
  /**
    * Details on the resource types used to filter findings.
    */
  var resourceType: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * Details on the severity used to filter findings.
    */
  var severity: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * Details on the finding title used to filter findings.
    */
  var title: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * Details on the date and time a finding was last updated at used to filter findings.
    */
  var updatedAt: js.UndefOr[DateFilterList] = js.undefined
  
  /**
    * Details on the vendor severity used to filter findings.
    */
  var vendorSeverity: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * Details on the vulnerability ID used to filter findings.
    */
  var vulnerabilityId: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * Details on the vulnerability type used to filter findings.
    */
  var vulnerabilitySource: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * Details on the vulnerable packages used to filter findings.
    */
  var vulnerablePackages: js.UndefOr[PackageFilterList] = js.undefined
}
object FilterCriteria {
  
  inline def apply(): FilterCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterCriteria]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FilterCriteria] (val x: Self) extends AnyVal {
    
    inline def setAwsAccountId(value: StringFilterList): Self = StObject.set(x, "awsAccountId", value.asInstanceOf[js.Any])
    
    inline def setAwsAccountIdUndefined: Self = StObject.set(x, "awsAccountId", js.undefined)
    
    inline def setAwsAccountIdVarargs(value: StringFilter*): Self = StObject.set(x, "awsAccountId", js.Array(value*))
    
    inline def setComponentId(value: StringFilterList): Self = StObject.set(x, "componentId", value.asInstanceOf[js.Any])
    
    inline def setComponentIdUndefined: Self = StObject.set(x, "componentId", js.undefined)
    
    inline def setComponentIdVarargs(value: StringFilter*): Self = StObject.set(x, "componentId", js.Array(value*))
    
    inline def setComponentType(value: StringFilterList): Self = StObject.set(x, "componentType", value.asInstanceOf[js.Any])
    
    inline def setComponentTypeUndefined: Self = StObject.set(x, "componentType", js.undefined)
    
    inline def setComponentTypeVarargs(value: StringFilter*): Self = StObject.set(x, "componentType", js.Array(value*))
    
    inline def setEc2InstanceImageId(value: StringFilterList): Self = StObject.set(x, "ec2InstanceImageId", value.asInstanceOf[js.Any])
    
    inline def setEc2InstanceImageIdUndefined: Self = StObject.set(x, "ec2InstanceImageId", js.undefined)
    
    inline def setEc2InstanceImageIdVarargs(value: StringFilter*): Self = StObject.set(x, "ec2InstanceImageId", js.Array(value*))
    
    inline def setEc2InstanceSubnetId(value: StringFilterList): Self = StObject.set(x, "ec2InstanceSubnetId", value.asInstanceOf[js.Any])
    
    inline def setEc2InstanceSubnetIdUndefined: Self = StObject.set(x, "ec2InstanceSubnetId", js.undefined)
    
    inline def setEc2InstanceSubnetIdVarargs(value: StringFilter*): Self = StObject.set(x, "ec2InstanceSubnetId", js.Array(value*))
    
    inline def setEc2InstanceVpcId(value: StringFilterList): Self = StObject.set(x, "ec2InstanceVpcId", value.asInstanceOf[js.Any])
    
    inline def setEc2InstanceVpcIdUndefined: Self = StObject.set(x, "ec2InstanceVpcId", js.undefined)
    
    inline def setEc2InstanceVpcIdVarargs(value: StringFilter*): Self = StObject.set(x, "ec2InstanceVpcId", js.Array(value*))
    
    inline def setEcrImageArchitecture(value: StringFilterList): Self = StObject.set(x, "ecrImageArchitecture", value.asInstanceOf[js.Any])
    
    inline def setEcrImageArchitectureUndefined: Self = StObject.set(x, "ecrImageArchitecture", js.undefined)
    
    inline def setEcrImageArchitectureVarargs(value: StringFilter*): Self = StObject.set(x, "ecrImageArchitecture", js.Array(value*))
    
    inline def setEcrImageHash(value: StringFilterList): Self = StObject.set(x, "ecrImageHash", value.asInstanceOf[js.Any])
    
    inline def setEcrImageHashUndefined: Self = StObject.set(x, "ecrImageHash", js.undefined)
    
    inline def setEcrImageHashVarargs(value: StringFilter*): Self = StObject.set(x, "ecrImageHash", js.Array(value*))
    
    inline def setEcrImagePushedAt(value: DateFilterList): Self = StObject.set(x, "ecrImagePushedAt", value.asInstanceOf[js.Any])
    
    inline def setEcrImagePushedAtUndefined: Self = StObject.set(x, "ecrImagePushedAt", js.undefined)
    
    inline def setEcrImagePushedAtVarargs(value: DateFilter*): Self = StObject.set(x, "ecrImagePushedAt", js.Array(value*))
    
    inline def setEcrImageRegistry(value: StringFilterList): Self = StObject.set(x, "ecrImageRegistry", value.asInstanceOf[js.Any])
    
    inline def setEcrImageRegistryUndefined: Self = StObject.set(x, "ecrImageRegistry", js.undefined)
    
    inline def setEcrImageRegistryVarargs(value: StringFilter*): Self = StObject.set(x, "ecrImageRegistry", js.Array(value*))
    
    inline def setEcrImageRepositoryName(value: StringFilterList): Self = StObject.set(x, "ecrImageRepositoryName", value.asInstanceOf[js.Any])
    
    inline def setEcrImageRepositoryNameUndefined: Self = StObject.set(x, "ecrImageRepositoryName", js.undefined)
    
    inline def setEcrImageRepositoryNameVarargs(value: StringFilter*): Self = StObject.set(x, "ecrImageRepositoryName", js.Array(value*))
    
    inline def setEcrImageTags(value: StringFilterList): Self = StObject.set(x, "ecrImageTags", value.asInstanceOf[js.Any])
    
    inline def setEcrImageTagsUndefined: Self = StObject.set(x, "ecrImageTags", js.undefined)
    
    inline def setEcrImageTagsVarargs(value: StringFilter*): Self = StObject.set(x, "ecrImageTags", js.Array(value*))
    
    inline def setExploitAvailable(value: StringFilterList): Self = StObject.set(x, "exploitAvailable", value.asInstanceOf[js.Any])
    
    inline def setExploitAvailableUndefined: Self = StObject.set(x, "exploitAvailable", js.undefined)
    
    inline def setExploitAvailableVarargs(value: StringFilter*): Self = StObject.set(x, "exploitAvailable", js.Array(value*))
    
    inline def setFindingArn(value: StringFilterList): Self = StObject.set(x, "findingArn", value.asInstanceOf[js.Any])
    
    inline def setFindingArnUndefined: Self = StObject.set(x, "findingArn", js.undefined)
    
    inline def setFindingArnVarargs(value: StringFilter*): Self = StObject.set(x, "findingArn", js.Array(value*))
    
    inline def setFindingStatus(value: StringFilterList): Self = StObject.set(x, "findingStatus", value.asInstanceOf[js.Any])
    
    inline def setFindingStatusUndefined: Self = StObject.set(x, "findingStatus", js.undefined)
    
    inline def setFindingStatusVarargs(value: StringFilter*): Self = StObject.set(x, "findingStatus", js.Array(value*))
    
    inline def setFindingType(value: StringFilterList): Self = StObject.set(x, "findingType", value.asInstanceOf[js.Any])
    
    inline def setFindingTypeUndefined: Self = StObject.set(x, "findingType", js.undefined)
    
    inline def setFindingTypeVarargs(value: StringFilter*): Self = StObject.set(x, "findingType", js.Array(value*))
    
    inline def setFirstObservedAt(value: DateFilterList): Self = StObject.set(x, "firstObservedAt", value.asInstanceOf[js.Any])
    
    inline def setFirstObservedAtUndefined: Self = StObject.set(x, "firstObservedAt", js.undefined)
    
    inline def setFirstObservedAtVarargs(value: DateFilter*): Self = StObject.set(x, "firstObservedAt", js.Array(value*))
    
    inline def setFixAvailable(value: StringFilterList): Self = StObject.set(x, "fixAvailable", value.asInstanceOf[js.Any])
    
    inline def setFixAvailableUndefined: Self = StObject.set(x, "fixAvailable", js.undefined)
    
    inline def setFixAvailableVarargs(value: StringFilter*): Self = StObject.set(x, "fixAvailable", js.Array(value*))
    
    inline def setInspectorScore(value: NumberFilterList): Self = StObject.set(x, "inspectorScore", value.asInstanceOf[js.Any])
    
    inline def setInspectorScoreUndefined: Self = StObject.set(x, "inspectorScore", js.undefined)
    
    inline def setInspectorScoreVarargs(value: NumberFilter*): Self = StObject.set(x, "inspectorScore", js.Array(value*))
    
    inline def setLambdaFunctionExecutionRoleArn(value: StringFilterList): Self = StObject.set(x, "lambdaFunctionExecutionRoleArn", value.asInstanceOf[js.Any])
    
    inline def setLambdaFunctionExecutionRoleArnUndefined: Self = StObject.set(x, "lambdaFunctionExecutionRoleArn", js.undefined)
    
    inline def setLambdaFunctionExecutionRoleArnVarargs(value: StringFilter*): Self = StObject.set(x, "lambdaFunctionExecutionRoleArn", js.Array(value*))
    
    inline def setLambdaFunctionLastModifiedAt(value: DateFilterList): Self = StObject.set(x, "lambdaFunctionLastModifiedAt", value.asInstanceOf[js.Any])
    
    inline def setLambdaFunctionLastModifiedAtUndefined: Self = StObject.set(x, "lambdaFunctionLastModifiedAt", js.undefined)
    
    inline def setLambdaFunctionLastModifiedAtVarargs(value: DateFilter*): Self = StObject.set(x, "lambdaFunctionLastModifiedAt", js.Array(value*))
    
    inline def setLambdaFunctionLayers(value: StringFilterList): Self = StObject.set(x, "lambdaFunctionLayers", value.asInstanceOf[js.Any])
    
    inline def setLambdaFunctionLayersUndefined: Self = StObject.set(x, "lambdaFunctionLayers", js.undefined)
    
    inline def setLambdaFunctionLayersVarargs(value: StringFilter*): Self = StObject.set(x, "lambdaFunctionLayers", js.Array(value*))
    
    inline def setLambdaFunctionName(value: StringFilterList): Self = StObject.set(x, "lambdaFunctionName", value.asInstanceOf[js.Any])
    
    inline def setLambdaFunctionNameUndefined: Self = StObject.set(x, "lambdaFunctionName", js.undefined)
    
    inline def setLambdaFunctionNameVarargs(value: StringFilter*): Self = StObject.set(x, "lambdaFunctionName", js.Array(value*))
    
    inline def setLambdaFunctionRuntime(value: StringFilterList): Self = StObject.set(x, "lambdaFunctionRuntime", value.asInstanceOf[js.Any])
    
    inline def setLambdaFunctionRuntimeUndefined: Self = StObject.set(x, "lambdaFunctionRuntime", js.undefined)
    
    inline def setLambdaFunctionRuntimeVarargs(value: StringFilter*): Self = StObject.set(x, "lambdaFunctionRuntime", js.Array(value*))
    
    inline def setLastObservedAt(value: DateFilterList): Self = StObject.set(x, "lastObservedAt", value.asInstanceOf[js.Any])
    
    inline def setLastObservedAtUndefined: Self = StObject.set(x, "lastObservedAt", js.undefined)
    
    inline def setLastObservedAtVarargs(value: DateFilter*): Self = StObject.set(x, "lastObservedAt", js.Array(value*))
    
    inline def setNetworkProtocol(value: StringFilterList): Self = StObject.set(x, "networkProtocol", value.asInstanceOf[js.Any])
    
    inline def setNetworkProtocolUndefined: Self = StObject.set(x, "networkProtocol", js.undefined)
    
    inline def setNetworkProtocolVarargs(value: StringFilter*): Self = StObject.set(x, "networkProtocol", js.Array(value*))
    
    inline def setPortRange(value: PortRangeFilterList): Self = StObject.set(x, "portRange", value.asInstanceOf[js.Any])
    
    inline def setPortRangeUndefined: Self = StObject.set(x, "portRange", js.undefined)
    
    inline def setPortRangeVarargs(value: PortRangeFilter*): Self = StObject.set(x, "portRange", js.Array(value*))
    
    inline def setRelatedVulnerabilities(value: StringFilterList): Self = StObject.set(x, "relatedVulnerabilities", value.asInstanceOf[js.Any])
    
    inline def setRelatedVulnerabilitiesUndefined: Self = StObject.set(x, "relatedVulnerabilities", js.undefined)
    
    inline def setRelatedVulnerabilitiesVarargs(value: StringFilter*): Self = StObject.set(x, "relatedVulnerabilities", js.Array(value*))
    
    inline def setResourceId(value: StringFilterList): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
    
    inline def setResourceIdVarargs(value: StringFilter*): Self = StObject.set(x, "resourceId", js.Array(value*))
    
    inline def setResourceTags(value: MapFilterList): Self = StObject.set(x, "resourceTags", value.asInstanceOf[js.Any])
    
    inline def setResourceTagsUndefined: Self = StObject.set(x, "resourceTags", js.undefined)
    
    inline def setResourceTagsVarargs(value: MapFilter*): Self = StObject.set(x, "resourceTags", js.Array(value*))
    
    inline def setResourceType(value: StringFilterList): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    inline def setResourceTypeVarargs(value: StringFilter*): Self = StObject.set(x, "resourceType", js.Array(value*))
    
    inline def setSeverity(value: StringFilterList): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    inline def setSeverityVarargs(value: StringFilter*): Self = StObject.set(x, "severity", js.Array(value*))
    
    inline def setTitle(value: StringFilterList): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTitleVarargs(value: StringFilter*): Self = StObject.set(x, "title", js.Array(value*))
    
    inline def setUpdatedAt(value: DateFilterList): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAtUndefined: Self = StObject.set(x, "updatedAt", js.undefined)
    
    inline def setUpdatedAtVarargs(value: DateFilter*): Self = StObject.set(x, "updatedAt", js.Array(value*))
    
    inline def setVendorSeverity(value: StringFilterList): Self = StObject.set(x, "vendorSeverity", value.asInstanceOf[js.Any])
    
    inline def setVendorSeverityUndefined: Self = StObject.set(x, "vendorSeverity", js.undefined)
    
    inline def setVendorSeverityVarargs(value: StringFilter*): Self = StObject.set(x, "vendorSeverity", js.Array(value*))
    
    inline def setVulnerabilityId(value: StringFilterList): Self = StObject.set(x, "vulnerabilityId", value.asInstanceOf[js.Any])
    
    inline def setVulnerabilityIdUndefined: Self = StObject.set(x, "vulnerabilityId", js.undefined)
    
    inline def setVulnerabilityIdVarargs(value: StringFilter*): Self = StObject.set(x, "vulnerabilityId", js.Array(value*))
    
    inline def setVulnerabilitySource(value: StringFilterList): Self = StObject.set(x, "vulnerabilitySource", value.asInstanceOf[js.Any])
    
    inline def setVulnerabilitySourceUndefined: Self = StObject.set(x, "vulnerabilitySource", js.undefined)
    
    inline def setVulnerabilitySourceVarargs(value: StringFilter*): Self = StObject.set(x, "vulnerabilitySource", js.Array(value*))
    
    inline def setVulnerablePackages(value: PackageFilterList): Self = StObject.set(x, "vulnerablePackages", value.asInstanceOf[js.Any])
    
    inline def setVulnerablePackagesUndefined: Self = StObject.set(x, "vulnerablePackages", js.undefined)
    
    inline def setVulnerablePackagesVarargs(value: PackageFilter*): Self = StObject.set(x, "vulnerablePackages", js.Array(value*))
  }
}
