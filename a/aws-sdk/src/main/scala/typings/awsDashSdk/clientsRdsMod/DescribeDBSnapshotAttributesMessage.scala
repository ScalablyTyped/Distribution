package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDBSnapshotAttributesMessage extends js.Object {
  /**
    * The identifier for the DB snapshot to describe the attributes for.
    */
  var DBSnapshotIdentifier: String = js.native
}

object DescribeDBSnapshotAttributesMessage {
  @scala.inline
  def apply(DBSnapshotIdentifier: String): DescribeDBSnapshotAttributesMessage = {
    val __obj = js.Dynamic.literal(DBSnapshotIdentifier = DBSnapshotIdentifier.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeDBSnapshotAttributesMessage]
  }
}

