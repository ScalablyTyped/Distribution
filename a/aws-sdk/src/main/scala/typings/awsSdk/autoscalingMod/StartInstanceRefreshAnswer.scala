package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartInstanceRefreshAnswer extends StObject {
  
  /**
    * A unique ID for tracking the progress of the request.
    */
  var InstanceRefreshId: js.UndefOr[XmlStringMaxLen255] = js.undefined
}
object StartInstanceRefreshAnswer {
  
  @scala.inline
  def apply(): StartInstanceRefreshAnswer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartInstanceRefreshAnswer]
  }
  
  @scala.inline
  implicit class StartInstanceRefreshAnswerMutableBuilder[Self <: StartInstanceRefreshAnswer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceRefreshId(value: XmlStringMaxLen255): Self = StObject.set(x, "InstanceRefreshId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceRefreshIdUndefined: Self = StObject.set(x, "InstanceRefreshId", js.undefined)
  }
}
