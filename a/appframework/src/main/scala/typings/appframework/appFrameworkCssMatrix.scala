package typings.appframework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait appFrameworkCssMatrix extends StObject {
  
  var a: Double = js.native
  
  var b: Double = js.native
  
  var c: Double = js.native
  
  var d: Double = js.native
  
  var e: Double = js.native
  
  var f: Double = js.native
}
object appFrameworkCssMatrix {
  
  @scala.inline
  def apply(a: Double, b: Double, c: Double, d: Double, e: Double, f: Double): appFrameworkCssMatrix = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], c = c.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], e = e.asInstanceOf[js.Any], f = f.asInstanceOf[js.Any])
    __obj.asInstanceOf[appFrameworkCssMatrix]
  }
  
  @scala.inline
  implicit class appFrameworkCssMatrixMutableBuilder[Self <: appFrameworkCssMatrix] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setC(value: Double): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setD(value: Double): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setE(value: Double): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setF(value: Double): Self = StObject.set(x, "f", value.asInstanceOf[js.Any])
  }
}
