package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicSingularFilterConstant extends StObject {
  
  /**
    * The type of the singular filter constant. Valid values for this structure are SINGULAR.
    */
  var ConstantType: js.UndefOr[typings.awsSdk.clientsQuicksightMod.ConstantType] = js.undefined
  
  /**
    * The value of the singular filter constant.
    */
  var SingularConstant: js.UndefOr[LimitedString] = js.undefined
}
object TopicSingularFilterConstant {
  
  inline def apply(): TopicSingularFilterConstant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopicSingularFilterConstant]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TopicSingularFilterConstant] (val x: Self) extends AnyVal {
    
    inline def setConstantType(value: ConstantType): Self = StObject.set(x, "ConstantType", value.asInstanceOf[js.Any])
    
    inline def setConstantTypeUndefined: Self = StObject.set(x, "ConstantType", js.undefined)
    
    inline def setSingularConstant(value: LimitedString): Self = StObject.set(x, "SingularConstant", value.asInstanceOf[js.Any])
    
    inline def setSingularConstantUndefined: Self = StObject.set(x, "SingularConstant", js.undefined)
  }
}
