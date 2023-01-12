package typings.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFileSystemAssociationsOutput extends StObject {
  
  /**
    * An array containing the FileSystemAssociationInfo data type of each file system association to be described. 
    */
  var FileSystemAssociationInfoList: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.FileSystemAssociationInfoList] = js.undefined
}
object DescribeFileSystemAssociationsOutput {
  
  inline def apply(): DescribeFileSystemAssociationsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFileSystemAssociationsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeFileSystemAssociationsOutput] (val x: Self) extends AnyVal {
    
    inline def setFileSystemAssociationInfoList(value: FileSystemAssociationInfoList): Self = StObject.set(x, "FileSystemAssociationInfoList", value.asInstanceOf[js.Any])
    
    inline def setFileSystemAssociationInfoListUndefined: Self = StObject.set(x, "FileSystemAssociationInfoList", js.undefined)
    
    inline def setFileSystemAssociationInfoListVarargs(value: FileSystemAssociationInfo*): Self = StObject.set(x, "FileSystemAssociationInfoList", js.Array(value*))
  }
}
