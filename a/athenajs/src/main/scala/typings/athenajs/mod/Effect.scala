package typings.athenajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("athenajs", "Effect")
@js.native
open class Effect protected () extends StObject {
  /**
    * This the class constructor. Default options are:
    *
    */
  def this(options: EffectOptions, display: Display) = this()
  
  var animProgress: Double = js.native
  
  var buffer: RenderingContext = js.native
  
  var ended: Boolean = js.native
  
  var height: Double = js.native
  
  /**
    * Calculates current animation process
    *
    * This method can be overridden but the super should always be calle first
    */
  def process(ctx: RenderingContext): Boolean = js.native
  def process(ctx: RenderingContext, fxCtx: Unit, obj: Any): Boolean = js.native
  def process(ctx: RenderingContext, fxCtx: RenderingContext): Boolean = js.native
  def process(ctx: RenderingContext, fxCtx: RenderingContext, obj: Any): Boolean = js.native
  
  /**
    * Changes the easing function used for the ffect
    *
    */
  def setEasing(
    easing: js.Function5[
      /* x */ js.UndefOr[Double], 
      /* t */ js.UndefOr[Double], 
      /* b */ js.UndefOr[Double], 
      /* c */ js.UndefOr[Double], 
      /* d */ js.UndefOr[Double], 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * Called when the ffect is started.
    *
    * This method can be overriden but the super should always be called
    */
  def start(): Promise = js.native
  
  var startValue: Double = js.native
  
  /**
    * called when the effect is stopped
    */
  def stop(`object`: Any, setEndValue: Any): Unit = js.native
  
  var width: Double = js.native
}
