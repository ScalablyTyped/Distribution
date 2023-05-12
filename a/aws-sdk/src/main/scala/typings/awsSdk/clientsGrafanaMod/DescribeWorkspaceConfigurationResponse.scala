package typings.awsSdk.clientsGrafanaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeWorkspaceConfigurationResponse extends StObject {
  
  /**
    * The configuration string for the workspace that you requested. For more information about the format and configuration options available, see Working in your Grafana workspace.
    */
  var configuration: OverridableConfigurationJson
}
object DescribeWorkspaceConfigurationResponse {
  
  inline def apply(configuration: OverridableConfigurationJson): DescribeWorkspaceConfigurationResponse = {
    val __obj = js.Dynamic.literal(configuration = configuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeWorkspaceConfigurationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeWorkspaceConfigurationResponse] (val x: Self) extends AnyVal {
    
    inline def setConfiguration(value: OverridableConfigurationJson): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
  }
}
