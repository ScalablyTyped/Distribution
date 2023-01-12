package typings.awsSdk.clientsRumMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAppMonitorRequest extends StObject {
  
  /**
    * A structure that contains much of the configuration data for the app monitor. If you are using Amazon Cognito for authorization, you must include this structure in your request, and it must include the ID of the Amazon Cognito identity pool to use for authorization. If you don't include AppMonitorConfiguration, you must set up your own authorization method. For more information, see Authorize your application to send data to Amazon Web Services. If you omit this argument, the sample rate used for RUM is set to 10% of the user sessions.
    */
  var AppMonitorConfiguration: js.UndefOr[typings.awsSdk.clientsRumMod.AppMonitorConfiguration] = js.undefined
  
  /**
    * Data collected by RUM is kept by RUM for 30 days and then deleted. This parameter specifies whether RUM sends a copy of this telemetry data to Amazon CloudWatch Logs in your account. This enables you to keep the telemetry data for more than 30 days, but it does incur Amazon CloudWatch Logs charges. If you omit this parameter, the default is false.
    */
  var CwLogEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The top-level internet domain name for which your application has administrative authority.
    */
  var Domain: AppMonitorDomain
  
  /**
    * A name for the app monitor.
    */
  var Name: AppMonitorName
  
  /**
    * Assigns one or more tags (key-value pairs) to the app monitor. Tags can help you organize and categorize your resources. You can also use them to scope user permissions by granting a user permission to access or change only resources with certain tag values. Tags don't have any semantic meaning to Amazon Web Services and are interpreted strictly as strings of characters.  &lt;p&gt;You can associate as many as 50 tags with an app monitor.&lt;/p&gt; &lt;p&gt;For more information, see &lt;a href=&quot;https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html&quot;&gt;Tagging Amazon Web Services resources&lt;/a&gt;.&lt;/p&gt; 
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object CreateAppMonitorRequest {
  
  inline def apply(Domain: AppMonitorDomain, Name: AppMonitorName): CreateAppMonitorRequest = {
    val __obj = js.Dynamic.literal(Domain = Domain.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAppMonitorRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateAppMonitorRequest] (val x: Self) extends AnyVal {
    
    inline def setAppMonitorConfiguration(value: AppMonitorConfiguration): Self = StObject.set(x, "AppMonitorConfiguration", value.asInstanceOf[js.Any])
    
    inline def setAppMonitorConfigurationUndefined: Self = StObject.set(x, "AppMonitorConfiguration", js.undefined)
    
    inline def setCwLogEnabled(value: Boolean): Self = StObject.set(x, "CwLogEnabled", value.asInstanceOf[js.Any])
    
    inline def setCwLogEnabledUndefined: Self = StObject.set(x, "CwLogEnabled", js.undefined)
    
    inline def setDomain(value: AppMonitorDomain): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
    
    inline def setName(value: AppMonitorName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
