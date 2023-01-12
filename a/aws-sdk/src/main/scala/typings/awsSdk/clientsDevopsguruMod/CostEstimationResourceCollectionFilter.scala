package typings.awsSdk.clientsDevopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CostEstimationResourceCollectionFilter extends StObject {
  
  /**
    * An object that specifies the CloudFormation stack that defines the Amazon Web Services resources used to create a monthly estimate for DevOps Guru.
    */
  var CloudFormation: js.UndefOr[CloudFormationCostEstimationResourceCollectionFilter] = js.undefined
  
  /**
    * The Amazon Web Services tags used to filter the resource collection that is used for a cost estimate. Tags help you identify and organize your Amazon Web Services resources. Many Amazon Web Services services support tagging, so you can assign the same tag to resources from different services to indicate that the resources are related. For example, you can assign the same tag to an Amazon DynamoDB table resource that you assign to an Lambda function. For more information about using tags, see the Tagging best practices whitepaper.  Each Amazon Web Services tag has two parts.    A tag key (for example, CostCenter, Environment, Project, or Secret). Tag keys are case-sensitive.   An optional field known as a tag value (for example, 111122223333, Production, or a team name). Omitting the tag value is the same as using an empty string. Like tag keys, tag values are case-sensitive.   Together these are known as key-value pairs.  The string used for a key in a tag that you use to define your resource coverage must begin with the prefix Devops-guru-. The tag key might be DevOps-Guru-deployment-application or devops-guru-rds-application. When you create a key, the case of characters in the key can be whatever you choose. After you create a key, it is case-sensitive. For example, DevOps Guru works with a key named devops-guru-rds and a key named DevOps-Guru-RDS, and these act as two different keys. Possible key/value pairs in your application might be Devops-Guru-production-application/RDS or Devops-Guru-production-application/containers. 
    */
  var Tags: js.UndefOr[TagCostEstimationResourceCollectionFilters] = js.undefined
}
object CostEstimationResourceCollectionFilter {
  
  inline def apply(): CostEstimationResourceCollectionFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CostEstimationResourceCollectionFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CostEstimationResourceCollectionFilter] (val x: Self) extends AnyVal {
    
    inline def setCloudFormation(value: CloudFormationCostEstimationResourceCollectionFilter): Self = StObject.set(x, "CloudFormation", value.asInstanceOf[js.Any])
    
    inline def setCloudFormationUndefined: Self = StObject.set(x, "CloudFormation", js.undefined)
    
    inline def setTags(value: TagCostEstimationResourceCollectionFilters): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: TagCostEstimationResourceCollectionFilter*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
