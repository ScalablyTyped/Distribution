package typings
package agDashGridLib.distLibInterfacesIRichCellEditorParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRichCellEditorParams
  extends agDashGridLib.distLibRenderingCellEditorsICellEditorMod.ICellEditorParams
     with agDashGridLib.distLibComponentsFrameworkComponentResolverMod.ComponentHolder {
  var cellHeight: scala.Double = js.native
  var cellRenderer: agDashGridLib.Anon_ICellRendererComp | agDashGridLib.distLibRenderingCellRenderersICellRendererMod.ICellRendererFunc | java.lang.String = js.native
  var values: js.Array[java.lang.String] = js.native
}

