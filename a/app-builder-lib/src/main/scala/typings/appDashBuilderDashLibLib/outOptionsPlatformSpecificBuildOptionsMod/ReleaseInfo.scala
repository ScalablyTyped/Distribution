package typings
package appDashBuilderDashLibLib.outOptionsPlatformSpecificBuildOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ReleaseInfo extends js.Object {
  /**
       * The release date.
       */
  var releaseDate: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The release name.
       */
  var releaseName: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
       * The release notes.
       */
  var releaseNotes: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
       * The path to release notes file. Defaults to `release-notes-${platform}.md` (where `platform` it is current platform — `mac`, `linux` or `windows`) or `release-notes.md` in the [build resources](#MetadataDirectories-buildResources).
       */
  var releaseNotesFile: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

