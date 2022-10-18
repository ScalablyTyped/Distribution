package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecuteProvisionedProductPlanOutput extends StObject {
  
  /**
    * Information about the result of provisioning the product.
    */
  var RecordDetail: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.RecordDetail] = js.undefined
}
object ExecuteProvisionedProductPlanOutput {
  
  inline def apply(): ExecuteProvisionedProductPlanOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecuteProvisionedProductPlanOutput]
  }
  
  extension [Self <: ExecuteProvisionedProductPlanOutput](x: Self) {
    
    inline def setRecordDetail(value: RecordDetail): Self = StObject.set(x, "RecordDetail", value.asInstanceOf[js.Any])
    
    inline def setRecordDetailUndefined: Self = StObject.set(x, "RecordDetail", js.undefined)
  }
}
