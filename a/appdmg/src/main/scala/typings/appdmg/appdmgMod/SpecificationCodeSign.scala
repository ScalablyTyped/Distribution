package typings.appdmg.appdmgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpecificationCodeSign extends js.Object {
  var identifier: js.UndefOr[String] = js.undefined
  var `signing-identity`: String
}

object SpecificationCodeSign {
  @scala.inline
  def apply(`signing-identity`: String, identifier: String = null): SpecificationCodeSign = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("signing-identity")(`signing-identity`.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpecificationCodeSign]
  }
}

