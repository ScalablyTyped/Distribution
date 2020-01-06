package typings.awsDashSdk.clientsSchemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteSchemaVersionRequest extends js.Object {
  var RegistryName: __string = js.native
  var SchemaName: __string = js.native
  var SchemaVersion: __string = js.native
}

object DeleteSchemaVersionRequest {
  @scala.inline
  def apply(RegistryName: __string, SchemaName: __string, SchemaVersion: __string): DeleteSchemaVersionRequest = {
    val __obj = js.Dynamic.literal(RegistryName = RegistryName.asInstanceOf[js.Any], SchemaName = SchemaName.asInstanceOf[js.Any], SchemaVersion = SchemaVersion.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteSchemaVersionRequest]
  }
}

