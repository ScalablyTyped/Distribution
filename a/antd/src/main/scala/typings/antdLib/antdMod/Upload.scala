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

/* static members */
@JSImport("antd", "Upload")
@js.native
object Upload extends js.Object {
  var Dragger: org.scalablytyped.runtime.Instantiable0[antdLib.libUploadDraggerMod.default] = js.native
  var defaultProps: antdLib.Anon_AcceptAction = js.native
  def getDerivedStateFromProps(nextProps: antdLib.libUploadInterfaceMod.UploadProps): antdLib.Anon_FileListArray | scala.Null = js.native
}

