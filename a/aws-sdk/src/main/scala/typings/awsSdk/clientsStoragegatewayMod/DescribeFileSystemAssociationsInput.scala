package typings.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFileSystemAssociationsInput extends StObject {
  
  /**
    * An array containing the Amazon Resource Name (ARN) of each file system association to be described.
    */
  var FileSystemAssociationARNList: typings.awsSdk.clientsStoragegatewayMod.FileSystemAssociationARNList
}
object DescribeFileSystemAssociationsInput {
  
  inline def apply(FileSystemAssociationARNList: FileSystemAssociationARNList): DescribeFileSystemAssociationsInput = {
    val __obj = js.Dynamic.literal(FileSystemAssociationARNList = FileSystemAssociationARNList.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFileSystemAssociationsInput]
  }
  
  extension [Self <: DescribeFileSystemAssociationsInput](x: Self) {
    
    inline def setFileSystemAssociationARNList(value: FileSystemAssociationARNList): Self = StObject.set(x, "FileSystemAssociationARNList", value.asInstanceOf[js.Any])
    
    inline def setFileSystemAssociationARNListVarargs(value: FileSystemAssociationARN*): Self = StObject.set(x, "FileSystemAssociationARNList", js.Array(value*))
  }
}
