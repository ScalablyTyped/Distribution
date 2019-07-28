package typings.atAngularCore.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyValueDifferFactory extends js.Object {
  /**
    * Create a `KeyValueDiffer`.
    */
  def create[K, V](): KeyValueDiffer[K, V]
  /**
    * Test to see if the differ knows how to diff this kind of object.
    */
  def supports(objects: js.Any): Boolean
}

object KeyValueDifferFactory {
  @scala.inline
  def apply(create: () => KeyValueDiffer[js.Any, js.Any], supports: js.Any => Boolean): KeyValueDifferFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction0(create), supports = js.Any.fromFunction1(supports))
  
    __obj.asInstanceOf[KeyValueDifferFactory]
  }
}

