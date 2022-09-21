package typings.antvG2plot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@antv/g2plot.@antv/g2plot/lib/types.Options, 'theme'> */
trait PickOptionstheme extends StObject {
  
  var theme: js.UndefOr[String | js.Object] = js.undefined
}
object PickOptionstheme {
  
  inline def apply(): PickOptionstheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickOptionstheme]
  }
  
  extension [Self <: PickOptionstheme](x: Self) {
    
    inline def setTheme(value: String | js.Object): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
