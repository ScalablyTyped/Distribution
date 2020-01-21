package typings.agGrid.rowNodeBlockMod

import typings.agGrid.contextMod.Context
import typings.agGrid.rowRendererMod.RowRenderer
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
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], rowRenderer = rowRenderer.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RowNodeBlockBeans]
  }
}

