package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs

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
    acquire: js.Function0[scala.Unit],
    clip: js.Function1[XPolyPolygon2D, scala.Unit],
    getContentCanvas: js.Function0[XCanvas],
    hide: js.Function0[scala.Unit],
    move: js.Function3[
      activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealPoint2D, 
      ViewState, 
      RenderState, 
      scala.Unit
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setAlpha: js.Function1[scala.Double, scala.Unit],
    setPriority: js.Function1[scala.Double, scala.Unit],
    show: js.Function0[scala.Unit],
    transform: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.AffineMatrix2D, scala.Unit]
  ): XCustomSprite = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ContentCanvas")(ContentCanvas)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("clip")(clip)
    __obj.updateDynamic("getContentCanvas")(getContentCanvas)
    __obj.updateDynamic("hide")(hide)
    __obj.updateDynamic("move")(move)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setAlpha")(setAlpha)
    __obj.updateDynamic("setPriority")(setPriority)
    __obj.updateDynamic("show")(show)
    __obj.updateDynamic("transform")(transform)
    __obj.asInstanceOf[XCustomSprite]
  }
}

