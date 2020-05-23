package typings.asmcryptoJs.anon

import org.scalablytyped.runtime.StringDictionary
import typings.asmcryptoJs.asmcryptoJsNumbers.`1`
import typings.asmcryptoJs.asmcryptoJsNumbers.`3`
import typings.asmcryptoJs.asmcryptoJsNumbers.`5`
import typings.asmcryptoJs.asmcryptoJsNumbers.`6`
import typings.asmcryptoJs.asmcryptoJsNumbers.`7`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CBC extends /* key */ StringDictionary[Double] {
  var CBC: `3`
  var CFB: `5`
  var CTR: `7`
  var ECB: `1`
  var OFB: `6`
}

object CBC {
  @scala.inline
  def apply(
    CBC: `3`,
    CFB: `5`,
    CTR: `7`,
    ECB: `1`,
    OFB: `6`,
    StringDictionary: /* index */ StringDictionary[Double] = null
  ): CBC = {
    val __obj = js.Dynamic.literal(CBC = CBC.asInstanceOf[js.Any], CFB = CFB.asInstanceOf[js.Any], CTR = CTR.asInstanceOf[js.Any], ECB = ECB.asInstanceOf[js.Any], OFB = OFB.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[CBC]
  }
}

