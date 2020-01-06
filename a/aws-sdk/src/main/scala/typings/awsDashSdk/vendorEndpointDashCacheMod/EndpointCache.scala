package typings.awsDashSdk.vendorEndpointDashCacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/vendor/endpoint-cache", "EndpointCache")
@js.native
class EndpointCache () extends js.Object {
  def this(maxSize: Double) = this()
  var cache: js.Any = js.native
  val maxSize: Double = js.native
  var populateValue: js.Any = js.native
  val size: Double = js.native
  def empty(): Unit = js.native
  def get(key: String): js.UndefOr[EndpointRecords] = js.native
  def get(key: EndpointIdentifier): js.UndefOr[EndpointRecords] = js.native
  def put(key: String, value: DiscoveredEndpoints): Unit = js.native
  def put(key: EndpointIdentifier, value: DiscoveredEndpoints): Unit = js.native
  def remove(key: String): Unit = js.native
  def remove(key: EndpointIdentifier): Unit = js.native
}

/* static members */
@JSImport("aws-sdk/vendor/endpoint-cache", "EndpointCache")
@js.native
object EndpointCache extends js.Object {
  def getKeyString(key: EndpointIdentifier): String = js.native
}

