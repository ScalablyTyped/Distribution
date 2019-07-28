package typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Endpoint extends js.Object {
  /**
    * IP address of the endpoint.
    */
  var Address: String
  /**
    * Endpoint cache time to live (TTL) value.
    */
  var CachePeriodInMinutes: Long
}

object Endpoint {
  @scala.inline
  def apply(Address: String, CachePeriodInMinutes: Long): Endpoint = {
    val __obj = js.Dynamic.literal(Address = Address, CachePeriodInMinutes = CachePeriodInMinutes)
  
    __obj.asInstanceOf[Endpoint]
  }
}

