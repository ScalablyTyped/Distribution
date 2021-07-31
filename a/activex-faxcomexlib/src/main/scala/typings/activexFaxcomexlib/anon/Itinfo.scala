package typings.activexFaxcomexlib.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Itinfo extends StObject {
  
  val itinfo: Double
  
  val lcid: Double
  
  var pptinfo: Unit
}
object Itinfo {
  
  @scala.inline
  def apply(itinfo: Double, lcid: Double, pptinfo: Unit): Itinfo = {
    val __obj = js.Dynamic.literal(itinfo = itinfo.asInstanceOf[js.Any], lcid = lcid.asInstanceOf[js.Any], pptinfo = pptinfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Itinfo]
  }
  
  @scala.inline
  implicit class ItinfoMutableBuilder[Self <: Itinfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItinfo(value: Double): Self = StObject.set(x, "itinfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLcid(value: Double): Self = StObject.set(x, "lcid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPptinfo(value: Unit): Self = StObject.set(x, "pptinfo", value.asInstanceOf[js.Any])
  }
}
