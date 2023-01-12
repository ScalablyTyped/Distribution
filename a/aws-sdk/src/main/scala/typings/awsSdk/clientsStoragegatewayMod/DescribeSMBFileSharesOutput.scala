package typings.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSMBFileSharesOutput extends StObject {
  
  /**
    * An array containing a description for each requested file share.
    */
  var SMBFileShareInfoList: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.SMBFileShareInfoList] = js.undefined
}
object DescribeSMBFileSharesOutput {
  
  inline def apply(): DescribeSMBFileSharesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSMBFileSharesOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeSMBFileSharesOutput] (val x: Self) extends AnyVal {
    
    inline def setSMBFileShareInfoList(value: SMBFileShareInfoList): Self = StObject.set(x, "SMBFileShareInfoList", value.asInstanceOf[js.Any])
    
    inline def setSMBFileShareInfoListUndefined: Self = StObject.set(x, "SMBFileShareInfoList", js.undefined)
    
    inline def setSMBFileShareInfoListVarargs(value: SMBFileShareInfo*): Self = StObject.set(x, "SMBFileShareInfoList", js.Array(value*))
  }
}
