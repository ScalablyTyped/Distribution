package typings
package agDashGridLib.distLibRowModelsCacheRowNodeBlockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowNodeBlockBeans extends js.Object {
  var context: agDashGridLib.distLibContextContextMod.Context
  var rowRenderer: agDashGridLib.distLibRenderingRowRendererMod.RowRenderer
}

object RowNodeBlockBeans {
  @scala.inline
  def apply(
    context: agDashGridLib.distLibContextContextMod.Context,
    rowRenderer: agDashGridLib.distLibRenderingRowRendererMod.RowRenderer
  ): RowNodeBlockBeans = {
    val __obj = js.Dynamic.literal(context = context, rowRenderer = rowRenderer)
  
    __obj.asInstanceOf[RowNodeBlockBeans]
  }
}

