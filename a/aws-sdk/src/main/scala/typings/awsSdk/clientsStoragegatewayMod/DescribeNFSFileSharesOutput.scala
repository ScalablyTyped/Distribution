package typings.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeNFSFileSharesOutput extends StObject {
  
  /**
    * An array containing a description for each requested file share.
    */
  var NFSFileShareInfoList: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.NFSFileShareInfoList] = js.undefined
}
object DescribeNFSFileSharesOutput {
  
  inline def apply(): DescribeNFSFileSharesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeNFSFileSharesOutput]
  }
  
  extension [Self <: DescribeNFSFileSharesOutput](x: Self) {
    
    inline def setNFSFileShareInfoList(value: NFSFileShareInfoList): Self = StObject.set(x, "NFSFileShareInfoList", value.asInstanceOf[js.Any])
    
    inline def setNFSFileShareInfoListUndefined: Self = StObject.set(x, "NFSFileShareInfoList", js.undefined)
    
    inline def setNFSFileShareInfoListVarargs(value: NFSFileShareInfo*): Self = StObject.set(x, "NFSFileShareInfoList", js.Array(value*))
  }
}
