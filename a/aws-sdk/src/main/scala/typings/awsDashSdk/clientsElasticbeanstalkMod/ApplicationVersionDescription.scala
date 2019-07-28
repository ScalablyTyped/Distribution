package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationVersionDescription extends js.Object {
  /**
    * The name of the application to which the application version belongs.
    */
  var ApplicationName: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.ApplicationName] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the application version.
    */
  var ApplicationVersionArn: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.ApplicationVersionArn] = js.undefined
  /**
    * Reference to the artifact from the AWS CodeBuild build.
    */
  var BuildArn: js.UndefOr[String] = js.undefined
  /**
    * The creation date of the application version.
    */
  var DateCreated: js.UndefOr[CreationDate] = js.undefined
  /**
    * The last modified date of the application version.
    */
  var DateUpdated: js.UndefOr[UpdateDate] = js.undefined
  /**
    * The description of the application version.
    */
  var Description: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.Description] = js.undefined
  /**
    * If the version's source code was retrieved from AWS CodeCommit, the location of the source code for the application version.
    */
  var SourceBuildInformation: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.SourceBuildInformation] = js.undefined
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
  var VersionLabel: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.VersionLabel] = js.undefined
}

object ApplicationVersionDescription {
  @scala.inline
  def apply(
    ApplicationName: ApplicationName = null,
    ApplicationVersionArn: ApplicationVersionArn = null,
    BuildArn: String = null,
    DateCreated: CreationDate = null,
    DateUpdated: UpdateDate = null,
    Description: Description = null,
    SourceBuildInformation: SourceBuildInformation = null,
    SourceBundle: S3Location = null,
    Status: ApplicationVersionStatus = null,
    VersionLabel: VersionLabel = null
  ): ApplicationVersionDescription = {
    val __obj = js.Dynamic.literal()
    if (ApplicationName != null) __obj.updateDynamic("ApplicationName")(ApplicationName)
    if (ApplicationVersionArn != null) __obj.updateDynamic("ApplicationVersionArn")(ApplicationVersionArn)
    if (BuildArn != null) __obj.updateDynamic("BuildArn")(BuildArn)
    if (DateCreated != null) __obj.updateDynamic("DateCreated")(DateCreated)
    if (DateUpdated != null) __obj.updateDynamic("DateUpdated")(DateUpdated)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (SourceBuildInformation != null) __obj.updateDynamic("SourceBuildInformation")(SourceBuildInformation)
    if (SourceBundle != null) __obj.updateDynamic("SourceBundle")(SourceBundle)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (VersionLabel != null) __obj.updateDynamic("VersionLabel")(VersionLabel)
    __obj.asInstanceOf[ApplicationVersionDescription]
  }
}

