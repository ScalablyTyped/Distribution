package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDetachTypedLink extends js.Object {
  /**
    * Used to accept a typed link specifier as input.
    */
  var TypedLinkSpecifier: typings.awsDashSdk.clientsClouddirectoryMod.TypedLinkSpecifier = js.native
}

object BatchDetachTypedLink {
  @scala.inline
  def apply(TypedLinkSpecifier: TypedLinkSpecifier): BatchDetachTypedLink = {
    val __obj = js.Dynamic.literal(TypedLinkSpecifier = TypedLinkSpecifier.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BatchDetachTypedLink]
  }
}

