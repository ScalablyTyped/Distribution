package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateApplicationRequest extends StObject {
  
  /**
    * The ARN of the app block.
    */
  var AppBlockArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The attributes to delete for an application.
    */
  var AttributesToDelete: js.UndefOr[ApplicationAttributes] = js.undefined
  
  /**
    * The description of the application.
    */
  var Description: js.UndefOr[typings.awsSdk.appstreamMod.Description] = js.undefined
  
  /**
    * The display name of the application. This name is visible to users in the application catalog.
    */
  var DisplayName: js.UndefOr[typings.awsSdk.appstreamMod.DisplayName] = js.undefined
  
  /**
    * The icon S3 location of the application.
    */
  var IconS3Location: js.UndefOr[S3Location] = js.undefined
  
  /**
    * The launch parameters of the application.
    */
  var LaunchParameters: js.UndefOr[String] = js.undefined
  
  /**
    * The launch path of the application.
    */
  var LaunchPath: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the application. This name is visible to users when display name is not specified.
    */
  var Name: typings.awsSdk.appstreamMod.Name
  
  /**
    * The working directory of the application.
    */
  var WorkingDirectory: js.UndefOr[String] = js.undefined
}
object UpdateApplicationRequest {
  
  inline def apply(Name: Name): UpdateApplicationRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApplicationRequest]
  }
  
  extension [Self <: UpdateApplicationRequest](x: Self) {
    
    inline def setAppBlockArn(value: Arn): Self = StObject.set(x, "AppBlockArn", value.asInstanceOf[js.Any])
    
    inline def setAppBlockArnUndefined: Self = StObject.set(x, "AppBlockArn", js.undefined)
    
    inline def setAttributesToDelete(value: ApplicationAttributes): Self = StObject.set(x, "AttributesToDelete", value.asInstanceOf[js.Any])
    
    inline def setAttributesToDeleteUndefined: Self = StObject.set(x, "AttributesToDelete", js.undefined)
    
    inline def setAttributesToDeleteVarargs(value: ApplicationAttribute*): Self = StObject.set(x, "AttributesToDelete", js.Array(value*))
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDisplayName(value: DisplayName): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    inline def setIconS3Location(value: S3Location): Self = StObject.set(x, "IconS3Location", value.asInstanceOf[js.Any])
    
    inline def setIconS3LocationUndefined: Self = StObject.set(x, "IconS3Location", js.undefined)
    
    inline def setLaunchParameters(value: String): Self = StObject.set(x, "LaunchParameters", value.asInstanceOf[js.Any])
    
    inline def setLaunchParametersUndefined: Self = StObject.set(x, "LaunchParameters", js.undefined)
    
    inline def setLaunchPath(value: String): Self = StObject.set(x, "LaunchPath", value.asInstanceOf[js.Any])
    
    inline def setLaunchPathUndefined: Self = StObject.set(x, "LaunchPath", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setWorkingDirectory(value: String): Self = StObject.set(x, "WorkingDirectory", value.asInstanceOf[js.Any])
    
    inline def setWorkingDirectoryUndefined: Self = StObject.set(x, "WorkingDirectory", js.undefined)
  }
}
