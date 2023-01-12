package typings.atvlegacycontentkit

import typings.atvlegacycontentkit.atvlegacycontentkitStrings.BasicAnimation
import typings.atvlegacycontentkit.atvlegacycontentkitStrings.backwards
import typings.atvlegacycontentkit.atvlegacycontentkitStrings.both
import typings.atvlegacycontentkit.atvlegacycontentkitStrings.forwards
import typings.atvlegacycontentkit.atvlegacycontentkitStrings.removed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An animation for programmatic views. This seems to be confined to CABasicAnimation from Core Animation, so expect the same behavior as that.
  *
  * It's pretty hard to test all of this stuff (as there isn't any validation), so I've mostly copied the same structure as CABasicAnimation. However, some properties may be unsupported, but they
  * will not cause an error, rather they will silently fail.
  *
  * I've also attributed situations where I've borrowed the documentation from Apple's website.
  */
// tslint:disable-next-line:strict-export-declare-modifiers
trait ATVAnimation extends StObject {
  
  /**
    * Determines if the value specified by the animation is added to the current render tree value to produce the new render tree value.
    *
    * See https://developer.apple.com/documentation/quartzcore/capropertyanimation/1412493-additive?language=objc for more information.
    */
  var additive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Tells the delegate the animation has started.
    *
    * See https://developer.apple.com/documentation/quartzcore/caanimationdelegate/2097265-animationdidstart for more information.
    */
  var animationDidStart: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Tells the delegate the animation has ended.
    *
    * See https://developer.apple.com/documentation/quartzcore/caanimationdelegate/2097259-animationdidstop for more information.
    */
  var animationDidStop: js.UndefOr[js.Function1[/* finished */ Boolean, Unit]] = js.undefined
  
  /**
    * Determines if the receiver plays in the reverse upon completion.
    *
    * See https://developer.apple.com/documentation/quartzcore/camediatiming/1427645-autoreverses?language=objc for more information.
    */
  var autoreverses: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the begin time of the receiver in relation to its parent object, if applicable.
    *
    * See https://developer.apple.com/documentation/quartzcore/camediatiming/1427654-begintime?language=objc for more information.
    */
  var beginTime: js.UndefOr[Double] = js.undefined
  
  /**
    * Defines the value the receiver uses to perform relative interpolation.
    *
    * See https://developer.apple.com/documentation/quartzcore/cabasicanimation/1412445-byvalue?language=objc for more information.
    */
  var byValue: js.UndefOr[Double | js.Array[Double] | ATVColor] = js.undefined
  
  /**
    * Determines if the value of the property is the value at the end of the previous repeat cycle, plus the value of the current repeat cycle.
    *
    * See https://developer.apple.com/documentation/quartzcore/capropertyanimation/1412538-cumulative?language=objc for more information.
    */
  var cumulative: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the basic duration of the animation, in seconds.
    *
    * See https://developer.apple.com/documentation/quartzcore/camediatiming/1427652-duration?language=objc for more information.
    */
  var duration: js.UndefOr[Double] = js.undefined
  
  /**
    * The duration for transitioning into the animation’s effect as it begins.
    *
    * See https://developer.apple.com/documentation/quartzcore/caanimation/1523370-fadeinduration?language=objc for more information.
    */
  var fadeInDuration: js.UndefOr[Double] = js.undefined
  
  /**
    * The duration for transitioning out of the animation’s effect as it ends.
    *
    * See https://developer.apple.com/documentation/quartzcore/caanimation/1522959-fadeoutduration?language=objc for more information.
    */
  var fadeOutDuration: js.UndefOr[Double] = js.undefined
  
  /**
    * Determines if the receiver’s presentation is frozen or removed once its active duration has completed.
    *
    * See https://developer.apple.com/documentation/quartzcore/camediatiming/fill_modes for more information.
    */
  var fillMode: js.UndefOr[removed | forwards | backwards | both] = js.undefined
  
  /**
    * Defines the value the receiver uses to start interpolation.
    *
    * See https://developer.apple.com/documentation/quartzcore/cabasicanimation/1412519-fromvalue?language=objc for more information.
    */
  var fromValue: js.UndefOr[Double | js.Array[Double] | ATVColor] = js.undefined
  
  /**
    * Specifies the key path the receiver animates.
    *
    * See https://developer.apple.com/documentation/quartzcore/capropertyanimation/1412496-keypath?language=objc for more information.
    */
  var keyPath: js.UndefOr[String] = js.undefined
  
  /**
    * Determines if the animation is removed from the target layer’s animations upon completion.
    *
    * See https://developer.apple.com/documentation/quartzcore/caanimation/1412458-removedoncompletion?language=objc for more information.
    */
  var removedOnCompletion: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Determines the number of times the animation will repeat.
    *
    * See https://developer.apple.com/documentation/quartzcore/camediatiming/1427666-repeatcount?language=objc for more information.
    */
  var repeatCount: js.UndefOr[Double] = js.undefined
  
  /**
    * Determines how many seconds the animation will repeat for.
    *
    * See https://developer.apple.com/documentation/quartzcore/camediatiming/1427643-repeatduration?language=objc for more information.
    */
  var repeatDuration: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies how time is mapped to receiver’s time space from the parent time space.
    *
    * See https://developer.apple.com/documentation/quartzcore/camediatiming/1427647-speed?language=objc for more information.
    */
  var speed: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies an additional time offset in active local time.
    *
    * See https://developer.apple.com/documentation/quartzcore/camediatiming/1427650-timeoffset?language=objc for more information.
    */
  var timeOffset: js.UndefOr[Double] = js.undefined
  
