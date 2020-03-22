package typings.antd

import typings.antd.gridRowMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/grid", JSImport.Namespace)
@js.native
object libGridMod extends js.Object {
  @js.native
  class Col ()
    extends typings.antd.gridColMod.Col
  
  @js.native
  class Row () extends default
  
  /* static members */
  @js.native
  object Row extends js.Object {
    var defaultProps: AnonGutter = js.native
  }
  
}

