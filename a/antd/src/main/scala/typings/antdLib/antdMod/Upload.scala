package typings
package antdLib.antdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd", "Upload")
@js.native
class Upload protected ()
  extends antdLib.libUploadMod.default {
  def this(props: antdLib.libUploadInterfaceMod.UploadProps) = this()
}

@JSImport("antd", "Upload")
@js.native
object Upload extends js.Object {
  var Dragger: ScalablyTyped.runtime.Instantiable0[antdLib.libUploadDraggerMod.default] = js.native
  var defaultProps: antdLib.Anon_BeforeUpload = js.native
  def getDerivedStateFromProps(nextProps: antdLib.libUploadInterfaceMod.UploadProps): antdLib.Anon_FileList | scala.Null = js.native
}

