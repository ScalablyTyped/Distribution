package typings.awsSdk.clientsElasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeInstancesHealthRequest extends StObject {
  
  /**
    * Specifies the response elements you wish to receive. To retrieve all attributes, set to All. If no attribute names are specified, returns a list of instances.
    */
  var AttributeNames: js.UndefOr[InstancesHealthAttributes] = js.undefined
  
  /**
    * Specify the AWS Elastic Beanstalk environment by ID.
    */
  var EnvironmentId: js.UndefOr[typings.awsSdk.clientsElasticbeanstalkMod.EnvironmentId] = js.undefined
  
  /**
    * Specify the AWS Elastic Beanstalk environment by name.
    */
  var EnvironmentName: js.UndefOr[typings.awsSdk.clientsElasticbeanstalkMod.EnvironmentName] = js.undefined
  
  /**
    * Specify the pagination token returned by a previous call.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsElasticbeanstalkMod.NextToken] = js.undefined
}
object DescribeInstancesHealthRequest {
  
  inline def apply(): DescribeInstancesHealthRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInstancesHealthRequest]
  }
  
  extension [Self <: DescribeInstancesHealthRequest](x: Self) {
    
    inline def setAttributeNames(value: InstancesHealthAttributes): Self = StObject.set(x, "AttributeNames", value.asInstanceOf[js.Any])
    
    inline def setAttributeNamesUndefined: Self = StObject.set(x, "AttributeNames", js.undefined)
    
    inline def setAttributeNamesVarargs(value: InstancesHealthAttribute*): Self = StObject.set(x, "AttributeNames", js.Array(value*))
    
    inline def setEnvironmentId(value: EnvironmentId): Self = StObject.set(x, "EnvironmentId", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentIdUndefined: Self = StObject.set(x, "EnvironmentId", js.undefined)
    
    inline def setEnvironmentName(value: EnvironmentName): Self = StObject.set(x, "EnvironmentName", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentNameUndefined: Self = StObject.set(x, "EnvironmentName", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
