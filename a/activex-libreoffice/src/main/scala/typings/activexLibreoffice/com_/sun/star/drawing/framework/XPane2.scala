package typings.activexLibreoffice.com_.sun.star.drawing.framework

import typings.activexLibreoffice.com_.sun.star.accessibility.XAccessible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An extension of the {@link XPane} interface that adds support for a) showing and hiding the windows that internally belong to the pane and b) setting
  * the accessibility object. This is typically an optional interface.
  */
@js.native
trait XPane2 extends js.Object {
  /** Return the accessibility object that is currently associated with the windows that implement the pane. */
  var Accessible: XAccessible = js.native
  /** Return the accessibility object that is currently associated with the windows that implement the pane. */
  def getAccessible(): XAccessible = js.native
  /**
    * Return whether all windows that are used to implement the pane are visible.
    * @returns `TRUE` when all windows of the pane are visible.
    */
  def isVisible(): Boolean = js.native
  /**
    * Set the accessibility object for the pane. When there is more than one window used to implement the pane then the given accessibility object is
    * usually set at the topmost window. However, the details are implementation dependent.
    * @param xAccessible May be an empty reference.
    */
  def setAccessible(xAccessible: XAccessible): Unit = js.native
  /**
    * Hide or show the pane. If there is more than one window used to implement the pane then it is left to the implementation if one, some, or all windows
    * are hidden or shown as long as the pane becomes hidden or visible.
    * @param bIsVisible When `TRUE` then show the pane. Hide it otherwise.
    */
  def setVisible(bIsVisible: Boolean): Unit = js.native
}

object XPane2 {
  @scala.inline
  def apply(
    Accessible: XAccessible,
    getAccessible: () => XAccessible,
    isVisible: () => Boolean,
    setAccessible: XAccessible => Unit,
    setVisible: Boolean => Unit
  ): XPane2 = {
    val __obj = js.Dynamic.literal(Accessible = Accessible.asInstanceOf[js.Any], getAccessible = js.Any.fromFunction0(getAccessible), isVisible = js.Any.fromFunction0(isVisible), setAccessible = js.Any.fromFunction1(setAccessible), setVisible = js.Any.fromFunction1(setVisible))
    __obj.asInstanceOf[XPane2]
  }
  @scala.inline
  implicit class XPane2Ops[Self <: XPane2] (val x: Self) extends AnyVal {
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
    def setAccessible(value: XAccessible): Self = this.set("Accessible", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetAccessible(value: () => XAccessible): Self = this.set("getAccessible", js.Any.fromFunction0(value))
    @scala.inline
    def setIsVisible(value: () => Boolean): Self = this.set("isVisible", js.Any.fromFunction0(value))
    @scala.inline
    def setSetAccessible(value: XAccessible => Unit): Self = this.set("setAccessible", js.Any.fromFunction1(value))
    @scala.inline
    def setSetVisible(value: Boolean => Unit): Self = this.set("setVisible", js.Any.fromFunction1(value))
  }
  
}

