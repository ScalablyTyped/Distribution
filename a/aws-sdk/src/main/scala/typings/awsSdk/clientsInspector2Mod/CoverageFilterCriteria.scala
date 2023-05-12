package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoverageFilterCriteria extends StObject {
  
  /**
    * An array of Amazon Web Services account IDs to return coverage statistics for.
    */
  var accountId: js.UndefOr[CoverageStringFilterList] = js.undefined
  
  /**
    * The Amazon EC2 instance tags to filter on.
    */
  var ec2InstanceTags: js.UndefOr[CoverageMapFilterList] = js.undefined
  
  /**
    * The Amazon ECR image tags to filter on.
    */
  var ecrImageTags: js.UndefOr[CoverageStringFilterList] = js.undefined
  
  /**
    * The Amazon ECR repository name to filter on.
    */
  var ecrRepositoryName: js.UndefOr[CoverageStringFilterList] = js.undefined
  
  /**
    * Returns coverage statistics for AWS Lambda functions filtered by function names.
    */
  var lambdaFunctionName: js.UndefOr[CoverageStringFilterList] = js.undefined
  
  /**
    * Returns coverage statistics for AWS Lambda functions filtered by runtime.
    */
  var lambdaFunctionRuntime: js.UndefOr[CoverageStringFilterList] = js.undefined
  
  /**
    * Returns coverage statistics for AWS Lambda functions filtered by tag.
    */
  var lambdaFunctionTags: js.UndefOr[CoverageMapFilterList] = js.undefined
  
  /**
    * An array of Amazon Web Services resource IDs to return coverage statistics for.
    */
  var resourceId: js.UndefOr[CoverageStringFilterList] = js.undefined
  
  /**
    * An array of Amazon Web Services resource types to return coverage statistics for. The values can be AWS_EC2_INSTANCE or AWS_ECR_REPOSITORY.
    */
  var resourceType: js.UndefOr[CoverageStringFilterList] = js.undefined
  
  /**
    * The scan status code to filter on.
    */
  var scanStatusCode: js.UndefOr[CoverageStringFilterList] = js.undefined
  
  /**
    * The scan status reason to filter on.
    */
  var scanStatusReason: js.UndefOr[CoverageStringFilterList] = js.undefined
  
  /**
    * An array of Amazon Inspector scan types to return coverage statistics for.
    */
  var scanType: js.UndefOr[CoverageStringFilterList] = js.undefined
}
object CoverageFilterCriteria {
  
  inline def apply(): CoverageFilterCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoverageFilterCriteria]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CoverageFilterCriteria] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: CoverageStringFilterList): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setAccountIdVarargs(value: CoverageStringFilter*): Self = StObject.set(x, "accountId", js.Array(value*))
    
    inline def setEc2InstanceTags(value: CoverageMapFilterList): Self = StObject.set(x, "ec2InstanceTags", value.asInstanceOf[js.Any])
    
    inline def setEc2InstanceTagsUndefined: Self = StObject.set(x, "ec2InstanceTags", js.undefined)
    
    inline def setEc2InstanceTagsVarargs(value: CoverageMapFilter*): Self = StObject.set(x, "ec2InstanceTags", js.Array(value*))
    
    inline def setEcrImageTags(value: CoverageStringFilterList): Self = StObject.set(x, "ecrImageTags", value.asInstanceOf[js.Any])
    
    inline def setEcrImageTagsUndefined: Self = StObject.set(x, "ecrImageTags", js.undefined)
    
    inline def setEcrImageTagsVarargs(value: CoverageStringFilter*): Self = StObject.set(x, "ecrImageTags", js.Array(value*))
    
    inline def setEcrRepositoryName(value: CoverageStringFilterList): Self = StObject.set(x, "ecrRepositoryName", value.asInstanceOf[js.Any])
    
    inline def setEcrRepositoryNameUndefined: Self = StObject.set(x, "ecrRepositoryName", js.undefined)
    
    inline def setEcrRepositoryNameVarargs(value: CoverageStringFilter*): Self = StObject.set(x, "ecrRepositoryName", js.Array(value*))
    
    inline def setLambdaFunctionName(value: CoverageStringFilterList): Self = StObject.set(x, "lambdaFunctionName", value.asInstanceOf[js.Any])
    
    inline def setLambdaFunctionNameUndefined: Self = StObject.set(x, "lambdaFunctionName", js.undefined)
    
    inline def setLambdaFunctionNameVarargs(value: CoverageStringFilter*): Self = StObject.set(x, "lambdaFunctionName", js.Array(value*))
    
    inline def setLambdaFunctionRuntime(value: CoverageStringFilterList): Self = StObject.set(x, "lambdaFunctionRuntime", value.asInstanceOf[js.Any])
    
    inline def setLambdaFunctionRuntimeUndefined: Self = StObject.set(x, "lambdaFunctionRuntime", js.undefined)
    
    inline def setLambdaFunctionRuntimeVarargs(value: CoverageStringFilter*): Self = StObject.set(x, "lambdaFunctionRuntime", js.Array(value*))
    
    inline def setLambdaFunctionTags(value: CoverageMapFilterList): Self = StObject.set(x, "lambdaFunctionTags", value.asInstanceOf[js.Any])
    
    inline def setLambdaFunctionTagsUndefined: Self = StObject.set(x, "lambdaFunctionTags", js.undefined)
    
    inline def setLambdaFunctionTagsVarargs(value: CoverageMapFilter*): Self = StObject.set(x, "lambdaFunctionTags", js.Array(value*))
    
    inline def setResourceId(value: CoverageStringFilterList): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
    
    inline def setResourceIdVarargs(value: CoverageStringFilter*): Self = StObject.set(x, "resourceId", js.Array(value*))
    
    inline def setResourceType(value: CoverageStringFilterList): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    inline def setResourceTypeVarargs(value: CoverageStringFilter*): Self = StObject.set(x, "resourceType", js.Array(value*))
    
    inline def setScanStatusCode(value: CoverageStringFilterList): Self = StObject.set(x, "scanStatusCode", value.asInstanceOf[js.Any])
    
    inline def setScanStatusCodeUndefined: Self = StObject.set(x, "scanStatusCode", js.undefined)
    
    inline def setScanStatusCodeVarargs(value: CoverageStringFilter*): Self = StObject.set(x, "scanStatusCode", js.Array(value*))
    
    inline def setScanStatusReason(value: CoverageStringFilterList): Self = StObject.set(x, "scanStatusReason", value.asInstanceOf[js.Any])
    
    inline def setScanStatusReasonUndefined: Self = StObject.set(x, "scanStatusReason", js.undefined)
    
    inline def setScanStatusReasonVarargs(value: CoverageStringFilter*): Self = StObject.set(x, "scanStatusReason", js.Array(value*))
    
    inline def setScanType(value: CoverageStringFilterList): Self = StObject.set(x, "scanType", value.asInstanceOf[js.Any])
    
    inline def setScanTypeUndefined: Self = StObject.set(x, "scanType", js.undefined)
    
    inline def setScanTypeVarargs(value: CoverageStringFilter*): Self = StObject.set(x, "scanType", js.Array(value*))
  }
}
