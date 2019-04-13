package typings
package awsDashSdkLib.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchDetachObject extends js.Object {
  /**
    * The batch reference name. See Transaction Support for more information.
    */
  var BatchReferenceName: js.UndefOr[BatchReferenceName] = js.undefined
  /**
    * The name of the link.
    */
  var LinkName: awsDashSdkLib.clientsClouddirectoryMod.LinkName
  /**
    * Parent reference from which the object with the specified link name is detached.
    */
  var ParentReference: ObjectReference
}

object BatchDetachObject {
  @scala.inline
  def apply(
    LinkName: LinkName,
    ParentReference: ObjectReference,
    BatchReferenceName: BatchReferenceName = null
  ): BatchDetachObject = {
    val __obj = js.Dynamic.literal(LinkName = LinkName, ParentReference = ParentReference)
    if (BatchReferenceName != null) __obj.updateDynamic("BatchReferenceName")(BatchReferenceName)
    __obj.asInstanceOf[BatchDetachObject]
  }
}

