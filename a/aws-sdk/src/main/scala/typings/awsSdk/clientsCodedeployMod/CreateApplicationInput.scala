package typings.awsSdk.clientsCodedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateApplicationInput extends StObject {
  
  /**
    * The name of the application. This name must be unique with the applicable IAM or Amazon Web Services account.
    */
  var applicationName: ApplicationName
  
  /**
    *  The destination platform type for the deployment (Lambda, Server, or ECS).
    */
  var computePlatform: js.UndefOr[ComputePlatform] = js.undefined
  
  /**
    *  The metadata that you apply to CodeDeploy applications to help you organize and categorize them. Each tag consists of a key and an optional value, both of which you define. 
    */
  var tags: js.UndefOr[TagList] = js.undefined
}
object CreateApplicationInput {
  
  inline def apply(applicationName: ApplicationName): CreateApplicationInput = {
    val __obj = js.Dynamic.literal(applicationName = applicationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateApplicationInput]
  }
  
  extension [Self <: CreateApplicationInput](x: Self) {
    
    inline def setApplicationName(value: ApplicationName): Self = StObject.set(x, "applicationName", value.asInstanceOf[js.Any])
    
    inline def setComputePlatform(value: ComputePlatform): Self = StObject.set(x, "computePlatform", value.asInstanceOf[js.Any])
    
    inline def setComputePlatformUndefined: Self = StObject.set(x, "computePlatform", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
