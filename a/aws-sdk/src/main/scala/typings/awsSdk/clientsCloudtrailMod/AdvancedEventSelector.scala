package typings.awsSdk.clientsCloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdvancedEventSelector extends StObject {
  
  /**
    * Contains all selector statements in an advanced event selector.
    */
  var FieldSelectors: AdvancedFieldSelectors
  
  /**
    * An optional, descriptive name for an advanced event selector, such as "Log data events for only two S3 buckets".
    */
  var Name: js.UndefOr[SelectorName] = js.undefined
}
object AdvancedEventSelector {
  
  inline def apply(FieldSelectors: AdvancedFieldSelectors): AdvancedEventSelector = {
    val __obj = js.Dynamic.literal(FieldSelectors = FieldSelectors.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdvancedEventSelector]
  }
  
  extension [Self <: AdvancedEventSelector](x: Self) {
    
    inline def setFieldSelectors(value: AdvancedFieldSelectors): Self = StObject.set(x, "FieldSelectors", value.asInstanceOf[js.Any])
    
    inline def setFieldSelectorsVarargs(value: AdvancedFieldSelector*): Self = StObject.set(x, "FieldSelectors", js.Array(value*))
    
    inline def setName(value: SelectorName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
