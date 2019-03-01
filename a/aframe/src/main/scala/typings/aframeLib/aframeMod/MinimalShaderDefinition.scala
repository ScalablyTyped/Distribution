package typings
package aframeLib.aframeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MinimalShaderDefinition extends js.Object {
  var schema: Schema[
    /* import warning: ImportType.apply Failed type conversion: this['data'] */ js.Any
  ]
}

object MinimalShaderDefinition {
  @scala.inline
  def apply(
    schema: Schema[
      /* import warning: ImportType.apply Failed type conversion: this['data'] */ js.Any
    ]
  ): MinimalShaderDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinimalShaderDefinition]
  }
}

