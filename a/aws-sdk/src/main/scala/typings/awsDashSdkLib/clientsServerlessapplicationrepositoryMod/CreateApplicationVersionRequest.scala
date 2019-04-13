package typings
package awsDashSdkLib.clientsServerlessapplicationrepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateApplicationVersionRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the application.
    */
  var ApplicationId: __string
  /**
    * The semantic version of the new version.
    */
  var SemanticVersion: __string
  /**
    * A link to the S3 object that contains the ZIP archive of the source code for this version of your application.Maximum size 50 MB
    */
  var SourceCodeArchiveUrl: js.UndefOr[__string] = js.undefined
  /**
    * A link to a public repository for the source code of your application, for example the URL of a specific GitHub commit.
    */
  var SourceCodeUrl: js.UndefOr[__string] = js.undefined
  /**
    * The raw packaged AWS SAM template of your application.
    */
  var TemplateBody: js.UndefOr[__string] = js.undefined
  /**
    * A link to the packaged AWS SAM template of your application.
    */
  var TemplateUrl: js.UndefOr[__string] = js.undefined
}

object CreateApplicationVersionRequest {
  @scala.inline
  def apply(
    ApplicationId: __string,
    SemanticVersion: __string,
    SourceCodeArchiveUrl: __string = null,
    SourceCodeUrl: __string = null,
    TemplateBody: __string = null,
    TemplateUrl: __string = null
  ): CreateApplicationVersionRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId, SemanticVersion = SemanticVersion)
    if (SourceCodeArchiveUrl != null) __obj.updateDynamic("SourceCodeArchiveUrl")(SourceCodeArchiveUrl)
    if (SourceCodeUrl != null) __obj.updateDynamic("SourceCodeUrl")(SourceCodeUrl)
    if (TemplateBody != null) __obj.updateDynamic("TemplateBody")(TemplateBody)
    if (TemplateUrl != null) __obj.updateDynamic("TemplateUrl")(TemplateUrl)
    __obj.asInstanceOf[CreateApplicationVersionRequest]
  }
}

