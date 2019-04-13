package typings
package awsDashSdkLib.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDirectoryResponse extends js.Object {
  /**
    * The ARN of the published schema in the Directory. Once a published schema is copied into the directory, it has its own ARN, which is referred to applied schema ARN. For more information, see arns.
    */
  var AppliedSchemaArn: Arn
  /**
    * The ARN that is associated with the Directory. For more information, see arns.
    */
  var DirectoryArn: awsDashSdkLib.clientsClouddirectoryMod.DirectoryArn
  /**
    * The name of the Directory.
    */
  var Name: DirectoryName
  /**
    * The root object node of the created directory.
    */
  var ObjectIdentifier: awsDashSdkLib.clientsClouddirectoryMod.ObjectIdentifier
}

object CreateDirectoryResponse {
  @scala.inline
  def apply(
    AppliedSchemaArn: Arn,
    DirectoryArn: DirectoryArn,
    Name: DirectoryName,
    ObjectIdentifier: ObjectIdentifier
  ): CreateDirectoryResponse = {
    val __obj = js.Dynamic.literal(AppliedSchemaArn = AppliedSchemaArn, DirectoryArn = DirectoryArn, Name = Name, ObjectIdentifier = ObjectIdentifier)
  
    __obj.asInstanceOf[CreateDirectoryResponse]
  }
}

