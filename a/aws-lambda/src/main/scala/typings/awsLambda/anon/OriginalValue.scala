package typings.awsLambda.anon

import typings.awsLambda.lexMod.LexSlotResolution
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OriginalValue extends StObject {
  
  var originalValue: String = js.native
  
  // The following line only works in TypeScript Version: 3.0, The array should have at least 1 and no more than 5 items
  // resolutions: [LexSlotResolution, LexSlotResolution?, LexSlotResolution?, LexSlotResolution?, LexSlotResolution?];
  var resolutions: js.Array[LexSlotResolution] = js.native
}
object OriginalValue {
  
  @scala.inline
  def apply(originalValue: String, resolutions: js.Array[LexSlotResolution]): OriginalValue = {
    val __obj = js.Dynamic.literal(originalValue = originalValue.asInstanceOf[js.Any], resolutions = resolutions.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginalValue]
  }
  
  @scala.inline
  implicit class OriginalValueMutableBuilder[Self <: OriginalValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOriginalValue(value: String): Self = StObject.set(x, "originalValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolutions(value: js.Array[LexSlotResolution]): Self = StObject.set(x, "resolutions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolutionsVarargs(value: LexSlotResolution*): Self = StObject.set(x, "resolutions", js.Array(value :_*))
  }
}
