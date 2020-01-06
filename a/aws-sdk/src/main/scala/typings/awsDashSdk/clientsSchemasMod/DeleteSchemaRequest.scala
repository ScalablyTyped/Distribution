package typings.awsDashSdk.clientsSchemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteSchemaRequest extends js.Object {
  var RegistryName: __string = js.native
  var SchemaName: __string = js.native
}

object DeleteSchemaRequest {
  @scala.inline
  def apply(RegistryName: __string, SchemaName: __string): DeleteSchemaRequest = {
    val __obj = js.Dynamic.literal(RegistryName = RegistryName.asInstanceOf[js.Any], SchemaName = SchemaName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteSchemaRequest]
  }
}

