package typings.amapJsSdk.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TMC extends StObject {
  
  var distance: Double = js.native
  
  var lcode: String = js.native
  
  var status: String = js.native
}
object TMC {
  
  @scala.inline
  def apply(distance: Double, lcode: String, status: String): TMC = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], lcode = lcode.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[TMC]
  }
  
  @scala.inline
  implicit class TMCMutableBuilder[Self <: TMC] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLcode(value: String): Self = StObject.set(x, "lcode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
