package typings.apolloUploadClient.mod

import typings.extractFiles.mod.ReactNativeFileOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-upload-client", "ReactNativeFile")
@js.native
class ReactNativeFile protected ()
  extends typings.extractFiles.mod.ReactNativeFile {
  def this(options: ReactNativeFileOptions) = this()
}

/* static members */
@JSImport("apollo-upload-client", "ReactNativeFile")
@js.native
object ReactNativeFile extends js.Object {
  def list(files: js.Array[ReactNativeFileOptions]): js.Array[typings.extractFiles.mod.ReactNativeFile] = js.native
}

