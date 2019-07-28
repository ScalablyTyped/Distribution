package typings.agDashGrid.distLibEnvironmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/environment", "Environment")
@js.native
class Environment () extends js.Object {
  var eGridDiv: js.Any = js.native
  var gridSize: js.Any = js.native
  var iconSize: js.Any = js.native
  var sassVariables: js.Any = js.native
  def getSassVariable(theme: String, key: String): Double = js.native
  def getTheme(): String = js.native
  def loadSassVariables(): Unit = js.native
}

