package typings.atom.linterMod

import typings.atom.anon.File
import typings.atom.anon.Position
import typings.atom.atomStrings.error
import typings.atom.atomStrings.info
import typings.atom.atomStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  /**
    *  Markdown long description of the error. Accepts a callback so that you can
    *  do things like HTTP requests.
    */
  var description: js.UndefOr[String | (js.Function0[js.Promise[String] | String])] = js.undefined
  /** The text for the message. */
  var excerpt: String
  /** The name of the octicon to show in the gutter. */
  var icon: js.UndefOr[String] = js.undefined
  /** Optionally override the displayed linter name. Defaults to provider name. */
  var linterName: js.UndefOr[String] = js.undefined
  /** The location of the issue (aka where to highlight). */
  var location: File
  /** A reference to a different location in the editor. */
  var reference: js.UndefOr[Position] = js.undefined
  /** The severity level for the message. */
  var severity: error | warning | info
  /** Possible solutions (which the user can invoke at will). */
  var solutions: js.UndefOr[js.Array[ReplacementSolution | CallbackSolution]] = js.undefined
  /** An HTTP link to a resource explaining the issue. Default is a google search. */
  var url: js.UndefOr[String] = js.undefined
}

object Message {
  @scala.inline
  def apply(
    excerpt: String,
    location: File,
    severity: error | warning | info,
    description: String | (js.Function0[js.Promise[String] | String]) = null,
    icon: String = null,
    linterName: String = null,
    reference: Position = null,
    solutions: js.Array[ReplacementSolution | CallbackSolution] = null,
    url: String = null
  ): Message = {
    val __obj = js.Dynamic.literal(excerpt = excerpt.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (linterName != null) __obj.updateDynamic("linterName")(linterName.asInstanceOf[js.Any])
    if (reference != null) __obj.updateDynamic("reference")(reference.asInstanceOf[js.Any])
    if (solutions != null) __obj.updateDynamic("solutions")(solutions.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
}

