package typings.appBuilderLib.metadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorMetadata extends js.Object {
  val email: js.UndefOr[String] = js.undefined
  val name: String
}

object AuthorMetadata {
  @scala.inline
  def apply(name: String, email: String = null): AuthorMetadata = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorMetadata]
  }
}

