package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Options extends js.Object {
  var options: adoneLib.adoneNs.netNs.httpNs.clientNs.INs.FormValueOptions
  var value: java.lang.String | nodeLib.Buffer | nodeLib.streamMod.Readable
}

object Anon_Options {
  @scala.inline
  def apply(
    options: adoneLib.adoneNs.netNs.httpNs.clientNs.INs.FormValueOptions,
    value: java.lang.String | nodeLib.Buffer | nodeLib.streamMod.Readable
  ): Anon_Options = {
    val __obj = js.Dynamic.literal(options = options, value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Options]
  }
}

