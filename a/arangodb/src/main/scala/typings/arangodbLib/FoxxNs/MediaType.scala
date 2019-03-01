package typings
package arangodbLib.FoxxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaType extends js.Object {
  var parameters: arangodbLib.Anon_Charset
  var subtype: java.lang.String
  var suffix: js.UndefOr[java.lang.String] = js.undefined
  var `type`: java.lang.String
}

object MediaType {
  @scala.inline
  def apply(
    parameters: arangodbLib.Anon_Charset,
    subtype: java.lang.String,
    `type`: java.lang.String,
    suffix: java.lang.String = null
  ): MediaType = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("parameters")(parameters)
    __obj.updateDynamic("subtype")(subtype)
    if (suffix != null) __obj.updateDynamic("suffix")(suffix)
    __obj.asInstanceOf[MediaType]
  }
}

