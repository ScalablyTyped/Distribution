package typings
package adoneLib.adoneNs.utilNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BracesOptions extends js.Object {
  /**
                   * Generate an "expanded" brace pattern (this option is unncessary with the `.expand` method, which does the same thing).
                   *
                   * @default undefined
                   */
  var expand: js.UndefOr[scala.Boolean] = js.undefined
  /**
                   * Duplicates are removed by default. To keep duplicates, pass `{nodupes: false}` on the options
                   *
                   * @default true
                   */
  var nodupes: js.UndefOr[scala.Boolean] = js.undefined
  /**
                   * Enabled by default.
                   *
                   * @default true
                   */
  var optimize: js.UndefOr[scala.Boolean] = js.undefined
  /**
                   * In regular expressions, quanitifiers can be used to specify how many times a token can be repeated. For example, `a{1,3}` will match the letter `a` one to three times.
                   *
                   * Unfortunately, regex quantifiers happen to share the same syntax as [Bash lists](#lists)
                   *
                   * The `quantifiers` option tells braces to detect when [regex quantifiers](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/RegExp#quantifiers)
                   * are defined in the given pattern, and not to try to expand them as lists.
                   *
                   * @default undefined
                   */
  var quantifiers: js.UndefOr[scala.Boolean] = js.undefined
  /**
                   * When `braces.expand()` is used, or `options.expand` is true, brace patterns will automatically be [optimized](#optionsoptimize)
                   * when the difference between the range minimum and range maximum exceeds the `rangeLimit`.
                   * This is to prevent huge ranges from freezing your application.
                   *
                   * You can set this to any number, or change `options.rangeLimit` to `Inifinity` to disable this altogether.
                   *
                   * @default 250
                   */
  var rangeLimit: js.UndefOr[scala.Double] = js.undefined
  /**
                   * Customize range expansion.
                   *
                   * @default undefined
                   */
  var transform: js.UndefOr[js.Function1[/* str */ java.lang.String, java.lang.String]] = js.undefined
  /**
                   * Strip backslashes that were used for escaping from the result.
                   *
                   * @default undefined
                   */
  var unescape: js.UndefOr[scala.Boolean] = js.undefined
}

