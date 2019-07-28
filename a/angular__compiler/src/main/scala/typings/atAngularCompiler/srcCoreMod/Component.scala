package typings.atAngularCompiler.srcCoreMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Component extends Directive {
  var animations: js.UndefOr[js.Array[_]] = js.undefined
  var changeDetection: js.UndefOr[ChangeDetectionStrategy] = js.undefined
  var encapsulation: js.UndefOr[ViewEncapsulation] = js.undefined
  var entryComponents: js.UndefOr[js.Array[Type | js.Array[_]]] = js.undefined
  var interpolation: js.UndefOr[js.Tuple2[String, String]] = js.undefined
  var moduleId: js.UndefOr[String] = js.undefined
  var preserveWhitespaces: js.UndefOr[Boolean] = js.undefined
  var styleUrls: js.UndefOr[js.Array[String]] = js.undefined
  var styles: js.UndefOr[js.Array[String]] = js.undefined
  var template: js.UndefOr[String] = js.undefined
  var templateUrl: js.UndefOr[String] = js.undefined
  var viewProviders: js.UndefOr[js.Array[Provider]] = js.undefined
}

object Component {
  @scala.inline
  def apply(
    animations: js.Array[_] = null,
    changeDetection: ChangeDetectionStrategy = null,
    encapsulation: ViewEncapsulation = null,
    entryComponents: js.Array[Type | js.Array[_]] = null,
    exportAs: String = null,
    guards: StringDictionary[js.Any] = null,
    host: StringDictionary[String] = null,
    inputs: js.Array[String] = null,
    interpolation: js.Tuple2[String, String] = null,
    moduleId: String = null,
    outputs: js.Array[String] = null,
    preserveWhitespaces: js.UndefOr[Boolean] = js.undefined,
    providers: js.Array[Provider] = null,
    queries: StringDictionary[js.Any] = null,
    selector: String = null,
    styleUrls: js.Array[String] = null,
    styles: js.Array[String] = null,
    template: String = null,
    templateUrl: String = null,
    viewProviders: js.Array[Provider] = null
  ): Component = {
    val __obj = js.Dynamic.literal()
    if (animations != null) __obj.updateDynamic("animations")(animations)
    if (changeDetection != null) __obj.updateDynamic("changeDetection")(changeDetection)
    if (encapsulation != null) __obj.updateDynamic("encapsulation")(encapsulation)
    if (entryComponents != null) __obj.updateDynamic("entryComponents")(entryComponents)
    if (exportAs != null) __obj.updateDynamic("exportAs")(exportAs)
    if (guards != null) __obj.updateDynamic("guards")(guards)
    if (host != null) __obj.updateDynamic("host")(host)
    if (inputs != null) __obj.updateDynamic("inputs")(inputs)
    if (interpolation != null) __obj.updateDynamic("interpolation")(interpolation)
    if (moduleId != null) __obj.updateDynamic("moduleId")(moduleId)
    if (outputs != null) __obj.updateDynamic("outputs")(outputs)
    if (!js.isUndefined(preserveWhitespaces)) __obj.updateDynamic("preserveWhitespaces")(preserveWhitespaces)
    if (providers != null) __obj.updateDynamic("providers")(providers)
    if (queries != null) __obj.updateDynamic("queries")(queries)
    if (selector != null) __obj.updateDynamic("selector")(selector)
    if (styleUrls != null) __obj.updateDynamic("styleUrls")(styleUrls)
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (template != null) __obj.updateDynamic("template")(template)
    if (templateUrl != null) __obj.updateDynamic("templateUrl")(templateUrl)
    if (viewProviders != null) __obj.updateDynamic("viewProviders")(viewProviders)
    __obj.asInstanceOf[Component]
  }
}

