package typings.apolloDashLinkDashError.apolloDashLinkDashErrorMod

import typings.apolloDashLink.apolloDashLinkMod.ApolloLink
import typings.apolloDashLinkDashError.apolloDashLinkDashErrorMod.ErrorLinkNs.ErrorHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-link-error", "ErrorLink")
@js.native
class ErrorLink protected () extends ApolloLink {
  def this(errorHandler: ErrorHandler) = this()
  var link: js.Any = js.native
}

