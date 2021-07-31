package typings.awsSdk.appsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElasticsearchDataSourceConfig extends StObject {
  
  /**
    * The AWS Region.
    */
  var awsRegion: String
  
  /**
    * The endpoint.
    */
  var endpoint: String
}
object ElasticsearchDataSourceConfig {
  
  @scala.inline
  def apply(awsRegion: String, endpoint: String): ElasticsearchDataSourceConfig = {
    val __obj = js.Dynamic.literal(awsRegion = awsRegion.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElasticsearchDataSourceConfig]
  }
  
  @scala.inline
  implicit class ElasticsearchDataSourceConfigMutableBuilder[Self <: ElasticsearchDataSourceConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAwsRegion(value: String): Self = StObject.set(x, "awsRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
  }
}
