package typings.aphrodite.cssPropertiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CSSProperties
  extends CSSPropertiesLossy
     with CSSPropertiesComplete
     with CSSPropertiesPseudo

object CSSProperties {
  @scala.inline
  def apply(
    CSSPropertiesComplete: CSSPropertiesComplete = null,
    CSSPropertiesLossy: CSSPropertiesLossy = null,
    CSSPropertiesPseudo: CSSPropertiesPseudo = null
  ): CSSProperties = {
    val __obj = js.Dynamic.literal()
    if (CSSPropertiesComplete != null) js.Dynamic.global.Object.assign(__obj, CSSPropertiesComplete)
    if (CSSPropertiesLossy != null) js.Dynamic.global.Object.assign(__obj, CSSPropertiesLossy)
    if (CSSPropertiesPseudo != null) js.Dynamic.global.Object.assign(__obj, CSSPropertiesPseudo)
    __obj.asInstanceOf[CSSProperties]
  }
}

