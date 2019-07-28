package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeDocumentPermissionRequest extends js.Object {
  /**
    * The name of the document for which you are the owner.
    */
  var Name: DocumentName
  /**
    * The permission type for the document. The permission type can be Share.
    */
  var PermissionType: DocumentPermissionType
}

object DescribeDocumentPermissionRequest {
  @scala.inline
  def apply(Name: DocumentName, PermissionType: DocumentPermissionType): DescribeDocumentPermissionRequest = {
    val __obj = js.Dynamic.literal(Name = Name, PermissionType = PermissionType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeDocumentPermissionRequest]
  }
}

