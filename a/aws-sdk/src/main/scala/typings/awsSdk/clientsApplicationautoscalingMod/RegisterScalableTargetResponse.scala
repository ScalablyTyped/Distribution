package typings.awsSdk.clientsApplicationautoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterScalableTargetResponse extends StObject {
  
  /**
    * The ARN of the scalable target.
    */
  var ScalableTargetARN: js.UndefOr[XmlString] = js.undefined
}
object RegisterScalableTargetResponse {
  
  inline def apply(): RegisterScalableTargetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterScalableTargetResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegisterScalableTargetResponse] (val x: Self) extends AnyVal {
    
    inline def setScalableTargetARN(value: XmlString): Self = StObject.set(x, "ScalableTargetARN", value.asInstanceOf[js.Any])
    
    inline def setScalableTargetARNUndefined: Self = StObject.set(x, "ScalableTargetARN", js.undefined)
  }
}
