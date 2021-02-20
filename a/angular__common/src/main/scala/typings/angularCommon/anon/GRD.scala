package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GRD extends StObject {
  
  var GRD: js.Array[String] = js.native
  
  var JPY: js.Array[String] = js.native
  
  var THB: js.Array[String] = js.native
}
object GRD {
  
  @scala.inline
  def apply(GRD: js.Array[String], JPY: js.Array[String], THB: js.Array[String]): GRD = {
    val __obj = js.Dynamic.literal(GRD = GRD.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any])
    __obj.asInstanceOf[GRD]
  }
  
  @scala.inline
  implicit class GRDMutableBuilder[Self <: GRD] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGRD(value: js.Array[String]): Self = StObject.set(x, "GRD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGRDVarargs(value: String*): Self = StObject.set(x, "GRD", js.Array(value :_*))
    
    @scala.inline
    def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
    
    @scala.inline
    def setTHB(value: js.Array[String]): Self = StObject.set(x, "THB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTHBVarargs(value: String*): Self = StObject.set(x, "THB", js.Array(value :_*))
  }
}
