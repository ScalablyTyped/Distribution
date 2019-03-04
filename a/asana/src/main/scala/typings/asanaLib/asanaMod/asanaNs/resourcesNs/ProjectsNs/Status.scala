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
    val __obj = js.Dynamic.literal(author = author, color = color, html_text = html_text, modified_at = modified_at, text = text)
  
    __obj.asInstanceOf[Status]
  }
}

