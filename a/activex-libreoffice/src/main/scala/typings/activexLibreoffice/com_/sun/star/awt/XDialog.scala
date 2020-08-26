package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to show and hide a dialog and gives access to the title of the dialog. */
@js.native
trait XDialog extends XInterface {
  /** gets the title of the dialog. */
  var Title: String = js.native
  /** hides the dialog and then causes {@link XDialog.execute()} to return. */
  def endExecute(): Unit = js.native
  /** shows the dialog. */
  def execute(): Double = js.native
  /** gets the title of the dialog. */
  def getTitle(): String = js.native
  /** sets the title of the dialog. */
  def setTitle(Title: String): Unit = js.native
}

object XDialog {
  @scala.inline
  def apply(
    Title: String,
    acquire: () => Unit,
    endExecute: () => Unit,
    execute: () => Double,
    getTitle: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setTitle: String => Unit
  ): XDialog = {
    val __obj = js.Dynamic.literal(Title = Title.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), endExecute = js.Any.fromFunction0(endExecute), execute = js.Any.fromFunction0(execute), getTitle = js.Any.fromFunction0(getTitle), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setTitle = js.Any.fromFunction1(setTitle))
    __obj.asInstanceOf[XDialog]
  }
  @scala.inline
  implicit class XDialogOps[Self <: XDialog] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTitle(value: String): Self = this.set("Title", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndExecute(value: () => Unit): Self = this.set("endExecute", js.Any.fromFunction0(value))
    @scala.inline
    def setExecute(value: () => Double): Self = this.set("execute", js.Any.fromFunction0(value))
    @scala.inline
    def setGetTitle(value: () => String): Self = this.set("getTitle", js.Any.fromFunction0(value))
    @scala.inline
    def setSetTitle(value: String => Unit): Self = this.set("setTitle", js.Any.fromFunction1(value))
  }
  
}

