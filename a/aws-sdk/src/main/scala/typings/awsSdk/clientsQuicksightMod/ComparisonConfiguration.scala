package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComparisonConfiguration extends StObject {
  
  /**
    * The format of the comparison.
    */
  var ComparisonFormat: js.UndefOr[ComparisonFormatConfiguration] = js.undefined
  
  /**
    * The method of the comparison. Choose from the following options:    DIFFERENCE     PERCENT_DIFFERENCE     PERCENT   
    */
  var ComparisonMethod: js.UndefOr[typings.awsSdk.clientsQuicksightMod.ComparisonMethod] = js.undefined
}
object ComparisonConfiguration {
  
  inline def apply(): ComparisonConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComparisonConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComparisonConfiguration] (val x: Self) extends AnyVal {
    
    inline def setComparisonFormat(value: ComparisonFormatConfiguration): Self = StObject.set(x, "ComparisonFormat", value.asInstanceOf[js.Any])
    
    inline def setComparisonFormatUndefined: Self = StObject.set(x, "ComparisonFormat", js.undefined)
    
    inline def setComparisonMethod(value: ComparisonMethod): Self = StObject.set(x, "ComparisonMethod", value.asInstanceOf[js.Any])
    
    inline def setComparisonMethodUndefined: Self = StObject.set(x, "ComparisonMethod", js.undefined)
  }
}
