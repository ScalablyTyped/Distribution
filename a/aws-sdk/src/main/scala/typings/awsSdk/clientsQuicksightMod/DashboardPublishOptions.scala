package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DashboardPublishOptions extends StObject {
  
  /**
    * Ad hoc (one-time) filtering option.
    */
  var AdHocFilteringOption: js.UndefOr[typings.awsSdk.clientsQuicksightMod.AdHocFilteringOption] = js.undefined
  
  /**
    * The drill-down options of data points in a dashboard.
    */
  var DataPointDrillUpDownOption: js.UndefOr[typings.awsSdk.clientsQuicksightMod.DataPointDrillUpDownOption] = js.undefined
  
  /**
    * The data point menu label options of a dashboard.
    */
  var DataPointMenuLabelOption: js.UndefOr[typings.awsSdk.clientsQuicksightMod.DataPointMenuLabelOption] = js.undefined
  
  /**
    * The data point tool tip options of a dashboard.
    */
  var DataPointTooltipOption: js.UndefOr[typings.awsSdk.clientsQuicksightMod.DataPointTooltipOption] = js.undefined
  
  /**
    * Export to .csv option.
    */
  var ExportToCSVOption: js.UndefOr[typings.awsSdk.clientsQuicksightMod.ExportToCSVOption] = js.undefined
  
  /**
    * Determines if hidden fields are exported with a dashboard.
    */
  var ExportWithHiddenFieldsOption: js.UndefOr[typings.awsSdk.clientsQuicksightMod.ExportWithHiddenFieldsOption] = js.undefined
  
  /**
    * Sheet controls option.
    */
  var SheetControlsOption: js.UndefOr[typings.awsSdk.clientsQuicksightMod.SheetControlsOption] = js.undefined
  
  /**
    * The sheet layout maximization options of a dashbaord.
    */
  var SheetLayoutElementMaximizationOption: js.UndefOr[typings.awsSdk.clientsQuicksightMod.SheetLayoutElementMaximizationOption] = js.undefined
  
  /**
    * The axis sort options of a dashboard.
    */
  var VisualAxisSortOption: js.UndefOr[typings.awsSdk.clientsQuicksightMod.VisualAxisSortOption] = js.undefined
  
  /**
    * The menu options of a visual in a dashboard.
    */
  var VisualMenuOption: js.UndefOr[typings.awsSdk.clientsQuicksightMod.VisualMenuOption] = js.undefined
  
  /**
    * The visual publish options of a visual in a dashboard.
    */
  var VisualPublishOptions: js.UndefOr[DashboardVisualPublishOptions] = js.undefined
}
object DashboardPublishOptions {
  
  inline def apply(): DashboardPublishOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DashboardPublishOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DashboardPublishOptions] (val x: Self) extends AnyVal {
    
    inline def setAdHocFilteringOption(value: AdHocFilteringOption): Self = StObject.set(x, "AdHocFilteringOption", value.asInstanceOf[js.Any])
    
    inline def setAdHocFilteringOptionUndefined: Self = StObject.set(x, "AdHocFilteringOption", js.undefined)
    
    inline def setDataPointDrillUpDownOption(value: DataPointDrillUpDownOption): Self = StObject.set(x, "DataPointDrillUpDownOption", value.asInstanceOf[js.Any])
    
    inline def setDataPointDrillUpDownOptionUndefined: Self = StObject.set(x, "DataPointDrillUpDownOption", js.undefined)
    
    inline def setDataPointMenuLabelOption(value: DataPointMenuLabelOption): Self = StObject.set(x, "DataPointMenuLabelOption", value.asInstanceOf[js.Any])
    
    inline def setDataPointMenuLabelOptionUndefined: Self = StObject.set(x, "DataPointMenuLabelOption", js.undefined)
    
    inline def setDataPointTooltipOption(value: DataPointTooltipOption): Self = StObject.set(x, "DataPointTooltipOption", value.asInstanceOf[js.Any])
    
    inline def setDataPointTooltipOptionUndefined: Self = StObject.set(x, "DataPointTooltipOption", js.undefined)
    
    inline def setExportToCSVOption(value: ExportToCSVOption): Self = StObject.set(x, "ExportToCSVOption", value.asInstanceOf[js.Any])
    
    inline def setExportToCSVOptionUndefined: Self = StObject.set(x, "ExportToCSVOption", js.undefined)
    
    inline def setExportWithHiddenFieldsOption(value: ExportWithHiddenFieldsOption): Self = StObject.set(x, "ExportWithHiddenFieldsOption", value.asInstanceOf[js.Any])
    
    inline def setExportWithHiddenFieldsOptionUndefined: Self = StObject.set(x, "ExportWithHiddenFieldsOption", js.undefined)
    
    inline def setSheetControlsOption(value: SheetControlsOption): Self = StObject.set(x, "SheetControlsOption", value.asInstanceOf[js.Any])
    
    inline def setSheetControlsOptionUndefined: Self = StObject.set(x, "SheetControlsOption", js.undefined)
    
    inline def setSheetLayoutElementMaximizationOption(value: SheetLayoutElementMaximizationOption): Self = StObject.set(x, "SheetLayoutElementMaximizationOption", value.asInstanceOf[js.Any])
    
    inline def setSheetLayoutElementMaximizationOptionUndefined: Self = StObject.set(x, "SheetLayoutElementMaximizationOption", js.undefined)
    
    inline def setVisualAxisSortOption(value: VisualAxisSortOption): Self = StObject.set(x, "VisualAxisSortOption", value.asInstanceOf[js.Any])
    
    inline def setVisualAxisSortOptionUndefined: Self = StObject.set(x, "VisualAxisSortOption", js.undefined)
    
    inline def setVisualMenuOption(value: VisualMenuOption): Self = StObject.set(x, "VisualMenuOption", value.asInstanceOf[js.Any])
    
    inline def setVisualMenuOptionUndefined: Self = StObject.set(x, "VisualMenuOption", js.undefined)
    
    inline def setVisualPublishOptions(value: DashboardVisualPublishOptions): Self = StObject.set(x, "VisualPublishOptions", value.asInstanceOf[js.Any])
    
    inline def setVisualPublishOptionsUndefined: Self = StObject.set(x, "VisualPublishOptions", js.undefined)
  }
}
