package typings.angularCompiler.directiveNormalizerMod

import typings.angularCompiler.coreMod.ViewEncapsulation
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
    preserveWhitespaces: Boolean = null.asInstanceOf[Boolean],
    template: String = null,
    templateUrl: String = null
  ): PrenormalizedTemplateMetadata = {
    val __obj = js.Dynamic.literal(animations = animations.asInstanceOf[js.Any], componentType = componentType.asInstanceOf[js.Any], moduleUrl = moduleUrl.asInstanceOf[js.Any], ngModuleType = ngModuleType.asInstanceOf[js.Any], styleUrls = styleUrls.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], encapsulation = encapsulation.asInstanceOf[js.Any], interpolation = interpolation.asInstanceOf[js.Any], preserveWhitespaces = preserveWhitespaces.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], templateUrl = templateUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrenormalizedTemplateMetadata]
  }
}

