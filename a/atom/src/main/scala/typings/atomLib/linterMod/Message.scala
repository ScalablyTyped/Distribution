package typings
package atomLib.linterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  /**
    *  Markdown long description of the error. Accepts a callback so that you can
    *  do things like HTTP requests.
    */
  var description: js.UndefOr[
    java.lang.String | (js.Function0[js.Promise[java.lang.String] | java.lang.String])
  ] = js.undefined
  /** The text for the message. */
  var excerpt: java.lang.String
  /** The name of the octicon to show in the gutter. */
  var icon: js.UndefOr[java.lang.String] = js.undefined
  /** Optionally override the displayed linter name. Defaults to provider name. */
  var linterName: js.UndefOr[java.lang.String] = js.undefined
  /** The location of the issue (aka where to highlight). */
  var location: atomLib.Anon_FilePosition
  /** A reference to a different location in the editor. */
  var reference: js.UndefOr[atomLib.Anon_File] = js.undefined
  /** The severity level for the message. */
  var severity: atomLib.atomLibStrings.error | atomLib.atomLibStrings.warning | atomLib.atomLibStrings.info
  /** Possible solutions (which the user can invoke at will). */
  var solutions: js.UndefOr[js.Array[ReplacementSolution | CallbackSolution]] = js.undefined
  /** An HTTP link to a resource explaining the issue. Default is a google search. */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

