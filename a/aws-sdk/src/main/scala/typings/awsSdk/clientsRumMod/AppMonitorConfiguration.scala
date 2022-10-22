package typings.awsSdk.clientsRumMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppMonitorConfiguration extends StObject {
  
  /**
    * If you set this to true, the RUM web client sets two cookies, a session cookie and a user cookie. The cookies allow the RUM web client to collect data relating to the number of users an application has and the behavior of the application across a sequence of events. Cookies are stored in the top-level domain of the current page.
    */
  var AllowCookies: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If you set this to true, RUM enables X-Ray tracing for the user sessions that RUM samples. RUM adds an X-Ray trace header to allowed HTTP requests. It also records an X-Ray segment for allowed HTTP requests. You can see traces and segments from these user sessions in the X-Ray console and the CloudWatch ServiceLens console. For more information, see What is X-Ray? 
    */
  var EnableXRay: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A list of URLs in your website or application to exclude from RUM data collection. You can't include both ExcludedPages and IncludedPages in the same operation.
    */
  var ExcludedPages: js.UndefOr[Pages] = js.undefined
  
  /**
    * A list of pages in your application that are to be displayed with a "favorite" icon in the CloudWatch RUM console.
    */
  var FavoritePages: js.UndefOr[typings.awsSdk.clientsRumMod.FavoritePages] = js.undefined
  
  /**
    * The ARN of the guest IAM role that is attached to the Amazon Cognito identity pool that is used to authorize the sending of data to RUM.
    */
  var GuestRoleArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The ID of the Amazon Cognito identity pool that is used to authorize the sending of data to RUM.
    */
  var IdentityPoolId: js.UndefOr[typings.awsSdk.clientsRumMod.IdentityPoolId] = js.undefined
  
  /**
    * If this app monitor is to collect data from only certain pages in your application, this structure lists those pages.   &lt;p&gt;You can't include both &lt;code&gt;ExcludedPages&lt;/code&gt; and &lt;code&gt;IncludedPages&lt;/code&gt; in the same operation.&lt;/p&gt; 
    */
  var IncludedPages: js.UndefOr[Pages] = js.undefined
  
  /**
    * Specifies the portion of user sessions to use for RUM data collection. Choosing a higher portion gives you more data but also incurs more costs. The range for this value is 0 to 1 inclusive. Setting this to 1 means that 100% of user sessions are sampled, and setting it to 0.1 means that 10% of user sessions are sampled. If you omit this parameter, the default of 0.1 is used, and 10% of sessions will be sampled.
    */
  var SessionSampleRate: js.UndefOr[typings.awsSdk.clientsRumMod.SessionSampleRate] = js.undefined
  
  /**
    * An array that lists the types of telemetry data that this app monitor is to collect.    errors indicates that RUM collects data about unhandled JavaScript errors raised by your application.    performance indicates that RUM collects performance data about how your application and its resources are loaded and rendered. This includes Core Web Vitals.    http indicates that RUM collects data about HTTP errors thrown by your application.  
    */
  var Telemetries: js.UndefOr[typings.awsSdk.clientsRumMod.Telemetries] = js.undefined
}
object AppMonitorConfiguration {
  
  inline def apply(): AppMonitorConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppMonitorConfiguration]
  }
  
  extension [Self <: AppMonitorConfiguration](x: Self) {
    
    inline def setAllowCookies(value: Boolean): Self = StObject.set(x, "AllowCookies", value.asInstanceOf[js.Any])
    
    inline def setAllowCookiesUndefined: Self = StObject.set(x, "AllowCookies", js.undefined)
    
    inline def setEnableXRay(value: Boolean): Self = StObject.set(x, "EnableXRay", value.asInstanceOf[js.Any])
    
    inline def setEnableXRayUndefined: Self = StObject.set(x, "EnableXRay", js.undefined)
    
    inline def setExcludedPages(value: Pages): Self = StObject.set(x, "ExcludedPages", value.asInstanceOf[js.Any])
    
    inline def setExcludedPagesUndefined: Self = StObject.set(x, "ExcludedPages", js.undefined)
    
    inline def setExcludedPagesVarargs(value: Url*): Self = StObject.set(x, "ExcludedPages", js.Array(value*))
    
    inline def setFavoritePages(value: FavoritePages): Self = StObject.set(x, "FavoritePages", value.asInstanceOf[js.Any])
    
    inline def setFavoritePagesUndefined: Self = StObject.set(x, "FavoritePages", js.undefined)
    
    inline def setFavoritePagesVarargs(value: String*): Self = StObject.set(x, "FavoritePages", js.Array(value*))
    
    inline def setGuestRoleArn(value: Arn): Self = StObject.set(x, "GuestRoleArn", value.asInstanceOf[js.Any])
    
    inline def setGuestRoleArnUndefined: Self = StObject.set(x, "GuestRoleArn", js.undefined)
    
    inline def setIdentityPoolId(value: IdentityPoolId): Self = StObject.set(x, "IdentityPoolId", value.asInstanceOf[js.Any])
    
    inline def setIdentityPoolIdUndefined: Self = StObject.set(x, "IdentityPoolId", js.undefined)
    
    inline def setIncludedPages(value: Pages): Self = StObject.set(x, "IncludedPages", value.asInstanceOf[js.Any])
    
    inline def setIncludedPagesUndefined: Self = StObject.set(x, "IncludedPages", js.undefined)
    
    inline def setIncludedPagesVarargs(value: Url*): Self = StObject.set(x, "IncludedPages", js.Array(value*))
    
    inline def setSessionSampleRate(value: SessionSampleRate): Self = StObject.set(x, "SessionSampleRate", value.asInstanceOf[js.Any])
    
    inline def setSessionSampleRateUndefined: Self = StObject.set(x, "SessionSampleRate", js.undefined)
    
    inline def setTelemetries(value: Telemetries): Self = StObject.set(x, "Telemetries", value.asInstanceOf[js.Any])
    
    inline def setTelemetriesUndefined: Self = StObject.set(x, "Telemetries", js.undefined)
    
    inline def setTelemetriesVarargs(value: Telemetry*): Self = StObject.set(x, "Telemetries", js.Array(value*))
  }
}
