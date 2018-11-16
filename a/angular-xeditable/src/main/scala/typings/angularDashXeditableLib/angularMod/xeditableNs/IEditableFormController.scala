package typings
package angularDashXeditableLib.angularMod.xeditableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEditableFormController
  extends angularLib.angularMod.angularNs.IFormController {
  /**
               * Sets focus on form field specified by `name`.<br/>
               * When trying to set the focus on a form field of a new row in the editable table, the `$activate` call needs to be wrapped in a `$timeout` call so that the form is rendered before the `$activate` function is called.
               *
               * @param name name of field
               */
  @JSName("$activate")
  def $activate(name: java.lang.String): scala.Unit = js.native
  /**
               * Triggers `oncancel` event and calls `$hide()`.
               */
  @JSName("$cancel")
  def $cancel(): scala.Unit = js.native
  /**
               * Hides form with editable controls without saving.
               */
  @JSName("$hide")
  def $hide(): scala.Unit = js.native
  @JSName("$save")
  def $save(): scala.Unit = js.native
  /**
               * Shows error message for particular field.
               *
               * @param name name of field
               * @param msg error message
               */
  @JSName("$setError")
  def $setError(name: java.lang.String, msg: java.lang.String): scala.Unit = js.native
  @JSName("$setWaiting")
  def $setWaiting(value: scala.Boolean): scala.Unit = js.native
  /**
               * Shows form with editable controls.
               */
  @JSName("$show")
  def $show(): scala.Unit = js.native
  @JSName("$submit")
  def $submit(): scala.Unit = js.native
}

