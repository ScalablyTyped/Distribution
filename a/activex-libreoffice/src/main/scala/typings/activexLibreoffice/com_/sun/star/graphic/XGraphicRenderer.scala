package typings.activexLibreoffice.com_.sun.star.graphic

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This interfaces exposes just one method to render a {@link XGraphic} container */
@js.native
trait XGraphicRenderer extends XInterface {
  
  /**
    * Renders the {@link XGraphic} container
    * @param Graphic The graphic container to be rendered
    * @see XGraphic
    */
  def render(Graphic: XGraphic): Unit = js.native
}
object XGraphicRenderer {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    render: XGraphic => Unit
  ): XGraphicRenderer = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), render = js.Any.fromFunction1(render))
    __obj.asInstanceOf[XGraphicRenderer]
  }
  
  @scala.inline
  implicit class XGraphicRendererOps[Self <: XGraphicRenderer] (val x: Self) extends AnyVal {
    
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
    def setRender(value: XGraphic => Unit): Self = this.set("render", js.Any.fromFunction1(value))
  }
}
