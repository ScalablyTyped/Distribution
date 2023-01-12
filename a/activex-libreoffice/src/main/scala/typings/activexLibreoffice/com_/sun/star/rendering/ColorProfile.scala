package typings.activexLibreoffice.com_.sun.star.rendering

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorProfile extends StObject {
  
  var dummy: Double
}
object ColorProfile {
  
  inline def apply(dummy: Double): ColorProfile = {
    val __obj = js.Dynamic.literal(dummy = dummy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorProfile]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColorProfile] (val x: Self) extends AnyVal {
    
    inline def setDummy(value: Double): Self = StObject.set(x, "dummy", value.asInstanceOf[js.Any])
  }
}
