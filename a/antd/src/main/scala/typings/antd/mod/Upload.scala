package typings.antd.mod

import org.scalablytyped.runtime.Instantiable0
import typings.antd.anon.Accept
import typings.antd.anon.FileList
import typings.antd.uploadInterfaceMod.UploadProps
import typings.antd.uploadMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd", "Upload")
@js.native
class Upload protected () extends default {
  def this(props: UploadProps[_]) = this()
}

/* static members */
@JSImport("antd", "Upload")
@js.native
object Upload extends js.Object {
  var Dragger: Instantiable0[typings.antd.draggerMod.default] = js.native
  var defaultProps: Accept = js.native
  def getDerivedStateFromProps(nextProps: UploadProps[_]): FileList | Null = js.native
}

