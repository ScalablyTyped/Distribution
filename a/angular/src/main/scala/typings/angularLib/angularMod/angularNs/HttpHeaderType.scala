package typings
package angularLib.angularMod.angularNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpHeaderType
  extends /* requestType */ org.scalablytyped.runtime.StringDictionary[java.lang.String | (js.Function1[/* config */ IRequestConfig, java.lang.String])]

object HttpHeaderType {
  @scala.inline
  def apply(
    StringDictionary: /* requestType */ org.scalablytyped.runtime.StringDictionary[java.lang.String | (js.Function1[/* config */ IRequestConfig, java.lang.String])] = null
  ): HttpHeaderType = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[HttpHeaderType]
  }
}

