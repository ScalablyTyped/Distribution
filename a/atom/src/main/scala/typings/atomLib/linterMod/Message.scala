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
  var location: atomLib.Anon_File
  /** A reference to a different location in the editor. */
  var reference: js.UndefOr[atomLib.Anon_FilePosition] = js.undefined
  /** The severity level for the message. */
  var severity: atomLib.atomLibStrings.error | atomLib.atomLibStrings.warning | atomLib.atomLibStrings.info
  /** Possible solutions (which the user can invoke at will). */
  var solutions: js.UndefOr[js.Array[ReplacementSolution | CallbackSolution]] = js.undefined
  /** An HTTP link to a resource explaining the issue. Default is a google search. */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object Message {
  @scala.inline
  def apply(
    excerpt: java.lang.String,
    location: atomLib.Anon_File,
    severity: atomLib.atomLibStrings.error | atomLib.atomLibStrings.warning | atomLib.atomLibStrings.info,
    description: java.lang.String | (js.Function0[js.Promise[java.lang.String] | java.lang.String]) = null,
    icon: java.lang.String = null,
    linterName: java.lang.String = null,
    reference: atomLib.Anon_FilePosition = null,
    solutions: js.Array[ReplacementSolution | CallbackSolution] = null,
    url: java.lang.String = null
  ): Message = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("excerpt")(excerpt)
    __obj.updateDynamic("location")(location)
    __obj.updateDynamic("severity")(severity.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (linterName != null) __obj.updateDynamic("linterName")(linterName)
    if (reference != null) __obj.updateDynamic("reference")(reference)
    if (solutions != null) __obj.updateDynamic("solutions")(solutions)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Message]
  }
}

