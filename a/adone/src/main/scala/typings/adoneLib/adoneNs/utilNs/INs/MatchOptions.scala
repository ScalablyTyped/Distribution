package typings
package adoneLib.adoneNs.utilNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MatchOptions extends js.Object {
  /**
                   * Allow glob patterns without slashes to match a file path based on its basename. Same behavior as [minimatch](https://github.com/isaacs/minimatch) option `matchBase`.
                   *
                   * @default false
                   */
  var basename: js.UndefOr[scala.Boolean] = js.undefined
  /**
                   * Enabled by default, this option enforces bash-like behavior with stars immediately following a bracket expression.
                   * Bash bracket expressions are similar to regex character classes, but unlike regex, a star following a bracket expression **does not repeat the bracketed characters**.
                   * Instead, the star is treated the same as an other star.
                   *
                   * @default true
                   */
  var bash: js.UndefOr[scala.Boolean] = js.undefined
  /**
                   * Disable regex and function memoization.
                   *
                   * @default undefined
                   */
  var cache: js.UndefOr[scala.Boolean] = js.undefined
  /**
                   * Match dotfiles. Same behavior as [minimatch](https://github.com/isaacs/minimatch) option `dot`.
                   *
                   * @default false
                   */
  var dot: js.UndefOr[scala.Boolean] = js.undefined
  /**
                   * Similar to the `--failglob` behavior in Bash, throws an error when no matches are found.
                   *
                   * @default undefined
                   */
  var failglob: js.UndefOr[scala.Boolean] = js.undefined
  /**
                   * String or array of glob patterns to match files to ignore.
                   *
                   * @default undefined
                   */
  var ignore: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /**
                   * Alias for [options.basename](#options-basename).
                   */
  var matchBase: js.UndefOr[scala.Boolean] = js.undefined
  /**
                   * Disable expansion of brace patterns. Same behavior as [minimatch](https://github.com/isaacs/minimatch) option `nobrace`.
                   *
                   * @default undefined
                   */
  var nobrace: js.UndefOr[scala.Boolean] = js.undefined
  /**
                   * Use a case-insensitive regex for matching files. Same behavior as [minimatch](https://github.com/isaacs/minimatch).
                   *
                   * @default undefined
                   */
  var nocase: js.UndefOr[scala.Boolean] = js.undefined
  /**
                   * Remove duplicate elements from the result array.
                   *
                   * @default undefined
                   */
  var nodupes: js.UndefOr[scala.Boolean] = js.undefined
  /**
                   * Disable extglob support, so that extglobs are regarded as literal characters.
                   *
                   * @default undefined
                   */
  var noext: js.UndefOr[scala.Boolean] = js.undefined
  /**
                   * Disable matching with globstars (`**`).
                   *
                   * @default undefined
                   */
  var noglobstar: js.UndefOr[scala.Boolean] = js.undefined
  /**
                   * Disallow negation (`!`) patterns, and treat leading `!` as a literal character to match.
                   *
                   * @default undefined
                   */
  var nonegate: js.UndefOr[scala.Boolean] = js.undefined
  /**
                   * Alias for [options.nullglob](#options-nullglob).
                   */
  var nonull: js.UndefOr[scala.Boolean] = js.undefined
  /**
                   * If `true`, when no matches are found the actual (arrayified) glob pattern is returned instead of an empty array.
                   * Same behavior as [minimatch](https://github.com/isaacs/minimatch) option `nonull`.
                   *
                   * @default undefined
                   */
  var nullglob: js.UndefOr[scala.Boolean] = js.undefined
  /**
                   * Pass your own instance of [snapdragon](https://github.com/jonschlinkert/snapdragon), to customize parsers or compilers.
                   *
                   * @default undefined
                   */
  var snapdragon: js.UndefOr[js.Object] = js.undefined
  /**
                   * Generate a source map by enabling the `sourcemap` option with the `.parse`, `.compile`, or `.create` methods.
                   *
                   * _(Note that sourcemaps are currently not enabled for brace patterns)_
                   */
  var sourcemap: js.UndefOr[scala.Boolean] = js.undefined
  /**
                   * Remove backslashes from returned matches.
                   *
                   * @default undefined
                   */
  var unescape: js.UndefOr[scala.Boolean] = js.undefined
  /**
                   * Convert path separators on returned files to posix/unix-style forward slashes.
                   *
                   * @default true
                   */
  var unixify: js.UndefOr[scala.Boolean] = js.undefined
}

