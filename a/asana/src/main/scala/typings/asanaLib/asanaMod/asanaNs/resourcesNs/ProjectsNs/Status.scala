package typings
package asanaLib.asanaMod.asanaNs.resourcesNs.ProjectsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Status extends js.Object {
  var author: asanaLib.asanaMod.asanaNs.resourcesNs.Resource
  var color: java.lang.String
  var html_text: java.lang.String
  var modified_at: java.lang.String
  var text: java.lang.String
}

object Status {
  @scala.inline
  def apply(
    author: asanaLib.asanaMod.asanaNs.resourcesNs.Resource,
    color: java.lang.String,
    html_text: java.lang.String,
    modified_at: java.lang.String,
    text: java.lang.String
  ): Status = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("author")(author)
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("html_text")(html_text)
    __obj.updateDynamic("modified_at")(modified_at)
    __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Status]
  }
}

