package typings.aframe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemaUtils extends js.Object {
  def isSingleProperty(schema: Schema_[js.Object]): Boolean
  def process(schema: Schema_[js.Object]): Boolean
}

object SchemaUtils {
  @scala.inline
  def apply(isSingleProperty: Schema_[js.Object] => Boolean, process: Schema_[js.Object] => Boolean): SchemaUtils = {
    val __obj = js.Dynamic.literal(isSingleProperty = js.Any.fromFunction1(isSingleProperty), process = js.Any.fromFunction1(process))
    __obj.asInstanceOf[SchemaUtils]
  }
}

