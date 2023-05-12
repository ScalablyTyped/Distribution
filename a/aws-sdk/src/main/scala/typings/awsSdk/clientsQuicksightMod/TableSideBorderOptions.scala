package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableSideBorderOptions extends StObject {
  
  /**
    * The table border options of the bottom border.
    */
  var Bottom: js.UndefOr[TableBorderOptions] = js.undefined
  
  /**
    * The table border options of the inner horizontal border.
    */
  var InnerHorizontal: js.UndefOr[TableBorderOptions] = js.undefined
  
  /**
    * The table border options of the inner vertical border.
    */
  var InnerVertical: js.UndefOr[TableBorderOptions] = js.undefined
  
  /**
    * The table border options of the left border.
    */
  var Left: js.UndefOr[TableBorderOptions] = js.undefined
  
  /**
    * The table border options of the right border.
    */
  var Right: js.UndefOr[TableBorderOptions] = js.undefined
  
  /**
    * The table border options of the top border.
    */
  var Top: js.UndefOr[TableBorderOptions] = js.undefined
}
object TableSideBorderOptions {
  
  inline def apply(): TableSideBorderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableSideBorderOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableSideBorderOptions] (val x: Self) extends AnyVal {
    
    inline def setBottom(value: TableBorderOptions): Self = StObject.set(x, "Bottom", value.asInstanceOf[js.Any])
    
    inline def setBottomUndefined: Self = StObject.set(x, "Bottom", js.undefined)
    
    inline def setInnerHorizontal(value: TableBorderOptions): Self = StObject.set(x, "InnerHorizontal", value.asInstanceOf[js.Any])
    
    inline def setInnerHorizontalUndefined: Self = StObject.set(x, "InnerHorizontal", js.undefined)
    
    inline def setInnerVertical(value: TableBorderOptions): Self = StObject.set(x, "InnerVertical", value.asInstanceOf[js.Any])
    
    inline def setInnerVerticalUndefined: Self = StObject.set(x, "InnerVertical", js.undefined)
    
    inline def setLeft(value: TableBorderOptions): Self = StObject.set(x, "Left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "Left", js.undefined)
    
    inline def setRight(value: TableBorderOptions): Self = StObject.set(x, "Right", value.asInstanceOf[js.Any])
    
    inline def setRightUndefined: Self = StObject.set(x, "Right", js.undefined)
    
    inline def setTop(value: TableBorderOptions): Self = StObject.set(x, "Top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "Top", js.undefined)
  }
}
