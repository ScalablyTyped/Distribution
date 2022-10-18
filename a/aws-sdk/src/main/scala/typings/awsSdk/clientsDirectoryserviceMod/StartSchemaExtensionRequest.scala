package typings.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartSchemaExtensionRequest extends StObject {
  
  /**
    * If true, creates a snapshot of the directory before applying the schema extension.
    */
  var CreateSnapshotBeforeSchemaExtension: typings.awsSdk.clientsDirectoryserviceMod.CreateSnapshotBeforeSchemaExtension
  
  /**
    * A description of the schema extension.
    */
  var Description: typings.awsSdk.clientsDirectoryserviceMod.Description
  
  /**
    * The identifier of the directory for which the schema extension will be applied to.
    */
  var DirectoryId: typings.awsSdk.clientsDirectoryserviceMod.DirectoryId
  
  /**
    * The LDIF file represented as a string. To construct the LdifContent string, precede each line as it would be formatted in an ldif file with \n. See the example request below for more details. The file size can be no larger than 1MB.
    */
  var LdifContent: typings.awsSdk.clientsDirectoryserviceMod.LdifContent
}
object StartSchemaExtensionRequest {
  
  inline def apply(
    CreateSnapshotBeforeSchemaExtension: CreateSnapshotBeforeSchemaExtension,
    Description: Description,
    DirectoryId: DirectoryId,
    LdifContent: LdifContent
  ): StartSchemaExtensionRequest = {
    val __obj = js.Dynamic.literal(CreateSnapshotBeforeSchemaExtension = CreateSnapshotBeforeSchemaExtension.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], DirectoryId = DirectoryId.asInstanceOf[js.Any], LdifContent = LdifContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartSchemaExtensionRequest]
  }
  
  extension [Self <: StartSchemaExtensionRequest](x: Self) {
    
    inline def setCreateSnapshotBeforeSchemaExtension(value: CreateSnapshotBeforeSchemaExtension): Self = StObject.set(x, "CreateSnapshotBeforeSchemaExtension", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    inline def setLdifContent(value: LdifContent): Self = StObject.set(x, "LdifContent", value.asInstanceOf[js.Any])
  }
}
