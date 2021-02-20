package typings.athenajs.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("athenajs", "Display")
@js.native
class Display protected () extends StObject {
  /**
    * Creates a new Display instance
    *
    */
  def this(options: DisplayOptions, target: String) = this()
  def this(options: DisplayOptions, target: HTMLElement) = this()
  
  /**
    * Starts an animation on the display
    *
    */
  def animate(fxName: String, options: EffectOptions, context: RenderingContext): Promise = js.native
  
  /**
    * Clears every rendering buffer, including the special fxCtx one
    */
  def clearAllScreens(): Unit = js.native
  
  /**
    * Clears every display layer and clears fx queues
    */
  def clearDisplay(): Unit = js.native
  
  /**
    * Clears a canvas display buffer
    *
    */
  def clearScreen(ctx: RenderingContext): Unit = js.native
  
  /**
    * Executes an effect on a frame at a given time
    *
    */
  def executeFx(ctx: RenderingContext, fxCtx: RenderingContext, obj: Drawable, time: Double, when: String): Unit = js.native
  
  /**
    * Creates a new (offscreen) drawing buffer
    *
    */
  def getBuffer(width: Double, height: Double): RenderingContext = js.native
  
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
  def prepareCanvas(resources: js.Array[JSObject]): Unit = js.native
  
  /**
    * Renders the specified scene
    *
    */
  def renderScene(scene: Scene): Unit = js.native
  
  /**
    * Changes the (CSS) opacity of a canvas
    *
    */
  def setCanvasOpacity(canvas: HTMLElement, opacity: Double): Unit = js.native
  
  /**
    * Changes the zIndex property of the specified layer canvas
    *
    */
  def setLayerZIndex(layer: Double, zIndex: Double): Unit = js.native
  
  /**
    * stops current animation
    *
    * TODO
    */
  def stopAnimate(): Unit = js.native
  def stopAnimate(fxName: String): Unit = js.native
  
  /**
    * Toggles fullscreen display scaling
    */
  def toggleFullscreen(): Unit = js.native
}
