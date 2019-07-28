package typings.atAngularCompiler.srcCoreMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Directive extends js.Object {
  var exportAs: js.UndefOr[String] = js.undefined
  var guards: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var host: js.UndefOr[StringDictionary[String]] = js.undefined
  var inputs: js.UndefOr[js.Array[String]] = js.undefined
  var outputs: js.UndefOr[js.Array[String]] = js.undefined
  var providers: js.UndefOr[js.Array[Provider]] = js.undefined
  var queries: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var selector: js.UndefOr[String] = js.undefined
}

object Directive {
  @scala.inline
  def apply(
    exportAs: String = null,
    guards: StringDictionary[js.Any] = null,
    host: StringDictionary[String] = null,
    inputs: js.Array[String] = null,
    outputs: js.Array[String] = null,
    providers: js.Array[Provider] = null,
    queries: StringDictionary[js.Any] = null,
    selector: String = null
  ): Directive = {
    val __obj = js.Dynamic.literal()
    if (exportAs != null) __obj.updateDynamic("exportAs")(exportAs)
    if (guards != null) __obj.updateDynamic("guards")(guards)
    if (host != null) __obj.updateDynamic("host")(host)
    if (inputs != null) __obj.updateDynamic("inputs")(inputs)
    if (outputs != null) __obj.updateDynamic("outputs")(outputs)
    if (providers != null) __obj.updateDynamic("providers")(providers)
    if (queries != null) __obj.updateDynamic("queries")(queries)
    if (selector != null) __obj.updateDynamic("selector")(selector)
    __obj.asInstanceOf[Directive]
  }
}

