package typings.awsDashSdk.clientsServerlessapplicationrepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VersionSummary extends js.Object {
  /**
    * The application Amazon Resource Name (ARN).
    */
  var ApplicationId: __string
  /**
    * The date and time this resource was created.
    */
  var CreationTime: __string
  /**
    * The semantic version of the application:
    https://semver.org/
    
    */
  var SemanticVersion: __string
  /**
    * A link to a public repository for the source code of your application, for example the URL of a specific GitHub commit.
    */
  var SourceCodeUrl: js.UndefOr[__string] = js.undefined
}

object VersionSummary {
  @scala.inline
  def apply(
    ApplicationId: __string,
    CreationTime: __string,
    SemanticVersion: __string,
    SourceCodeUrl: __string = null
  ): VersionSummary = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId, CreationTime = CreationTime, SemanticVersion = SemanticVersion)
    if (SourceCodeUrl != null) __obj.updateDynamic("SourceCodeUrl")(SourceCodeUrl)
    __obj.asInstanceOf[VersionSummary]
  }
}

