package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Margin extends StObject {
  
  var margin: Double
}
object Margin {
  
  inline def apply(margin: Double): Margin = {
    val __obj = js.Dynamic.literal(margin = margin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Margin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Margin] (val x: Self) extends AnyVal {
    
    inline def setMargin(value: Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
  }
}
