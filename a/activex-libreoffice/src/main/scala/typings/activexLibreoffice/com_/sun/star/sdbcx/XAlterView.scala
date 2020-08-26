package typings.activexLibreoffice.com_.sun.star.sdbcx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * implements the possibility to alter aspects of a view's definition
  * @since OOo 2.4
  */
@js.native
trait XAlterView extends js.Object {
  /**
    * changes the command which constitutes the view
    *
    * The operation should be atomic.
    * @param NewCommand the new command which the view should be based on. Usually an `SELECT` statement.
    * @throws com::sun::star::sdbc::SQLException if an error occurs
    */
  def alterCommand(NewCommand: String): Unit = js.native
}

object XAlterView {
  @scala.inline
  def apply(alterCommand: String => Unit): XAlterView = {
    val __obj = js.Dynamic.literal(alterCommand = js.Any.fromFunction1(alterCommand))
    __obj.asInstanceOf[XAlterView]
  }
  @scala.inline
  implicit class XAlterViewOps[Self <: XAlterView] (val x: Self) extends AnyVal {
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
    def setAlterCommand(value: String => Unit): Self = this.set("alterCommand", js.Any.fromFunction1(value))
  }
  
}

