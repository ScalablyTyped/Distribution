package typings.amapJsApi.global.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("AMap.LayerGroup")
@js.native
class LayerGroup[L] protected ()
  extends typings.amapJsApi.AMap.LayerGroup[L] {
  /**
    * 图层集合
    * @param layers 集合中的图层
    */
  def this(layers: L) = this()
  def this(layers: js.Array[L]) = this()
}
