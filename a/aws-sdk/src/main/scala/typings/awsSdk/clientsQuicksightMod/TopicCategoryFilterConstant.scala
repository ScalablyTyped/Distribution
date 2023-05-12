package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicCategoryFilterConstant extends StObject {
  
  /**
    * A collective constant used in a category filter. This element is used to specify a list of values for the constant.
    */
  var CollectiveConstant: js.UndefOr[typings.awsSdk.clientsQuicksightMod.CollectiveConstant] = js.undefined
  
  /**
    * The type of category filter constant. This element is used to specify whether a constant is a singular or collective. Valid values are SINGULAR and COLLECTIVE.
    */
  var ConstantType: js.UndefOr[typings.awsSdk.clientsQuicksightMod.ConstantType] = js.undefined
  
  /**
    * A singular constant used in a category filter. This element is used to specify a single value for the constant.
    */
  var SingularConstant: js.UndefOr[LimitedString] = js.undefined
}
object TopicCategoryFilterConstant {
  
  inline def apply(): TopicCategoryFilterConstant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopicCategoryFilterConstant]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TopicCategoryFilterConstant] (val x: Self) extends AnyVal {
    
    inline def setCollectiveConstant(value: CollectiveConstant): Self = StObject.set(x, "CollectiveConstant", value.asInstanceOf[js.Any])
    
    inline def setCollectiveConstantUndefined: Self = StObject.set(x, "CollectiveConstant", js.undefined)
    
    inline def setConstantType(value: ConstantType): Self = StObject.set(x, "ConstantType", value.asInstanceOf[js.Any])
    
    inline def setConstantTypeUndefined: Self = StObject.set(x, "ConstantType", js.undefined)
    
    inline def setSingularConstant(value: LimitedString): Self = StObject.set(x, "SingularConstant", value.asInstanceOf[js.Any])
    
    inline def setSingularConstantUndefined: Self = StObject.set(x, "SingularConstant", js.undefined)
  }
}
