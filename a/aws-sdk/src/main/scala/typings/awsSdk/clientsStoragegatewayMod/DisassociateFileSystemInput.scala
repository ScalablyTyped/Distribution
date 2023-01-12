package typings.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateFileSystemInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the file system association to be deleted.
    */
  var FileSystemAssociationARN: typings.awsSdk.clientsStoragegatewayMod.FileSystemAssociationARN
  
  /**
    * If this value is set to true, the operation disassociates an Amazon FSx file system immediately. It ends all data uploads to the file system, and the file system association enters the FORCE_DELETING status. If this value is set to false, the Amazon FSx file system does not disassociate until all data is uploaded.
    */
  var ForceDelete: js.UndefOr[scala.Boolean] = js.undefined
}
object DisassociateFileSystemInput {
  
  inline def apply(FileSystemAssociationARN: FileSystemAssociationARN): DisassociateFileSystemInput = {
    val __obj = js.Dynamic.literal(FileSystemAssociationARN = FileSystemAssociationARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateFileSystemInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisassociateFileSystemInput] (val x: Self) extends AnyVal {
    
    inline def setFileSystemAssociationARN(value: FileSystemAssociationARN): Self = StObject.set(x, "FileSystemAssociationARN", value.asInstanceOf[js.Any])
    
    inline def setForceDelete(value: scala.Boolean): Self = StObject.set(x, "ForceDelete", value.asInstanceOf[js.Any])
    
    inline def setForceDeleteUndefined: Self = StObject.set(x, "ForceDelete", js.undefined)
  }
}
