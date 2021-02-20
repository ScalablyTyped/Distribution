package typings.antd.anon

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemIcon extends StObject {
  
  var clearIcon: ReactNode = js.native
  
  var itemIcon: js.Object | Null = js.native
  
  var removeIcon: js.Object | Null = js.native
  
  var suffixIcon: js.Object | Null = js.native
}
object ItemIcon {
  
  @scala.inline
  def apply(): ItemIcon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemIcon]
  }
  
  @scala.inline
  implicit class ItemIconMutableBuilder[Self <: ItemIcon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClearIcon(value: ReactNode): Self = StObject.set(x, "clearIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearIconUndefined: Self = StObject.set(x, "clearIcon", js.undefined)
    
    @scala.inline
    def setItemIcon(value: js.Object): Self = StObject.set(x, "itemIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemIconNull: Self = StObject.set(x, "itemIcon", null)
    
    @scala.inline
    def setRemoveIcon(value: js.Object): Self = StObject.set(x, "removeIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveIconNull: Self = StObject.set(x, "removeIcon", null)
    
    @scala.inline
    def setSuffixIcon(value: js.Object): Self = StObject.set(x, "suffixIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuffixIconNull: Self = StObject.set(x, "suffixIcon", null)
  }
}
