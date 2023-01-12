package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaddingTopNumber extends StObject {
  
  var paddingTop: Double
}
object PaddingTopNumber {
  
  inline def apply(paddingTop: Double): PaddingTopNumber = {
    val __obj = js.Dynamic.literal(paddingTop = paddingTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaddingTopNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PaddingTopNumber] (val x: Self) extends AnyVal {
    
    inline def setPaddingTop(value: Double): Self = StObject.set(x, "paddingTop", value.asInstanceOf[js.Any])
  }
}
