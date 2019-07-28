package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchUpdateObjectAttributes extends js.Object {
  /**
    * Attributes update structure.
    */
  var AttributeUpdates: ObjectAttributeUpdateList
  /**
    * Reference that identifies the object.
    */
  var ObjectReference: typings.awsDashSdk.clientsClouddirectoryMod.ObjectReference
}

object BatchUpdateObjectAttributes {
  @scala.inline
  def apply(AttributeUpdates: ObjectAttributeUpdateList, ObjectReference: ObjectReference): BatchUpdateObjectAttributes = {
    val __obj = js.Dynamic.literal(AttributeUpdates = AttributeUpdates, ObjectReference = ObjectReference)
  
    __obj.asInstanceOf[BatchUpdateObjectAttributes]
  }
}

