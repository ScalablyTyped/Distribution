package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCopyProductStatusOutput extends StObject {
  
  /**
    * The status of the copy product operation.
    */
  var CopyProductStatus: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.CopyProductStatus] = js.undefined
  
  /**
    * The status message.
    */
  var StatusDetail: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.StatusDetail] = js.undefined
  
  /**
    * The identifier of the copied product.
    */
  var TargetProductId: js.UndefOr[Id] = js.undefined
}
object DescribeCopyProductStatusOutput {
  
  inline def apply(): DescribeCopyProductStatusOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCopyProductStatusOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeCopyProductStatusOutput] (val x: Self) extends AnyVal {
    
    inline def setCopyProductStatus(value: CopyProductStatus): Self = StObject.set(x, "CopyProductStatus", value.asInstanceOf[js.Any])
    
    inline def setCopyProductStatusUndefined: Self = StObject.set(x, "CopyProductStatus", js.undefined)
    
    inline def setStatusDetail(value: StatusDetail): Self = StObject.set(x, "StatusDetail", value.asInstanceOf[js.Any])
    
    inline def setStatusDetailUndefined: Self = StObject.set(x, "StatusDetail", js.undefined)
    
    inline def setTargetProductId(value: Id): Self = StObject.set(x, "TargetProductId", value.asInstanceOf[js.Any])
    
    inline def setTargetProductIdUndefined: Self = StObject.set(x, "TargetProductId", js.undefined)
  }
}
