package typings
package awsDashSdkLib.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Segment extends js.Object {
  /**
    * The segment document.
    */
  var Document: js.UndefOr[SegmentDocument] = js.undefined
  /**
    * The segment's ID.
    */
  var Id: js.UndefOr[SegmentId] = js.undefined
}

object Segment {
  @scala.inline
  def apply(Document: SegmentDocument = null, Id: SegmentId = null): Segment = {
    val __obj = js.Dynamic.literal()
    if (Document != null) __obj.updateDynamic("Document")(Document)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    __obj.asInstanceOf[Segment]
  }
}

