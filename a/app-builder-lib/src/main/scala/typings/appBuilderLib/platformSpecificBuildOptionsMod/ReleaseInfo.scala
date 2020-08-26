package typings.appBuilderLib.platformSpecificBuildOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReleaseInfo extends js.Object {
  /**
    * The release date.
    */
  var releaseDate: js.UndefOr[String] = js.native
  /**
    * The release name.
    */
  var releaseName: js.UndefOr[String | Null] = js.native
  /**
    * The release notes.
    */
  var releaseNotes: js.UndefOr[String | Null] = js.native
  /**
    * The path to release notes file. Defaults to `release-notes-${platform}.md` (where `platform` it is current platform — `mac`, `linux` or `windows`) or `release-notes.md` in the [build resources](#MetadataDirectories-buildResources).
    */
  var releaseNotesFile: js.UndefOr[String | Null] = js.native
}

object ReleaseInfo {
  @scala.inline
  def apply(): ReleaseInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReleaseInfo]
  }
  @scala.inline
  implicit class ReleaseInfoOps[Self <: ReleaseInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setReleaseDate(value: String): Self = this.set("releaseDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReleaseDate: Self = this.set("releaseDate", js.undefined)
    @scala.inline
    def setReleaseName(value: String): Self = this.set("releaseName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReleaseName: Self = this.set("releaseName", js.undefined)
    @scala.inline
    def setReleaseNameNull: Self = this.set("releaseName", null)
    @scala.inline
    def setReleaseNotes(value: String): Self = this.set("releaseNotes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReleaseNotes: Self = this.set("releaseNotes", js.undefined)
    @scala.inline
    def setReleaseNotesNull: Self = this.set("releaseNotes", null)
    @scala.inline
    def setReleaseNotesFile(value: String): Self = this.set("releaseNotesFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReleaseNotesFile: Self = this.set("releaseNotesFile", js.undefined)
    @scala.inline
    def setReleaseNotesFileNull: Self = this.set("releaseNotesFile", null)
  }
  
}

