package typings
package aframeLib.aframeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemaUtils extends js.Object {
  def isSingleProperty(schema: Schema[js.Object]): scala.Boolean
  def process(schema: Schema[js.Object]): scala.Boolean
}

object SchemaUtils {
  @scala.inline
  def apply(
    isSingleProperty: js.Function1[Schema[js.Object], scala.Boolean],
    process: js.Function1[Schema[js.Object], scala.Boolean]
  ): SchemaUtils = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isSingleProperty")(isSingleProperty)
    __obj.updateDynamic("process")(process)
    __obj.asInstanceOf[SchemaUtils]
  }
}

