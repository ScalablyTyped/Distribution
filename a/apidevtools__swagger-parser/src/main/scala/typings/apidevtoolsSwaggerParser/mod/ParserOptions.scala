package typings.apidevtoolsSwaggerParser.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParserOptions extends js.Object {
  /**
    * All of the built-in parsers allow empty files by default. The JSON and YAML parsers will parse empty files as `undefined`. The text parser will parse empty files as an empty string. The binary parser will parse empty files as an empty byte array.
    *
    * You can set `allowEmpty: false` on any parser, which will cause an error to be thrown if a file empty.
    */
  var allowEmpty: js.UndefOr[Boolean] = js.native
  /**
    * Determines which parsers will be used for which files.
    *
    * A regular expression can be used to match files by their full path. A string (or array of strings) can be used to match files by their file extension. Or a function can be used to perform more complex matching logic. See the custom parser docs for details.
    */
  var canParse: js.UndefOr[
    Boolean | RegExp | String | js.Array[String] | (js.Function1[/* file */ FileInfo, Boolean])
  ] = js.native
  /**
    * Parsers run in a specific order, relative to other parsers. For example, a parser with `order: 5` will run before a parser with `order: 10`. If a parser is unable to successfully parse a file, then the next parser is tried, until one succeeds or they all fail.
    *
    * You can change the order in which parsers run, which is useful if you know that most of your referenced files will be a certain type, or if you add your own custom parser that you want to run first.
    */
  var order: js.UndefOr[Double] = js.native
}

object ParserOptions {
  @scala.inline
  def apply(): ParserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParserOptions]
  }
  @scala.inline
  implicit class ParserOptionsOps[Self <: ParserOptions] (val x: Self) extends AnyVal {
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
    def setAllowEmpty(value: Boolean): Self = this.set("allowEmpty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowEmpty: Self = this.set("allowEmpty", js.undefined)
    @scala.inline
    def setCanParseVarargs(value: String*): Self = this.set("canParse", js.Array(value :_*))
    @scala.inline
    def setCanParseFunction1(value: /* file */ FileInfo => Boolean): Self = this.set("canParse", js.Any.fromFunction1(value))
    @scala.inline
    def setCanParse(value: Boolean | RegExp | String | js.Array[String] | (js.Function1[/* file */ FileInfo, Boolean])): Self = this.set("canParse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanParse: Self = this.set("canParse", js.undefined)
    @scala.inline
    def setOrder(value: Double): Self = this.set("order", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
  }
  
}

