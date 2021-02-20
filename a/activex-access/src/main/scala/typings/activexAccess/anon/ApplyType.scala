package typings.activexAccess.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplyType extends StObject {
  
  var ApplyType: Double = js.native
  
  var Cancel: Double = js.native
}
object ApplyType {
  
  @scala.inline
  def apply(ApplyType: Double, Cancel: Double): ApplyType = {
    val __obj = js.Dynamic.literal(ApplyType = ApplyType.asInstanceOf[js.Any], Cancel = Cancel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplyType]
  }
  
  @scala.inline
  implicit class ApplyTypeMutableBuilder[Self <: ApplyType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplyType(value: Double): Self = StObject.set(x, "ApplyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancel(value: Double): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
  }
}
