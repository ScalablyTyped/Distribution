package typings.atom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExclusiveReversed extends StObject {
  
  var exclusive: js.UndefOr[Boolean] = js.undefined
  
  var reversed: js.UndefOr[Boolean] = js.undefined
}
object ExclusiveReversed {
  
  inline def apply(): ExclusiveReversed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExclusiveReversed]
  }
  
  extension [Self <: ExclusiveReversed](x: Self) {
    
    inline def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
    
    inline def setExclusiveUndefined: Self = StObject.set(x, "exclusive", js.undefined)
    
    inline def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
    
    inline def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
  }
}
