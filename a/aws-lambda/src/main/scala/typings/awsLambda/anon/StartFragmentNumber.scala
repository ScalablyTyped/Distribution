package typings.awsLambda.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartFragmentNumber extends StObject {
  
  var StartFragmentNumber: js.UndefOr[String] = js.undefined
  
  var StartTimestamp: js.UndefOr[String] = js.undefined
  
  var StreamARN: js.UndefOr[String] = js.undefined
}
object StartFragmentNumber {
  
  inline def apply(): StartFragmentNumber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartFragmentNumber]
  }
  
  extension [Self <: StartFragmentNumber](x: Self) {
    
    inline def setStartFragmentNumber(value: String): Self = StObject.set(x, "StartFragmentNumber", value.asInstanceOf[js.Any])
    
    inline def setStartFragmentNumberUndefined: Self = StObject.set(x, "StartFragmentNumber", js.undefined)
    
    inline def setStartTimestamp(value: String): Self = StObject.set(x, "StartTimestamp", value.asInstanceOf[js.Any])
    
    inline def setStartTimestampUndefined: Self = StObject.set(x, "StartTimestamp", js.undefined)
    
    inline def setStreamARN(value: String): Self = StObject.set(x, "StreamARN", value.asInstanceOf[js.Any])
    
    inline def setStreamARNUndefined: Self = StObject.set(x, "StreamARN", js.undefined)
  }
}
