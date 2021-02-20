package typings.atom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoscrollPreserveFolds extends StObject {
  
  var autoscroll: js.UndefOr[Boolean] = js.native
  
  var preserveFolds: js.UndefOr[Boolean] = js.native
}
object AutoscrollPreserveFolds {
  
  @scala.inline
  def apply(): AutoscrollPreserveFolds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoscrollPreserveFolds]
  }
  
  @scala.inline
  implicit class AutoscrollPreserveFoldsMutableBuilder[Self <: AutoscrollPreserveFolds] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoscroll(value: Boolean): Self = StObject.set(x, "autoscroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoscrollUndefined: Self = StObject.set(x, "autoscroll", js.undefined)
    
    @scala.inline
    def setPreserveFolds(value: Boolean): Self = StObject.set(x, "preserveFolds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveFoldsUndefined: Self = StObject.set(x, "preserveFolds", js.undefined)
  }
}
