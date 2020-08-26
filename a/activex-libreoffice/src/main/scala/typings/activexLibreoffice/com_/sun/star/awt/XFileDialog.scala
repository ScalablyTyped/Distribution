package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gives access to a file dialog.
  * @deprecated Deprecated
  */
@js.native
trait XFileDialog extends XInterface {
  /** returns the currently selected filter. */
  var CurrentFilter: String = js.native
  /** returns the path. */
  var Path: String = js.native
  /** returns the currently selected filter. */
  def getCurrentFilter(): String = js.native
  /** returns the path. */
  def getPath(): String = js.native
  /** sets the current filter. */
  def setCurrentFilter(Filter: String): Unit = js.native
  /** sets the filters. */
  def setFilters(rFilterNames: SeqEquiv[String], rMasks: SeqEquiv[String]): Unit = js.native
  /** sets the path. */
  def setPath(Path: String): Unit = js.native
}

object XFileDialog {
  @scala.inline
  def apply(
    CurrentFilter: String,
    Path: String,
    acquire: () => Unit,
    getCurrentFilter: () => String,
    getPath: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setCurrentFilter: String => Unit,
    setFilters: (SeqEquiv[String], SeqEquiv[String]) => Unit,
    setPath: String => Unit
  ): XFileDialog = {
    val __obj = js.Dynamic.literal(CurrentFilter = CurrentFilter.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getCurrentFilter = js.Any.fromFunction0(getCurrentFilter), getPath = js.Any.fromFunction0(getPath), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setCurrentFilter = js.Any.fromFunction1(setCurrentFilter), setFilters = js.Any.fromFunction2(setFilters), setPath = js.Any.fromFunction1(setPath))
    __obj.asInstanceOf[XFileDialog]
  }
  @scala.inline
  implicit class XFileDialogOps[Self <: XFileDialog] (val x: Self) extends AnyVal {
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
    def setCurrentFilter(value: String): Self = this.set("CurrentFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("Path", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetCurrentFilter(value: () => String): Self = this.set("getCurrentFilter", js.Any.fromFunction0(value))
    @scala.inline
    def setGetPath(value: () => String): Self = this.set("getPath", js.Any.fromFunction0(value))
    @scala.inline
    def setSetCurrentFilter(value: String => Unit): Self = this.set("setCurrentFilter", js.Any.fromFunction1(value))
    @scala.inline
    def setSetFilters(value: (SeqEquiv[String], SeqEquiv[String]) => Unit): Self = this.set("setFilters", js.Any.fromFunction2(value))
    @scala.inline
    def setSetPath(value: String => Unit): Self = this.set("setPath", js.Any.fromFunction1(value))
  }
  
}

