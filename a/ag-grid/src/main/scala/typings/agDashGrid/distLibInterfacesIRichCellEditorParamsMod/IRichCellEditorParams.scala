package typings.agDashGrid.distLibInterfacesIRichCellEditorParamsMod

import typings.agDashGrid.Anon_ICellRendererComp
import typings.agDashGrid.distLibComponentsFrameworkComponentResolverMod.ComponentHolder
import typings.agDashGrid.distLibRenderingCellEditorsICellEditorMod.ICellEditorParams
import typings.agDashGrid.distLibRenderingCellRenderersICellRendererMod.ICellRendererFunc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRichCellEditorParams
  extends ICellEditorParams
     with ComponentHolder {
  var cellHeight: Double = js.native
  var cellRenderer: Anon_ICellRendererComp | ICellRendererFunc | String = js.native
  var values: js.Array[String] = js.native
}

