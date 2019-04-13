package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DevEndpointCustomLibraries extends js.Object {
  /**
    * Path to one or more Java Jars in an S3 bucket that should be loaded in your DevEndpoint. Please note that only pure Java/Scala libraries can currently be used on a DevEndpoint.
    */
  var ExtraJarsS3Path: js.UndefOr[GenericString] = js.undefined
  /**
    * Path(s) to one or more Python libraries in an S3 bucket that should be loaded in your DevEndpoint. Multiple values must be complete paths separated by a comma. Please note that only pure Python libraries can currently be used on a DevEndpoint. Libraries that rely on C extensions, such as the pandas Python data analysis library, are not yet supported.
    */
  var ExtraPythonLibsS3Path: js.UndefOr[GenericString] = js.undefined
}

object DevEndpointCustomLibraries {
  @scala.inline
  def apply(ExtraJarsS3Path: GenericString = null, ExtraPythonLibsS3Path: GenericString = null): DevEndpointCustomLibraries = {
    val __obj = js.Dynamic.literal()
    if (ExtraJarsS3Path != null) __obj.updateDynamic("ExtraJarsS3Path")(ExtraJarsS3Path)
    if (ExtraPythonLibsS3Path != null) __obj.updateDynamic("ExtraPythonLibsS3Path")(ExtraPythonLibsS3Path)
    __obj.asInstanceOf[DevEndpointCustomLibraries]
  }
}

