package typings.activexLibreoffice.com_.sun.star.inspection

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.XActionListener
import typings.activexLibreoffice.com_.sun.star.awt.XWindow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * defines the interface for an {@link XPropertyControl} which displays its value in a hyperlink-like way
  *
  * Hyperlink controls exchange their value ( {@link XPropertyControl.Value} ) as strings.
  * @since OOo 2.0.3
  */
trait XHyperlinkControl extends XPropertyControl {
  /**
    * adds a listener which will be notified when the user clicked the hyperlink text in the control
    * @param listener the listener to notify of hyperlink clicks
    */
  def addActionListener(listener: XActionListener): Unit
  /**
    * removes a listener which was previously added via {@link addActionListener()}
    * @param listener the listener to revoke
    */
  def removeActionListener(listener: XActionListener): Unit
}

object XHyperlinkControl {
  @scala.inline
  def apply(
    ControlContext: XPropertyControlContext,
    ControlType: Double,
    ControlWindow: XWindow,
    Value: js.Any,
    ValueType: `type`,
    addActionListener: XActionListener => Unit,
    isModified: () => Boolean,
    notifyModifiedValue: () => Unit,
    removeActionListener: XActionListener => Unit
  ): XHyperlinkControl = {
    val __obj = js.Dynamic.literal(ControlContext = ControlContext.asInstanceOf[js.Any], ControlType = ControlType.asInstanceOf[js.Any], ControlWindow = ControlWindow.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], ValueType = ValueType.asInstanceOf[js.Any], addActionListener = js.Any.fromFunction1(addActionListener), isModified = js.Any.fromFunction0(isModified), notifyModifiedValue = js.Any.fromFunction0(notifyModifiedValue), removeActionListener = js.Any.fromFunction1(removeActionListener))
    __obj.asInstanceOf[XHyperlinkControl]
  }
}

