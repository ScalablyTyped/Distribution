package typings.angularCompiler.directiveNormalizerMod

import typings.angularCompiler.coreMod.ViewEncapsulation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrenormalizedTemplateMetadata extends js.Object {
  var animations: js.Array[_] = js.native
  var componentType: js.Any = js.native
  var encapsulation: ViewEncapsulation | Null = js.native
  var interpolation: (js.Tuple2[String, String]) | Null = js.native
  var moduleUrl: String = js.native
  var ngModuleType: js.Any = js.native
  var preserveWhitespaces: Boolean | Null = js.native
  var styleUrls: js.Array[String] = js.native
  var styles: js.Array[String] = js.native
  var template: String | Null = js.native
  var templateUrl: String | Null = js.native
}

object PrenormalizedTemplateMetadata {
  @scala.inline
  def apply(
    animations: js.Array[_],
    componentType: js.Any,
    moduleUrl: String,
    ngModuleType: js.Any,
    styleUrls: js.Array[String],
    styles: js.Array[String]
  ): PrenormalizedTemplateMetadata = {
    val __obj = js.Dynamic.literal(animations = animations.asInstanceOf[js.Any], componentType = componentType.asInstanceOf[js.Any], moduleUrl = moduleUrl.asInstanceOf[js.Any], ngModuleType = ngModuleType.asInstanceOf[js.Any], styleUrls = styleUrls.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrenormalizedTemplateMetadata]
  }
  @scala.inline
  implicit class PrenormalizedTemplateMetadataOps[Self <: PrenormalizedTemplateMetadata] (val x: Self) extends AnyVal {
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
    def setAnimationsVarargs(value: js.Any*): Self = this.set("animations", js.Array(value :_*))
    @scala.inline
    def setAnimations(value: js.Array[_]): Self = this.set("animations", value.asInstanceOf[js.Any])
    @scala.inline
    def setComponentType(value: js.Any): Self = this.set("componentType", value.asInstanceOf[js.Any])
    @scala.inline
    def setModuleUrl(value: String): Self = this.set("moduleUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setNgModuleType(value: js.Any): Self = this.set("ngModuleType", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyleUrlsVarargs(value: String*): Self = this.set("styleUrls", js.Array(value :_*))
    @scala.inline
    def setStyleUrls(value: js.Array[String]): Self = this.set("styleUrls", value.asInstanceOf[js.Any])
    @scala.inline
    def setStylesVarargs(value: String*): Self = this.set("styles", js.Array(value :_*))
    @scala.inline
    def setStyles(value: js.Array[String]): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def setEncapsulation(value: ViewEncapsulation): Self = this.set("encapsulation", value.asInstanceOf[js.Any])
    @scala.inline
    def setEncapsulationNull: Self = this.set("encapsulation", null)
    @scala.inline
    def setInterpolation(value: js.Tuple2[String, String]): Self = this.set("interpolation", value.asInstanceOf[js.Any])
    @scala.inline
    def setInterpolationNull: Self = this.set("interpolation", null)
    @scala.inline
    def setPreserveWhitespaces(value: Boolean): Self = this.set("preserveWhitespaces", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreserveWhitespacesNull: Self = this.set("preserveWhitespaces", null)
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def setTemplateNull: Self = this.set("template", null)
    @scala.inline
    def setTemplateUrl(value: String): Self = this.set("templateUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setTemplateUrlNull: Self = this.set("templateUrl", null)
  }
  
}

