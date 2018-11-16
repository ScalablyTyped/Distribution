package typings
package athenajsLib.athenajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("athenajs", "Effect")
@js.native
class Effect protected () extends js.Object {
  /**
       * This the class constructor. Default options are:
       *
       */
  def this(options: EffectOptions, display: Display) = this()
  var animProgress: scala.Double = js.native
  var buffer: RenderingContext = js.native
  var ended: scala.Boolean = js.native
  var height: scala.Double = js.native
  var startValue: scala.Double = js.native
  var width: scala.Double = js.native
  /**
       * Calculates current animation process
       *
       * This method can be overridden but the super should always be calle first
       */
  def process(ctx: RenderingContext): scala.Boolean = js.native
  /**
       * Calculates current animation process
       *
       * This method can be overridden but the super should always be calle first
       */
  def process(ctx: RenderingContext, fxCtx: RenderingContext): scala.Boolean = js.native
  /**
       * Calculates current animation process
       *
       * This method can be overridden but the super should always be calle first
       */
  def process(ctx: RenderingContext, fxCtx: RenderingContext, obj: js.Any): scala.Boolean = js.native
  /**
       * Changes the easing function used for the ffect
       *
       */
  def setEasing(
    easing: js.Function5[
      /* x */ js.UndefOr[scala.Double], 
      /* t */ js.UndefOr[scala.Double], 
      /* b */ js.UndefOr[scala.Double], 
      /* c */ js.UndefOr[scala.Double], 
      /* d */ js.UndefOr[scala.Double], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Called when the ffect is started.
       *
       * This method can be overriden but the super should always be called
       */
  def start(): Promise = js.native
  /**
       * called when the effect is stopped
       */
  def stop(`object`: js.Any, setEndValue: js.Any): scala.Unit = js.native
}

