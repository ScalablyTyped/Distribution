package typings.activexLibreoffice.com_.sun.star.drawing.framework

import typings.activexLibreoffice.com_.sun.star.awt.XWindow
import typings.activexLibreoffice.com_.sun.star.rendering.XCanvas
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A pane is an abstraction of a window and is one of the resources managed by the drawing framework.
  *
  * Apart from the area that displays a view a pane may contain other parts like title, menu, closer button.
  *
  * The URL prefix of panes is `private:resource/floater`
  */
@js.native
trait XPane extends XResource {
  
  /**
    * Return the com::sun::star::awt::XCanvas of the pane. The {@link com.sun.star.rendering.XCanvas} object is expected to be associated with the {@link
    * com.sun.star.awt.XWindow} object returned by {@link getWindow()} .
    * @returns When the {@link com.sun.star.rendering.XCanvas} interface is not supported then an empty reference is returned.
    */
  val Canvas: XCanvas = js.native
  
  /** Return the {@link com.sun.star.awt.XWindow} of the pane that is used to display a view. */
  val Window: XWindow = js.native
  
  /**
    * Return the com::sun::star::awt::XCanvas of the pane. The {@link com.sun.star.rendering.XCanvas} object is expected to be associated with the {@link
    * com.sun.star.awt.XWindow} object returned by {@link getWindow()} .
    * @returns When the {@link com.sun.star.rendering.XCanvas} interface is not supported then an empty reference is returned.
    */
  def getCanvas(): XCanvas = js.native
  
  /** Return the {@link com.sun.star.awt.XWindow} of the pane that is used to display a view. */
  def getWindow(): XWindow = js.native
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
    val __obj = js.Dynamic.literal(Canvas = Canvas.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any], Window = Window.asInstanceOf[js.Any], getCanvas = js.Any.fromFunction0(getCanvas), getResourceId = js.Any.fromFunction0(getResourceId), getWindow = js.Any.fromFunction0(getWindow), isAnchorOnly = js.Any.fromFunction0(isAnchorOnly))
    __obj.asInstanceOf[XPane]
  }
  
  @scala.inline
  implicit class XPaneOps[Self <: XPane] (val x: Self) extends AnyVal {
    
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
    def setCanvas(value: XCanvas): Self = this.set("Canvas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindow(value: XWindow): Self = this.set("Window", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetCanvas(value: () => XCanvas): Self = this.set("getCanvas", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetWindow(value: () => XWindow): Self = this.set("getWindow", js.Any.fromFunction0(value))
  }
}
