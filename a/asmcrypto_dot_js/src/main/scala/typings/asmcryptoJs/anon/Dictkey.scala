package typings.asmcryptoJs.anon

import org.scalablytyped.runtime.StringDictionary
import typings.asmcryptoJs.asmcryptoJsNumbers.`0`
import typings.asmcryptoJs.asmcryptoJsNumbers.`2`
import typings.asmcryptoJs.asmcryptoJsNumbers.`4`
import typings.asmcryptoJs.asmcryptoJsNumbers.`6`
import typings.asmcryptoJs.asmcryptoJsNumbers.`7`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dictkey extends /* key */ StringDictionary[Double] {
  var CBC: `2`
  var CFB: `4`
  var CTR: `7`
  var ECB: `0`
  var OFB: `6`
}

object Dictkey {
  @scala.inline
  def apply(
    CBC: `2`,
    CFB: `4`,
    CTR: `7`,
    ECB: `0`,
    OFB: `6`,
    StringDictionary: /* index */ StringDictionary[Double] = null
  ): Dictkey = {
    val __obj = js.Dynamic.literal(CBC = CBC.asInstanceOf[js.Any], CFB = CFB.asInstanceOf[js.Any], CTR = CTR.asInstanceOf[js.Any], ECB = ECB.asInstanceOf[js.Any], OFB = OFB.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Dictkey]
  }
}

