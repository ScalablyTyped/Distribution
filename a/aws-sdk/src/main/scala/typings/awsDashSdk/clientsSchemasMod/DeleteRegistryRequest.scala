package typings.awsDashSdk.clientsSchemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteRegistryRequest extends js.Object {
  var RegistryName: __string = js.native
}

object DeleteRegistryRequest {
  @scala.inline
  def apply(RegistryName: __string): DeleteRegistryRequest = {
    val __obj = js.Dynamic.literal(RegistryName = RegistryName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteRegistryRequest]
  }
}

