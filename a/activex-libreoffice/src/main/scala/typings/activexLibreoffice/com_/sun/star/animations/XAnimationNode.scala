package typings.activexLibreoffice.com_.sun.star.animations

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.NamedValue
import typings.activexLibreoffice.com_.sun.star.container.XChild
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XAnimationNode
  extends StObject
     with XChild {
  
  /**
    * defines the acceleration for this element. ;  Element time will accelerate from a rate of 0 at the beginning up to a run rate, over the course of the
    * specified proportion of the simple duration.
    *
    * {@link Acceleration} is a value between 0 (no acceleration) and 1 (acceleration until end of the elements duration).
    * @see http://www.w3.org/TR/smil20/smil-timemanip.html#adef-accelerate
    */
  var Acceleration: Double
  
  /**
    * defines the auto reverse settings for this element.
    *
    * {@link AutoReverse} is `FALSE` if the animation is played normal.`TRUE` if the animation is played forwards and then backwards. This doubles the
    * duration
    * @see http://www.w3.org/TR/smil20/smil-timemanip.html#adef-autoReverse
    */
  var AutoReverse: Boolean
  
  /**
    * a sequence of values that define the beginning of this element ; {@link Begin} is `double` describes the element begin as an offset in seconds from an
    * implicit syncbase. The definition of the implicit syncbase depends upon the element's parent time container. The offset is measured in parent simple
    * time.{@link Event} describes an event and an optional offset that determine the element begin. The element begin is defined relative to the time that
    * the event is raised.Timing::INDEFINITE the begin of the element will be determined by an external event to the element.sequence<any> a sequence of
    * values described above if more than one begin value is defined for this element.`VOID` if no begin behavior is defined for this element.
    * @see http://www.w3.org/TR/smil20/smil-timing.html#adef-begin
    */
  var Begin: js.Any
  
  /**
    * defines the deceleration for this element. Element time will deceleration from a run rate to a rate of 0 at the ending, over the course of the
    * specified proportion of the simple duration.
    *
    * {@link Decelerate} is a value between 0 (no deceleration) and 1 (deceleration from beginning of the elements duration).
    * @see http://www.w3.org/TR/smil20/smil-timemanip.html#adef-decelerate
    */
  var Decelerate: Double
  
  /**
    * defines the length of the simple duration. ; {@link Duration} is `double` specifies the length of the simple duration in seconds.Timing::INDEFINITE
    * specifies the simple duration as indefinite.Timing::MEDIA specifies the simple duration as the intrinsic media duration. This is only valid for
    * elements that define media.`VOID` the simple duration for the element is defined to be the implicit duration of the element.
    * @see http://www.w3.org/TR/smil20/smil-timing.html#adef-dur
    */
  var Duration: js.Any
  
  /**
    * a sequence of values that define the ending of this element ; {@link End} is `double` describes the element end as an offset in seconds from an
    * implicit syncbase. The definition of the implicit syncbase depends upon the element's parent time container. The offset is measured in parent simple
    * time.{@link Event} describes an event and an optional offset that determine the element end. The element end is defined relative to the time that the
    * event is raised.Timing::INDEFINITE the end of the element will be determined by an external event to the element.sequence<any> a sequence of values
    * described above if more than one begin value is defined for this element.`VOID` if no end behavior is defined for this element.
    * @see http://www.w3.org/TR/smil20/smil-timing.html#adef-end
    */
  var End: js.Any
  
  /**
    * controls the implicit duration of time containers, as a function of the children. ;  The EndSync attribute is only valid for par and excl time
    * container elements, and media elements with timed children (e.g. animate or area elements).
    *
    * {@link EndSync} is either a `short` constant from EndSync, an interface reference to a child {@link XTimeContainer} or `VOID` .
    * @see http://www.w3.org/TR/smil20/smil-timing.html#adef-endsync
    */
  var EndSync: js.Any
  
  /**
    * the attribute that specify the behavior how an element should be extended beyond the active duration by freezing the final state of the element. ;
    * {@link Fill} is a value from {@link AnimationFill} .
    * @see Fill
    * @see http://www.w3.org/TR/smil20/smil-timing.html#adef-fill
    */
  var Fill: Double
  
  /**
    * the default value for the fill behavior for this element and all descendants. ; {@link FillDefault} is The values {@link AnimationFill.REMOVE} ,
    * {@link AnimationFill.FREEZE} , {@link AnimationFill.HOLD} , {@link AnimationFill.TRANSITION} and {@link AnimationFill.AUTO} specify that the element
    * fill behavior is the respective value.The value {@link AnimationFill.INHERIT} specifies that the value of this attribute (and of the fill behavior)
    * are inherited from the {@link FillDefault} value of the parent element. If there is no parent element, the value is {@link AnimationFill.AUTO} .
    * @see Fill
    * @see http://www.w3.org/TR/smil20/smil-timing.html#adef-fillDefault
    */
  var FillDefault: Double
  
  /**
    * the number of iterations of the simple duration. ; {@link RepeatCount} is `double` this is a numeric value that specifies the number of iterations. It
    * can include partial iterations expressed as fraction values. A fractional value describes a portion of the simple duration. Values must be greater
    * than 0.Timing::INDEFINITE the element is defined to repeat indefinitely (subject to the constraints of the parent time container).`VOID` no repeat
    * count is defined for this element.
    * @see EndSync
    * @see http://www.w3.org/TR/smil20/smil-timing.html#adef-repeatCount
    */
  var RepeatCount: js.Any
  
  /**
    * the total duration for repeat. ; {@link RepeatDuration} is `double` specifies the duration in element active time to repeat the simple duration in
    * seconds.Timing::INDEFINITE the element is defined to repeat indefinitely (subject to the constraints of the parent time container).`VOID` No repeat
    * duration is defined for this element.
    * @see http://www.w3.org/TR/smil20/smil-timing.html#adef-repeatDur
    */
  var RepeatDuration: js.Any
  
  /**
    * defines the restart behavior of this element. ; {@link Restart} is a `short` value from {@link AnimationRestart} .
    * @see AnimationRestart
    * @see http://www.w3.org/TR/smil20/smil-timing.html#adef-restart
    */
  var Restart: Double
  
  /**
    * defines the default restart behavior for this element and all descendants.
    * @returns a value from Restart.
    * @see AnimationRestart
    * @see http://www.w3.org/TR/smil20/smil-timing.html#adef-restartDefault
    */
  var RestartDefault: Double
  
  /**
    * a value from {@link AnimationNodeType} .
    * @see http://www.w3.org/TR/smil20/smil-timing.html#adef-timeContainer
    */
  var Type: Double
  
  var UserData: SafeArray[NamedValue]
}
object XAnimationNode {
  
