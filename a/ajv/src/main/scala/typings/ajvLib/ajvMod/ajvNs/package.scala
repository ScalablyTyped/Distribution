package typings
package ajvLib.ajvMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ajvNs {
  type ErrorParameters = RefParams | LimitParams | AdditionalPropertiesParams | DependenciesParams | FormatParams | ComparisonParams | MultipleOfParams | PatternParams | RequiredParams | TypeParams | UniqueItemsParams | CustomParams | PatternRequiredParams | PropertyNamesParams | IfParams | SwitchParams | NoParams | EnumParams
  type FormatDefinition = NumberFormatDefinition | StringFormatDefinition
  type FormatValidator = java.lang.String | stdLib.RegExp | (js.Function1[/* data */ java.lang.String, scala.Boolean | stdLib.PromiseLike[js.Any]])
  type NumberFormatValidator = js.Function1[/* data */ scala.Double, scala.Boolean | stdLib.PromiseLike[js.Any]]
}
