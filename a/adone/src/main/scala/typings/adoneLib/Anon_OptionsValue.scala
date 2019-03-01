package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OptionsValue extends js.Object {
  var options: adoneLib.adoneNs.netNs.httpNs.clientNs.INs.FormValueOptions
  var value: java.lang.String | nodeLib.Buffer | nodeLib.streamMod.Readable
}

object Anon_OptionsValue {
  @scala.inline
  def apply(
    options: adoneLib.adoneNs.netNs.httpNs.clientNs.INs.FormValueOptions,
    value: java.lang.String | nodeLib.Buffer | nodeLib.streamMod.Readable
  ): Anon_OptionsValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("options")(options)
    __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_OptionsValue]
  }
}

