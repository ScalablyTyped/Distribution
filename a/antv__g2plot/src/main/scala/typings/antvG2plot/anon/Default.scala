package typings.antvG2plot.anon

import typings.antvGBase.libTypesMod.ShapeAttrs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Default extends StObject {
  
  var default: js.UndefOr[ShapeAttrs] = js.undefined
}
object Default {
  
  inline def apply(): Default = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Default]
  }
  
  extension [Self <: Default](x: Self) {
    
    inline def setDefault(value: ShapeAttrs): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
  }
}
