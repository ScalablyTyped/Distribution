package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerifiedAccessInstanceLoggingConfiguration extends StObject {
  
  /**
    * Details about the logging options.
    */
  var AccessLogs: js.UndefOr[VerifiedAccessLogs] = js.undefined
  
  /**
    * The ID of the Amazon Web Services Verified Access instance.
    */
  var VerifiedAccessInstanceId: js.UndefOr[String] = js.undefined
}
object VerifiedAccessInstanceLoggingConfiguration {
  
  inline def apply(): VerifiedAccessInstanceLoggingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerifiedAccessInstanceLoggingConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VerifiedAccessInstanceLoggingConfiguration] (val x: Self) extends AnyVal {
    
    inline def setAccessLogs(value: VerifiedAccessLogs): Self = StObject.set(x, "AccessLogs", value.asInstanceOf[js.Any])
    
    inline def setAccessLogsUndefined: Self = StObject.set(x, "AccessLogs", js.undefined)
    
    inline def setVerifiedAccessInstanceId(value: String): Self = StObject.set(x, "VerifiedAccessInstanceId", value.asInstanceOf[js.Any])
    
    inline def setVerifiedAccessInstanceIdUndefined: Self = StObject.set(x, "VerifiedAccessInstanceId", js.undefined)
  }
}
