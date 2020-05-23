package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to show and hide a dialog and gives access to the title of the dialog. */
trait XDialog extends XInterface {
  /** gets the title of the dialog. */
  var Title: String
  /** hides the dialog and then causes {@link XDialog.execute()} to return. */
  def endExecute(): Unit
  /** shows the dialog. */
  def execute(): Double
  /** gets the title of the dialog. */
  def getTitle(): String
  /** sets the title of the dialog. */
  def setTitle(Title: String): Unit
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
}

