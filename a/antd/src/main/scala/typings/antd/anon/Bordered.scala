package typings.antd.anon

import typings.antd.configProviderSizeContextMod.SizeType
import typings.antd.motionMod.SelectCommonPlacement
import typings.antd.statusUtilsMod.InputStatus
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bordered[DataNodeType] extends StObject {
  
  var bordered: js.UndefOr[Boolean] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @deprecated `dropdownClassName` is deprecated which will be removed in next major
    *   version.Please use `popupClassName` instead.
    */
  var dropdownClassName: js.UndefOr[String] = js.undefined
  
  var multiple: js.UndefOr[Boolean] = js.undefined
  
  var options: js.UndefOr[js.Array[DataNodeType]] = js.undefined
  
  var placement: js.UndefOr[SelectCommonPlacement] = js.undefined
  
  var size: js.UndefOr[SizeType] = js.undefined
  
  var status: js.UndefOr[InputStatus] = js.undefined
  
  var suffixIcon: js.UndefOr[ReactNode] = js.undefined
}
object Bordered {
  
  inline def apply[DataNodeType](): Bordered[DataNodeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bordered[DataNodeType]]
  }
  
  extension [Self <: Bordered[?], DataNodeType](x: Self & Bordered[DataNodeType]) {
    
    inline def setBordered(value: Boolean): Self = StObject.set(x, "bordered", value.asInstanceOf[js.Any])
    
    inline def setBorderedUndefined: Self = StObject.set(x, "bordered", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setDropdownClassName(value: String): Self = StObject.set(x, "dropdownClassName", value.asInstanceOf[js.Any])
    
    inline def setDropdownClassNameUndefined: Self = StObject.set(x, "dropdownClassName", js.undefined)
    
    inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    
    inline def setOptions(value: js.Array[DataNodeType]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setOptionsVarargs(value: DataNodeType*): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setPlacement(value: SelectCommonPlacement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    
    inline def setSize(value: SizeType): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStatus(value: InputStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSuffixIcon(value: ReactNode): Self = StObject.set(x, "suffixIcon", value.asInstanceOf[js.Any])
    
    inline def setSuffixIconUndefined: Self = StObject.set(x, "suffixIcon", js.undefined)
  }
}
