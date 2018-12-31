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

