package typings
package awsDashSdkLib.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchUpdateLinkAttributes extends js.Object {
  /**
    * The attributes update structure.
    */
  var AttributeUpdates: LinkAttributeUpdateList
  /**
    * Allows a typed link specifier to be accepted as input.
    */
  var TypedLinkSpecifier: awsDashSdkLib.clientsClouddirectoryMod.TypedLinkSpecifier
}

object BatchUpdateLinkAttributes {
  @scala.inline
  def apply(AttributeUpdates: LinkAttributeUpdateList, TypedLinkSpecifier: TypedLinkSpecifier): BatchUpdateLinkAttributes = {
    val __obj = js.Dynamic.literal(AttributeUpdates = AttributeUpdates, TypedLinkSpecifier = TypedLinkSpecifier)
  
    __obj.asInstanceOf[BatchUpdateLinkAttributes]
  }
}

