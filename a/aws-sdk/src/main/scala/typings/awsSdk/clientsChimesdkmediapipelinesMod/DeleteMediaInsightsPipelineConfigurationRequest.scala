package typings.awsSdk.clientsChimesdkmediapipelinesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteMediaInsightsPipelineConfigurationRequest extends StObject {
  
  /**
    * The unique identifier of the resource to be deleted. Valid values include the name and ARN of the media insights pipeline configuration.
    */
  var Identifier: NonEmptyString
}
object DeleteMediaInsightsPipelineConfigurationRequest {
  
  inline def apply(Identifier: NonEmptyString): DeleteMediaInsightsPipelineConfigurationRequest = {
    val __obj = js.Dynamic.literal(Identifier = Identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMediaInsightsPipelineConfigurationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteMediaInsightsPipelineConfigurationRequest] (val x: Self) extends AnyVal {
    
    inline def setIdentifier(value: NonEmptyString): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
  }
}
