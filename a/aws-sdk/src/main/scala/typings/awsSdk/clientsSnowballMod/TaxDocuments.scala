package typings.awsSdk.clientsSnowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaxDocuments extends StObject {
  
  var IND: js.UndefOr[INDTaxDocuments] = js.undefined
}
object TaxDocuments {
  
  inline def apply(): TaxDocuments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaxDocuments]
  }
  
  extension [Self <: TaxDocuments](x: Self) {
    
    inline def setIND(value: INDTaxDocuments): Self = StObject.set(x, "IND", value.asInstanceOf[js.Any])
    
    inline def setINDUndefined: Self = StObject.set(x, "IND", js.undefined)
  }
}