  inline def apply(
    Acceleration: Double,
    AutoReverse: Boolean,
    Begin: js.Any,
    Decelerate: Double,
    Duration: js.Any,
    End: js.Any,
    EndSync: js.Any,
    Fill: Double,
    FillDefault: Double,
    Parent: XInterface,
    RepeatCount: js.Any,
    RepeatDuration: js.Any,
    Restart: Double,
    RestartDefault: Double,
    Type: Double,
    UserData: SafeArray[NamedValue],
    acquire: () => Unit,
    getParent: () => XInterface,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setParent: XInterface => Unit
  ): XAnimationNode = {
    val __obj = js.Dynamic.literal(Acceleration = Acceleration.asInstanceOf[js.Any], AutoReverse = AutoReverse.asInstanceOf[js.Any], Begin = Begin.asInstanceOf[js.Any], Decelerate = Decelerate.asInstanceOf[js.Any], Duration = Duration.asInstanceOf[js.Any], End = End.asInstanceOf[js.Any], EndSync = EndSync.asInstanceOf[js.Any], Fill = Fill.asInstanceOf[js.Any], FillDefault = FillDefault.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RepeatCount = RepeatCount.asInstanceOf[js.Any], RepeatDuration = RepeatDuration.asInstanceOf[js.Any], Restart = Restart.asInstanceOf[js.Any], RestartDefault = RestartDefault.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], UserData = UserData.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getParent = js.Any.fromFunction0(getParent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setParent = js.Any.fromFunction1(setParent))
    __obj.asInstanceOf[XAnimationNode]
  }
  
  extension [Self <: XAnimationNode](x: Self) {
    
    inline def setAcceleration(value: Double): Self = StObject.set(x, "Acceleration", value.asInstanceOf[js.Any])
    
    inline def setAutoReverse(value: Boolean): Self = StObject.set(x, "AutoReverse", value.asInstanceOf[js.Any])
    
    inline def setBegin(value: js.Any): Self = StObject.set(x, "Begin", value.asInstanceOf[js.Any])
    
    inline def setDecelerate(value: Double): Self = StObject.set(x, "Decelerate", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: js.Any): Self = StObject.set(x, "Duration", value.asInstanceOf[js.Any])
    
    inline def setEnd(value: js.Any): Self = StObject.set(x, "End", value.asInstanceOf[js.Any])
    
    inline def setEndSync(value: js.Any): Self = StObject.set(x, "EndSync", value.asInstanceOf[js.Any])
    
    inline def setFill(value: Double): Self = StObject.set(x, "Fill", value.asInstanceOf[js.Any])
    
    inline def setFillDefault(value: Double): Self = StObject.set(x, "FillDefault", value.asInstanceOf[js.Any])
    
    inline def setRepeatCount(value: js.Any): Self = StObject.set(x, "RepeatCount", value.asInstanceOf[js.Any])
    
    inline def setRepeatDuration(value: js.Any): Self = StObject.set(x, "RepeatDuration", value.asInstanceOf[js.Any])
    
    inline def setRestart(value: Double): Self = StObject.set(x, "Restart", value.asInstanceOf[js.Any])
    
    inline def setRestartDefault(value: Double): Self = StObject.set(x, "RestartDefault", value.asInstanceOf[js.Any])
    
    inline def setType(value: Double): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setUserData(value: SafeArray[NamedValue]): Self = StObject.set(x, "UserData", value.asInstanceOf[js.Any])
  }
}
