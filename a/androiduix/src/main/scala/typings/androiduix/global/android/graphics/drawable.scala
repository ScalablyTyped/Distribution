package typings.androiduix.global.android.graphics

import typings.androiduix.android.content.res.Resources
import typings.androiduix.android.graphics.drawable.AnimationDrawable.AnimationState
import typings.androiduix.android.graphics.drawable.ClipDrawable.ClipState
import typings.androiduix.android.graphics.drawable.LayerDrawable.LayerState
import typings.androiduix.android.graphics.drawable.RotateDrawable.RotateState
import typings.androiduix.android.graphics.drawable.ScaleDrawable.ScaleState
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object drawable {
  
  object Animatable {
    
    @JSGlobal("android.graphics.drawable.Animatable.isImpl")
    @js.native
    def isImpl(obj: js.Any): js.Any = js.native
  }
  
  @JSGlobal("android.graphics.drawable.AnimationDrawable")
  @js.native
  class AnimationDrawable ()
    extends typings.androiduix.android.graphics.drawable.AnimationDrawable {
    def this(state: AnimationState) = this()
  }
  object AnimationDrawable {
    
    @JSGlobal("android.graphics.drawable.AnimationDrawable.AnimationState")
    @js.native
    class AnimationState protected ()
      extends typings.androiduix.android.graphics.drawable.AnimationDrawable.AnimationState {
      def this(
        orig: typings.androiduix.android.graphics.drawable.AnimationDrawable.AnimationState,
        owner: typings.androiduix.android.graphics.drawable.AnimationDrawable
      ) = this()
    }
  }
  
  @JSGlobal("android.graphics.drawable.ClipDrawable")
  @js.native
  class ClipDrawable ()
    extends typings.androiduix.android.graphics.drawable.ClipDrawable {
    def this(state: ClipState) = this()
    def this(
      drawable: typings.androiduix.android.graphics.drawable.Drawable,
      gravity: Double,
      orientation: Double
    ) = this()
  }
  object ClipDrawable {
    
    @JSGlobal("android.graphics.drawable.ClipDrawable")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("android.graphics.drawable.ClipDrawable.ClipState")
    @js.native
    class ClipState protected ()
      extends typings.androiduix.android.graphics.drawable.ClipDrawable.ClipState {
      def this(
        orig: typings.androiduix.android.graphics.drawable.ClipDrawable.ClipState,
        owner: typings.androiduix.android.graphics.drawable.ClipDrawable
      ) = this()
    }
    
    /* static member */
    @JSGlobal("android.graphics.drawable.ClipDrawable.HORIZONTAL")
    @js.native
    def HORIZONTAL: Double = js.native
    @scala.inline
    def HORIZONTAL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HORIZONTAL")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.graphics.drawable.ClipDrawable.VERTICAL")
    @js.native
    def VERTICAL: Double = js.native
    @scala.inline
    def VERTICAL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERTICAL")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("android.graphics.drawable.ColorDrawable")
  @js.native
  class ColorDrawable ()
    extends typings.androiduix.android.graphics.drawable.ColorDrawable {
    def this(color: Double) = this()
  }
  
  @JSGlobal("android.graphics.drawable.Drawable")
  @js.native
  abstract class Drawable ()
    extends typings.androiduix.android.graphics.drawable.Drawable
  object Drawable {
    
    @JSGlobal("android.graphics.drawable.Drawable")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("android.graphics.drawable.Drawable.ZERO_BOUNDS_RECT")
    @js.native
    def ZERO_BOUNDS_RECT: js.Any = js.native
    @scala.inline
    def ZERO_BOUNDS_RECT_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ZERO_BOUNDS_RECT")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.graphics.drawable.Drawable.createFromXml")
    @js.native
    def createFromXml(r: Resources, parser: HTMLElement): typings.androiduix.android.graphics.drawable.Drawable = js.native
    
    /* static member */
    @JSGlobal("android.graphics.drawable.Drawable.resolveOpacity")
    @js.native
    def resolveOpacity(op1: Double, op2: Double): Double = js.native
  }
  
  @JSGlobal("android.graphics.drawable.DrawableContainer")
  @js.native
  class DrawableContainer ()
    extends typings.androiduix.android.graphics.drawable.DrawableContainer
  object DrawableContainer {
    
    @JSGlobal("android.graphics.drawable.DrawableContainer")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("android.graphics.drawable.DrawableContainer.DEBUG")
    @js.native
    def DEBUG: js.Any = js.native
    @scala.inline
    def DEBUG_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBUG")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.graphics.drawable.DrawableContainer.DEFAULT_DITHER")
    @js.native
    def DEFAULT_DITHER: Boolean = js.native
    @scala.inline
    def DEFAULT_DITHER_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_DITHER")(x.asInstanceOf[js.Any])
    
    @JSGlobal("android.graphics.drawable.DrawableContainer.DrawableContainerState")
    @js.native
    class DrawableContainerState protected ()
      extends typings.androiduix.android.graphics.drawable.DrawableContainer.DrawableContainerState {
      def this(
        orig: typings.androiduix.android.graphics.drawable.DrawableContainer.DrawableContainerState,
        owner: typings.androiduix.android.graphics.drawable.DrawableContainer
      ) = this()
    }
    
    /* static member */
    @JSGlobal("android.graphics.drawable.DrawableContainer.TAG")
    @js.native
    def TAG: js.Any = js.native
    @scala.inline
    def TAG_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TAG")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("android.graphics.drawable.InsetDrawable")
  @js.native
  class InsetDrawable protected ()
    extends typings.androiduix.android.graphics.drawable.InsetDrawable {
    def this(drawable: typings.androiduix.android.graphics.drawable.Drawable, insetLeft: Double) = this()
    def this(
      drawable: typings.androiduix.android.graphics.drawable.Drawable,
      insetLeft: Double,
      insetTop: Double
    ) = this()
    def this(
      drawable: typings.androiduix.android.graphics.drawable.Drawable,
      insetLeft: Double,
      insetTop: js.UndefOr[scala.Nothing],
      insetRight: Double
    ) = this()
    def this(
      drawable: typings.androiduix.android.graphics.drawable.Drawable,
      insetLeft: Double,
      insetTop: Double,
      insetRight: Double
    ) = this()
    def this(
      drawable: typings.androiduix.android.graphics.drawable.Drawable,
      insetLeft: Double,
      insetTop: js.UndefOr[scala.Nothing],
      insetRight: js.UndefOr[scala.Nothing],
      insetBottom: Double
    ) = this()
    def this(
      drawable: typings.androiduix.android.graphics.drawable.Drawable,
      insetLeft: Double,
      insetTop: js.UndefOr[scala.Nothing],
      insetRight: Double,
      insetBottom: Double
    ) = this()
    def this(
      drawable: typings.androiduix.android.graphics.drawable.Drawable,
      insetLeft: Double,
      insetTop: Double,
      insetRight: js.UndefOr[scala.Nothing],
      insetBottom: Double
    ) = this()
    def this(
      drawable: typings.androiduix.android.graphics.drawable.Drawable,
      insetLeft: Double,
      insetTop: Double,
      insetRight: Double,
      insetBottom: Double
    ) = this()
  }
  
  @JSGlobal("android.graphics.drawable.LayerDrawable")
  @js.native
  class LayerDrawable protected ()
    extends typings.androiduix.android.graphics.drawable.LayerDrawable {
    def this(layers: js.Array[typings.androiduix.android.graphics.drawable.Drawable]) = this()
    def this(layers: js.Array[typings.androiduix.android.graphics.drawable.Drawable], state: LayerState) = this()
  }
  object LayerDrawable {
    
    @JSGlobal("android.graphics.drawable.LayerDrawable.ChildDrawable")
    @js.native
    class ChildDrawable ()
      extends typings.androiduix.android.graphics.drawable.LayerDrawable.ChildDrawable
    
    @JSGlobal("android.graphics.drawable.LayerDrawable.LayerState")
    @js.native
    class LayerState protected ()
      extends typings.androiduix.android.graphics.drawable.LayerDrawable.LayerState {
      def this(
        orig: typings.androiduix.android.graphics.drawable.LayerDrawable.LayerState,
        owner: typings.androiduix.android.graphics.drawable.LayerDrawable
      ) = this()
    }
  }
  
  @JSGlobal("android.graphics.drawable.RotateDrawable")
  @js.native
  class RotateDrawable ()
    extends typings.androiduix.android.graphics.drawable.RotateDrawable {
    def this(rotateState: RotateState) = this()
  }
  object RotateDrawable {
    
    @JSGlobal("android.graphics.drawable.RotateDrawable")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("android.graphics.drawable.RotateDrawable.MAX_LEVEL")
    @js.native
    def MAX_LEVEL: js.Any = js.native
    @scala.inline
    def MAX_LEVEL_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_LEVEL")(x.asInstanceOf[js.Any])
    
    @JSGlobal("android.graphics.drawable.RotateDrawable.RotateState")
    @js.native
    class RotateState protected ()
      extends typings.androiduix.android.graphics.drawable.RotateDrawable.RotateState {
      def this(
        source: typings.androiduix.android.graphics.drawable.RotateDrawable.RotateState,
        owner: typings.androiduix.android.graphics.drawable.RotateDrawable
      ) = this()
    }
  }
  
  @JSGlobal("android.graphics.drawable.RoundRectDrawable")
  @js.native
  class RoundRectDrawable protected ()
    extends typings.androiduix.android.graphics.drawable.RoundRectDrawable {
    def this(color: Double, radiusTopLeft: Double) = this()
    def this(color: Double, radiusTopLeft: Double, radiusTopRight: Double) = this()
    def this(
      color: Double,
      radiusTopLeft: Double,
      radiusTopRight: js.UndefOr[scala.Nothing],
      radiusBottomRight: Double
    ) = this()
    def this(color: Double, radiusTopLeft: Double, radiusTopRight: Double, radiusBottomRight: Double) = this()
    def this(
      color: Double,
      radiusTopLeft: Double,
      radiusTopRight: js.UndefOr[scala.Nothing],
      radiusBottomRight: js.UndefOr[scala.Nothing],
      radiusBottomLeft: Double
    ) = this()
    def this(
      color: Double,
      radiusTopLeft: Double,
      radiusTopRight: js.UndefOr[scala.Nothing],
      radiusBottomRight: Double,
      radiusBottomLeft: Double
    ) = this()
    def this(
      color: Double,
      radiusTopLeft: Double,
      radiusTopRight: Double,
      radiusBottomRight: js.UndefOr[scala.Nothing],
      radiusBottomLeft: Double
    ) = this()
    def this(
      color: Double,
      radiusTopLeft: Double,
      radiusTopRight: Double,
      radiusBottomRight: Double,
      radiusBottomLeft: Double
    ) = this()
  }
  
  @JSGlobal("android.graphics.drawable.ScaleDrawable")
  @js.native
  class ScaleDrawable ()
    extends typings.androiduix.android.graphics.drawable.ScaleDrawable {
    def this(state: ScaleState) = this()
    def this(
      drawable: typings.androiduix.android.graphics.drawable.Drawable,
      gravity: Double,
      scaleWidth: Double,
      scaleHeight: Double
    ) = this()
  }
  object ScaleDrawable {
    
    @JSGlobal("android.graphics.drawable.ScaleDrawable.ScaleState")
    @js.native
    class ScaleState protected ()
      extends typings.androiduix.android.graphics.drawable.ScaleDrawable.ScaleState {
      def this(
        orig: typings.androiduix.android.graphics.drawable.ScaleDrawable.ScaleState,
        owner: typings.androiduix.android.graphics.drawable.ScaleDrawable
      ) = this()
    }
  }
  
  @JSGlobal("android.graphics.drawable.ScrollBarDrawable")
  @js.native
  class ScrollBarDrawable ()
    extends typings.androiduix.android.graphics.drawable.ScrollBarDrawable
  
  @JSGlobal("android.graphics.drawable.ShadowDrawable")
  @js.native
  class ShadowDrawable protected ()
    extends typings.androiduix.android.graphics.drawable.ShadowDrawable {
    def this(
      drawable: typings.androiduix.android.graphics.drawable.Drawable,
      radius: Double,
      dx: Double,
      dy: Double,
      color: Double
    ) = this()
  }
  
  @JSGlobal("android.graphics.drawable.StateListDrawable")
  @js.native
  class StateListDrawable ()
    extends typings.androiduix.android.graphics.drawable.StateListDrawable
}
