package typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.frameworkNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XWindow
import typings.activexDashLibreoffice.comNs.sunNs.starNs.renderingNs.XCanvas
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A pane is an abstraction of a window and is one of the resources managed by the drawing framework.
  *
  * Apart from the area that displays a view a pane may contain other parts like title, menu, closer button.
  *
  * The URL prefix of panes is `private:resource/floater`
  */
trait XPane extends XResource {
  /**
    * Return the com::sun::star::awt::XCanvas of the pane. The {@link com.sun.star.rendering.XCanvas} object is expected to be associated with the {@link
    * com.sun.star.awt.XWindow} object returned by {@link getWindow()} .
    * @returns When the {@link com.sun.star.rendering.XCanvas} interface is not supported then an empty reference is returned.
    */
  val Canvas: XCanvas
  /** Return the {@link com.sun.star.awt.XWindow} of the pane that is used to display a view. */
  val Window: XWindow
  /**
    * Return the com::sun::star::awt::XCanvas of the pane. The {@link com.sun.star.rendering.XCanvas} object is expected to be associated with the {@link
    * com.sun.star.awt.XWindow} object returned by {@link getWindow()} .
    * @returns When the {@link com.sun.star.rendering.XCanvas} interface is not supported then an empty reference is returned.
    */
  def getCanvas(): XCanvas
  /** Return the {@link com.sun.star.awt.XWindow} of the pane that is used to display a view. */
  def getWindow(): XWindow
}

object XPane {
  @scala.inline
  def apply(
    Canvas: XCanvas,
    ResourceId: XResourceId,
    Window: XWindow,
    getCanvas: () => XCanvas,
    getResourceId: () => XResourceId,
    getWindow: () => XWindow,
    isAnchorOnly: () => Boolean
  ): XPane = {
    val __obj = js.Dynamic.literal(Canvas = Canvas, ResourceId = ResourceId, Window = Window, getCanvas = js.Any.fromFunction0(getCanvas), getResourceId = js.Any.fromFunction0(getResourceId), getWindow = js.Any.fromFunction0(getWindow), isAnchorOnly = js.Any.fromFunction0(isAnchorOnly))
  
    __obj.asInstanceOf[XPane]
  }
}

