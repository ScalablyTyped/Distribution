package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MinHeightNumber extends StObject {
  
  var minHeight: Double
}
object MinHeightNumber {
  
  inline def apply(minHeight: Double): MinHeightNumber = {
    val __obj = js.Dynamic.literal(minHeight = minHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinHeightNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MinHeightNumber] (val x: Self) extends AnyVal {
    
    inline def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
  }
}
