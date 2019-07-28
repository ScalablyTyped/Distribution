package typings.agDashGrid.distLibRowModelsCacheRowNodeBlockMod

import typings.agDashGrid.distLibContextContextMod.Context
import typings.agDashGrid.distLibRenderingRowRendererMod.RowRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowNodeBlockBeans extends js.Object {
  var context: Context
  var rowRenderer: RowRenderer
}

object RowNodeBlockBeans {
  @scala.inline
  def apply(context: Context, rowRenderer: RowRenderer): RowNodeBlockBeans = {
    val __obj = js.Dynamic.literal(context = context, rowRenderer = rowRenderer)
  
    __obj.asInstanceOf[RowNodeBlockBeans]
  }
}

