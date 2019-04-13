package typings
package appdmgLib.appdmgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpecificationCodeSign extends js.Object {
  var identifier: js.UndefOr[java.lang.String] = js.undefined
  var `signing-identity`: java.lang.String
}

object SpecificationCodeSign {
  @scala.inline
  def apply(`signing-identity`: java.lang.String, identifier: java.lang.String = null): SpecificationCodeSign = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("signing-identity")(`signing-identity`)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    __obj.asInstanceOf[SpecificationCodeSign]
  }
}

