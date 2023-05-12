package typings.adraffyEnsNormalize

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Nf extends StObject {
    
    var nf: js.UndefOr[Boolean] = js.undefined
  }
  object Nf {
    
    inline def apply(): Nf = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Nf]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Nf] (val x: Self) extends AnyVal {
      
      inline def setNf(value: Boolean): Self = StObject.set(x, "nf", value.asInstanceOf[js.Any])
      
      inline def setNfUndefined: Self = StObject.set(x, "nf", js.undefined)
    }
  }
}
