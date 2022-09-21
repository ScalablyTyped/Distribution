package typings.antd.anon

import typings.rcSelect.optionMod.OptionFC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Option extends StObject {
  
  var Option: OptionFC
}
object Option {
  
  inline def apply(Option: OptionFC): Option = {
    val __obj = js.Dynamic.literal(Option = Option.asInstanceOf[js.Any])
    __obj.asInstanceOf[Option]
  }
  
  extension [Self <: Option](x: Self) {
    
    inline def setOption(value: OptionFC): Self = StObject.set(x, "Option", value.asInstanceOf[js.Any])
  }
}
