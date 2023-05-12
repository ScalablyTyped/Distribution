package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmallMultiplesOptions extends StObject {
  
  /**
    * Sets the maximum number of visible columns to display in the grid of small multiples panels. The default is Auto, which automatically adjusts the columns in the grid to fit the overall layout and size of the given chart.
    */
  var MaxVisibleColumns: js.UndefOr[VisiblePanelColumns] = js.undefined
  
  /**
    * Sets the maximum number of visible rows to display in the grid of small multiples panels. The default value is Auto, which automatically adjusts the rows in the grid to fit the overall layout and size of the given chart.
    */
  var MaxVisibleRows: js.UndefOr[VisiblePanelRows] = js.undefined
  
  /**
    * Configures the display options for each small multiples panel.
    */
  var PanelConfiguration: js.UndefOr[typings.awsSdk.clientsQuicksightMod.PanelConfiguration] = js.undefined
}
object SmallMultiplesOptions {
  
  inline def apply(): SmallMultiplesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SmallMultiplesOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SmallMultiplesOptions] (val x: Self) extends AnyVal {
    
    inline def setMaxVisibleColumns(value: VisiblePanelColumns): Self = StObject.set(x, "MaxVisibleColumns", value.asInstanceOf[js.Any])
    
    inline def setMaxVisibleColumnsUndefined: Self = StObject.set(x, "MaxVisibleColumns", js.undefined)
    
    inline def setMaxVisibleRows(value: VisiblePanelRows): Self = StObject.set(x, "MaxVisibleRows", value.asInstanceOf[js.Any])
    
    inline def setMaxVisibleRowsUndefined: Self = StObject.set(x, "MaxVisibleRows", js.undefined)
    
    inline def setPanelConfiguration(value: PanelConfiguration): Self = StObject.set(x, "PanelConfiguration", value.asInstanceOf[js.Any])
    
    inline def setPanelConfigurationUndefined: Self = StObject.set(x, "PanelConfiguration", js.undefined)
  }
}
