package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchAttachToIndex extends js.Object {
  /**
    * A reference to the index that you are attaching the object to.
    */
  var IndexReference: ObjectReference
  /**
    * A reference to the object that you are attaching to the index.
    */
  var TargetReference: ObjectReference
}

object BatchAttachToIndex {
  @scala.inline
  def apply(IndexReference: ObjectReference, TargetReference: ObjectReference): BatchAttachToIndex = {
    val __obj = js.Dynamic.literal(IndexReference = IndexReference, TargetReference = TargetReference)
  
    __obj.asInstanceOf[BatchAttachToIndex]
  }
}

