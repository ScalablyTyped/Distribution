package typings.atvlegacycontentkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Timed metadata object. This basically seems to be the AVMetadataItem from AVFoundation.
  *
  * This definitions leaves out some properties and may also have inaccurate types as it is not trivial to test.
  *
  * See https://developer.apple.com/documentation/avfoundation/avmetadataitem for more information.
  */
// tslint:disable-next-line:strict-export-declare-modifiers
trait AVMetadataItem extends StObject {
  
  var dataValue: js.UndefOr[String] = js.undefined
  
  var dateValue: js.UndefOr[js.Date] = js.undefined
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var extraAttributes: Any
  
  var key: js.UndefOr[String] = js.undefined
  
  var numberValue: js.UndefOr[Double] = js.undefined
  
  var startDate: js.UndefOr[js.Date] = js.undefined
  
  var stringValue: js.UndefOr[String] = js.undefined
  
  var time: js.UndefOr[Double] = js.undefined
  
  var value: Any
}
object AVMetadataItem {
  
  inline def apply(extraAttributes: Any, value: Any): AVMetadataItem = {
    val __obj = js.Dynamic.literal(extraAttributes = extraAttributes.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AVMetadataItem]
  }
  
  extension [Self <: AVMetadataItem](x: Self) {
    
    inline def setDataValue(value: String): Self = StObject.set(x, "dataValue", value.asInstanceOf[js.Any])
    
    inline def setDataValueUndefined: Self = StObject.set(x, "dataValue", js.undefined)
    
    inline def setDateValue(value: js.Date): Self = StObject.set(x, "dateValue", value.asInstanceOf[js.Any])
    
    inline def setDateValueUndefined: Self = StObject.set(x, "dateValue", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setExtraAttributes(value: Any): Self = StObject.set(x, "extraAttributes", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setNumberValue(value: Double): Self = StObject.set(x, "numberValue", value.asInstanceOf[js.Any])
    
    inline def setNumberValueUndefined: Self = StObject.set(x, "numberValue", js.undefined)
    
    inline def setStartDate(value: js.Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    
    inline def setStringValue(value: String): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
    
    inline def setStringValueUndefined: Self = StObject.set(x, "stringValue", js.undefined)
    
    inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
