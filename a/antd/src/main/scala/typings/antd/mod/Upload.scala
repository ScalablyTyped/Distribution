package typings.antd.mod

import org.scalablytyped.runtime.Instantiable0
import typings.antd.AnonAccept
import typings.antd.AnonFileList
import typings.antd.uploadInterfaceMod.UploadProps
import typings.antd.uploadMod.default
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
  var Dragger: Instantiable0[typings.antd.draggerMod.default] = js.native
  var defaultProps: AnonAccept = js.native
  def getDerivedStateFromProps(nextProps: UploadProps): AnonFileList | Null = js.native
}

