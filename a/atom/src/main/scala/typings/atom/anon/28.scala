package typings.atom.anon

import typings.atom.atomStrings.backward
import typings.atom.atomStrings.closest
import typings.atom.atomStrings.forward
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `28` extends StObject {
  
  var clipDirection: js.UndefOr[backward | forward | closest] = js.native
}
object `28` {
  
  @scala.inline
  def apply(): `28` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`28`]
  }
  
  @scala.inline
  implicit class `28MutableBuilder`[Self <: `28`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClipDirection(value: backward | forward | closest): Self = StObject.set(x, "clipDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClipDirectionUndefined: Self = StObject.set(x, "clipDirection", js.undefined)
  }
}
