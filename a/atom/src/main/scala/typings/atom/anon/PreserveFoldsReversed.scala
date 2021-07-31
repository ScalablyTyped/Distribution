package typings.atom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreserveFoldsReversed extends StObject {
  
  var autoscroll: js.UndefOr[Boolean] = js.undefined
  
  var preserveFolds: js.UndefOr[Boolean] = js.undefined
  
  var reversed: js.UndefOr[Boolean] = js.undefined
}
object PreserveFoldsReversed {
  
  @scala.inline
  def apply(): PreserveFoldsReversed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreserveFoldsReversed]
  }
  
  @scala.inline
  implicit class PreserveFoldsReversedMutableBuilder[Self <: PreserveFoldsReversed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoscroll(value: Boolean): Self = StObject.set(x, "autoscroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoscrollUndefined: Self = StObject.set(x, "autoscroll", js.undefined)
    
    @scala.inline
    def setPreserveFolds(value: Boolean): Self = StObject.set(x, "preserveFolds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveFoldsUndefined: Self = StObject.set(x, "preserveFolds", js.undefined)
    
    @scala.inline
    def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
  }
}
