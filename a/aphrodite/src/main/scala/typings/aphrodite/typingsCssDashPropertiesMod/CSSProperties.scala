package typings.aphrodite.typingsCssDashPropertiesMod

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
    js.Dynamic.global.Object.assign(__obj, CSSPropertiesComplete)
    js.Dynamic.global.Object.assign(__obj, CSSPropertiesLossy)
    js.Dynamic.global.Object.assign(__obj, CSSPropertiesPseudo)
    __obj.asInstanceOf[CSSProperties]
  }
}

