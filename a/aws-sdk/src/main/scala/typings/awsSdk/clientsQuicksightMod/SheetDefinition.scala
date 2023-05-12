package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SheetDefinition extends StObject {
  
  /**
    * The layout content type of the sheet. Choose one of the following options:    PAGINATED: Creates a sheet for a paginated report.    INTERACTIVE: Creates a sheet for an interactive dashboard.  
    */
  var ContentType: js.UndefOr[SheetContentType] = js.undefined
  
  /**
    * A description of the sheet.
    */
  var Description: js.UndefOr[SheetDescription] = js.undefined
  
  /**
    * The list of filter controls that are on a sheet. For more information, see Adding filter controls to analysis sheets in the Amazon QuickSight User Guide.
    */
  var FilterControls: js.UndefOr[FilterControlList] = js.undefined
  
  /**
    * Layouts define how the components of a sheet are arranged. For more information, see Types of layout in the Amazon QuickSight User Guide.
    */
  var Layouts: js.UndefOr[LayoutList] = js.undefined
  
  /**
    * The name of the sheet. This name is displayed on the sheet's tab in the Amazon QuickSight console.
    */
  var Name: js.UndefOr[SheetName] = js.undefined
  
  /**
    * The list of parameter controls that are on a sheet. For more information, see Using a Control with a Parameter in Amazon QuickSight in the Amazon QuickSight User Guide.
    */
  var ParameterControls: js.UndefOr[ParameterControlList] = js.undefined
  
  /**
    * The control layouts of the sheet.
    */
  var SheetControlLayouts: js.UndefOr[SheetControlLayoutList] = js.undefined
  
  /**
    * The unique identifier of a sheet.
    */
  var SheetId: ShortRestrictiveResourceId
  
  /**
    * The text boxes that are on a sheet.
    */
  var TextBoxes: js.UndefOr[SheetTextBoxList] = js.undefined
  
  /**
    * The title of the sheet.
    */
  var Title: js.UndefOr[SheetTitle] = js.undefined
  
  /**
    * A list of the visuals that are on a sheet. Visual placement is determined by the layout of the sheet.
    */
  var Visuals: js.UndefOr[VisualList] = js.undefined
}
object SheetDefinition {
  
  inline def apply(SheetId: ShortRestrictiveResourceId): SheetDefinition = {
    val __obj = js.Dynamic.literal(SheetId = SheetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SheetDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SheetDefinition] (val x: Self) extends AnyVal {
    
    inline def setContentType(value: SheetContentType): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "ContentType", js.undefined)
    
    inline def setDescription(value: SheetDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setFilterControls(value: FilterControlList): Self = StObject.set(x, "FilterControls", value.asInstanceOf[js.Any])
    
    inline def setFilterControlsUndefined: Self = StObject.set(x, "FilterControls", js.undefined)
    
    inline def setFilterControlsVarargs(value: FilterControl*): Self = StObject.set(x, "FilterControls", js.Array(value*))
    
    inline def setLayouts(value: LayoutList): Self = StObject.set(x, "Layouts", value.asInstanceOf[js.Any])
    
    inline def setLayoutsUndefined: Self = StObject.set(x, "Layouts", js.undefined)
    
    inline def setLayoutsVarargs(value: Layout*): Self = StObject.set(x, "Layouts", js.Array(value*))
    
    inline def setName(value: SheetName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setParameterControls(value: ParameterControlList): Self = StObject.set(x, "ParameterControls", value.asInstanceOf[js.Any])
    
    inline def setParameterControlsUndefined: Self = StObject.set(x, "ParameterControls", js.undefined)
    
    inline def setParameterControlsVarargs(value: ParameterControl*): Self = StObject.set(x, "ParameterControls", js.Array(value*))
    
    inline def setSheetControlLayouts(value: SheetControlLayoutList): Self = StObject.set(x, "SheetControlLayouts", value.asInstanceOf[js.Any])
    
    inline def setSheetControlLayoutsUndefined: Self = StObject.set(x, "SheetControlLayouts", js.undefined)
    
    inline def setSheetControlLayoutsVarargs(value: SheetControlLayout*): Self = StObject.set(x, "SheetControlLayouts", js.Array(value*))
    
    inline def setSheetId(value: ShortRestrictiveResourceId): Self = StObject.set(x, "SheetId", value.asInstanceOf[js.Any])
    
    inline def setTextBoxes(value: SheetTextBoxList): Self = StObject.set(x, "TextBoxes", value.asInstanceOf[js.Any])
    
    inline def setTextBoxesUndefined: Self = StObject.set(x, "TextBoxes", js.undefined)
    
    inline def setTextBoxesVarargs(value: SheetTextBox*): Self = StObject.set(x, "TextBoxes", js.Array(value*))
    
    inline def setTitle(value: SheetTitle): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "Title", js.undefined)
    
    inline def setVisuals(value: VisualList): Self = StObject.set(x, "Visuals", value.asInstanceOf[js.Any])
    
    inline def setVisualsUndefined: Self = StObject.set(x, "Visuals", js.undefined)
    
    inline def setVisualsVarargs(value: Visual*): Self = StObject.set(x, "Visuals", js.Array(value*))
  }
}
