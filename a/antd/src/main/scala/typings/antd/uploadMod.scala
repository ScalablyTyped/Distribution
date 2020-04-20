package typings.antd

import org.scalablytyped.runtime.Instantiable0
import typings.antd.uploadInterfaceMod.UploadProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/upload", JSImport.Namespace)
@js.native
object uploadMod extends js.Object {
  @js.native
  class default protected ()
    extends typings.antd.uploadUploadMod.default {
    def this(props: UploadProps[_]) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var Dragger: Instantiable0[typings.antd.draggerMod.default] = js.native
    var defaultProps: AnonAccept = js.native
    def getDerivedStateFromProps(nextProps: UploadProps[_]): AnonFileList | Null = js.native
  }
  
}

