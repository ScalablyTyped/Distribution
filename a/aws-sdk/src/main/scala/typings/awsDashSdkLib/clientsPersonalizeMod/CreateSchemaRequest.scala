package typings
package awsDashSdkLib.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSchemaRequest extends js.Object {
  /**
    * The name for the schema.
    */
  var name: Name
  /**
    * A schema in Avro JSON format.
    */
  var schema: AvroSchema
}

object CreateSchemaRequest {
  @scala.inline
  def apply(name: Name, schema: AvroSchema): CreateSchemaRequest = {
    val __obj = js.Dynamic.literal(name = name, schema = schema)
  
    __obj.asInstanceOf[CreateSchemaRequest]
  }
}

