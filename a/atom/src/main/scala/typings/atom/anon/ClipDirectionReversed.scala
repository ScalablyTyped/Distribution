package typings.atom.anon

import typings.atom.atomStrings.backward
import typings.atom.atomStrings.closest
import typings.atom.atomStrings.forward
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClipDirectionReversed extends StObject {
  
  var clipDirection: js.UndefOr[backward | forward | closest] = js.undefined
  
  var reversed: js.UndefOr[Boolean] = js.undefined
}
object ClipDirectionReversed {
  
  inline def apply(): ClipDirectionReversed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClipDirectionReversed]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClipDirectionReversed] (val x: Self) extends AnyVal {
    
    inline def setClipDirection(value: backward | forward | closest): Self = StObject.set(x, "clipDirection", value.asInstanceOf[js.Any])
    
    inline def setClipDirectionUndefined: Self = StObject.set(x, "clipDirection", js.undefined)
    
    inline def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
    
    inline def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
  }
}
