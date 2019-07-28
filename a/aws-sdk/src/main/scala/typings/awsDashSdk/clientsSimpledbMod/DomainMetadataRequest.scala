package typings.awsDashSdk.clientsSimpledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainMetadataRequest extends js.Object {
  /**
    * The name of the domain for which to display the metadata of.
    */
  var DomainName: String
}

object DomainMetadataRequest {
  @scala.inline
  def apply(DomainName: String): DomainMetadataRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName)
  
    __obj.asInstanceOf[DomainMetadataRequest]
  }
}

