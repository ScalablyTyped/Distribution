package typings.asana.mod.resources.Projects

import typings.asana.mod.resources.Resource
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
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], html_text = html_text.asInstanceOf[js.Any], modified_at = modified_at.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Status]
  }
}

