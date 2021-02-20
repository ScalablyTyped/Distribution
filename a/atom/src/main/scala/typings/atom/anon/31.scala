package typings.atom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `31` extends StObject {
  
  var includeNonWordCharacters: js.UndefOr[Boolean] = js.native
}
object `31` {
  
  @scala.inline
  def apply(): `31` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`31`]
  }
  
  @scala.inline
  implicit class `31MutableBuilder`[Self <: `31`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncludeNonWordCharacters(value: Boolean): Self = StObject.set(x, "includeNonWordCharacters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeNonWordCharactersUndefined: Self = StObject.set(x, "includeNonWordCharacters", js.undefined)
  }
}
