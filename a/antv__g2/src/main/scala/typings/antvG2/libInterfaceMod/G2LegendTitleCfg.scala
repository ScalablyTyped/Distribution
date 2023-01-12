package typings.antvG2.libInterfaceMod

import typings.antvComponent.libTypesMod.LegendTitleCfg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait G2LegendTitleCfg
  extends StObject
     with LegendTitleCfg {
  
  /**
    * @title title 文本显示内容
    */
  var text: js.UndefOr[String] = js.undefined
}
object G2LegendTitleCfg {
  
  inline def apply(): G2LegendTitleCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[G2LegendTitleCfg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: G2LegendTitleCfg] (val x: Self) extends AnyVal {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
