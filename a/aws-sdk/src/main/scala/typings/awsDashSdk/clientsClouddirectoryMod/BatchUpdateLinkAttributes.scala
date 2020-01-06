package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchUpdateLinkAttributes extends js.Object {
  /**
    * The attributes update structure.
    */
  var AttributeUpdates: LinkAttributeUpdateList = js.native
  /**
    * Allows a typed link specifier to be accepted as input.
    */
  var TypedLinkSpecifier: typings.awsDashSdk.clientsClouddirectoryMod.TypedLinkSpecifier = js.native
}

object BatchUpdateLinkAttributes {
  @scala.inline
  def apply(AttributeUpdates: LinkAttributeUpdateList, TypedLinkSpecifier: TypedLinkSpecifier): BatchUpdateLinkAttributes = {
    val __obj = js.Dynamic.literal(AttributeUpdates = AttributeUpdates.asInstanceOf[js.Any], TypedLinkSpecifier = TypedLinkSpecifier.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BatchUpdateLinkAttributes]
  }
}

