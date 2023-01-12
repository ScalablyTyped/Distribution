package typings.awsSdk.clientsEmrcontainersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametricCloudWatchMonitoringConfiguration extends StObject {
  
  /**
    *  The name of the log group for log publishing.
    */
  var logGroupName: js.UndefOr[TemplateParameter] = js.undefined
  
  /**
    *  The specified name prefix for log streams.
    */
  var logStreamNamePrefix: js.UndefOr[String256] = js.undefined
}
object ParametricCloudWatchMonitoringConfiguration {
  
  inline def apply(): ParametricCloudWatchMonitoringConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParametricCloudWatchMonitoringConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametricCloudWatchMonitoringConfiguration] (val x: Self) extends AnyVal {
    
    inline def setLogGroupName(value: TemplateParameter): Self = StObject.set(x, "logGroupName", value.asInstanceOf[js.Any])
    
    inline def setLogGroupNameUndefined: Self = StObject.set(x, "logGroupName", js.undefined)
    
    inline def setLogStreamNamePrefix(value: String256): Self = StObject.set(x, "logStreamNamePrefix", value.asInstanceOf[js.Any])
    
    inline def setLogStreamNamePrefixUndefined: Self = StObject.set(x, "logStreamNamePrefix", js.undefined)
  }
}
