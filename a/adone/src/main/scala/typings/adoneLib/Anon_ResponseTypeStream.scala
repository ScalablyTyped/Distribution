package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ResponseTypeStream extends js.Object {
  var responseType: adoneLib.adoneLibStrings.stream
}

object Anon_ResponseTypeStream {
  @scala.inline
  def apply(responseType: adoneLib.adoneLibStrings.stream): Anon_ResponseTypeStream = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("responseType")(responseType)
    __obj.asInstanceOf[Anon_ResponseTypeStream]
  }
}

