package typings.awsSdk.clientsAppsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenSearchServiceDataSourceConfig extends StObject {
  
  /**
    * The Amazon Web Services Region.
    */
  var awsRegion: String
  
  /**
    * The endpoint.
    */
  var endpoint: String
}
object OpenSearchServiceDataSourceConfig {
  
  inline def apply(awsRegion: String, endpoint: String): OpenSearchServiceDataSourceConfig = {
    val __obj = js.Dynamic.literal(awsRegion = awsRegion.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenSearchServiceDataSourceConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OpenSearchServiceDataSourceConfig] (val x: Self) extends AnyVal {
    
    inline def setAwsRegion(value: String): Self = StObject.set(x, "awsRegion", value.asInstanceOf[js.Any])
    
    inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
  }
}
