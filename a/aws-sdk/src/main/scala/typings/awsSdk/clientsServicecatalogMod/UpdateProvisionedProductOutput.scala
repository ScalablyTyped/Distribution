package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateProvisionedProductOutput extends StObject {
  
  /**
    * Information about the result of the request.
    */
  var RecordDetail: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.RecordDetail] = js.undefined
}
object UpdateProvisionedProductOutput {
  
  inline def apply(): UpdateProvisionedProductOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateProvisionedProductOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateProvisionedProductOutput] (val x: Self) extends AnyVal {
    
    inline def setRecordDetail(value: RecordDetail): Self = StObject.set(x, "RecordDetail", value.asInstanceOf[js.Any])
    
    inline def setRecordDetailUndefined: Self = StObject.set(x, "RecordDetail", js.undefined)
  }
}
