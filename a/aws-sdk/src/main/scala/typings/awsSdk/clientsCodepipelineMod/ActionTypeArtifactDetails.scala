package typings.awsSdk.clientsCodepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionTypeArtifactDetails extends StObject {
  
  /**
    * The maximum number of artifacts that can be used with the actiontype. For example, you should specify a minimum and maximum of zero input artifacts for an action type with a category of source.
    */
  var maximumCount: MaximumActionTypeArtifactCount
  
  /**
    * The minimum number of artifacts that can be used with the action type. For example, you should specify a minimum and maximum of zero input artifacts for an action type with a category of source.
    */
  var minimumCount: MinimumActionTypeArtifactCount
}
object ActionTypeArtifactDetails {
  
  inline def apply(maximumCount: MaximumActionTypeArtifactCount, minimumCount: MinimumActionTypeArtifactCount): ActionTypeArtifactDetails = {
    val __obj = js.Dynamic.literal(maximumCount = maximumCount.asInstanceOf[js.Any], minimumCount = minimumCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionTypeArtifactDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActionTypeArtifactDetails] (val x: Self) extends AnyVal {
    
    inline def setMaximumCount(value: MaximumActionTypeArtifactCount): Self = StObject.set(x, "maximumCount", value.asInstanceOf[js.Any])
    
    inline def setMinimumCount(value: MinimumActionTypeArtifactCount): Self = StObject.set(x, "minimumCount", value.asInstanceOf[js.Any])
  }
}
