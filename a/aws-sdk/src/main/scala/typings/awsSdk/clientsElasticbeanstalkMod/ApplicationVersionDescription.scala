package typings.awsSdk.clientsElasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationVersionDescription extends StObject {
  
  /**
    * The name of the application to which the application version belongs.
    */
  var ApplicationName: js.UndefOr[typings.awsSdk.clientsElasticbeanstalkMod.ApplicationName] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the application version.
    */
  var ApplicationVersionArn: js.UndefOr[typings.awsSdk.clientsElasticbeanstalkMod.ApplicationVersionArn] = js.undefined
  
  /**
    * Reference to the artifact from the AWS CodeBuild build.
    */
  var BuildArn: js.UndefOr[String] = js.undefined
  
  /**
    * The creation date of the application version.
    */
  var DateCreated: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The last modified date of the application version.
    */
  var DateUpdated: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description of the application version.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsElasticbeanstalkMod.Description] = js.undefined
  
  /**
    * If the version's source code was retrieved from AWS CodeCommit, the location of the source code for the application version.
    */
  var SourceBuildInformation: js.UndefOr[typings.awsSdk.clientsElasticbeanstalkMod.SourceBuildInformation] = js.undefined
  
  /**
    * The storage location of the application version's source bundle in Amazon S3.
    */
  var SourceBundle: js.UndefOr[S3Location] = js.undefined
  
  /**
    * The processing status of the application version. Reflects the state of the application version during its creation. Many of the values are only applicable if you specified True for the Process parameter of the CreateApplicationVersion action. The following list describes the possible values.    Unprocessed – Application version wasn't pre-processed or validated. Elastic Beanstalk will validate configuration files during deployment of the application version to an environment.    Processing – Elastic Beanstalk is currently processing the application version.    Building – Application version is currently undergoing an AWS CodeBuild build.    Processed – Elastic Beanstalk was successfully pre-processed and validated.    Failed – Either the AWS CodeBuild build failed or configuration files didn't pass validation. This application version isn't usable.  
    */
  var Status: js.UndefOr[ApplicationVersionStatus] = js.undefined
  
  /**
    * A unique identifier for the application version.
    */
  var VersionLabel: js.UndefOr[typings.awsSdk.clientsElasticbeanstalkMod.VersionLabel] = js.undefined
}
object ApplicationVersionDescription {
  
  inline def apply(): ApplicationVersionDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationVersionDescription]
  }
  
  extension [Self <: ApplicationVersionDescription](x: Self) {
    
    inline def setApplicationName(value: ApplicationName): Self = StObject.set(x, "ApplicationName", value.asInstanceOf[js.Any])
    
    inline def setApplicationNameUndefined: Self = StObject.set(x, "ApplicationName", js.undefined)
    
    inline def setApplicationVersionArn(value: ApplicationVersionArn): Self = StObject.set(x, "ApplicationVersionArn", value.asInstanceOf[js.Any])
    
    inline def setApplicationVersionArnUndefined: Self = StObject.set(x, "ApplicationVersionArn", js.undefined)
    
    inline def setBuildArn(value: String): Self = StObject.set(x, "BuildArn", value.asInstanceOf[js.Any])
    
    inline def setBuildArnUndefined: Self = StObject.set(x, "BuildArn", js.undefined)
    
    inline def setDateCreated(value: js.Date): Self = StObject.set(x, "DateCreated", value.asInstanceOf[js.Any])
    
    inline def setDateCreatedUndefined: Self = StObject.set(x, "DateCreated", js.undefined)
    
    inline def setDateUpdated(value: js.Date): Self = StObject.set(x, "DateUpdated", value.asInstanceOf[js.Any])
    
    inline def setDateUpdatedUndefined: Self = StObject.set(x, "DateUpdated", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setSourceBuildInformation(value: SourceBuildInformation): Self = StObject.set(x, "SourceBuildInformation", value.asInstanceOf[js.Any])
    
    inline def setSourceBuildInformationUndefined: Self = StObject.set(x, "SourceBuildInformation", js.undefined)
    
    inline def setSourceBundle(value: S3Location): Self = StObject.set(x, "SourceBundle", value.asInstanceOf[js.Any])
    
    inline def setSourceBundleUndefined: Self = StObject.set(x, "SourceBundle", js.undefined)
    
    inline def setStatus(value: ApplicationVersionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setVersionLabel(value: VersionLabel): Self = StObject.set(x, "VersionLabel", value.asInstanceOf[js.Any])
    
    inline def setVersionLabelUndefined: Self = StObject.set(x, "VersionLabel", js.undefined)
  }
}
