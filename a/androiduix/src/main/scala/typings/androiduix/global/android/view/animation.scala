package typings.androiduix.global.android.view

import typings.androiduix.android.content.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animation {
  
  @JSGlobal("android.view.animation.AccelerateDecelerateInterpolator")
  @js.native
  class AccelerateDecelerateInterpolator ()
    extends typings.androiduix.android.view.animation.AccelerateDecelerateInterpolator
  
  @JSGlobal("android.view.animation.AccelerateInterpolator")
  @js.native
  class AccelerateInterpolator ()
    extends typings.androiduix.android.view.animation.AccelerateInterpolator {
    def this(factor: Double) = this()
  }
  
  @JSGlobal("android.view.animation.AlphaAnimation")
  @js.native
  class AlphaAnimation protected ()
    extends typings.androiduix.android.view.animation.AlphaAnimation {
    def this(fromAlpha: Double, toAlpha: Double) = this()
  }
  
  @JSGlobal("android.view.animation.Animation")
  @js.native
  abstract class Animation ()
    extends typings.androiduix.android.view.animation.Animation
  object Animation {
    
    @JSGlobal("android.view.animation.Animation")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("android.view.animation.Animation.ABSOLUTE")
    @js.native
    def ABSOLUTE: Double = js.native
    @scala.inline
    def ABSOLUTE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ABSOLUTE")(x.asInstanceOf[js.Any])
    
    @JSGlobal("android.view.animation.Animation.Description")
    @js.native
    class Description ()
      extends typings.androiduix.android.view.animation.Animation.Description
    object Description {
      
      /* static member */
      @JSGlobal("android.view.animation.Animation.Description.parseValue")
      @js.native
      def parseValue(value: String): typings.androiduix.android.view.animation.Animation.Description = js.native
    }
    
    /* static member */
    @JSGlobal("android.view.animation.Animation.INFINITE")
    @js.native
    def INFINITE: Double = js.native
    @scala.inline
    def INFINITE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INFINITE")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.view.animation.Animation.RELATIVE_TO_PARENT")
    @js.native
    def RELATIVE_TO_PARENT: Double = js.native
    @scala.inline
    def RELATIVE_TO_PARENT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RELATIVE_TO_PARENT")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.view.animation.Animation.RELATIVE_TO_SELF")
    @js.native
    def RELATIVE_TO_SELF: Double = js.native
    @scala.inline
    def RELATIVE_TO_SELF_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RELATIVE_TO_SELF")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.view.animation.Animation.RESTART")
    @js.native
    def RESTART: Double = js.native
    @scala.inline
    def RESTART_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RESTART")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.view.animation.Animation.REVERSE")
    @js.native
    def REVERSE: Double = js.native
    @scala.inline
    def REVERSE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REVERSE")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.view.animation.Animation.START_ON_FIRST_FRAME")
    @js.native
    def START_ON_FIRST_FRAME: Double = js.native
    @scala.inline
    def START_ON_FIRST_FRAME_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("START_ON_FIRST_FRAME")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.view.animation.Animation.USE_CLOSEGUARD")
    @js.native
    def USE_CLOSEGUARD: js.Any = js.native
    @scala.inline
    def USE_CLOSEGUARD_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("USE_CLOSEGUARD")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.view.animation.Animation.ZORDER_BOTTOM")
    @js.native
    def ZORDER_BOTTOM: Double = js.native
    @scala.inline
    def ZORDER_BOTTOM_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ZORDER_BOTTOM")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.view.animation.Animation.ZORDER_NORMAL")
    @js.native
    def ZORDER_NORMAL: Double = js.native
    @scala.inline
    def ZORDER_NORMAL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ZORDER_NORMAL")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.view.animation.Animation.ZORDER_TOP")
    @js.native
    def ZORDER_TOP: Double = js.native
    @scala.inline
    def ZORDER_TOP_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ZORDER_TOP")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("android.view.animation.AnimationSet")
  @js.native
  class AnimationSet ()
    extends typings.androiduix.android.view.animation.AnimationSet {
    def this(shareInterpolator: Boolean) = this()
  }
  object AnimationSet {
    
    @JSGlobal("android.view.animation.AnimationSet")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("android.view.animation.AnimationSet.PROPERTY_CHANGE_BOUNDS_MASK")
    @js.native
    def PROPERTY_CHANGE_BOUNDS_MASK: js.Any = js.native
    @scala.inline
    def PROPERTY_CHANGE_BOUNDS_MASK_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROPERTY_CHANGE_BOUNDS_MASK")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.view.animation.AnimationSet.PROPERTY_DURATION_MASK")
    @js.native
    def PROPERTY_DURATION_MASK: js.Any = js.native
    @scala.inline
    def PROPERTY_DURATION_MASK_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROPERTY_DURATION_MASK")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.view.animation.AnimationSet.PROPERTY_FILL_AFTER_MASK")
    @js.native
    def PROPERTY_FILL_AFTER_MASK: js.Any = js.native
    @scala.inline
    def PROPERTY_FILL_AFTER_MASK_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROPERTY_FILL_AFTER_MASK")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.view.animation.AnimationSet.PROPERTY_FILL_BEFORE_MASK")
    @js.native
    def PROPERTY_FILL_BEFORE_MASK: js.Any = js.native
    @scala.inline
    def PROPERTY_FILL_BEFORE_MASK_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROPERTY_FILL_BEFORE_MASK")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.view.animation.AnimationSet.PROPERTY_MORPH_MATRIX_MASK")
    @js.native
    def PROPERTY_MORPH_MATRIX_MASK: js.Any = js.native
    @scala.inline
    def PROPERTY_MORPH_MATRIX_MASK_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROPERTY_MORPH_MATRIX_MASK")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.view.animation.AnimationSet.PROPERTY_REPEAT_MODE_MASK")
    @js.native
    def PROPERTY_REPEAT_MODE_MASK: js.Any = js.native
    @scala.inline
    def PROPERTY_REPEAT_MODE_MASK_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROPERTY_REPEAT_MODE_MASK")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.view.animation.AnimationSet.PROPERTY_SHARE_INTERPOLATOR_MASK")
    @js.native
    def PROPERTY_SHARE_INTERPOLATOR_MASK: js.Any = js.native
    @scala.inline
    def PROPERTY_SHARE_INTERPOLATOR_MASK_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROPERTY_SHARE_INTERPOLATOR_MASK")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.view.animation.AnimationSet.PROPERTY_START_OFFSET_MASK")
    @js.native
    def PROPERTY_START_OFFSET_MASK: js.Any = js.native
    @scala.inline
    def PROPERTY_START_OFFSET_MASK_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROPERTY_START_OFFSET_MASK")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("android.view.animation.AnimationUtils")
  @js.native
  class AnimationUtils ()
    extends typings.androiduix.android.view.animation.AnimationUtils
  object AnimationUtils {
    
    /* static member */
    @JSGlobal("android.view.animation.AnimationUtils.currentAnimationTimeMillis")
    @js.native
    def currentAnimationTimeMillis(): Double = js.native
    
    /* static member */
    @JSGlobal("android.view.animation.AnimationUtils.loadAnimation")
    @js.native
    def loadAnimation(context: Context, id: String): typings.androiduix.android.view.animation.Animation = js.native
  }
  
  @JSGlobal("android.view.animation.AnticipateInterpolator")
  @js.native
  class AnticipateInterpolator ()
    extends typings.androiduix.android.view.animation.AnticipateInterpolator {
    def this(tension: Double) = this()
  }
  
  @JSGlobal("android.view.animation.AnticipateOvershootInterpolator")
  @js.native
  class AnticipateOvershootInterpolator ()
    extends typings.androiduix.android.view.animation.AnticipateOvershootInterpolator {
    def this(tension: Double) = this()
    def this(tension: js.UndefOr[scala.Nothing], extraTension: Double) = this()
    def this(tension: Double, extraTension: Double) = this()
  }
  object AnticipateOvershootInterpolator {
    
    /* static member */
    @JSGlobal("android.view.animation.AnticipateOvershootInterpolator.a")
    @js.native
    def a(t: js.Any, s: js.Any): js.Any = js.native
    
    /* static member */
    @JSGlobal("android.view.animation.AnticipateOvershootInterpolator.o")
    @js.native
    def o(t: js.Any, s: js.Any): js.Any = js.native
  }
  
  @JSGlobal("android.view.animation.BounceInterpolator")
  @js.native
  class BounceInterpolator ()
    extends typings.androiduix.android.view.animation.BounceInterpolator
  object BounceInterpolator {
    
    /* static member */
    @JSGlobal("android.view.animation.BounceInterpolator.bounce")
    @js.native
    def bounce(t: js.Any): js.Any = js.native
  }
  
  @JSGlobal("android.view.animation.CycleInterpolator")
  @js.native
  class CycleInterpolator protected ()
    extends typings.androiduix.android.view.animation.CycleInterpolator {
    def this(mCycles: Double) = this()
  }
  
  @JSGlobal("android.view.animation.DecelerateInterpolator")
  @js.native
  class DecelerateInterpolator ()
    extends typings.androiduix.android.view.animation.DecelerateInterpolator {
    def this(factor: Double) = this()
  }
  
  @JSGlobal("android.view.animation.LinearInterpolator")
  @js.native
  class LinearInterpolator ()
    extends typings.androiduix.android.view.animation.LinearInterpolator
  
  @JSGlobal("android.view.animation.OvershootInterpolator")
  @js.native
  class OvershootInterpolator ()
    extends typings.androiduix.android.view.animation.OvershootInterpolator {
    def this(tension: Double) = this()
  }
  
  @JSGlobal("android.view.animation.RotateAnimation")
  @js.native
  class RotateAnimation protected ()
    extends typings.androiduix.android.view.animation.RotateAnimation {
    def this(fromDegrees: Double, toDegrees: Double) = this()
    def this(fromDegrees: Double, toDegrees: Double, pivotXType: Double) = this()
    def this(fromDegrees: Double, toDegrees: Double, pivotXType: js.UndefOr[scala.Nothing], pivotXValue: Double) = this()
    def this(fromDegrees: Double, toDegrees: Double, pivotXType: Double, pivotXValue: Double) = this()
    def this(
      fromDegrees: Double,
      toDegrees: Double,
      pivotXType: js.UndefOr[scala.Nothing],
      pivotXValue: js.UndefOr[scala.Nothing],
      pivotYType: Double
    ) = this()
    def this(
      fromDegrees: Double,
      toDegrees: Double,
      pivotXType: js.UndefOr[scala.Nothing],
      pivotXValue: Double,
      pivotYType: Double
    ) = this()
    def this(
      fromDegrees: Double,
      toDegrees: Double,
      pivotXType: Double,
      pivotXValue: js.UndefOr[scala.Nothing],
      pivotYType: Double
    ) = this()
    def this(
      fromDegrees: Double,
      toDegrees: Double,
      pivotXType: Double,
      pivotXValue: Double,
      pivotYType: Double
    ) = this()
    def this(
      fromDegrees: Double,
      toDegrees: Double,
      pivotXType: js.UndefOr[scala.Nothing],
      pivotXValue: js.UndefOr[scala.Nothing],
      pivotYType: js.UndefOr[scala.Nothing],
      pivotYValue: Double
    ) = this()
    def this(
      fromDegrees: Double,
      toDegrees: Double,
      pivotXType: js.UndefOr[scala.Nothing],
      pivotXValue: js.UndefOr[scala.Nothing],
      pivotYType: Double,
      pivotYValue: Double
    ) = this()
    def this(
      fromDegrees: Double,
      toDegrees: Double,
      pivotXType: js.UndefOr[scala.Nothing],
      pivotXValue: Double,
      pivotYType: js.UndefOr[scala.Nothing],
      pivotYValue: Double
    ) = this()
    def this(
      fromDegrees: Double,
      toDegrees: Double,
      pivotXType: js.UndefOr[scala.Nothing],
      pivotXValue: Double,
      pivotYType: Double,
      pivotYValue: Double
    ) = this()
    def this(
      fromDegrees: Double,
      toDegrees: Double,
      pivotXType: Double,
      pivotXValue: js.UndefOr[scala.Nothing],
      pivotYType: js.UndefOr[scala.Nothing],
      pivotYValue: Double
    ) = this()
    def this(
      fromDegrees: Double,
      toDegrees: Double,
      pivotXType: Double,
      pivotXValue: js.UndefOr[scala.Nothing],
      pivotYType: Double,
      pivotYValue: Double
    ) = this()
    def this(
      fromDegrees: Double,
      toDegrees: Double,
      pivotXType: Double,
      pivotXValue: Double,
      pivotYType: js.UndefOr[scala.Nothing],
      pivotYValue: Double
    ) = this()
    def this(
      fromDegrees: Double,
      toDegrees: Double,
      pivotXType: Double,
      pivotXValue: Double,
      pivotYType: Double,
      pivotYValue: Double
    ) = this()
  }
  
  @JSGlobal("android.view.animation.ScaleAnimation")
  @js.native
  class ScaleAnimation protected ()
    extends typings.androiduix.android.view.animation.ScaleAnimation {
    def this(fromX: Double, toX: Double, fromY: Double, toY: Double) = this()
    def this(fromX: Double, toX: Double, fromY: Double, toY: Double, pivotXType: Double) = this()
    def this(
      fromX: Double,
      toX: Double,
      fromY: Double,
      toY: Double,
      pivotXType: js.UndefOr[scala.Nothing],
      pivotXValue: Double
    ) = this()
    def this(fromX: Double, toX: Double, fromY: Double, toY: Double, pivotXType: Double, pivotXValue: Double) = this()
    def this(
      fromX: Double,
      toX: Double,
      fromY: Double,
      toY: Double,
      pivotXType: js.UndefOr[scala.Nothing],
      pivotXValue: js.UndefOr[scala.Nothing],
      pivotYType: Double
    ) = this()
    def this(
      fromX: Double,
      toX: Double,
      fromY: Double,
      toY: Double,
      pivotXType: js.UndefOr[scala.Nothing],
      pivotXValue: Double,
      pivotYType: Double
    ) = this()
    def this(
      fromX: Double,
      toX: Double,
      fromY: Double,
      toY: Double,
      pivotXType: Double,
      pivotXValue: js.UndefOr[scala.Nothing],
      pivotYType: Double
    ) = this()
    def this(
      fromX: Double,
      toX: Double,
      fromY: Double,
      toY: Double,
      pivotXType: Double,
      pivotXValue: Double,
      pivotYType: Double
    ) = this()
    def this(
      fromX: Double,
      toX: Double,
      fromY: Double,
      toY: Double,
      pivotXType: js.UndefOr[scala.Nothing],
      pivotXValue: js.UndefOr[scala.Nothing],
      pivotYType: js.UndefOr[scala.Nothing],
      pivotYValue: Double
    ) = this()
    def this(
      fromX: Double,
      toX: Double,
      fromY: Double,
      toY: Double,
      pivotXType: js.UndefOr[scala.Nothing],
      pivotXValue: js.UndefOr[scala.Nothing],
      pivotYType: Double,
      pivotYValue: Double
    ) = this()
    def this(
      fromX: Double,
      toX: Double,
      fromY: Double,
      toY: Double,
      pivotXType: js.UndefOr[scala.Nothing],
      pivotXValue: Double,
      pivotYType: js.UndefOr[scala.Nothing],
      pivotYValue: Double
    ) = this()
    def this(
      fromX: Double,
      toX: Double,
      fromY: Double,
      toY: Double,
      pivotXType: js.UndefOr[scala.Nothing],
      pivotXValue: Double,
      pivotYType: Double,
      pivotYValue: Double
    ) = this()
    def this(
      fromX: Double,
      toX: Double,
      fromY: Double,
      toY: Double,
      pivotXType: Double,
      pivotXValue: js.UndefOr[scala.Nothing],
      pivotYType: js.UndefOr[scala.Nothing],
      pivotYValue: Double
    ) = this()
    def this(
      fromX: Double,
      toX: Double,
      fromY: Double,
      toY: Double,
      pivotXType: Double,
      pivotXValue: js.UndefOr[scala.Nothing],
      pivotYType: Double,
      pivotYValue: Double
    ) = this()
    def this(
      fromX: Double,
      toX: Double,
      fromY: Double,
      toY: Double,
      pivotXType: Double,
      pivotXValue: Double,
      pivotYType: js.UndefOr[scala.Nothing],
      pivotYValue: Double
    ) = this()
    def this(
      fromX: Double,
      toX: Double,
      fromY: Double,
      toY: Double,
      pivotXType: Double,
      pivotXValue: Double,
      pivotYType: Double,
      pivotYValue: Double
    ) = this()
  }
  
  @JSGlobal("android.view.animation.Transformation")
  @js.native
  class Transformation ()
    extends typings.androiduix.android.view.animation.Transformation
  object Transformation {
    
    @JSGlobal("android.view.animation.Transformation")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("android.view.animation.Transformation.TYPE_ALPHA")
    @js.native
    def TYPE_ALPHA: Double = js.native
    @scala.inline
    def TYPE_ALPHA_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TYPE_ALPHA")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.view.animation.Transformation.TYPE_BOTH")
    @js.native
    def TYPE_BOTH: Double = js.native
    @scala.inline
    def TYPE_BOTH_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TYPE_BOTH")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.view.animation.Transformation.TYPE_IDENTITY")
    @js.native
    def TYPE_IDENTITY: Double = js.native
    @scala.inline
    def TYPE_IDENTITY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TYPE_IDENTITY")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.view.animation.Transformation.TYPE_MATRIX")
    @js.native
    def TYPE_MATRIX: Double = js.native
    @scala.inline
    def TYPE_MATRIX_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TYPE_MATRIX")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("android.view.animation.TranslateAnimation")
  @js.native
  class TranslateAnimation protected ()
    extends typings.androiduix.android.view.animation.TranslateAnimation {
    def this(fromXDelta: Double, toXDelta: Double, fromYDelta: Double, toYDelta: Double) = this()
    def this(
      fromXType: Double,
      fromXValue: Double,
      toXType: Double,
      toXValue: Double,
      fromYType: Double,
      fromYValue: Double,
      toYType: Double,
      toYValue: Double
    ) = this()
  }
}
