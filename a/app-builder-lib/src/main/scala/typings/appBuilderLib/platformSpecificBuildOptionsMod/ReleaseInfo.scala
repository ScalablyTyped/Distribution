package typings.appBuilderLib.platformSpecificBuildOptionsMod

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
    releaseName: js.UndefOr[Null | String] = js.undefined,
    releaseNotes: js.UndefOr[Null | String] = js.undefined,
    releaseNotesFile: js.UndefOr[Null | String] = js.undefined
  ): ReleaseInfo = {
    val __obj = js.Dynamic.literal()
    if (releaseDate != null) __obj.updateDynamic("releaseDate")(releaseDate.asInstanceOf[js.Any])
    if (!js.isUndefined(releaseName)) __obj.updateDynamic("releaseName")(releaseName.asInstanceOf[js.Any])
    if (!js.isUndefined(releaseNotes)) __obj.updateDynamic("releaseNotes")(releaseNotes.asInstanceOf[js.Any])
    if (!js.isUndefined(releaseNotesFile)) __obj.updateDynamic("releaseNotesFile")(releaseNotesFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseInfo]
  }
}

