package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies the basic operations for a window component.
  *
  * A window is a rectangular region on an output device with its own position, size, and internal coordinate system. A window is used for displaying
  * data. In addition, the window receives events from the user.
  */
@js.native
trait XWindow extends XComponent {
  /** returns the outer bounds of the window. */
  val PosSize: Rectangle = js.native
  /** adds a focus listener to the object. */
  def addFocusListener(xListener: XFocusListener): Unit = js.native
  /** adds a key listener to the object. */
  def addKeyListener(xListener: XKeyListener): Unit = js.native
  /** adds a mouse listener to the object. */
  def addMouseListener(xListener: XMouseListener): Unit = js.native
  /** adds a mouse motion listener to the object. */
  def addMouseMotionListener(xListener: XMouseMotionListener): Unit = js.native
  /** adds a paint listener to the object. */
  def addPaintListener(xListener: XPaintListener): Unit = js.native
  /**
    * adds a window listener to the object.
    * @param xListener the listener to add. If this listener also supports the {@link XWindowListener2} interface, it will receive the additional events decla
    */
  def addWindowListener(xListener: XWindowListener): Unit = js.native
  /** returns the outer bounds of the window. */
  def getPosSize(): Rectangle = js.native
  /** removes the specified focus listener from the listener list. */
  def removeFocusListener(xListener: XFocusListener): Unit = js.native
  /** removes the specified key listener from the listener list. */
  def removeKeyListener(xListener: XKeyListener): Unit = js.native
  /** removes the specified mouse listener from the listener list. */
  def removeMouseListener(xListener: XMouseListener): Unit = js.native
  /** removes the specified mouse motion listener from the listener list. */
  def removeMouseMotionListener(xListener: XMouseMotionListener): Unit = js.native
  /** removes the specified paint listener from the listener list. */
  def removePaintListener(xListener: XPaintListener): Unit = js.native
  /** removes the specified window listener from the listener list. */
  def removeWindowListener(xListener: XWindowListener): Unit = js.native
  /** enables or disables the window depending on the parameter. */
  def setEnable(Enable: Boolean): Unit = js.native
  /** sets the focus to the window. */
  def setFocus(): Unit = js.native
  /**
    * sets the outer bounds of the window.
    * @param X the x-coordinate of the window.
    * @param Y the y-coordinate of the window.
    * @param Width the width of the window.
    * @param Height the height of the window.
    * @param Flags Flags are of type {@link PosSize} and specify, which parameters are taken into account when setting the outer bounds of the window.
    */
  def setPosSize(X: Double, Y: Double, Width: Double, Height: Double, Flags: Double): Unit = js.native
  /** shows or hides the window depending on the parameter. */
  def setVisible(Visible: Boolean): Unit = js.native
}

object XWindow {
  @scala.inline
  def apply(
    PosSize: Rectangle,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    addFocusListener: XFocusListener => Unit,
    addKeyListener: XKeyListener => Unit,
    addMouseListener: XMouseListener => Unit,
    addMouseMotionListener: XMouseMotionListener => Unit,
    addPaintListener: XPaintListener => Unit,
    addWindowListener: XWindowListener => Unit,
    dispose: () => Unit,
    getPosSize: () => Rectangle,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    removeFocusListener: XFocusListener => Unit,
    removeKeyListener: XKeyListener => Unit,
    removeMouseListener: XMouseListener => Unit,
    removeMouseMotionListener: XMouseMotionListener => Unit,
    removePaintListener: XPaintListener => Unit,
    removeWindowListener: XWindowListener => Unit,
    setEnable: Boolean => Unit,
    setFocus: () => Unit,
    setPosSize: (Double, Double, Double, Double, Double) => Unit,
    setVisible: Boolean => Unit
  ): XWindow = {
    val __obj = js.Dynamic.literal(PosSize = PosSize.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addFocusListener = js.Any.fromFunction1(addFocusListener), addKeyListener = js.Any.fromFunction1(addKeyListener), addMouseListener = js.Any.fromFunction1(addMouseListener), addMouseMotionListener = js.Any.fromFunction1(addMouseMotionListener), addPaintListener = js.Any.fromFunction1(addPaintListener), addWindowListener = js.Any.fromFunction1(addWindowListener), dispose = js.Any.fromFunction0(dispose), getPosSize = js.Any.fromFunction0(getPosSize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removeFocusListener = js.Any.fromFunction1(removeFocusListener), removeKeyListener = js.Any.fromFunction1(removeKeyListener), removeMouseListener = js.Any.fromFunction1(removeMouseListener), removeMouseMotionListener = js.Any.fromFunction1(removeMouseMotionListener), removePaintListener = js.Any.fromFunction1(removePaintListener), removeWindowListener = js.Any.fromFunction1(removeWindowListener), setEnable = js.Any.fromFunction1(setEnable), setFocus = js.Any.fromFunction0(setFocus), setPosSize = js.Any.fromFunction5(setPosSize), setVisible = js.Any.fromFunction1(setVisible))
    __obj.asInstanceOf[XWindow]
  }
  @scala.inline
  implicit class XWindowOps[Self <: XWindow] (val x: Self) extends AnyVal {
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
    def setPosSize(value: Rectangle): Self = this.set("PosSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddFocusListener(value: XFocusListener => Unit): Self = this.set("addFocusListener", js.Any.fromFunction1(value))
    @scala.inline
    def setAddKeyListener(value: XKeyListener => Unit): Self = this.set("addKeyListener", js.Any.fromFunction1(value))
    @scala.inline
    def setAddMouseListener(value: XMouseListener => Unit): Self = this.set("addMouseListener", js.Any.fromFunction1(value))
    @scala.inline
    def setAddMouseMotionListener(value: XMouseMotionListener => Unit): Self = this.set("addMouseMotionListener", js.Any.fromFunction1(value))
    @scala.inline
    def setAddPaintListener(value: XPaintListener => Unit): Self = this.set("addPaintListener", js.Any.fromFunction1(value))
    @scala.inline
    def setAddWindowListener(value: XWindowListener => Unit): Self = this.set("addWindowListener", js.Any.fromFunction1(value))
    @scala.inline
    def setGetPosSize(value: () => Rectangle): Self = this.set("getPosSize", js.Any.fromFunction0(value))
    @scala.inline
    def setRemoveFocusListener(value: XFocusListener => Unit): Self = this.set("removeFocusListener", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveKeyListener(value: XKeyListener => Unit): Self = this.set("removeKeyListener", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveMouseListener(value: XMouseListener => Unit): Self = this.set("removeMouseListener", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveMouseMotionListener(value: XMouseMotionListener => Unit): Self = this.set("removeMouseMotionListener", js.Any.fromFunction1(value))
    @scala.inline
    def setRemovePaintListener(value: XPaintListener => Unit): Self = this.set("removePaintListener", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveWindowListener(value: XWindowListener => Unit): Self = this.set("removeWindowListener", js.Any.fromFunction1(value))
    @scala.inline
    def setSetEnable(value: Boolean => Unit): Self = this.set("setEnable", js.Any.fromFunction1(value))
    @scala.inline
    def setSetFocus(value: () => Unit): Self = this.set("setFocus", js.Any.fromFunction0(value))
    @scala.inline
    def setSetPosSize(value: (Double, Double, Double, Double, Double) => Unit): Self = this.set("setPosSize", js.Any.fromFunction5(value))
    @scala.inline
    def setSetVisible(value: Boolean => Unit): Self = this.set("setVisible", js.Any.fromFunction1(value))
  }
  
}

