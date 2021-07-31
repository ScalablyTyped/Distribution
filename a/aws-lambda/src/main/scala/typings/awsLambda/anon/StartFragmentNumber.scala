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
  
  @scala.inline
  def apply(): StartFragmentNumber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartFragmentNumber]
  }
  
  @scala.inline
  implicit class StartFragmentNumberMutableBuilder[Self <: StartFragmentNumber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStartFragmentNumber(value: String): Self = StObject.set(x, "StartFragmentNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartFragmentNumberUndefined: Self = StObject.set(x, "StartFragmentNumber", js.undefined)
    
    @scala.inline
    def setStartTimestamp(value: String): Self = StObject.set(x, "StartTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimestampUndefined: Self = StObject.set(x, "StartTimestamp", js.undefined)
    
    @scala.inline
    def setStreamARN(value: String): Self = StObject.set(x, "StreamARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamARNUndefined: Self = StObject.set(x, "StreamARN", js.undefined)
  }
}
