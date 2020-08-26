package typings.activexLibreoffice.com_.sun.star.sdb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.XWindow
import typings.activexLibreoffice.com_.sun.star.sdbc.XRowSet
import typings.activexLibreoffice.com_.sun.star.ui.dialogs.XExecutableDialog
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface could be incomplete since I derived it from its places of use.
  * @since LibreOffice 4.1
  */
@js.native
trait FilterDialog extends XExecutableDialog {
  def createDefault(): Unit = js.native
  def createWithQuery(QueryComposer: XSingleSelectQueryComposer, RowSet: XRowSet, ParentWindow: XWindow): Unit = js.native
}

object FilterDialog {
  @scala.inline
  def apply(
    acquire: () => Unit,
    createDefault: () => Unit,
    createWithQuery: (XSingleSelectQueryComposer, XRowSet, XWindow) => Unit,
    execute: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setTitle: String => Unit
  ): FilterDialog = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createDefault = js.Any.fromFunction0(createDefault), createWithQuery = js.Any.fromFunction3(createWithQuery), execute = js.Any.fromFunction0(execute), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setTitle = js.Any.fromFunction1(setTitle))
    __obj.asInstanceOf[FilterDialog]
  }
  @scala.inline
  implicit class FilterDialogOps[Self <: FilterDialog] (val x: Self) extends AnyVal {
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
    def setCreateDefault(value: () => Unit): Self = this.set("createDefault", js.Any.fromFunction0(value))
    @scala.inline
    def setCreateWithQuery(value: (XSingleSelectQueryComposer, XRowSet, XWindow) => Unit): Self = this.set("createWithQuery", js.Any.fromFunction3(value))
  }
  
}

