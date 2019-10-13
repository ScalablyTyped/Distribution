package typings.airtable.airtableMod._Global_.Airtable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Collaborator extends js.Object {
  var email: String
  var id: String
  var name: String
}

object Collaborator {
  @scala.inline
  def apply(email: String, id: String, name: String): Collaborator = {
    val __obj = js.Dynamic.literal(email = email, id = id, name = name)
  
    __obj.asInstanceOf[Collaborator]
  }
}

