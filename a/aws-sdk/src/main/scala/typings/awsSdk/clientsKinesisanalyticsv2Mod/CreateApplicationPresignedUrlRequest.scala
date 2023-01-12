package typings.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateApplicationPresignedUrlRequest extends StObject {
  
  /**
    * The name of the application.
    */
  var ApplicationName: typings.awsSdk.clientsKinesisanalyticsv2Mod.ApplicationName
  
  /**
    * The duration in seconds for which the returned URL will be valid.
    */
  var SessionExpirationDurationInSeconds: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.SessionExpirationDurationInSeconds] = js.undefined
  
  /**
    * The type of the extension for which to create and return a URL. Currently, the only valid extension URL type is FLINK_DASHBOARD_URL. 
    */
  var UrlType: typings.awsSdk.clientsKinesisanalyticsv2Mod.UrlType
}
object CreateApplicationPresignedUrlRequest {
  
  inline def apply(ApplicationName: ApplicationName, UrlType: UrlType): CreateApplicationPresignedUrlRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], UrlType = UrlType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateApplicationPresignedUrlRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateApplicationPresignedUrlRequest] (val x: Self) extends AnyVal {
    
    inline def setApplicationName(value: ApplicationName): Self = StObject.set(x, "ApplicationName", value.asInstanceOf[js.Any])
    
    inline def setSessionExpirationDurationInSeconds(value: SessionExpirationDurationInSeconds): Self = StObject.set(x, "SessionExpirationDurationInSeconds", value.asInstanceOf[js.Any])
    
    inline def setSessionExpirationDurationInSecondsUndefined: Self = StObject.set(x, "SessionExpirationDurationInSeconds", js.undefined)
    
    inline def setUrlType(value: UrlType): Self = StObject.set(x, "UrlType", value.asInstanceOf[js.Any])
  }
}
