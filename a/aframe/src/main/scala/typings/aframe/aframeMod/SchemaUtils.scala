package typings.aframe.aframeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemaUtils extends js.Object {
  def isSingleProperty(schema: Schema[js.Object]): Boolean
  def process(schema: Schema[js.Object]): Boolean
}

object SchemaUtils {
  @scala.inline
  def apply(isSingleProperty: Schema[js.Object] => Boolean, process: Schema[js.Object] => Boolean): SchemaUtils = {
    val __obj = js.Dynamic.literal(isSingleProperty = js.Any.fromFunction1(isSingleProperty), process = js.Any.fromFunction1(process))
  
    __obj.asInstanceOf[SchemaUtils]
  }
}

