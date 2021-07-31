package typings.antDesignPro.anon

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollapseText extends StObject {
  
  var collapseText: js.UndefOr[ReactNode] = js.undefined
  
  var expandText: js.UndefOr[ReactNode] = js.undefined
  
  var selectAllText: js.UndefOr[ReactNode] = js.undefined
}
object CollapseText {
  
  @scala.inline
  def apply(): CollapseText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollapseText]
  }
  
  @scala.inline
  implicit class CollapseTextMutableBuilder[Self <: CollapseText] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollapseText(value: ReactNode): Self = StObject.set(x, "collapseText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapseTextUndefined: Self = StObject.set(x, "collapseText", js.undefined)
    
    @scala.inline
    def setExpandText(value: ReactNode): Self = StObject.set(x, "expandText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandTextUndefined: Self = StObject.set(x, "expandText", js.undefined)
    
    @scala.inline
    def setSelectAllText(value: ReactNode): Self = StObject.set(x, "selectAllText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectAllTextUndefined: Self = StObject.set(x, "selectAllText", js.undefined)
  }
}
