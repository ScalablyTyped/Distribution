package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagOptionSummary extends StObject {
  
  /**
    * The TagOption key.
    */
  var Key: js.UndefOr[TagOptionKey] = js.undefined
  
  /**
    * The TagOption value.
    */
  var Values: js.UndefOr[TagOptionValues] = js.undefined
}
object TagOptionSummary {
  
  inline def apply(): TagOptionSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagOptionSummary]
  }
  
  extension [Self <: TagOptionSummary](x: Self) {
    
    inline def setKey(value: TagOptionKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    inline def setValues(value: TagOptionValues): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
    
    inline def setValuesVarargs(value: TagOptionValue*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
