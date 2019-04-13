package typings
package awsDashSdkLib.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartSchemaExtensionRequest extends js.Object {
  /**
    * If true, creates a snapshot of the directory before applying the schema extension.
    */
  var CreateSnapshotBeforeSchemaExtension: awsDashSdkLib.clientsDirectoryserviceMod.CreateSnapshotBeforeSchemaExtension
  /**
    * A description of the schema extension.
    */
  var Description: awsDashSdkLib.clientsDirectoryserviceMod.Description
  /**
    * The identifier of the directory for which the schema extension will be applied to.
    */
  var DirectoryId: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryId
  /**
    * The LDIF file represented as a string. To construct the LdifContent string, precede each line as it would be formatted in an ldif file with \n. See the example request below for more details. The file size can be no larger than 1MB.
    */
  var LdifContent: awsDashSdkLib.clientsDirectoryserviceMod.LdifContent
}

object StartSchemaExtensionRequest {
  @scala.inline
  def apply(
    CreateSnapshotBeforeSchemaExtension: CreateSnapshotBeforeSchemaExtension,
    Description: Description,
    DirectoryId: DirectoryId,
    LdifContent: LdifContent
  ): StartSchemaExtensionRequest = {
    val __obj = js.Dynamic.literal(CreateSnapshotBeforeSchemaExtension = CreateSnapshotBeforeSchemaExtension, Description = Description, DirectoryId = DirectoryId, LdifContent = LdifContent)
  
    __obj.asInstanceOf[StartSchemaExtensionRequest]
  }
}

