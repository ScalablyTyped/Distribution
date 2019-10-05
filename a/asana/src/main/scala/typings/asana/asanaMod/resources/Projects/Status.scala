package typings.asana.asanaMod.resources.Projects

import typings.asana.asanaMod.resources.Resource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Status extends js.Object {
  var author: Resource
  var color: String
  var html_text: String
  var modified_at: String
  var text: String
}

object Status {
  @scala.inline
  def apply(author: Resource, color: String, html_text: String, modified_at: String, text: String): Status = {
    val __obj = js.Dynamic.literal(author = author, color = color, html_text = html_text, modified_at = modified_at, text = text)
  
    __obj.asInstanceOf[Status]
  }
}

