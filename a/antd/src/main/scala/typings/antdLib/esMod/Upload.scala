package typings
package antdLib.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/es", "Upload")
@js.native
class Upload protected ()
  extends antdLib.esUploadMod.default {
  def this(props: antdLib.esUploadInterfaceMod.UploadProps) = this()
}

/* static members */
@JSImport("antd/es", "Upload")
@js.native
object Upload extends js.Object {
  var Dragger: org.scalablytyped.runtime.Instantiable0[antdLib.esUploadDraggerMod.default] = js.native
  var defaultProps: antdLib.Anon_Accept = js.native
  def getDerivedStateFromProps(nextProps: antdLib.esUploadInterfaceMod.UploadProps): antdLib.Anon_FileList | scala.Null = js.native
}

