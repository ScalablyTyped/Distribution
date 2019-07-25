package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DevEndpointCustomLibraries extends js.Object {
  /**
    * The path to one or more Java .jar files in an S3 bucket that should be loaded in your DevEndpoint.  You can only use pure Java/Scala libraries with a DevEndpoint. 
    */
  var ExtraJarsS3Path: js.UndefOr[GenericString] = js.undefined
  /**
    * The paths to one or more Python libraries in an Amazon Simple Storage Service (Amazon S3) bucket that should be loaded in your DevEndpoint. Multiple values must be complete paths separated by a comma.  You can only use pure Python libraries with a DevEndpoint. Libraries that rely on C extensions, such as the pandas Python data analysis library, are not currently supported. 
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

