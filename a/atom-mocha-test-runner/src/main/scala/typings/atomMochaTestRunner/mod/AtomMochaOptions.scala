package typings.atomMochaTestRunner.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AtomMochaOptions extends js.Object {
  /** Whether or not to colorize output on the terminal. */
  var colors: js.UndefOr[Boolean] = js.undefined
  /** Whether or not to assign the created Atom environment to `global.atom`. */
  var globalAtom: js.UndefOr[Boolean] = js.undefined
  /** The string to use for the window title in the HTML reporter. */
  var htmlTitle: js.UndefOr[String] = js.undefined
  /** Which reporter to use on the terminal. */
  var reporter: js.UndefOr[String] = js.undefined
  /** File extensions that indicate that the file contains tests. */
  var testSuffixes: js.UndefOr[js.Array[String]] = js.undefined
}

object AtomMochaOptions {
  @scala.inline
  def apply(
    colors: js.UndefOr[Boolean] = js.undefined,
    globalAtom: js.UndefOr[Boolean] = js.undefined,
    htmlTitle: String = null,
    reporter: String = null,
    testSuffixes: js.Array[String] = null
  ): AtomMochaOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(colors)) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (!js.isUndefined(globalAtom)) __obj.updateDynamic("globalAtom")(globalAtom.asInstanceOf[js.Any])
    if (htmlTitle != null) __obj.updateDynamic("htmlTitle")(htmlTitle.asInstanceOf[js.Any])
    if (reporter != null) __obj.updateDynamic("reporter")(reporter.asInstanceOf[js.Any])
    if (testSuffixes != null) __obj.updateDynamic("testSuffixes")(testSuffixes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AtomMochaOptions]
  }
}

