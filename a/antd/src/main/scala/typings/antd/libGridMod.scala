package typings.antd

import typings.antd.gridColMod.default
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
    extends typings.antd.rowMod.default
  
  /* static members */
  @js.native
  object Col extends js.Object {
    var propTypes: AnonChildren = js.native
  }
  
  /* static members */
  @js.native
  object Row extends js.Object {
    var defaultProps: AnonGutter = js.native
    var propTypes: AnonAlign = js.native
  }
  
}

