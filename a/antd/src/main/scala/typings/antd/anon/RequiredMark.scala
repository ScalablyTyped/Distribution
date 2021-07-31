package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequiredMark extends StObject {
  
  var requiredMark: js.UndefOr[typings.antd.formFormMod.RequiredMark] = js.undefined
}
object RequiredMark {
  
  @scala.inline
  def apply(): RequiredMark = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequiredMark]
  }
  
  @scala.inline
  implicit class RequiredMarkMutableBuilder[Self <: RequiredMark] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequiredMark(value: typings.antd.formFormMod.RequiredMark): Self = StObject.set(x, "requiredMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredMarkUndefined: Self = StObject.set(x, "requiredMark", js.undefined)
  }
}
