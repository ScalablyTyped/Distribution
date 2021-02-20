package typings.atom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreserveFolds extends StObject {
  
  var preserveFolds: js.UndefOr[Boolean] = js.native
  
  var reversed: js.UndefOr[Boolean] = js.native
}
object PreserveFolds {
  
  @scala.inline
  def apply(): PreserveFolds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreserveFolds]
  }
  
  @scala.inline
  implicit class PreserveFoldsMutableBuilder[Self <: PreserveFolds] (val x: Self) extends AnyVal {
    
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
