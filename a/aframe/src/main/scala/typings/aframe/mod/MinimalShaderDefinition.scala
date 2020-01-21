package typings.aframe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MinimalShaderDefinition extends js.Object {
  var schema: Schema_[
    /* import warning: importer.ImportType#apply Failed type conversion: this['data'] */ js.Any
  ]
}

object MinimalShaderDefinition {
  @scala.inline
  def apply(
    schema: Schema_[
      /* import warning: importer.ImportType#apply Failed type conversion: this['data'] */ js.Any
    ]
  ): MinimalShaderDefinition = {
    val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MinimalShaderDefinition]
  }
}

