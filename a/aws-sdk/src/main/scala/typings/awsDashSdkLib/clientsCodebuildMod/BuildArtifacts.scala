package typings
package awsDashSdkLib.clientsCodebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildArtifacts extends js.Object {
  /**
    *  An identifier for this artifact definition. 
    */
  var artifactIdentifier: js.UndefOr[String] = js.undefined
  /**
    *  Information that tells you if encryption for build artifacts is disabled. 
    */
  var encryptionDisabled: js.UndefOr[WrapperBoolean] = js.undefined
  /**
    * Information about the location of the build artifacts.
    */
  var location: js.UndefOr[String] = js.undefined
  /**
    * The MD5 hash of the build artifact. You can use this hash along with a checksum tool to confirm file integrity and authenticity.  This value is available only if the build project's packaging value is set to ZIP. 
    */
  var md5sum: js.UndefOr[String] = js.undefined
  /**
    *  If this flag is set, a name specified in the build spec file overrides the artifact name. The name specified in a build spec file is calculated at build time and uses the Shell Command Language. For example, you can append a date and time to your artifact name so that it is always unique. 
    */
  var overrideArtifactName: js.UndefOr[WrapperBoolean] = js.undefined
  /**
    * The SHA-256 hash of the build artifact. You can use this hash along with a checksum tool to confirm file integrity and authenticity.  This value is available only if the build project's packaging value is set to ZIP. 
    */
  var sha256sum: js.UndefOr[String] = js.undefined
}

object BuildArtifacts {
  @scala.inline
  def apply(
    artifactIdentifier: String = null,
    encryptionDisabled: js.UndefOr[WrapperBoolean] = js.undefined,
    location: String = null,
    md5sum: String = null,
    overrideArtifactName: js.UndefOr[WrapperBoolean] = js.undefined,
    sha256sum: String = null
  ): BuildArtifacts = {
    val __obj = js.Dynamic.literal()
    if (artifactIdentifier != null) __obj.updateDynamic("artifactIdentifier")(artifactIdentifier)
    if (!js.isUndefined(encryptionDisabled)) __obj.updateDynamic("encryptionDisabled")(encryptionDisabled)
    if (location != null) __obj.updateDynamic("location")(location)
    if (md5sum != null) __obj.updateDynamic("md5sum")(md5sum)
    if (!js.isUndefined(overrideArtifactName)) __obj.updateDynamic("overrideArtifactName")(overrideArtifactName)
    if (sha256sum != null) __obj.updateDynamic("sha256sum")(sha256sum)
    __obj.asInstanceOf[BuildArtifacts]
  }
}

