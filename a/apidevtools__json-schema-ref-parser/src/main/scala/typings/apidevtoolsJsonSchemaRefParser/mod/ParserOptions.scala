package typings.apidevtoolsJsonSchemaRefParser.mod

import typings.std.Error
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
  /**
    * This is where the real work of a parser happens. The `parse` method accepts the same file info object as the `canParse` function, but rather than returning a boolean value, the `parse` method should return a JavaScript representation of the file contents.  For our CSV parser, that is a two-dimensional array of lines and values.  For your parser, it might be an object, a string, a custom class, or anything else.
    *
    * Unlike the `canParse` function, the `parse` method can also be asynchronous. This might be important if your parser needs to retrieve data from a database or if it relies on an external HTTP service to return the parsed value.  You can return your asynchronous value via a [Promise](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Promise) or a Node.js-style error-first callback.  Here are examples of both approaches:
    */
  def parse(file: FileInfo): js.Any | js.Promise[_] = js.native
  def parse(file: FileInfo, callback: js.Function2[/* error */ Error | Null, /* data */ String | Null, _]): js.Any | js.Promise[_] = js.native
}

