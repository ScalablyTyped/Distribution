package typings.awsSdk.clientsCodepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionType extends StObject {
  
  /**
    * The configuration properties for the action type.
    */
  var actionConfigurationProperties: js.UndefOr[ActionConfigurationPropertyList] = js.undefined
  
  /**
    * Represents information about an action type.
    */
  var id: ActionTypeId
  
  /**
    * The details of the input artifact for the action, such as its commit ID.
    */
  var inputArtifactDetails: ArtifactDetails
  
  /**
    * The details of the output artifact of the action, such as its commit ID.
    */
  var outputArtifactDetails: ArtifactDetails
  
  /**
    * The settings for the action type.
    */
  var settings: js.UndefOr[ActionTypeSettings] = js.undefined
}
object ActionType {
  
  inline def apply(id: ActionTypeId, inputArtifactDetails: ArtifactDetails, outputArtifactDetails: ArtifactDetails): ActionType = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], inputArtifactDetails = inputArtifactDetails.asInstanceOf[js.Any], outputArtifactDetails = outputArtifactDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionType]
  }
  
  extension [Self <: ActionType](x: Self) {
    
    inline def setActionConfigurationProperties(value: ActionConfigurationPropertyList): Self = StObject.set(x, "actionConfigurationProperties", value.asInstanceOf[js.Any])
    
    inline def setActionConfigurationPropertiesUndefined: Self = StObject.set(x, "actionConfigurationProperties", js.undefined)
    
    inline def setActionConfigurationPropertiesVarargs(value: ActionConfigurationProperty*): Self = StObject.set(x, "actionConfigurationProperties", js.Array(value*))
    
    inline def setId(value: ActionTypeId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInputArtifactDetails(value: ArtifactDetails): Self = StObject.set(x, "inputArtifactDetails", value.asInstanceOf[js.Any])
    
    inline def setOutputArtifactDetails(value: ArtifactDetails): Self = StObject.set(x, "outputArtifactDetails", value.asInstanceOf[js.Any])
    
    inline def setSettings(value: ActionTypeSettings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
  }
}
