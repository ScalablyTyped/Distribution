package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.frameworkNs

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
  val Canvas: activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.XCanvas
  /** Return the {@link com.sun.star.awt.XWindow} of the pane that is used to display a view. */
  val Window: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow
  /**
    * Return the com::sun::star::awt::XCanvas of the pane. The {@link com.sun.star.rendering.XCanvas} object is expected to be associated with the {@link
    * com.sun.star.awt.XWindow} object returned by {@link getWindow()} .
    * @returns When the {@link com.sun.star.rendering.XCanvas} interface is not supported then an empty reference is returned.
    */
  def getCanvas(): activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.XCanvas
  /** Return the {@link com.sun.star.awt.XWindow} of the pane that is used to display a view. */
  def getWindow(): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow
}

object XPane {
  @scala.inline
  def apply(
    Canvas: activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.XCanvas,
    ResourceId: XResourceId,
    Window: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow,
    getCanvas: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.XCanvas],
    getResourceId: js.Function0[XResourceId],
    getWindow: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow],
    isAnchorOnly: js.Function0[scala.Boolean]
  ): XPane = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Canvas")(Canvas)
    __obj.updateDynamic("ResourceId")(ResourceId)
    __obj.updateDynamic("Window")(Window)
    __obj.updateDynamic("getCanvas")(getCanvas)
    __obj.updateDynamic("getResourceId")(getResourceId)
    __obj.updateDynamic("getWindow")(getWindow)
    __obj.updateDynamic("isAnchorOnly")(isAnchorOnly)
    __obj.asInstanceOf[XPane]
  }
}

