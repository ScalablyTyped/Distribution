package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelInstanceRefreshAnswer extends StObject {
  
  /**
    * The instance refresh ID.
    */
  var InstanceRefreshId: js.UndefOr[XmlStringMaxLen255] = js.native
}
object CancelInstanceRefreshAnswer {
  
  @scala.inline
  def apply(): CancelInstanceRefreshAnswer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelInstanceRefreshAnswer]
  }
  
  @scala.inline
  implicit class CancelInstanceRefreshAnswerMutableBuilder[Self <: CancelInstanceRefreshAnswer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceRefreshId(value: XmlStringMaxLen255): Self = StObject.set(x, "InstanceRefreshId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceRefreshIdUndefined: Self = StObject.set(x, "InstanceRefreshId", js.undefined)
  }
}
