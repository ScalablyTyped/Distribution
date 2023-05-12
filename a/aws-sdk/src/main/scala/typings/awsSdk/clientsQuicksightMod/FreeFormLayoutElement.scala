package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FreeFormLayoutElement extends StObject {
  
  /**
    * The background style configuration of a free-form layout element.
    */
  var BackgroundStyle: js.UndefOr[FreeFormLayoutElementBackgroundStyle] = js.undefined
  
  /**
    * The border style configuration of a free-form layout element.
    */
  var BorderStyle: js.UndefOr[FreeFormLayoutElementBorderStyle] = js.undefined
  
  /**
    * A unique identifier for an element within a free-form layout.
    */
  var ElementId: ShortRestrictiveResourceId
  
  /**
    * The type of element.
    */
  var ElementType: LayoutElementType
  
  /**
    * The height of an element within a free-form layout.
    */
  var Height: PixelLength
  
  /**
    * The loading animation configuration of a free-form layout element.
    */
  var LoadingAnimation: js.UndefOr[typings.awsSdk.clientsQuicksightMod.LoadingAnimation] = js.undefined
  
  /**
    * The rendering rules that determine when an element should be displayed within a free-form layout.
    */
  var RenderingRules: js.UndefOr[SheetElementRenderingRuleList] = js.undefined
  
  /**
    * The border style configuration of a free-form layout element. This border style is used when the element is selected.
    */
  var SelectedBorderStyle: js.UndefOr[FreeFormLayoutElementBorderStyle] = js.undefined
  
  /**
    * The visibility of an element within a free-form layout.
    */
  var Visibility: js.UndefOr[typings.awsSdk.clientsQuicksightMod.Visibility] = js.undefined
  
  /**
    * The width of an element within a free-form layout.
    */
  var Width: PixelLength
  
  /**
    * The x-axis coordinate of the element.
    */
  var XAxisLocation: PixelLength
  
  /**
    * The y-axis coordinate of the element.
    */
  var YAxisLocation: UnlimitedPixelLength
}
object FreeFormLayoutElement {
  
  inline def apply(
    ElementId: ShortRestrictiveResourceId,
    ElementType: LayoutElementType,
    Height: PixelLength,
    Width: PixelLength,
    XAxisLocation: PixelLength,
    YAxisLocation: UnlimitedPixelLength
  ): FreeFormLayoutElement = {
    val __obj = js.Dynamic.literal(ElementId = ElementId.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any], XAxisLocation = XAxisLocation.asInstanceOf[js.Any], YAxisLocation = YAxisLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[FreeFormLayoutElement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FreeFormLayoutElement] (val x: Self) extends AnyVal {
    
    inline def setBackgroundStyle(value: FreeFormLayoutElementBackgroundStyle): Self = StObject.set(x, "BackgroundStyle", value.asInstanceOf[js.Any])
    
    inline def setBackgroundStyleUndefined: Self = StObject.set(x, "BackgroundStyle", js.undefined)
    
    inline def setBorderStyle(value: FreeFormLayoutElementBorderStyle): Self = StObject.set(x, "BorderStyle", value.asInstanceOf[js.Any])
    
    inline def setBorderStyleUndefined: Self = StObject.set(x, "BorderStyle", js.undefined)
    
    inline def setElementId(value: ShortRestrictiveResourceId): Self = StObject.set(x, "ElementId", value.asInstanceOf[js.Any])
    
    inline def setElementType(value: LayoutElementType): Self = StObject.set(x, "ElementType", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: PixelLength): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    inline def setLoadingAnimation(value: LoadingAnimation): Self = StObject.set(x, "LoadingAnimation", value.asInstanceOf[js.Any])
    
    inline def setLoadingAnimationUndefined: Self = StObject.set(x, "LoadingAnimation", js.undefined)
    
    inline def setRenderingRules(value: SheetElementRenderingRuleList): Self = StObject.set(x, "RenderingRules", value.asInstanceOf[js.Any])
    
    inline def setRenderingRulesUndefined: Self = StObject.set(x, "RenderingRules", js.undefined)
    
    inline def setRenderingRulesVarargs(value: SheetElementRenderingRule*): Self = StObject.set(x, "RenderingRules", js.Array(value*))
    
    inline def setSelectedBorderStyle(value: FreeFormLayoutElementBorderStyle): Self = StObject.set(x, "SelectedBorderStyle", value.asInstanceOf[js.Any])
    
    inline def setSelectedBorderStyleUndefined: Self = StObject.set(x, "SelectedBorderStyle", js.undefined)
    
    inline def setVisibility(value: Visibility): Self = StObject.set(x, "Visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "Visibility", js.undefined)
    
    inline def setWidth(value: PixelLength): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
    
    inline def setXAxisLocation(value: PixelLength): Self = StObject.set(x, "XAxisLocation", value.asInstanceOf[js.Any])
    
    inline def setYAxisLocation(value: UnlimitedPixelLength): Self = StObject.set(x, "YAxisLocation", value.asInstanceOf[js.Any])
  }
}
