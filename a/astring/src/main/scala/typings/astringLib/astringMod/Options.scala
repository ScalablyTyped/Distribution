package typings
package astringLib.astringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** generate comments if true (defaults to false) */
  var comments: js.UndefOr[scala.Boolean] = js.undefined
  /** custom code generator (defaults to astring.baseGenerator) */
  var generator: js.UndefOr[js.Object] = js.undefined
  /** string to use for indentation (defaults to "  ") */
  var indent: js.UndefOr[java.lang.String] = js.undefined
  /** string to use for line endings (defaults to "\n") */
  var lineEnd: js.UndefOr[java.lang.String] = js.undefined
  /** source map generator (defaults to null), see https://github.com/mozilla/source-map#sourcemapgenerator */
  var sourceMap: js.UndefOr[js.Any] = js.undefined
  /** indent level to start from (defaults to 0) */
  var startingIndentLevel: js.UndefOr[scala.Double] = js.undefined
}

