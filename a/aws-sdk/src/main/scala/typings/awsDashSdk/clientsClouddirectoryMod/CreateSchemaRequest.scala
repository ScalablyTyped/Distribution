package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSchemaRequest extends js.Object {
  /**
    * The name that is associated with the schema. This is unique to each account and in each region.
    */
  var Name: SchemaName
}

object CreateSchemaRequest {
  @scala.inline
  def apply(Name: SchemaName): CreateSchemaRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
  
    __obj.asInstanceOf[CreateSchemaRequest]
  }
}

