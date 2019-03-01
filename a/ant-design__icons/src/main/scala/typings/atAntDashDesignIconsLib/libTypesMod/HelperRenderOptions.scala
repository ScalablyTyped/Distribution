package typings
package atAntDashDesignIconsLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HelperRenderOptions extends js.Object {
  var extraSVGAttrs: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var placeholders: js.UndefOr[atAntDashDesignIconsLib.Anon_PrimaryColor] = js.undefined
}

object HelperRenderOptions {
  @scala.inline
  def apply(
    extraSVGAttrs: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    placeholders: atAntDashDesignIconsLib.Anon_PrimaryColor = null
  ): HelperRenderOptions = {
    val __obj = js.Dynamic.literal()
    if (extraSVGAttrs != null) __obj.updateDynamic("extraSVGAttrs")(extraSVGAttrs)
    if (placeholders != null) __obj.updateDynamic("placeholders")(placeholders)
    __obj.asInstanceOf[HelperRenderOptions]
  }
}

