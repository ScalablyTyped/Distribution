package typings.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddApplicationVpcConfigurationRequest extends StObject {
  
  /**
    * The name of an existing application.
    */
  var ApplicationName: typings.awsSdk.clientsKinesisanalyticsv2Mod.ApplicationName
  
  /**
    * A value you use to implement strong concurrency for application updates. You must provide the ApplicationVersionID or the ConditionalToken. You get the application's current ConditionalToken using DescribeApplication. For better concurrency support, use the ConditionalToken parameter instead of CurrentApplicationVersionId.
    */
  var ConditionalToken: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.ConditionalToken] = js.undefined
  
  /**
    * The version of the application to which you want to add the VPC configuration. You must provide the CurrentApplicationVersionId or the ConditionalToken. You can use the DescribeApplication operation to get the current application version. If the version specified is not the current version, the ConcurrentModificationException is returned. For better concurrency support, use the ConditionalToken parameter instead of CurrentApplicationVersionId.
    */
  var CurrentApplicationVersionId: js.UndefOr[ApplicationVersionId] = js.undefined
  
  /**
    * Description of the VPC to add to the application.
    */
  var VpcConfiguration: typings.awsSdk.clientsKinesisanalyticsv2Mod.VpcConfiguration
}
object AddApplicationVpcConfigurationRequest {
  
  inline def apply(ApplicationName: ApplicationName, VpcConfiguration: VpcConfiguration): AddApplicationVpcConfigurationRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], VpcConfiguration = VpcConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddApplicationVpcConfigurationRequest]
  }
  
  extension [Self <: AddApplicationVpcConfigurationRequest](x: Self) {
    
    inline def setApplicationName(value: ApplicationName): Self = StObject.set(x, "ApplicationName", value.asInstanceOf[js.Any])
    
    inline def setConditionalToken(value: ConditionalToken): Self = StObject.set(x, "ConditionalToken", value.asInstanceOf[js.Any])
    
    inline def setConditionalTokenUndefined: Self = StObject.set(x, "ConditionalToken", js.undefined)
    
    inline def setCurrentApplicationVersionId(value: ApplicationVersionId): Self = StObject.set(x, "CurrentApplicationVersionId", value.asInstanceOf[js.Any])
    
    inline def setCurrentApplicationVersionIdUndefined: Self = StObject.set(x, "CurrentApplicationVersionId", js.undefined)
    
    inline def setVpcConfiguration(value: VpcConfiguration): Self = StObject.set(x, "VpcConfiguration", value.asInstanceOf[js.Any])
  }
}
