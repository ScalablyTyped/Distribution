package typings
package agDashGridLib.distLibHeaderRenderingHeaderGroupHeaderGroupCompMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- agDashGridLib.distLibHeaderRenderingHeaderGroupHeaderGroupCompMod.IHeaderGroupComp because var conflicts: afterGuiAttached, destroy, init. Inlined  */ @JSImport("ag-grid/dist/lib/headerRendering/headerGroup/headerGroupComp", "HeaderGroupComp")
@js.native
class HeaderGroupComp ()
  extends agDashGridLib.distLibWidgetsComponentMod.Component {
  var columnController: js.Any = js.native
  var eCloseIcon: js.Any = js.native
  var eOpenIcon: js.Any = js.native
  var gridOptionsWrapper: js.Any = js.native
  var params: js.Any = js.native
  /* private */ def addGroupExpandIcon(): js.Any = js.native
  /* private */ def addInIcon(iconName: js.Any, refName: js.Any): js.Any = js.native
  /* private */ def addTouchAndClickListeners(eElement: js.Any, action: js.Any): js.Any = js.native
  @JSName("init")
  def init_MHeaderGroupComp(params: IHeaderGroupParams): scala.Unit = js.native
  /* private */ def setupExpandIcons(): js.Any = js.native
  /* private */ def setupLabel(): js.Any = js.native
  /* private */ def updateIconVisibility(): js.Any = js.native
}

/* static members */
@JSImport("ag-grid/dist/lib/headerRendering/headerGroup/headerGroupComp", "HeaderGroupComp")
@js.native
object HeaderGroupComp extends js.Object {
  var TEMPLATE: java.lang.String = js.native
}

