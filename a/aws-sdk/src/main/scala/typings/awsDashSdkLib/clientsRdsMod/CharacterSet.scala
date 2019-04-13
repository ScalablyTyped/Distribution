package typings
package awsDashSdkLib.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CharacterSet extends js.Object {
  /**
    * The description of the character set.
    */
  var CharacterSetDescription: js.UndefOr[String] = js.undefined
  /**
    * The name of the character set.
    */
  var CharacterSetName: js.UndefOr[String] = js.undefined
}

object CharacterSet {
  @scala.inline
  def apply(CharacterSetDescription: String = null, CharacterSetName: String = null): CharacterSet = {
    val __obj = js.Dynamic.literal()
    if (CharacterSetDescription != null) __obj.updateDynamic("CharacterSetDescription")(CharacterSetDescription)
    if (CharacterSetName != null) __obj.updateDynamic("CharacterSetName")(CharacterSetName)
    __obj.asInstanceOf[CharacterSet]
  }
}

