package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestGridSessionArtifact extends js.Object {
  /**
    * The file name of the artifact.
    */
  var filename: js.UndefOr[String] = js.native
  /**
    * The kind of artifact.
    */
  var `type`: js.UndefOr[TestGridSessionArtifactType] = js.native
  /**
    * A semi-stable URL to the content of the object.
    */
  var url: js.UndefOr[String] = js.native
}

object TestGridSessionArtifact {
  @scala.inline
  def apply(filename: String = null, `type`: TestGridSessionArtifactType = null, url: String = null): TestGridSessionArtifact = {
    val __obj = js.Dynamic.literal()
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestGridSessionArtifact]
  }
}

