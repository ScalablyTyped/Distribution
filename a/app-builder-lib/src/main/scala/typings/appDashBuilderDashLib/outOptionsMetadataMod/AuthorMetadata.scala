package typings.appDashBuilderDashLib.outOptionsMetadataMod

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
    val __obj = js.Dynamic.literal(name = name)
    if (email != null) __obj.updateDynamic("email")(email)
    __obj.asInstanceOf[AuthorMetadata]
  }
}

