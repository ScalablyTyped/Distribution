package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppInstanceStreamingConfiguration extends StObject {
  
  /**
    * The data type of the app instance.
    */
  var AppInstanceDataType: typings.awsSdk.chimeMod.AppInstanceDataType
  
  /**
    * The resource ARN.
    */
  var ResourceArn: Arn
}
object AppInstanceStreamingConfiguration {
  
  @scala.inline
  def apply(AppInstanceDataType: AppInstanceDataType, ResourceArn: Arn): AppInstanceStreamingConfiguration = {
    val __obj = js.Dynamic.literal(AppInstanceDataType = AppInstanceDataType.asInstanceOf[js.Any], ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppInstanceStreamingConfiguration]
  }
  
  @scala.inline
  implicit class AppInstanceStreamingConfigurationMutableBuilder[Self <: AppInstanceStreamingConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppInstanceDataType(value: AppInstanceDataType): Self = StObject.set(x, "AppInstanceDataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceArn(value: Arn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
