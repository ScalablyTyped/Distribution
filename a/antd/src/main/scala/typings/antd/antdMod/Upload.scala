package typings.antd.antdMod

import typings.antd.Anon_AcceptAction
import typings.antd.Anon_FileListArray
import typings.antd.libUploadDraggerMod.DraggerProps
import typings.antd.libUploadInterfaceMod.UploadProps
import typings.antd.libUploadMod.default
import typings.react.reactMod.FC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd", "Upload")
@js.native
class Upload protected () extends default {
  def this(props: UploadProps) = this()
}

/* static members */
@JSImport("antd", "Upload")
@js.native
object Upload extends js.Object {
  var Dragger: FC[DraggerProps] = js.native
  var defaultProps: Anon_AcceptAction = js.native
  def getDerivedStateFromProps(nextProps: UploadProps): Anon_FileListArray | Null = js.native
}

