package typings
package accDashWizardLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccWizardOptions extends js.Object {
  /**
    * @summary Class to indicate the active task in sidebar.
    * @type {string}
    */
  var activeClass: java.lang.String
  /**
    * @summary Add next/prev buttons to panels.
    * @type {boolean}
    */
  var addButtons: scala.Boolean
  /**
    * @summary Auto-scrolling.
    * @type {boolean}
    */
  var autoScrolling: scala.Boolean
  /**
    * @summary Class(es) for back button.
    * @type {string}
    */
  var backClasses: java.lang.String
  /**
    * @summary Text for back button.
    * @type {string}
    */
  var backText: java.lang.String
  /**
    * @summary HTML input type for back button. (default: "reset")
    * @type {string}
    */
  var backType: java.lang.String
  /**
    * @summary Class to indicate task is complete.
    * @type {string}
    */
  var completedClass: java.lang.String
  /**
    * @summary Class(es) for next button.
    * @type {string}
    */
  var nextClasses: java.lang.String
  /**
    * @summary Text for next button.
    * @type {string}
    */
  var nextText: java.lang.String
  /**
    * @summary HTML input type for next button. (default: "submit")
    * @type {string}
    */
  var nextType: java.lang.String
  /**
    * @summary Function to call on back up.
    */
  var onBack: js.Function
  /**
    * @summary A chance to hook destruction.
    */
  var onDestroy: js.Function
  /**
    * @summary A chance to hook initialization.
    */
  var onInit: js.Function
  /**
    * @summary Function to call on next step.
    */
  var onNext: js.Function
  /**
    * @summary Selector for task sidebar.
    * @type {string}
    */
  var sidebar: java.lang.String
  /**
    * @summary Class for step buttons within panels.
    * @type {string}
    */
  var stepClass: java.lang.String
  /**
    * @summary Class to indicate task is still pending.
    * @type {string}
    */
  var todoClass: java.lang.String
}

object AccWizardOptions {
  @scala.inline
  def apply(
    activeClass: java.lang.String,
    addButtons: scala.Boolean,
    autoScrolling: scala.Boolean,
    backClasses: java.lang.String,
    backText: java.lang.String,
    backType: java.lang.String,
    completedClass: java.lang.String,
    nextClasses: java.lang.String,
    nextText: java.lang.String,
    nextType: java.lang.String,
    onBack: js.Function,
    onDestroy: js.Function,
    onInit: js.Function,
    onNext: js.Function,
    sidebar: java.lang.String,
    stepClass: java.lang.String,
    todoClass: java.lang.String
  ): AccWizardOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("activeClass")(activeClass)
    __obj.updateDynamic("addButtons")(addButtons)
    __obj.updateDynamic("autoScrolling")(autoScrolling)
    __obj.updateDynamic("backClasses")(backClasses)
    __obj.updateDynamic("backText")(backText)
    __obj.updateDynamic("backType")(backType)
    __obj.updateDynamic("completedClass")(completedClass)
    __obj.updateDynamic("nextClasses")(nextClasses)
    __obj.updateDynamic("nextText")(nextText)
    __obj.updateDynamic("nextType")(nextType)
    __obj.updateDynamic("onBack")(onBack)
    __obj.updateDynamic("onDestroy")(onDestroy)
    __obj.updateDynamic("onInit")(onInit)
    __obj.updateDynamic("onNext")(onNext)
    __obj.updateDynamic("sidebar")(sidebar)
    __obj.updateDynamic("stepClass")(stepClass)
    __obj.updateDynamic("todoClass")(todoClass)
    __obj.asInstanceOf[AccWizardOptions]
  }
}

