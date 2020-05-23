package typings.asmcryptoJs.anon

import org.scalablytyped.runtime.StringDictionary
import typings.asmcryptoJs.asmcryptoJsNumbers.`0`
import typings.asmcryptoJs.asmcryptoJsNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GCM extends /* key */ StringDictionary[Double] {
  var CBC: `0`
  var GCM: `1`
}

object GCM {
  @scala.inline
  def apply(CBC: `0`, GCM: `1`, StringDictionary: /* index */ StringDictionary[Double] = null): GCM = {
    val __obj = js.Dynamic.literal(CBC = CBC.asInstanceOf[js.Any], GCM = GCM.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[GCM]
  }
}

