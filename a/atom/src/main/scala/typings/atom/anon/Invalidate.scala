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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Invalidate extends StObject {
  
  var clipDirection: js.UndefOr[backward | forward | closest] = js.native
  
  var exclusive: js.UndefOr[Boolean] = js.native
  
  var invalidate: js.UndefOr[never | surround | overlap | inside | touch] = js.native
}
object Invalidate {
  
  @scala.inline
  def apply(): Invalidate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Invalidate]
  }
  
  @scala.inline
  implicit class InvalidateMutableBuilder[Self <: Invalidate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClipDirection(value: backward | forward | closest): Self = StObject.set(x, "clipDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClipDirectionUndefined: Self = StObject.set(x, "clipDirection", js.undefined)
    
    @scala.inline
    def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclusiveUndefined: Self = StObject.set(x, "exclusive", js.undefined)
    
    @scala.inline
    def setInvalidate(value: never | surround | overlap | inside | touch): Self = StObject.set(x, "invalidate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidateUndefined: Self = StObject.set(x, "invalidate", js.undefined)
  }
}
