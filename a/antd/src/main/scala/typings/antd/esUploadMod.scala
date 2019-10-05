package typings.antd

import org.scalablytyped.runtime.Instantiable0
import typings.antd.esUploadInterfaceMod.UploadProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/es/upload", JSImport.Namespace)
@js.native
object esUploadMod extends js.Object {
  @js.native
  class default protected ()
    extends typings.antd.esUploadUploadMod.default {
    def this(props: UploadProps) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var Dragger: Instantiable0[typings.antd.esUploadDraggerMod.default] = js.native
    var defaultProps: Anon_Accept = js.native
    def getDerivedStateFromProps(nextProps: UploadProps): Anon_FileList | Null = js.native
  }
  
}

