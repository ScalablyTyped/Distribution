package typings.appDashBuilderDashLib.outOptionsPlatformSpecificBuildOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseInfo extends js.Object {
  /**
    * The release date.
    */
  var releaseDate: js.UndefOr[String] = js.undefined
  /**
    * The release name.
    */
  var releaseName: js.UndefOr[String | Null] = js.undefined
  /**
    * The release notes.
    */
  var releaseNotes: js.UndefOr[String | Null] = js.undefined
  /**
    * The path to release notes file. Defaults to `release-notes-${platform}.md` (where `platform` it is current platform — `mac`, `linux` or `windows`) or `release-notes.md` in the [build resources](#MetadataDirectories-buildResources).
    */
  var releaseNotesFile: js.UndefOr[String | Null] = js.undefined
}

object ReleaseInfo {
  @scala.inline
  def apply(
    releaseDate: String = null,
    releaseName: String = null,
    releaseNotes: String = null,
    releaseNotesFile: String = null
  ): ReleaseInfo = {
    val __obj = js.Dynamic.literal()
    if (releaseDate != null) __obj.updateDynamic("releaseDate")(releaseDate)
    if (releaseName != null) __obj.updateDynamic("releaseName")(releaseName)
    if (releaseNotes != null) __obj.updateDynamic("releaseNotes")(releaseNotes)
    if (releaseNotesFile != null) __obj.updateDynamic("releaseNotesFile")(releaseNotesFile)
    __obj.asInstanceOf[ReleaseInfo]
  }
}

