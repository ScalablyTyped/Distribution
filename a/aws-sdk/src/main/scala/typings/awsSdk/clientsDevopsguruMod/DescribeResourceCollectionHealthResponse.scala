package typings.awsSdk.clientsDevopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeResourceCollectionHealthResponse extends StObject {
  
  /**
    *  The returned CloudFormationHealthOverview object that contains an InsightHealthOverview object with the requested system health information. 
    */
  var CloudFormation: js.UndefOr[CloudFormationHealths] = js.undefined
  
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages, this value is null.
    */
  var NextToken: js.UndefOr[UuidNextToken] = js.undefined
  
  /**
    * An array of ServiceHealth objects that describes the health of the Amazon Web Services services associated with the resources in the collection.
    */
  var Service: js.UndefOr[ServiceHealths] = js.undefined
  
  /**
    * The Amazon Web Services tags that are used by resources in the resource collection. Tags help you identify and organize your Amazon Web Services resources. Many Amazon Web Services services support tagging, so you can assign the same tag to resources from different services to indicate that the resources are related. For example, you can assign the same tag to an Amazon DynamoDB table resource that you assign to an Lambda function. For more information about using tags, see the Tagging best practices whitepaper.  Each Amazon Web Services tag has two parts.    A tag key (for example, CostCenter, Environment, Project, or Secret). Tag keys are case-sensitive.   An optional field known as a tag value (for example, 111122223333, Production, or a team name). Omitting the tag value is the same as using an empty string. Like tag keys, tag values are case-sensitive.   Together these are known as key-value pairs.  The string used for a key in a tag that you use to define your resource coverage must begin with the prefix Devops-guru-. The tag key might be DevOps-Guru-deployment-application or devops-guru-rds-application. When you create a key, the case of characters in the key can be whatever you choose. After you create a key, it is case-sensitive. For example, DevOps Guru works with a key named devops-guru-rds and a key named DevOps-Guru-RDS, and these act as two different keys. Possible key/value pairs in your application might be Devops-Guru-production-application/RDS or Devops-Guru-production-application/containers. 
    */
  var Tags: js.UndefOr[TagHealths] = js.undefined
}
object DescribeResourceCollectionHealthResponse {
  
  inline def apply(): DescribeResourceCollectionHealthResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeResourceCollectionHealthResponse]
  }
  
  extension [Self <: DescribeResourceCollectionHealthResponse](x: Self) {
    
    inline def setCloudFormation(value: CloudFormationHealths): Self = StObject.set(x, "CloudFormation", value.asInstanceOf[js.Any])
    
    inline def setCloudFormationUndefined: Self = StObject.set(x, "CloudFormation", js.undefined)
    
    inline def setCloudFormationVarargs(value: CloudFormationHealth*): Self = StObject.set(x, "CloudFormation", js.Array(value*))
    
    inline def setNextToken(value: UuidNextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setService(value: ServiceHealths): Self = StObject.set(x, "Service", value.asInstanceOf[js.Any])
    
    inline def setServiceUndefined: Self = StObject.set(x, "Service", js.undefined)
    
    inline def setServiceVarargs(value: ServiceHealth*): Self = StObject.set(x, "Service", js.Array(value*))
    
    inline def setTags(value: TagHealths): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: TagHealth*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
