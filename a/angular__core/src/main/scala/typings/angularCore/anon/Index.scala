package typings.angularCore.anon

import typings.angularCore.mod.Injector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Index extends StObject {
  
  var index: js.UndefOr[Double] = js.undefined
  
  var injector: js.UndefOr[Injector] = js.undefined
}
object Index {
  
  inline def apply(): Index = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Index]
  }
  
  extension [Self <: Index](x: Self) {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setInjector(value: Injector): Self = StObject.set(x, "injector", value.asInstanceOf[js.Any])
    
    inline def setInjectorUndefined: Self = StObject.set(x, "injector", js.undefined)
  }
}
