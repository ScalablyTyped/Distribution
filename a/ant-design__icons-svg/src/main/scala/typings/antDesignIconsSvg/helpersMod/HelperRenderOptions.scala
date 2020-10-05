package typings.antDesignIconsSvg.helpersMod

import org.scalablytyped.runtime.StringDictionary
import typings.antDesignIconsSvg.anon.PrimaryColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HelperRenderOptions extends js.Object {
  var extraSVGAttrs: js.UndefOr[StringDictionary[String]] = js.native
  var placeholders: js.UndefOr[PrimaryColor] = js.native
}

object HelperRenderOptions {
  @scala.inline
  def apply(): HelperRenderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HelperRenderOptions]
  }
  @scala.inline
  implicit class HelperRenderOptionsOps[Self <: HelperRenderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExtraSVGAttrs(value: StringDictionary[String]): Self = this.set("extraSVGAttrs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtraSVGAttrs: Self = this.set("extraSVGAttrs", js.undefined)
    @scala.inline
    def setPlaceholders(value: PrimaryColor): Self = this.set("placeholders", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholders: Self = this.set("placeholders", js.undefined)
  }
  
}

