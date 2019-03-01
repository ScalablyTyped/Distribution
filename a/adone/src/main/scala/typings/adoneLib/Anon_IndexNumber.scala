package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IndexNumber extends js.Object {
  /**
    * The index in the buffer where we wish to start serializing into
    */
  var index: js.UndefOr[scala.Double] = js.undefined
}

object Anon_IndexNumber {
  @scala.inline
  def apply(index: scala.Int | scala.Double = null): Anon_IndexNumber = {
    val __obj = js.Dynamic.literal()
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IndexNumber]
  }
}

