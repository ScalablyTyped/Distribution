package typings.antdMobileRn.anon

import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AntLocale extends StObject {
  
  var antLocale: Requireable[js.Object]
}
object AntLocale {
  
  inline def apply(antLocale: Requireable[js.Object]): AntLocale = {
    val __obj = js.Dynamic.literal(antLocale = antLocale.asInstanceOf[js.Any])
    __obj.asInstanceOf[AntLocale]
  }
  
  extension [Self <: AntLocale](x: Self) {
    
    inline def setAntLocale(value: Requireable[js.Object]): Self = StObject.set(x, "antLocale", value.asInstanceOf[js.Any])
  }
}
