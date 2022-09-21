package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAppBlockRequest extends StObject {
  
  /**
    * The description of the app block.
    */
  var Description: js.UndefOr[typings.awsSdk.appstreamMod.Description] = js.undefined
  
  /**
    * The display name of the app block. This is not displayed to the user.
    */
  var DisplayName: js.UndefOr[typings.awsSdk.appstreamMod.DisplayName] = js.undefined
  
  /**
    * The name of the app block.
    */
  var Name: typings.awsSdk.appstreamMod.Name
  
  /**
    * The setup script details of the app block.
    */
  var SetupScriptDetails: ScriptDetails
  
  /**
    * The source S3 location of the app block.
    */
  var SourceS3Location: S3Location
  
  /**
    * The tags assigned to the app block.
    */
  var Tags: js.UndefOr[typings.awsSdk.appstreamMod.Tags] = js.undefined
}
object CreateAppBlockRequest {
  
  inline def apply(Name: Name, SetupScriptDetails: ScriptDetails, SourceS3Location: S3Location): CreateAppBlockRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], SetupScriptDetails = SetupScriptDetails.asInstanceOf[js.Any], SourceS3Location = SourceS3Location.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAppBlockRequest]
  }
  
  extension [Self <: CreateAppBlockRequest](x: Self) {
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDisplayName(value: DisplayName): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setSetupScriptDetails(value: ScriptDetails): Self = StObject.set(x, "SetupScriptDetails", value.asInstanceOf[js.Any])
    
    inline def setSourceS3Location(value: S3Location): Self = StObject.set(x, "SourceS3Location", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
