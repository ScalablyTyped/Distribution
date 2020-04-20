package typings.angularCore.r3SymbolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A schema definition associated with an NgModule.
  *
  * @see `@NgModule`, `CUSTOM_ELEMENTS_SCHEMA`, `NO_ERRORS_SCHEMA`
  *
  * @param name The name of a defined schema.
  *
  * @publicApi
  */
trait SchemaMetadata extends js.Object {
  var name: String
}

object SchemaMetadata {
  @scala.inline
  def apply(name: String): SchemaMetadata = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMetadata]
  }
}

