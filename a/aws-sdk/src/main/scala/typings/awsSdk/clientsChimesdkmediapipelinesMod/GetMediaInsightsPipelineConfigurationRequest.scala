package typings.awsSdk.clientsChimesdkmediapipelinesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMediaInsightsPipelineConfigurationRequest extends StObject {
  
  /**
    * The unique identifier of the requested resource. Valid values include the name and ARN of the media insights pipeline configuration.
    */
  var Identifier: NonEmptyString
}
object GetMediaInsightsPipelineConfigurationRequest {
  
  inline def apply(Identifier: NonEmptyString): GetMediaInsightsPipelineConfigurationRequest = {
    val __obj = js.Dynamic.literal(Identifier = Identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMediaInsightsPipelineConfigurationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetMediaInsightsPipelineConfigurationRequest] (val x: Self) extends AnyVal {
    
    inline def setIdentifier(value: NonEmptyString): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
  }
}
