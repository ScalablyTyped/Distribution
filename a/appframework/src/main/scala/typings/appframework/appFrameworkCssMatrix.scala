package typings.appframework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait appFrameworkCssMatrix extends StObject {
  
  var a: Double
  
  var b: Double
  
  var c: Double
  
  var d: Double
  
  var e: Double
  
  var f: Double
}
object appFrameworkCssMatrix {
  
  inline def apply(a: Double, b: Double, c: Double, d: Double, e: Double, f: Double): appFrameworkCssMatrix = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], c = c.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], e = e.asInstanceOf[js.Any], f = f.asInstanceOf[js.Any])
    __obj.asInstanceOf[appFrameworkCssMatrix]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: appFrameworkCssMatrix] (val x: Self) extends AnyVal {
    
    inline def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    inline def setC(value: Double): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setD(value: Double): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setE(value: Double): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
    
    inline def setF(value: Double): Self = StObject.set(x, "f", value.asInstanceOf[js.Any])
  }
}
