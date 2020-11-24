package typings.angularCommon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common", "NgPlural")
@js.native
class NgPlural protected () extends js.Object {
  def this(_localization: NgLocalization) = this()
  
  var _activateView: js.Any = js.native
  
  var _activeView: js.Any = js.native
  
  var _caseViews: js.Any = js.native
  
  var _clearViews: js.Any = js.native
  
  var _localization: js.Any = js.native
  
  var _switchValue: js.Any = js.native
  
  var _updateView: js.Any = js.native
  
  def addCase(value: String, switchView: SwitchView): Unit = js.native
  
  def ngPlural_=(value: Double): Unit = js.native
}
