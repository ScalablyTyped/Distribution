package typings
package awsDashSdkLib.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeDBSnapshotAttributesMessage extends js.Object {
  /**
    * The identifier for the DB snapshot to describe the attributes for.
    */
  var DBSnapshotIdentifier: String
}

object DescribeDBSnapshotAttributesMessage {
  @scala.inline
  def apply(DBSnapshotIdentifier: String): DescribeDBSnapshotAttributesMessage = {
    val __obj = js.Dynamic.literal(DBSnapshotIdentifier = DBSnapshotIdentifier)
  
    __obj.asInstanceOf[DescribeDBSnapshotAttributesMessage]
  }
}

