package typings.atomMochaTestRunner.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AtomMochaOptions extends js.Object {
  /** Whether or not to colorize output on the terminal. */
  var colors: js.UndefOr[Boolean] = js.native
  /** Whether or not to assign the created Atom environment to `global.atom`. */
  var globalAtom: js.UndefOr[Boolean] = js.native
  /** The string to use for the window title in the HTML reporter. */
  var htmlTitle: js.UndefOr[String] = js.native
  /** Which reporter to use on the terminal. */
  var reporter: js.UndefOr[String] = js.native
  /** File extensions that indicate that the file contains tests. */
  var testSuffixes: js.UndefOr[js.Array[String]] = js.native
}

object AtomMochaOptions {
  @scala.inline
  def apply(): AtomMochaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AtomMochaOptions]
  }
  @scala.inline
  implicit class AtomMochaOptionsOps[Self <: AtomMochaOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setColors(value: Boolean): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    @scala.inline
    def setGlobalAtom(value: Boolean): Self = this.set("globalAtom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobalAtom: Self = this.set("globalAtom", js.undefined)
    @scala.inline
    def setHtmlTitle(value: String): Self = this.set("htmlTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtmlTitle: Self = this.set("htmlTitle", js.undefined)
    @scala.inline
    def setReporter(value: String): Self = this.set("reporter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReporter: Self = this.set("reporter", js.undefined)
    @scala.inline
    def setTestSuffixesVarargs(value: String*): Self = this.set("testSuffixes", js.Array(value :_*))
    @scala.inline
    def setTestSuffixes(value: js.Array[String]): Self = this.set("testSuffixes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTestSuffixes: Self = this.set("testSuffixes", js.undefined)
  }
  
}

