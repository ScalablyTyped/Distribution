package typings.awsSdk.clientsIvsrealtimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateStageRequest extends StObject {
  
  /**
    * Optional name that can be specified for the stage being created.
    */
  var name: js.UndefOr[StageName] = js.undefined
  
  /**
    * Array of participant token configuration objects to attach to the new stage.
    */
  var participantTokenConfigurations: js.UndefOr[ParticipantTokenConfigurations] = js.undefined
  
  /**
    * Tags attached to the resource. Array of maps, each of the form string:string (key:value). See Tagging AWS Resources for details, including restrictions that apply to tags and "Tag naming limits and requirements"; Amazon IVS has no constraints on tags beyond what is documented there. 
    */
  var tags: js.UndefOr[Tags] = js.undefined
}
object CreateStageRequest {
  
  inline def apply(): CreateStageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateStageRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateStageRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: StageName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParticipantTokenConfigurations(value: ParticipantTokenConfigurations): Self = StObject.set(x, "participantTokenConfigurations", value.asInstanceOf[js.Any])
    
    inline def setParticipantTokenConfigurationsUndefined: Self = StObject.set(x, "participantTokenConfigurations", js.undefined)
    
    inline def setParticipantTokenConfigurationsVarargs(value: ParticipantTokenConfiguration*): Self = StObject.set(x, "participantTokenConfigurations", js.Array(value*))
    
    inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
