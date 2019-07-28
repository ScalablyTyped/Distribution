package typings.activexDashLibreoffice.comNs.sunNs.starNs.renderingNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.geometryNs.AffineMatrix2D
import typings.activexDashLibreoffice.comNs.sunNs.starNs.geometryNs.RealPoint2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface to control a custom sprite object on a {@link XSpriteCanvas} .
  *
  * Every change performed on {@link XCustomSprite} objects is only visible after a {@link XSpriteCanvas.updateScreen()} call, to facilitate synchronized
  * screen updates.
  *
  * TODO: Maybe more than alpha has to be overridden from render state. TODO: Provide means to change the output area
  */
trait XCustomSprite extends XSprite {
  /**
    * Query a render canvas for this sprite's content.
    *
    * Whatever is rendered to this canvas will become visible on the screen only after a {@link XSpriteCanvas.updateScreen()} call at the associated sprite
    * canvas. This canvas is not equivalent to the host canvas of the sprite. At the very least, all output happens relative to the sprite's upper left
    * corner, i.e. the origin of the sprite's canvas device coordinate system will move with the sprite across the screen.
    * @returns the canvas the sprite content can be rendered into.
    */
  val ContentCanvas: XCanvas
  /**
    * Query a render canvas for this sprite's content.
    *
    * Whatever is rendered to this canvas will become visible on the screen only after a {@link XSpriteCanvas.updateScreen()} call at the associated sprite
    * canvas. This canvas is not equivalent to the host canvas of the sprite. At the very least, all output happens relative to the sprite's upper left
    * corner, i.e. the origin of the sprite's canvas device coordinate system will move with the sprite across the screen.
    * @returns the canvas the sprite content can be rendered into.
    */
  def getContentCanvas(): XCanvas
}

object XCustomSprite {
  @scala.inline
  def apply(
    ContentCanvas: XCanvas,
    acquire: () => Unit,
    clip: XPolyPolygon2D => Unit,
    getContentCanvas: () => XCanvas,
    hide: () => Unit,
    move: (RealPoint2D, ViewState, RenderState) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setAlpha: Double => Unit,
    setPriority: Double => Unit,
    show: () => Unit,
    transform: AffineMatrix2D => Unit
  ): XCustomSprite = {
    val __obj = js.Dynamic.literal(ContentCanvas = ContentCanvas, acquire = js.Any.fromFunction0(acquire), clip = js.Any.fromFunction1(clip), getContentCanvas = js.Any.fromFunction0(getContentCanvas), hide = js.Any.fromFunction0(hide), move = js.Any.fromFunction3(move), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setAlpha = js.Any.fromFunction1(setAlpha), setPriority = js.Any.fromFunction1(setPriority), show = js.Any.fromFunction0(show), transform = js.Any.fromFunction1(transform))
  
    __obj.asInstanceOf[XCustomSprite]
  }
}

