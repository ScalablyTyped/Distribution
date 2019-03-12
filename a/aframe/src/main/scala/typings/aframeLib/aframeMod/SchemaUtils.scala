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
  def apply(isSingleProperty: Schema[js.Object] => scala.Boolean, process: Schema[js.Object] => scala.Boolean): SchemaUtils = {
    val __obj = js.Dynamic.literal(isSingleProperty = js.Any.fromFunction1(isSingleProperty), process = js.Any.fromFunction1(process))
  
    __obj.asInstanceOf[SchemaUtils]
  }
}

