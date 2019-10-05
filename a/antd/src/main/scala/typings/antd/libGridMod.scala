package typings.antd

import typings.antd.libGridColMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/grid", JSImport.Namespace)
@js.native
object libGridMod extends js.Object {
  @js.native
  class Col () extends default
  
  @js.native
  class Row ()
    extends typings.antd.libGridRowMod.default
  
  /* static members */
  @js.native
  object Col extends js.Object {
    var propTypes: Anon_Children = js.native
  }
  
  /* static members */
  @js.native
  object Row extends js.Object {
    var defaultProps: Anon_Gutter = js.native
    var propTypes: Anon_Align = js.native
  }
  
}

