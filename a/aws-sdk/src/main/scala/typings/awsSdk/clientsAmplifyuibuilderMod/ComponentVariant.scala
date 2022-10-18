package typings.awsSdk.clientsAmplifyuibuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentVariant extends StObject {
  
  /**
    * The properties of the component variant that can be overriden when customizing an instance of the component. You can't specify tags as a valid property for overrides.
    */
  var overrides: js.UndefOr[ComponentOverrides] = js.undefined
  
  /**
    * The combination of variants that comprise this variant. You can't specify tags as a valid property for variantValues.
    */
  var variantValues: js.UndefOr[ComponentVariantValues] = js.undefined
}
object ComponentVariant {
  
  inline def apply(): ComponentVariant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentVariant]
  }
  
  extension [Self <: ComponentVariant](x: Self) {
    
    inline def setOverrides(value: ComponentOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    inline def setVariantValues(value: ComponentVariantValues): Self = StObject.set(x, "variantValues", value.asInstanceOf[js.Any])
    
    inline def setVariantValuesUndefined: Self = StObject.set(x, "variantValues", js.undefined)
  }
}
