package typings.auth0.mod

import typings.auth0.anon.AwsAccountId
import typings.auth0.anon.AzurePartnerTopic
import typings.auth0.anon.DatadogApiKey
import typings.auth0.anon.HttpAuthorization
import typings.auth0.anon.SplunkDomain
import typings.auth0.anon.SumoSourceAddress
import typings.auth0.auth0Strings.active
import typings.auth0.auth0Strings.paused
import typings.auth0.auth0Strings.suspended
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.auth0.mod.DatadogLogStream
  - typings.auth0.mod.EventBridgeLogStream
  - typings.auth0.mod.EventGridLogStream
  - typings.auth0.mod.HttpLogStream
  - typings.auth0.mod.SplunkLogStream
  - typings.auth0.mod.SumoLogStream
*/
trait LogStream extends StObject
object LogStream {
  
  inline def DatadogLogStream(id: String, name: String, sink: DatadogApiKey, status: active | paused | suspended): typings.auth0.mod.DatadogLogStream = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sink = sink.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("datadog")
    __obj.asInstanceOf[typings.auth0.mod.DatadogLogStream]
  }
  
  inline def EventBridgeLogStream(id: String, name: String, sink: AwsAccountId, status: active | paused | suspended): typings.auth0.mod.EventBridgeLogStream = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sink = sink.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("eventbridge")
    __obj.asInstanceOf[typings.auth0.mod.EventBridgeLogStream]
  }
  
  inline def EventGridLogStream(id: String, name: String, sink: AzurePartnerTopic, status: active | paused | suspended): typings.auth0.mod.EventGridLogStream = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sink = sink.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("eventgrid")
    __obj.asInstanceOf[typings.auth0.mod.EventGridLogStream]
  }
  
  inline def HttpLogStream(id: String, name: String, sink: HttpAuthorization, status: active | paused | suspended): typings.auth0.mod.HttpLogStream = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sink = sink.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("http")
    __obj.asInstanceOf[typings.auth0.mod.HttpLogStream]
  }
  
  inline def SplunkLogStream(id: String, name: String, sink: SplunkDomain, status: active | paused | suspended): typings.auth0.mod.SplunkLogStream = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sink = sink.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("splunk")
    __obj.asInstanceOf[typings.auth0.mod.SplunkLogStream]
  }
  
  inline def SumoLogStream(id: String, name: String, sink: SumoSourceAddress, status: active | paused | suspended): typings.auth0.mod.SumoLogStream = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sink = sink.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("sumo")
    __obj.asInstanceOf[typings.auth0.mod.SumoLogStream]
  }
}
