package typings.amapJsSdk.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tip extends StObject {
  
  var adcode: String = js.native
  
  var district: String = js.native
  
  var name: String = js.native
}
object Tip {
  
  @scala.inline
  def apply(adcode: String, district: String, name: String): Tip = {
    val __obj = js.Dynamic.literal(adcode = adcode.asInstanceOf[js.Any], district = district.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tip]
  }
  
  @scala.inline
  implicit class TipMutableBuilder[Self <: Tip] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdcode(value: String): Self = StObject.set(x, "adcode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistrict(value: String): Self = StObject.set(x, "district", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
