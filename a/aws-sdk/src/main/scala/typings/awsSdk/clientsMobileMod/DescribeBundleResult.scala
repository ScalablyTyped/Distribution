package typings.awsSdk.clientsMobileMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeBundleResult extends StObject {
  
  /**
    *  The details of the bundle. 
    */
  var details: js.UndefOr[BundleDetails] = js.undefined
}
object DescribeBundleResult {
  
  inline def apply(): DescribeBundleResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeBundleResult]
  }
  
  extension [Self <: DescribeBundleResult](x: Self) {
    
    inline def setDetails(value: BundleDetails): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
  }
}
