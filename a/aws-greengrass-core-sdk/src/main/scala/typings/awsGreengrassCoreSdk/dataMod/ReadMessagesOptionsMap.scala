package typings.awsGreengrassCoreSdk.dataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadMessagesOptionsMap extends StObject {
  
  var desiredStartSequenceNumber: js.UndefOr[Double] = js.undefined
  
  var maxMessageCount: js.UndefOr[Double] = js.undefined
  
  var minMessageCount: js.UndefOr[Double] = js.undefined
  
  var readTimeoutMillis: js.UndefOr[Double] = js.undefined
}
object ReadMessagesOptionsMap {
  
  inline def apply(): ReadMessagesOptionsMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadMessagesOptionsMap]
  }
  
  extension [Self <: ReadMessagesOptionsMap](x: Self) {
    
    inline def setDesiredStartSequenceNumber(value: Double): Self = StObject.set(x, "desiredStartSequenceNumber", value.asInstanceOf[js.Any])
    
    inline def setDesiredStartSequenceNumberUndefined: Self = StObject.set(x, "desiredStartSequenceNumber", js.undefined)
    
    inline def setMaxMessageCount(value: Double): Self = StObject.set(x, "maxMessageCount", value.asInstanceOf[js.Any])
    
    inline def setMaxMessageCountUndefined: Self = StObject.set(x, "maxMessageCount", js.undefined)
    
    inline def setMinMessageCount(value: Double): Self = StObject.set(x, "minMessageCount", value.asInstanceOf[js.Any])
    
    inline def setMinMessageCountUndefined: Self = StObject.set(x, "minMessageCount", js.undefined)
    
    inline def setReadTimeoutMillis(value: Double): Self = StObject.set(x, "readTimeoutMillis", value.asInstanceOf[js.Any])
    
    inline def setReadTimeoutMillisUndefined: Self = StObject.set(x, "readTimeoutMillis", js.undefined)
  }
}
