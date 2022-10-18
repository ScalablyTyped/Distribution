package typings.atom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `27` extends StObject {
  
  var includeNonWordCharacters: js.UndefOr[Boolean] = js.undefined
}
object `27` {
  
  inline def apply(): `27` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`27`]
  }
  
  extension [Self <: `27`](x: Self) {
    
    inline def setIncludeNonWordCharacters(value: Boolean): Self = StObject.set(x, "includeNonWordCharacters", value.asInstanceOf[js.Any])
    
    inline def setIncludeNonWordCharactersUndefined: Self = StObject.set(x, "includeNonWordCharacters", js.undefined)
  }
}
