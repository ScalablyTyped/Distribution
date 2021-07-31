package typings.atom.anon

import typings.atom.atomStrings.backward
import typings.atom.atomStrings.closest
import typings.atom.atomStrings.forward
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClipDirection extends StObject {
  
  var clipDirection: js.UndefOr[backward | forward | closest] = js.undefined
  
  var reversed: js.UndefOr[Boolean] = js.undefined
}
object ClipDirection {
  
  @scala.inline
  def apply(): ClipDirection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClipDirection]
  }
  
  @scala.inline
  implicit class ClipDirectionMutableBuilder[Self <: ClipDirection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClipDirection(value: backward | forward | closest): Self = StObject.set(x, "clipDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClipDirectionUndefined: Self = StObject.set(x, "clipDirection", js.undefined)
    
    @scala.inline
    def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
  }
}
