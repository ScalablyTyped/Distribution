package typings.antd.esUploadMod

import typings.antd.Anon_Accept
import typings.antd.Anon_FileList
import typings.antd.esUploadDraggerMod.DraggerProps
import typings.antd.esUploadInterfaceMod.UploadProps
import typings.react.reactMod.Global.JSXNs.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/es/upload", JSImport.Default)
@js.native
class default protected ()
  extends typings.antd.esUploadUploadMod.default {
  def this(props: UploadProps) = this()
}

/* static members */
@JSImport("antd/es/upload", JSImport.Default)
@js.native
object default extends js.Object {
  var Dragger: js.Function1[/* props */ DraggerProps, Element] = js.native
  var defaultProps: Anon_Accept = js.native
  def getDerivedStateFromProps(nextProps: UploadProps): Anon_FileList | Null = js.native
}

