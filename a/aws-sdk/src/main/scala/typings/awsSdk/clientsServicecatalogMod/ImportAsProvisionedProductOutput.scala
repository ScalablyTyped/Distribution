package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportAsProvisionedProductOutput extends StObject {
  
  var RecordDetail: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.RecordDetail] = js.undefined
}
object ImportAsProvisionedProductOutput {
  
  inline def apply(): ImportAsProvisionedProductOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportAsProvisionedProductOutput]
  }
  
  extension [Self <: ImportAsProvisionedProductOutput](x: Self) {
    
    inline def setRecordDetail(value: RecordDetail): Self = StObject.set(x, "RecordDetail", value.asInstanceOf[js.Any])
    
    inline def setRecordDetailUndefined: Self = StObject.set(x, "RecordDetail", js.undefined)
  }
}
