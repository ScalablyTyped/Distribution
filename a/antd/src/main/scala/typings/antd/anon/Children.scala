package typings.antd.anon

import typings.antd.useFormMod.FormInstance
import typings.react.mod.ReactNode
import typings.react.mod.RefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Children[Values] extends StObject {
  
  var children: js.UndefOr[ReactNode] = js.native
  
  var ref: js.UndefOr[
    (js.Function1[/* instance */ FormInstance[Values] | Null, Unit]) | RefObject[FormInstance[Values]] | Null
  ] = js.native
}
object Children {
  
  @scala.inline
  def apply[Values](): Children[Values] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Children[Values]]
  }
  
  @scala.inline
  implicit class ChildrenMutableBuilder[Self <: Children[_], Values] (val x: Self with Children[Values]) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setRef(
      value: (js.Function1[/* instance */ FormInstance[Values] | Null, Unit]) | RefObject[FormInstance[Values]]
    ): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefFunction1(value: /* instance */ FormInstance[Values] | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefNull: Self = StObject.set(x, "ref", null)
    
    @scala.inline
    def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}
