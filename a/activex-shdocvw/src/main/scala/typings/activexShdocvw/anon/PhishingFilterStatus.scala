package typings.activexShdocvw.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhishingFilterStatus extends StObject {
  
  val PhishingFilterStatus: Double
}
object PhishingFilterStatus {
  
  inline def apply(PhishingFilterStatus: Double): PhishingFilterStatus = {
    val __obj = js.Dynamic.literal(PhishingFilterStatus = PhishingFilterStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhishingFilterStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PhishingFilterStatus] (val x: Self) extends AnyVal {
    
    inline def setPhishingFilterStatus(value: Double): Self = StObject.set(x, "PhishingFilterStatus", value.asInstanceOf[js.Any])
  }
}
