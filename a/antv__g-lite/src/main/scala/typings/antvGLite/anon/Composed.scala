package typings.antvGLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Composed extends StObject {
  
  var composed: js.UndefOr[Boolean] = js.undefined
}
object Composed {
  
  inline def apply(): Composed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Composed]
  }
  
  extension [Self <: Composed](x: Self) {
    
    inline def setComposed(value: Boolean): Self = StObject.set(x, "composed", value.asInstanceOf[js.Any])
    
    inline def setComposedUndefined: Self = StObject.set(x, "composed", js.undefined)
  }
}
