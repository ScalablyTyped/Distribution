package typings.angularXeditable.mod.xeditable

import typings.angular.mod.IFormController
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEditableFormController extends IFormController {
  /**
    * Sets focus on form field specified by `name`.<br/>
    * When trying to set the focus on a form field of a new row in the editable table, the `$activate` call needs to be wrapped in a `$timeout` call so that the form is rendered before the `$activate` function is called.
    *
    * @param name name of field
    */
  @JSName("$activate")
  def $activate(name: String): Unit = js.native
  /**
    * Triggers `oncancel` event and calls `$hide()`.
    */
  @JSName("$cancel")
  def $cancel(): Unit = js.native
  /**
    * Hides form with editable controls without saving.
    */
  @JSName("$hide")
  def $hide(): Unit = js.native
  @JSName("$save")
  def $save(): Unit = js.native
  /**
    * Shows error message for particular field.
    *
    * @param name name of field
    * @param msg error message
    */
  @JSName("$setError")
  def $setError(name: String, msg: String): Unit = js.native
  @JSName("$setWaiting")
  def $setWaiting(value: Boolean): Unit = js.native
  /**
    * Shows form with editable controls.
    */
  @JSName("$show")
  def $show(): Unit = js.native
  @JSName("$submit")
  def $submit(): Unit = js.native
}

