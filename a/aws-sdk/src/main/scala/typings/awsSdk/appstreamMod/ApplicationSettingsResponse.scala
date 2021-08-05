package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationSettingsResponse extends StObject {
  
  /**
    * Specifies whether persistent application settings are enabled for users during their streaming sessions.
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The S3 bucket where users’ persistent application settings are stored. When persistent application settings are enabled for the first time for an account in an AWS Region, an S3 bucket is created. The bucket is unique to the AWS account and the Region. 
    */
  var S3BucketName: js.UndefOr[String] = js.undefined
  
  /**
    * The path prefix for the S3 bucket where users’ persistent application settings are stored.
    */
  var SettingsGroup: js.UndefOr[typings.awsSdk.appstreamMod.SettingsGroup] = js.undefined
}
object ApplicationSettingsResponse {
  
  inline def apply(): ApplicationSettingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationSettingsResponse]
  }
  
  extension [Self <: ApplicationSettingsResponse](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    inline def setS3BucketName(value: String): Self = StObject.set(x, "S3BucketName", value.asInstanceOf[js.Any])
    
    inline def setS3BucketNameUndefined: Self = StObject.set(x, "S3BucketName", js.undefined)
    
    inline def setSettingsGroup(value: SettingsGroup): Self = StObject.set(x, "SettingsGroup", value.asInstanceOf[js.Any])
    
    inline def setSettingsGroupUndefined: Self = StObject.set(x, "SettingsGroup", js.undefined)
  }
}
