package typings
package atAngularCompilerLib.srcDirectiveUnderscoreNormalizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrenormalizedTemplateMetadata extends js.Object {
  var animations: js.Array[_]
  var componentType: js.Any
  var encapsulation: atAngularCompilerLib.srcCoreMod.ViewEncapsulation | scala.Null
  var interpolation: (js.Tuple2[java.lang.String, java.lang.String]) | scala.Null
  var moduleUrl: java.lang.String
  var ngModuleType: js.Any
  var preserveWhitespaces: scala.Boolean | scala.Null
  var styleUrls: js.Array[java.lang.String]
  var styles: js.Array[java.lang.String]
  var template: java.lang.String | scala.Null
  var templateUrl: java.lang.String | scala.Null
}

object PrenormalizedTemplateMetadata {
  @scala.inline
  def apply(
    animations: js.Array[_],
    componentType: js.Any,
    moduleUrl: java.lang.String,
    ngModuleType: js.Any,
    styleUrls: js.Array[java.lang.String],
    styles: js.Array[java.lang.String],
    encapsulation: atAngularCompilerLib.srcCoreMod.ViewEncapsulation = null,
    interpolation: js.Tuple2[java.lang.String, java.lang.String] = null,
    preserveWhitespaces: js.UndefOr[scala.Boolean] = js.undefined,
    template: java.lang.String = null,
    templateUrl: java.lang.String = null
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

