package typings.awsSdk.clientsDevopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceCollectionFilter extends StObject {
  
  /**
    *  Information about Amazon Web Services CloudFormation stacks. You can use up to 500 stacks to specify which Amazon Web Services resources in your account to analyze. For more information, see Stacks in the Amazon Web Services CloudFormation User Guide. 
    */
  var CloudFormation: js.UndefOr[CloudFormationCollectionFilter] = js.undefined
  
  /**
    * The Amazon Web Services tags used to filter the resources in the resource collection. Tags help you identify and organize your Amazon Web Services resources. Many Amazon Web Services services support tagging, so you can assign the same tag to resources from different services to indicate that the resources are related. For example, you can assign the same tag to an Amazon DynamoDB table resource that you assign to an Lambda function. For more information about using tags, see the Tagging best practices whitepaper.  Each Amazon Web Services tag has two parts.    A tag key (for example, CostCenter, Environment, Project, or Secret). Tag keys are case-sensitive.   An optional field known as a tag value (for example, 111122223333, Production, or a team name). Omitting the tag value is the same as using an empty string. Like tag keys, tag values are case-sensitive.   Together these are known as key-value pairs.  The string used for a key in a tag that you use to define your resource coverage must begin with the prefix Devops-guru-. The tag key might be DevOps-Guru-deployment-application or devops-guru-rds-application. When you create a key, the case of characters in the key can be whatever you choose. After you create a key, it is case-sensitive. For example, DevOps Guru works with a key named devops-guru-rds and a key named DevOps-Guru-RDS, and these act as two different keys. Possible key/value pairs in your application might be Devops-Guru-production-application/RDS or Devops-Guru-production-application/containers. 
    */
  var Tags: js.UndefOr[TagCollectionFilters] = js.undefined
}
object ResourceCollectionFilter {
  
  inline def apply(): ResourceCollectionFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceCollectionFilter]
  }
  
  extension [Self <: ResourceCollectionFilter](x: Self) {
    
    inline def setCloudFormation(value: CloudFormationCollectionFilter): Self = StObject.set(x, "CloudFormation", value.asInstanceOf[js.Any])
    
    inline def setCloudFormationUndefined: Self = StObject.set(x, "CloudFormation", js.undefined)
    
    inline def setTags(value: TagCollectionFilters): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: TagCollectionFilter*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
