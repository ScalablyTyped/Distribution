package typings
package antdLib.libEmptyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferLocale extends js.Object {
  var description: java.lang.String
}

object TransferLocale {
  @scala.inline
  def apply(description: java.lang.String): TransferLocale = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[TransferLocale]
  }
}

