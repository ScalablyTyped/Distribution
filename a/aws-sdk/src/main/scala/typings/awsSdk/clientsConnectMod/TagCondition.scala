package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagCondition extends StObject {
  
  /**
    * The tag key in the tag condition.
    */
  var TagKey: js.UndefOr[String] = js.undefined
  
  /**
    * The tag value in the tag condition.
    */
  var TagValue: js.UndefOr[String] = js.undefined
}
object TagCondition {
  
  inline def apply(): TagCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagCondition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TagCondition] (val x: Self) extends AnyVal {
    
    inline def setTagKey(value: String): Self = StObject.set(x, "TagKey", value.asInstanceOf[js.Any])
    
    inline def setTagKeyUndefined: Self = StObject.set(x, "TagKey", js.undefined)
    
    inline def setTagValue(value: String): Self = StObject.set(x, "TagValue", value.asInstanceOf[js.Any])
    
    inline def setTagValueUndefined: Self = StObject.set(x, "TagValue", js.undefined)
  }
}
