package typings
package awsDashSdkLib.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchDetachFromIndex extends js.Object {
  /**
    * A reference to the index object.
    */
  var IndexReference: ObjectReference
  /**
    * A reference to the object being detached from the index.
    */
  var TargetReference: ObjectReference
}

object BatchDetachFromIndex {
  @scala.inline
  def apply(IndexReference: ObjectReference, TargetReference: ObjectReference): BatchDetachFromIndex = {
    val __obj = js.Dynamic.literal(IndexReference = IndexReference, TargetReference = TargetReference)
  
    __obj.asInstanceOf[BatchDetachFromIndex]
  }
}

