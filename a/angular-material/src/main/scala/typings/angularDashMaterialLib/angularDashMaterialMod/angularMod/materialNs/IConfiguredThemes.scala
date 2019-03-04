package typings
package angularDashMaterialLib.angularDashMaterialMod.angularMod.materialNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConfiguredThemes
  extends IThemes
     with /* name */ org.scalablytyped.runtime.StringDictionary[ITheme]

object IConfiguredThemes {
  @scala.inline
  def apply(
    default: ITheme,
    StringDictionary: /* name */ org.scalablytyped.runtime.StringDictionary[ITheme] = null
  ): IConfiguredThemes = {
    val __obj = js.Dynamic.literal(default = default)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[IConfiguredThemes]
  }
}

