package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * contains information needed to checkin a document.
  *
  * The checkin command is always called on the target private working copy document.
  */
trait CheckinArgument extends js.Object {
  /** Tells whether to create a new major or minor version during the checkin. */
  var MajorVersion: scala.Boolean
  /** contains the Mime-Type of the content to check-in as it may be different from the original one. */
  var MimeType: java.lang.String
  /**
    * contains the title of the transferred object, if it is different from the original one.
    *
    * If this field is filled, for example, a file will be renamed while it is being checked in.
    */
  var NewTitle: java.lang.String
  /** contains the URL of the source of the action (e.g. the URL of the temporary file to checkin). */
  var SourceURL: java.lang.String
  /** contains the URL of the private working copy to checkin. */
  var TargetURL: java.lang.String
  /** Contains the version comment to set during the checkin. */
  var VersionComment: java.lang.String
}

object CheckinArgument {
  @scala.inline
  def apply(
    MajorVersion: scala.Boolean,
    MimeType: java.lang.String,
    NewTitle: java.lang.String,
    SourceURL: java.lang.String,
    TargetURL: java.lang.String,
    VersionComment: java.lang.String
  ): CheckinArgument = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("MajorVersion")(MajorVersion)
    __obj.updateDynamic("MimeType")(MimeType)
    __obj.updateDynamic("NewTitle")(NewTitle)
    __obj.updateDynamic("SourceURL")(SourceURL)
    __obj.updateDynamic("TargetURL")(TargetURL)
    __obj.updateDynamic("VersionComment")(VersionComment)
    __obj.asInstanceOf[CheckinArgument]
  }
}

