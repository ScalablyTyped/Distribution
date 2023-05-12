package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridLayoutElement extends StObject {
  
  /**
    * The column index for the upper left corner of an element.
    */
  var ColumnIndex: js.UndefOr[GridLayoutElementColumnIndex] = js.undefined
  
  /**
    * The width of a grid element expressed as a number of grid columns.
    */
  var ColumnSpan: GridLayoutElementColumnSpan
  
  /**
    * A unique identifier for an element within a grid layout.
    */
  var ElementId: ShortRestrictiveResourceId
  
  /**
    * The type of element.
    */
  var ElementType: LayoutElementType
  
  /**
    * The row index for the upper left corner of an element.
    */
  var RowIndex: js.UndefOr[GridLayoutElementRowIndex] = js.undefined
  
  /**
    * The height of a grid element expressed as a number of grid rows.
    */
  var RowSpan: GridLayoutElementRowSpan
}
object GridLayoutElement {
  
  inline def apply(
    ColumnSpan: GridLayoutElementColumnSpan,
    ElementId: ShortRestrictiveResourceId,
    ElementType: LayoutElementType,
    RowSpan: GridLayoutElementRowSpan
  ): GridLayoutElement = {
    val __obj = js.Dynamic.literal(ColumnSpan = ColumnSpan.asInstanceOf[js.Any], ElementId = ElementId.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], RowSpan = RowSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridLayoutElement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GridLayoutElement] (val x: Self) extends AnyVal {
    
    inline def setColumnIndex(value: GridLayoutElementColumnIndex): Self = StObject.set(x, "ColumnIndex", value.asInstanceOf[js.Any])
    
    inline def setColumnIndexUndefined: Self = StObject.set(x, "ColumnIndex", js.undefined)
    
    inline def setColumnSpan(value: GridLayoutElementColumnSpan): Self = StObject.set(x, "ColumnSpan", value.asInstanceOf[js.Any])
    
    inline def setElementId(value: ShortRestrictiveResourceId): Self = StObject.set(x, "ElementId", value.asInstanceOf[js.Any])
    
    inline def setElementType(value: LayoutElementType): Self = StObject.set(x, "ElementType", value.asInstanceOf[js.Any])
    
    inline def setRowIndex(value: GridLayoutElementRowIndex): Self = StObject.set(x, "RowIndex", value.asInstanceOf[js.Any])
    
    inline def setRowIndexUndefined: Self = StObject.set(x, "RowIndex", js.undefined)
    
    inline def setRowSpan(value: GridLayoutElementRowSpan): Self = StObject.set(x, "RowSpan", value.asInstanceOf[js.Any])
  }
}
