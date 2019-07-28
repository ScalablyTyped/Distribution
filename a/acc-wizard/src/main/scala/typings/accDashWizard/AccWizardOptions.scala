package typings.accDashWizard

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccWizardOptions extends js.Object {
  /**
    * @summary Class to indicate the active task in sidebar.
    * @type {string}
    */
  var activeClass: String
  /**
    * @summary Add next/prev buttons to panels.
    * @type {boolean}
    */
  var addButtons: Boolean
  /**
    * @summary Auto-scrolling.
    * @type {boolean}
    */
  var autoScrolling: Boolean
  /**
    * @summary Class(es) for back button.
    * @type {string}
    */
  var backClasses: String
  /**
    * @summary Text for back button.
    * @type {string}
    */
  var backText: String
  /**
    * @summary HTML input type for back button. (default: "reset")
    * @type {string}
    */
  var backType: String
  /**
    * @summary Class to indicate task is complete.
    * @type {string}
    */
  var completedClass: String
  /**
    * @summary Class(es) for next button.
    * @type {string}
    */
  var nextClasses: String
  /**
    * @summary Text for next button.
    * @type {string}
    */
  var nextText: String
  /**
    * @summary HTML input type for next button. (default: "submit")
    * @type {string}
    */
  var nextType: String
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
  var sidebar: String
  /**
    * @summary Class for step buttons within panels.
    * @type {string}
    */
  var stepClass: String
  /**
    * @summary Class to indicate task is still pending.
    * @type {string}
    */
  var todoClass: String
}

object AccWizardOptions {
  @scala.inline
  def apply(
    activeClass: String,
    addButtons: Boolean,
    autoScrolling: Boolean,
    backClasses: String,
    backText: String,
    backType: String,
    completedClass: String,
    nextClasses: String,
    nextText: String,
    nextType: String,
    onBack: js.Function,
    onDestroy: js.Function,
    onInit: js.Function,
    onNext: js.Function,
    sidebar: String,
    stepClass: String,
    todoClass: String
  ): AccWizardOptions = {
    val __obj = js.Dynamic.literal(activeClass = activeClass, addButtons = addButtons, autoScrolling = autoScrolling, backClasses = backClasses, backText = backText, backType = backType, completedClass = completedClass, nextClasses = nextClasses, nextText = nextText, nextType = nextType, onBack = onBack, onDestroy = onDestroy, onInit = onInit, onNext = onNext, sidebar = sidebar, stepClass = stepClass, todoClass = todoClass)
  
    __obj.asInstanceOf[AccWizardOptions]
  }
}

