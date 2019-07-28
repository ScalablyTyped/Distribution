package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchGetLinkAttributes extends js.Object {
  /**
    * A list of attribute names whose values will be retrieved.
    */
  var AttributeNames: AttributeNameList
  /**
    * Allows a typed link specifier to be accepted as input.
    */
  var TypedLinkSpecifier: typings.awsDashSdk.clientsClouddirectoryMod.TypedLinkSpecifier
}

object BatchGetLinkAttributes {
  @scala.inline
  def apply(AttributeNames: AttributeNameList, TypedLinkSpecifier: TypedLinkSpecifier): BatchGetLinkAttributes = {
    val __obj = js.Dynamic.literal(AttributeNames = AttributeNames, TypedLinkSpecifier = TypedLinkSpecifier)
  
    __obj.asInstanceOf[BatchGetLinkAttributes]
  }
}

