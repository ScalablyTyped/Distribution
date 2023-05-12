package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReferenceLineDataConfiguration extends StObject {
  
  /**
    * The axis binding type of the reference line. Choose one of the following options:   PrimaryY   SecondaryY  
    */
  var AxisBinding: js.UndefOr[typings.awsSdk.clientsQuicksightMod.AxisBinding] = js.undefined
  
  /**
    * The dynamic configuration of the reference line data configuration.
    */
  var DynamicConfiguration: js.UndefOr[ReferenceLineDynamicDataConfiguration] = js.undefined
  
  /**
    * The static data configuration of the reference line data configuration.
    */
  var StaticConfiguration: js.UndefOr[ReferenceLineStaticDataConfiguration] = js.undefined
}
object ReferenceLineDataConfiguration {
  
  inline def apply(): ReferenceLineDataConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReferenceLineDataConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReferenceLineDataConfiguration] (val x: Self) extends AnyVal {
    
    inline def setAxisBinding(value: AxisBinding): Self = StObject.set(x, "AxisBinding", value.asInstanceOf[js.Any])
    
    inline def setAxisBindingUndefined: Self = StObject.set(x, "AxisBinding", js.undefined)
    
    inline def setDynamicConfiguration(value: ReferenceLineDynamicDataConfiguration): Self = StObject.set(x, "DynamicConfiguration", value.asInstanceOf[js.Any])
    
    inline def setDynamicConfigurationUndefined: Self = StObject.set(x, "DynamicConfiguration", js.undefined)
    
    inline def setStaticConfiguration(value: ReferenceLineStaticDataConfiguration): Self = StObject.set(x, "StaticConfiguration", value.asInstanceOf[js.Any])
    
    inline def setStaticConfigurationUndefined: Self = StObject.set(x, "StaticConfiguration", js.undefined)
  }
}
