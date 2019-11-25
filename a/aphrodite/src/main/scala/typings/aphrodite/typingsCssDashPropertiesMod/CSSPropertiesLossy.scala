package typings.aphrodite.typingsCssDashPropertiesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CSSPropertiesLossy
  extends /* propertyName */ StringDictionary[
      js.UndefOr[
        String | Double | CSSPropertiesComplete | (js.Array[
          js.UndefOr[
            /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 259 */ js.Any
          ]
        ]) | CSSPropertiesLossy
      ]
    ]

object CSSPropertiesLossy {
  @scala.inline
  def apply(
    StringDictionary: /* propertyName */ StringDictionary[
      js.UndefOr[
        String | Double | CSSPropertiesComplete | (js.Array[
          js.UndefOr[
            /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 259 */ js.Any
          ]
        ]) | CSSPropertiesLossy
      ]
    ] = null
  ): CSSPropertiesLossy = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[CSSPropertiesLossy]
  }
}

