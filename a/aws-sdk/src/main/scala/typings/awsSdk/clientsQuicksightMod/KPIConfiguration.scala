package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KPIConfiguration extends StObject {
  
  /**
    * The field well configuration of a KPI visual.
    */
  var FieldWells: js.UndefOr[KPIFieldWells] = js.undefined
  
  /**
    * The options that determine the presentation of a KPI visual.
    */
  var KPIOptions: js.UndefOr[typings.awsSdk.clientsQuicksightMod.KPIOptions] = js.undefined
  
  /**
    * The sort configuration of a KPI visual.
    */
  var SortConfiguration: js.UndefOr[KPISortConfiguration] = js.undefined
}
object KPIConfiguration {
  
  inline def apply(): KPIConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KPIConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KPIConfiguration] (val x: Self) extends AnyVal {
    
    inline def setFieldWells(value: KPIFieldWells): Self = StObject.set(x, "FieldWells", value.asInstanceOf[js.Any])
    
    inline def setFieldWellsUndefined: Self = StObject.set(x, "FieldWells", js.undefined)
    
    inline def setKPIOptions(value: KPIOptions): Self = StObject.set(x, "KPIOptions", value.asInstanceOf[js.Any])
    
    inline def setKPIOptionsUndefined: Self = StObject.set(x, "KPIOptions", js.undefined)
    
    inline def setSortConfiguration(value: KPISortConfiguration): Self = StObject.set(x, "SortConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSortConfigurationUndefined: Self = StObject.set(x, "SortConfiguration", js.undefined)
  }
}