  /**
    * Defines the value the receiver uses to end interpolation.
    *
    * See https://developer.apple.com/documentation/quartzcore/cabasicanimation/1412523-tovalue?language=objc for more information.
    */
  var toValue: js.UndefOr[Double | js.Array[Double] | ATVColor] = js.undefined
  
  /**
    * The type of the animation. It seems this can only be BasicAnimation which seems to basically be CABasicAnimation.
    */
  val `type`: BasicAnimation
}
object ATVAnimation {
  
  inline def apply(): ATVAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("BasicAnimation")
    __obj.asInstanceOf[ATVAnimation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ATVAnimation] (val x: Self) extends AnyVal {
    
    inline def setAdditive(value: Boolean): Self = StObject.set(x, "additive", value.asInstanceOf[js.Any])
    
    inline def setAdditiveUndefined: Self = StObject.set(x, "additive", js.undefined)
    
    inline def setAnimationDidStart(value: () => Unit): Self = StObject.set(x, "animationDidStart", js.Any.fromFunction0(value))
    
    inline def setAnimationDidStartUndefined: Self = StObject.set(x, "animationDidStart", js.undefined)
    
    inline def setAnimationDidStop(value: /* finished */ Boolean => Unit): Self = StObject.set(x, "animationDidStop", js.Any.fromFunction1(value))
    
    inline def setAnimationDidStopUndefined: Self = StObject.set(x, "animationDidStop", js.undefined)
    
    inline def setAutoreverses(value: Boolean): Self = StObject.set(x, "autoreverses", value.asInstanceOf[js.Any])
    
    inline def setAutoreversesUndefined: Self = StObject.set(x, "autoreverses", js.undefined)
    
    inline def setBeginTime(value: Double): Self = StObject.set(x, "beginTime", value.asInstanceOf[js.Any])
    
    inline def setBeginTimeUndefined: Self = StObject.set(x, "beginTime", js.undefined)
    
    inline def setByValue(value: Double | js.Array[Double] | ATVColor): Self = StObject.set(x, "byValue", value.asInstanceOf[js.Any])
    
    inline def setByValueUndefined: Self = StObject.set(x, "byValue", js.undefined)
    
    inline def setByValueVarargs(value: Double*): Self = StObject.set(x, "byValue", js.Array(value*))
    
    inline def setCumulative(value: Boolean): Self = StObject.set(x, "cumulative", value.asInstanceOf[js.Any])
    
    inline def setCumulativeUndefined: Self = StObject.set(x, "cumulative", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setFadeInDuration(value: Double): Self = StObject.set(x, "fadeInDuration", value.asInstanceOf[js.Any])
    
    inline def setFadeInDurationUndefined: Self = StObject.set(x, "fadeInDuration", js.undefined)
    
    inline def setFadeOutDuration(value: Double): Self = StObject.set(x, "fadeOutDuration", value.asInstanceOf[js.Any])
    
    inline def setFadeOutDurationUndefined: Self = StObject.set(x, "fadeOutDuration", js.undefined)
    
    inline def setFillMode(value: removed | forwards | backwards | both): Self = StObject.set(x, "fillMode", value.asInstanceOf[js.Any])
    
    inline def setFillModeUndefined: Self = StObject.set(x, "fillMode", js.undefined)
    
    inline def setFromValue(value: Double | js.Array[Double] | ATVColor): Self = StObject.set(x, "fromValue", value.asInstanceOf[js.Any])
    
    inline def setFromValueUndefined: Self = StObject.set(x, "fromValue", js.undefined)
    
    inline def setFromValueVarargs(value: Double*): Self = StObject.set(x, "fromValue", js.Array(value*))
    
    inline def setKeyPath(value: String): Self = StObject.set(x, "keyPath", value.asInstanceOf[js.Any])
    
    inline def setKeyPathUndefined: Self = StObject.set(x, "keyPath", js.undefined)
    
    inline def setRemovedOnCompletion(value: Boolean): Self = StObject.set(x, "removedOnCompletion", value.asInstanceOf[js.Any])
    
    inline def setRemovedOnCompletionUndefined: Self = StObject.set(x, "removedOnCompletion", js.undefined)
    
    inline def setRepeatCount(value: Double): Self = StObject.set(x, "repeatCount", value.asInstanceOf[js.Any])
    
    inline def setRepeatCountUndefined: Self = StObject.set(x, "repeatCount", js.undefined)
    
    inline def setRepeatDuration(value: Double): Self = StObject.set(x, "repeatDuration", value.asInstanceOf[js.Any])
    
    inline def setRepeatDurationUndefined: Self = StObject.set(x, "repeatDuration", js.undefined)
    
    inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    
    inline def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
    
    inline def setTimeOffset(value: Double): Self = StObject.set(x, "timeOffset", value.asInstanceOf[js.Any])
    
    inline def setTimeOffsetUndefined: Self = StObject.set(x, "timeOffset", js.undefined)
    
    inline def setToValue(value: Double | js.Array[Double] | ATVColor): Self = StObject.set(x, "toValue", value.asInstanceOf[js.Any])
    
    inline def setToValueUndefined: Self = StObject.set(x, "toValue", js.undefined)
    
    inline def setToValueVarargs(value: Double*): Self = StObject.set(x, "toValue", js.Array(value*))
    
    inline def setType(value: BasicAnimation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
