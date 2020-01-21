package typings.agGrid.agCheckboxMod

import typings.agGrid.componentMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/widgets/agCheckbox", "AgCheckbox")
@js.native
class AgCheckbox () extends Component {
  var eChecked: js.Any = js.native
  var eIndeterminate: js.Any = js.native
  var eLabel: js.Any = js.native
  var eUnchecked: js.Any = js.native
  var gridOptionsWrapper: js.Any = js.native
  var passive: js.Any = js.native
  var props: js.Any = js.native
  var readOnly: js.Any = js.native
  var selected: js.Any = js.native
  def getNextValue(): Boolean = js.native
  def isReadOnly(): Boolean = js.native
  def isSelected(): Boolean = js.native
  /* private */ def loadIcons(): js.Any = js.native
  /* private */ def onClick(event: js.Any): js.Any = js.native
  /* private */ def postConstruct(): js.Any = js.native
  /* private */ def preConstruct(): js.Any = js.native
  def setPassive(passive: Boolean): Unit = js.native
  def setReadOnly(readOnly: Boolean): Unit = js.native
  def setSelected(selected: Boolean): Unit = js.native
  def toggle(): Unit = js.native
  /* private */ def updateIcons(): js.Any = js.native
}

/* static members */
@JSImport("ag-grid/dist/lib/widgets/agCheckbox", "AgCheckbox")
@js.native
object AgCheckbox extends js.Object {
  var EVENT_CHANGED: String = js.native
  var TEMPLATE: js.Any = js.native
}

