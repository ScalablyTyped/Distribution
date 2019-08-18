package typings.antd.libUploadMod

import typings.antd.Anon_AcceptAction
import typings.antd.Anon_FileListArray
import typings.antd.libUploadDraggerMod.DraggerProps
import typings.antd.libUploadInterfaceMod.UploadProps
import typings.react.reactMod.FC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/upload", JSImport.Default)
@js.native
class default protected ()
  extends typings.antd.libUploadUploadMod.default {
  def this(props: UploadProps) = this()
}

/* static members */
@JSImport("antd/lib/upload", JSImport.Default)
@js.native
object default extends js.Object {
  var Dragger: FC[DraggerProps] = js.native
  var defaultProps: Anon_AcceptAction = js.native
  def getDerivedStateFromProps(nextProps: UploadProps): Anon_FileListArray | Null = js.native
}

