package typings.antDesignCssinjs

import typings.antDesignCssinjs.esHooksUseStyleRegisterMod.CSSObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTransformersInterfaceMod {
  
  trait Transformer extends StObject {
    
    var visit: js.UndefOr[js.Function1[/* cssObj */ CSSObject, CSSObject]] = js.undefined
  }
  object Transformer {
    
    inline def apply(): Transformer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Transformer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Transformer] (val x: Self) extends AnyVal {
      
      inline def setVisit(value: /* cssObj */ CSSObject => CSSObject): Self = StObject.set(x, "visit", js.Any.fromFunction1(value))
      
      inline def setVisitUndefined: Self = StObject.set(x, "visit", js.undefined)
    }
  }
}
