package typings.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeNFSFileSharesInput extends StObject {
  
  /**
    * An array containing the Amazon Resource Name (ARN) of each file share to be described.
    */
  var FileShareARNList: typings.awsSdk.clientsStoragegatewayMod.FileShareARNList
}
object DescribeNFSFileSharesInput {
  
  inline def apply(FileShareARNList: FileShareARNList): DescribeNFSFileSharesInput = {
    val __obj = js.Dynamic.literal(FileShareARNList = FileShareARNList.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeNFSFileSharesInput]
  }
  
  extension [Self <: DescribeNFSFileSharesInput](x: Self) {
    
    inline def setFileShareARNList(value: FileShareARNList): Self = StObject.set(x, "FileShareARNList", value.asInstanceOf[js.Any])
    
    inline def setFileShareARNListVarargs(value: FileShareARN*): Self = StObject.set(x, "FileShareARNList", js.Array(value*))
  }
}
