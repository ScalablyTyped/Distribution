package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CharacterSet extends js.Object {
  /**
    * The description of the character set.
    */
  var CharacterSetDescription: js.UndefOr[String] = js.native
  /**
    * The name of the character set.
    */
  var CharacterSetName: js.UndefOr[String] = js.native
}

object CharacterSet {
  @scala.inline
  def apply(CharacterSetDescription: String = null, CharacterSetName: String = null): CharacterSet = {
    val __obj = js.Dynamic.literal()
    if (CharacterSetDescription != null) __obj.updateDynamic("CharacterSetDescription")(CharacterSetDescription.asInstanceOf[js.Any])
    if (CharacterSetName != null) __obj.updateDynamic("CharacterSetName")(CharacterSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CharacterSet]
  }
}

