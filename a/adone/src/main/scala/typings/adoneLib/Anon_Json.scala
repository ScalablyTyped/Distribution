package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Json extends js.Object {
  var responseType: adoneLib.adoneLibStrings.json
}

object Anon_Json {
  @scala.inline
  def apply(responseType: adoneLib.adoneLibStrings.json): Anon_Json = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("responseType")(responseType)
    __obj.asInstanceOf[Anon_Json]
  }
}

