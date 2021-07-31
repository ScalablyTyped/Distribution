package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Affix extends StObject {
  
  var affix: Boolean
  
  var showInkInFixed: Boolean
}
object Affix {
  
  @scala.inline
  def apply(affix: Boolean, showInkInFixed: Boolean): Affix = {
    val __obj = js.Dynamic.literal(affix = affix.asInstanceOf[js.Any], showInkInFixed = showInkInFixed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Affix]
  }
  
  @scala.inline
  implicit class AffixMutableBuilder[Self <: Affix] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAffix(value: Boolean): Self = StObject.set(x, "affix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowInkInFixed(value: Boolean): Self = StObject.set(x, "showInkInFixed", value.asInstanceOf[js.Any])
  }
}
