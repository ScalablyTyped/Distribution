package typings.awsSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CachePeriodInMinutes extends StObject {
  
  var Address: js.UndefOr[String] = js.native
  
  var CachePeriodInMinutes: js.UndefOr[Double] = js.native
}
object CachePeriodInMinutes {
  
  @scala.inline
  def apply(): CachePeriodInMinutes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CachePeriodInMinutes]
  }
  
  @scala.inline
  implicit class CachePeriodInMinutesMutableBuilder[Self <: CachePeriodInMinutes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "Address", js.undefined)
    
    @scala.inline
    def setCachePeriodInMinutes(value: Double): Self = StObject.set(x, "CachePeriodInMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCachePeriodInMinutesUndefined: Self = StObject.set(x, "CachePeriodInMinutes", js.undefined)
  }
}
