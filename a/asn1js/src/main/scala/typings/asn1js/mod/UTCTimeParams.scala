package typings.asn1js.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UTCTimeParams
  extends StObject
     with LocalSimpleLocalSimpleStringValueBlockParams {
  
  var value: js.UndefOr[String] = js.undefined
  
  var valueDate: js.UndefOr[Date] = js.undefined
}
object UTCTimeParams {
  
  @scala.inline
  def apply(): UTCTimeParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UTCTimeParams]
  }
  
  @scala.inline
  implicit class UTCTimeParamsMutableBuilder[Self <: UTCTimeParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueDate(value: Date): Self = StObject.set(x, "valueDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueDateUndefined: Self = StObject.set(x, "valueDate", js.undefined)
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
