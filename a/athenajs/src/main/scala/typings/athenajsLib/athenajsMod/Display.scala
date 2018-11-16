package typings
package athenajsLib.athenajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("athenajs", "Display")
@js.native
class Display protected () extends js.Object {
  /**
       * Creates a new Display instance
       *
       */
  def this(options: DisplayOptions, target: java.lang.String) = this()
  /**
       * Creates a new Display instance
       *
       */
  def this(options: DisplayOptions, target: stdLib.HTMLElement) = this()
  /**
       * Starts an animation on the display
       *
       */
  def animate(fxName: java.lang.String, options: EffectOptions, context: RenderingContext): Promise = js.native
  /**
       * Clears every rendering buffer, including the special fxCtx one
       */
  def clearAllScreens(): scala.Unit = js.native
  /**
       * Clears every display layer and clears fx queues
       */
  def clearDisplay(): scala.Unit = js.native
  /**
       * Clears a canvas display buffer
       *
       */
  def clearScreen(ctx: RenderingContext): scala.Unit = js.native
  /**
       * Executes an effect on a frame at a given time
       *
       */
  def executeFx(
    ctx: RenderingContext,
    fxCtx: RenderingContext,
    obj: Drawable,
    time: scala.Double,
    when: java.lang.String
  ): scala.Unit = js.native
  /**
       * Creates a new (offscreen) drawing buffer
       *
       */
  def getBuffer(width: scala.Double, height: scala.Double): RenderingContext = js.native
  /**
       * Prepares the canvas before rendering images.
       *
       * Explanation: during development, I noticed that the very first time
       * the ctx.drawImage() was used to draw onto a canvas, it took a very long time,
       * like at least 10ms for a very small 32x32 pixels drawImage.
       *
       * Subsequent calls do not have this problem and are instant.
       * Maybe some ColorFormat conversion happens.
       *
       * This method makes sure that when the game starts rendering, we don't have
       * any of these delays that can impact gameplay and alter the gameplay experience
       * in a negative way.
       */
  def prepareCanvas(resources: js.Array[JSObject]): scala.Unit = js.native
  /**
       * Renders the specified scene
       *
       */
  def renderScene(scene: Scene): scala.Unit = js.native
  /**
       * Changes the (CSS) opacity of a canvas
       *
       */
  def setCanvasOpacity(canvas: stdLib.HTMLElement, opacity: scala.Double): scala.Unit = js.native
  /**
       * Changes the zIndex property of the specified layer canvas
       *
       */
  def setLayerZIndex(layer: scala.Double, zIndex: scala.Double): scala.Unit = js.native
  /**
       * stops current animation
       *
       * TODO
       */
  def stopAnimate(): scala.Unit = js.native
  /**
       * stops current animation
       *
       * TODO
       */
  def stopAnimate(fxName: java.lang.String): scala.Unit = js.native
  /**
       * Toggles fullscreen display scaling
       */
  def toggleFullscreen(): scala.Unit = js.native
}

