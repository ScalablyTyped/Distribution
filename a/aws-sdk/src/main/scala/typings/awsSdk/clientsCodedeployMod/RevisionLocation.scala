package typings.awsSdk.clientsCodedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RevisionLocation extends StObject {
  
  /**
    *  The content of an AppSpec file for an Lambda or Amazon ECS deployment. The content is formatted as JSON or YAML and stored as a RawString. 
    */
  var appSpecContent: js.UndefOr[AppSpecContent] = js.undefined
  
  /**
    * Information about the location of application artifacts stored in GitHub.
    */
  var gitHubLocation: js.UndefOr[GitHubLocation] = js.undefined
  
  /**
    * The type of application revision:   S3: An application revision stored in Amazon S3.   GitHub: An application revision stored in GitHub (EC2/On-premises deployments only).   String: A YAML-formatted or JSON-formatted string (Lambda deployments only).   AppSpecContent: An AppSpecContent object that contains the contents of an AppSpec file for an Lambda or Amazon ECS deployment. The content is formatted as JSON or YAML stored as a RawString.  
    */
  var revisionType: js.UndefOr[RevisionLocationType] = js.undefined
  
  /**
    * Information about the location of a revision stored in Amazon S3. 
    */
  var s3Location: js.UndefOr[S3Location] = js.undefined
  
  /**
    * Information about the location of an Lambda deployment revision stored as a RawString.
    */
  var string: js.UndefOr[RawString] = js.undefined
}
object RevisionLocation {
  
  inline def apply(): RevisionLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevisionLocation]
  }
  
  extension [Self <: RevisionLocation](x: Self) {
    
    inline def setAppSpecContent(value: AppSpecContent): Self = StObject.set(x, "appSpecContent", value.asInstanceOf[js.Any])
    
    inline def setAppSpecContentUndefined: Self = StObject.set(x, "appSpecContent", js.undefined)
    
    inline def setGitHubLocation(value: GitHubLocation): Self = StObject.set(x, "gitHubLocation", value.asInstanceOf[js.Any])
    
    inline def setGitHubLocationUndefined: Self = StObject.set(x, "gitHubLocation", js.undefined)
    
    inline def setRevisionType(value: RevisionLocationType): Self = StObject.set(x, "revisionType", value.asInstanceOf[js.Any])
    
    inline def setRevisionTypeUndefined: Self = StObject.set(x, "revisionType", js.undefined)
    
    inline def setS3Location(value: S3Location): Self = StObject.set(x, "s3Location", value.asInstanceOf[js.Any])
    
    inline def setS3LocationUndefined: Self = StObject.set(x, "s3Location", js.undefined)
    
    inline def setString(value: RawString): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    
    inline def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
  }
}
