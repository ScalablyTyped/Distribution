package typings.atAngularCompiler.srcDirectiveUnderscoreNormalizerMod

import typings.atAngularCompiler.srcCoreMod.ViewEncapsulation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrenormalizedTemplateMetadata extends js.Object {
  var animations: js.Array[_]
  var componentType: js.Any
  var encapsulation: ViewEncapsulation | Null
  var interpolation: (js.Tuple2[String, String]) | Null
  var moduleUrl: String
  var ngModuleType: js.Any
  var preserveWhitespaces: Boolean | Null
  var styleUrls: js.Array[String]
  var styles: js.Array[String]
  var template: String | Null
  var templateUrl: String | Null
}

object PrenormalizedTemplateMetadata {
  @scala.inline
  def apply(
    animations: js.Array[_],
    componentType: js.Any,
    moduleUrl: String,
    ngModuleType: js.Any,
    styleUrls: js.Array[String],
    styles: js.Array[String],
    encapsulation: ViewEncapsulation = null,
    interpolation: js.Tuple2[String, String] = null,
    preserveWhitespaces: js.UndefOr[Boolean] = js.undefined,
    template: String = null,
    templateUrl: String = null
  ): PrenormalizedTemplateMetadata = {
    val __obj = js.Dynamic.literal(animations = animations, componentType = componentType, moduleUrl = moduleUrl, ngModuleType = ngModuleType, styleUrls = styleUrls, styles = styles)
    if (encapsulation != null) __obj.updateDynamic("encapsulation")(encapsulation)
    if (interpolation != null) __obj.updateDynamic("interpolation")(interpolation)
    if (!js.isUndefined(preserveWhitespaces)) __obj.updateDynamic("preserveWhitespaces")(preserveWhitespaces)
    if (template != null) __obj.updateDynamic("template")(template)
    if (templateUrl != null) __obj.updateDynamic("templateUrl")(templateUrl)
    __obj.asInstanceOf[PrenormalizedTemplateMetadata]
  }
}

