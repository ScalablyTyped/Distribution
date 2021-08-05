package typings.atom.anon

import typings.atom.atomStrings.backward
import typings.atom.atomStrings.closest
import typings.atom.atomStrings.forward
import typings.atom.atomStrings.inside
import typings.atom.atomStrings.never
import typings.atom.atomStrings.overlap
import typings.atom.atomStrings.surround
import typings.atom.atomStrings.touch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Invalidate extends StObject {
  
  var clipDirection: js.UndefOr[backward | forward | closest] = js.undefined
  
  var exclusive: js.UndefOr[Boolean] = js.undefined
  
  var invalidate: js.UndefOr[never | surround | overlap | inside | touch] = js.undefined
}
object Invalidate {
  
  inline def apply(): Invalidate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Invalidate]
  }
  
  extension [Self <: Invalidate](x: Self) {
    
    inline def setClipDirection(value: backward | forward | closest): Self = StObject.set(x, "clipDirection", value.asInstanceOf[js.Any])
    
    inline def setClipDirectionUndefined: Self = StObject.set(x, "clipDirection", js.undefined)
    
    inline def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
    
    inline def setExclusiveUndefined: Self = StObject.set(x, "exclusive", js.undefined)
    
    inline def setInvalidate(value: never | surround | overlap | inside | touch): Self = StObject.set(x, "invalidate", value.asInstanceOf[js.Any])
    
    inline def setInvalidateUndefined: Self = StObject.set(x, "invalidate", js.undefined)
  }
}
