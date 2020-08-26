package typings.angularCommon.mod

import typings.angularCore.mod.DoCheck
import typings.angularCore.mod.TemplateRef
import typings.angularCore.mod.ViewContainerRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common", "NgSwitchCase")
@js.native
class NgSwitchCase protected () extends DoCheck {
  def this(viewContainer: ViewContainerRef, templateRef: TemplateRef[js.Object], ngSwitch: NgSwitch) = this()
  var _view: js.Any = js.native
  var ngSwitch: js.Any = js.native
  /**
    * Stores the HTML template to be selected on match.
    */
  var ngSwitchCase: js.Any = js.native
}

