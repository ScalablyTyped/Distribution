package typings.awsDashSdk.clientsKafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JmxExporter extends js.Object {
  /**
    * 
    Indicates whether you want to enable or disable the JMX Exporter.
    
    */
  var EnabledInBroker: __boolean = js.native
}

object JmxExporter {
  @scala.inline
  def apply(EnabledInBroker: __boolean): JmxExporter = {
    val __obj = js.Dynamic.literal(EnabledInBroker = EnabledInBroker.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JmxExporter]
  }
}

