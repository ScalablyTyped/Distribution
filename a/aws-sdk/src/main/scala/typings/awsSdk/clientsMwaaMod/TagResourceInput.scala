package typings.awsSdk.clientsMwaaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagResourceInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon MWAA environment. For example, arn:aws:airflow:us-east-1:123456789012:environment/MyMWAAEnvironment.
    */
  var ResourceArn: EnvironmentArn
  
  /**
    * The key-value tag pairs you want to associate to your environment. For example, "Environment": "Staging". To learn more, see Tagging Amazon Web Services resources.
    */
  var Tags: TagMap
}
object TagResourceInput {
  
  inline def apply(ResourceArn: EnvironmentArn, Tags: TagMap): TagResourceInput = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagResourceInput]
  }
  
  extension [Self <: TagResourceInput](x: Self) {
    
    inline def setResourceArn(value: EnvironmentArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
  }
}
