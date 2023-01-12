package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateStreamProcessorRequest extends StObject {
  
  /**
    *  Shows whether you are sharing data with Rekognition to improve model performance. You can choose this option at the account level or on a per-stream basis. Note that if you opt out at the account level this setting is ignored on individual streams. 
    */
  var DataSharingPreferenceForUpdate: js.UndefOr[StreamProcessorDataSharingPreference] = js.undefined
  
  /**
    *  Name of the stream processor that you want to update. 
    */
  var Name: StreamProcessorName
  
  /**
    *  A list of parameters you want to delete from the stream processor. 
    */
  var ParametersToDelete: js.UndefOr[StreamProcessorParametersToDelete] = js.undefined
  
  /**
    *  Specifies locations in the frames where Amazon Rekognition checks for objects or people. This is an optional parameter for label detection stream processors. 
    */
  var RegionsOfInterestForUpdate: js.UndefOr[RegionsOfInterest] = js.undefined
  
  /**
    *  The stream processor settings that you want to update. Label detection settings can be updated to detect different labels with a different minimum confidence. 
    */
  var SettingsForUpdate: js.UndefOr[StreamProcessorSettingsForUpdate] = js.undefined
}
object UpdateStreamProcessorRequest {
  
  inline def apply(Name: StreamProcessorName): UpdateStreamProcessorRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateStreamProcessorRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateStreamProcessorRequest] (val x: Self) extends AnyVal {
    
    inline def setDataSharingPreferenceForUpdate(value: StreamProcessorDataSharingPreference): Self = StObject.set(x, "DataSharingPreferenceForUpdate", value.asInstanceOf[js.Any])
    
    inline def setDataSharingPreferenceForUpdateUndefined: Self = StObject.set(x, "DataSharingPreferenceForUpdate", js.undefined)
    
    inline def setName(value: StreamProcessorName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setParametersToDelete(value: StreamProcessorParametersToDelete): Self = StObject.set(x, "ParametersToDelete", value.asInstanceOf[js.Any])
    
    inline def setParametersToDeleteUndefined: Self = StObject.set(x, "ParametersToDelete", js.undefined)
    
    inline def setParametersToDeleteVarargs(value: StreamProcessorParameterToDelete*): Self = StObject.set(x, "ParametersToDelete", js.Array(value*))
    
    inline def setRegionsOfInterestForUpdate(value: RegionsOfInterest): Self = StObject.set(x, "RegionsOfInterestForUpdate", value.asInstanceOf[js.Any])
    
    inline def setRegionsOfInterestForUpdateUndefined: Self = StObject.set(x, "RegionsOfInterestForUpdate", js.undefined)
    
    inline def setRegionsOfInterestForUpdateVarargs(value: RegionOfInterest*): Self = StObject.set(x, "RegionsOfInterestForUpdate", js.Array(value*))
    
    inline def setSettingsForUpdate(value: StreamProcessorSettingsForUpdate): Self = StObject.set(x, "SettingsForUpdate", value.asInstanceOf[js.Any])
    
    inline def setSettingsForUpdateUndefined: Self = StObject.set(x, "SettingsForUpdate", js.undefined)
  }
}
