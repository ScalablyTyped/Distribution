package typings
package appDashBuilderDashLibLib.outOptionsMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorMetadata extends js.Object {
  val email: js.UndefOr[java.lang.String] = js.undefined
  val name: java.lang.String
}

object AuthorMetadata {
  @scala.inline
  def apply(name: java.lang.String, email: java.lang.String = null): AuthorMetadata = {
    val __obj = js.Dynamic.literal(name = name)
    if (email != null) __obj.updateDynamic("email")(email)
    __obj.asInstanceOf[AuthorMetadata]
  }
}

