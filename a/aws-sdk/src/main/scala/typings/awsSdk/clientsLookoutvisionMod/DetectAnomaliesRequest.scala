package typings.awsSdk.clientsLookoutvisionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectAnomaliesRequest extends StObject {
  
  /**
    * The unencrypted image bytes that you want to analyze. 
    */
  var Body: Stream
  
  /**
    * The type of the image passed in Body. Valid values are image/png (PNG format images) and image/jpeg (JPG format images). 
    */
  var ContentType: typings.awsSdk.clientsLookoutvisionMod.ContentType
  
  /**
    * The version of the model that you want to use.
    */
  var ModelVersion: typings.awsSdk.clientsLookoutvisionMod.ModelVersion
  
  /**
    * The name of the project that contains the model version that you want to use.
    */
  var ProjectName: typings.awsSdk.clientsLookoutvisionMod.ProjectName
}
object DetectAnomaliesRequest {
  
  inline def apply(Body: Stream, ContentType: ContentType, ModelVersion: ModelVersion, ProjectName: ProjectName): DetectAnomaliesRequest = {
    val __obj = js.Dynamic.literal(Body = Body.asInstanceOf[js.Any], ContentType = ContentType.asInstanceOf[js.Any], ModelVersion = ModelVersion.asInstanceOf[js.Any], ProjectName = ProjectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectAnomaliesRequest]
  }
  
  extension [Self <: DetectAnomaliesRequest](x: Self) {
    
    inline def setBody(value: Stream): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
    
    inline def setContentType(value: ContentType): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
    
    inline def setModelVersion(value: ModelVersion): Self = StObject.set(x, "ModelVersion", value.asInstanceOf[js.Any])
    
    inline def setProjectName(value: ProjectName): Self = StObject.set(x, "ProjectName", value.asInstanceOf[js.Any])
  }
}
