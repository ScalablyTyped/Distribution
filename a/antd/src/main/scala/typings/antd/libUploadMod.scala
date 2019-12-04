package typings.antd

import org.scalablytyped.runtime.Instantiable0
import typings.antd.libUploadInterfaceMod.UploadProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/upload", JSImport.Namespace)
@js.native
object libUploadMod extends js.Object {
  @js.native
  class default protected ()
    extends typings.antd.libUploadUploadMod.default {
    def this(props: UploadProps) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var Dragger: Instantiable0[typings.antd.libUploadDraggerMod.default] = js.native
    var defaultProps: Anon_Accept = js.native
    def getDerivedStateFromProps(nextProps: UploadProps): Anon_FileList | Null = js.native
  }
  
}

