package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Affix extends StObject {
  
  var affix: Boolean
  
  var showInkInFixed: Boolean
}
object Affix {
  
  inline def apply(affix: Boolean, showInkInFixed: Boolean): Affix = {
    val __obj = js.Dynamic.literal(affix = affix.asInstanceOf[js.Any], showInkInFixed = showInkInFixed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Affix]
  }
  
  extension [Self <: Affix](x: Self) {
    
    inline def setAffix(value: Boolean): Self = StObject.set(x, "affix", value.asInstanceOf[js.Any])
    
    inline def setShowInkInFixed(value: Boolean): Self = StObject.set(x, "showInkInFixed", value.asInstanceOf[js.Any])
  }
}
