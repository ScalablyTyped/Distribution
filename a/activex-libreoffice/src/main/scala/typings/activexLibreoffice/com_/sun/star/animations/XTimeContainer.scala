package typings.activexLibreoffice.com_.sun.star.animations

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.NamedValue
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Supported modules BasicInlineTimingEventTimingFillDefaultMultiArcTimingRepeatTiming ** The deprecated repeat is not supported.
  * **RestartDefaultRestartTimingTimeContainerAttributes
  * @see http://www.w3.org/TR/smil20/smil-timing.html
  * @see http://www.w3.org/TR/smil20/smil-timing.html#Timing-TimingConcepts
  */
trait XTimeContainer
  extends StObject
     with XAnimationNode {
  
  def appendChild(newChild: XAnimationNode): XAnimationNode
  
  def insertAfter(newChild: XAnimationNode, refChild: XAnimationNode): XAnimationNode
  
  def insertBefore(newChild: XAnimationNode, refChild: XAnimationNode): XAnimationNode
  
  def removeChild(oldChild: XAnimationNode): XAnimationNode
  
  def replaceChild(newChild: XAnimationNode, oldChild: XAnimationNode): XAnimationNode
}
object XTimeContainer {
  
  inline def apply(
    Acceleration: Double,
    AutoReverse: Boolean,
    Begin: Any,
    Decelerate: Double,
    Duration: Any,
    End: Any,
    EndSync: Any,
    Fill: Double,
    FillDefault: Double,
    Parent: XInterface,
    RepeatCount: Any,
    RepeatDuration: Any,
    Restart: Double,
    RestartDefault: Double,
    Type: Double,
    UserData: SafeArray[NamedValue],
    acquire: () => Unit,
    appendChild: XAnimationNode => XAnimationNode,
    getParent: () => XInterface,
    insertAfter: (XAnimationNode, XAnimationNode) => XAnimationNode,
    insertBefore: (XAnimationNode, XAnimationNode) => XAnimationNode,
    queryInterface: `type` => Any,
    release: () => Unit,
    removeChild: XAnimationNode => XAnimationNode,
    replaceChild: (XAnimationNode, XAnimationNode) => XAnimationNode,
    setParent: XInterface => Unit
  ): XTimeContainer = {
    val __obj = js.Dynamic.literal(Acceleration = Acceleration.asInstanceOf[js.Any], AutoReverse = AutoReverse.asInstanceOf[js.Any], Begin = Begin.asInstanceOf[js.Any], Decelerate = Decelerate.asInstanceOf[js.Any], Duration = Duration.asInstanceOf[js.Any], End = End.asInstanceOf[js.Any], EndSync = EndSync.asInstanceOf[js.Any], Fill = Fill.asInstanceOf[js.Any], FillDefault = FillDefault.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RepeatCount = RepeatCount.asInstanceOf[js.Any], RepeatDuration = RepeatDuration.asInstanceOf[js.Any], Restart = Restart.asInstanceOf[js.Any], RestartDefault = RestartDefault.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], UserData = UserData.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), appendChild = js.Any.fromFunction1(appendChild), getParent = js.Any.fromFunction0(getParent), insertAfter = js.Any.fromFunction2(insertAfter), insertBefore = js.Any.fromFunction2(insertBefore), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeChild = js.Any.fromFunction1(removeChild), replaceChild = js.Any.fromFunction2(replaceChild), setParent = js.Any.fromFunction1(setParent))
    __obj.asInstanceOf[XTimeContainer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XTimeContainer] (val x: Self) extends AnyVal {
    
    inline def setAppendChild(value: XAnimationNode => XAnimationNode): Self = StObject.set(x, "appendChild", js.Any.fromFunction1(value))
    
    inline def setInsertAfter(value: (XAnimationNode, XAnimationNode) => XAnimationNode): Self = StObject.set(x, "insertAfter", js.Any.fromFunction2(value))
    
    inline def setInsertBefore(value: (XAnimationNode, XAnimationNode) => XAnimationNode): Self = StObject.set(x, "insertBefore", js.Any.fromFunction2(value))
    
    inline def setRemoveChild(value: XAnimationNode => XAnimationNode): Self = StObject.set(x, "removeChild", js.Any.fromFunction1(value))
    
    inline def setReplaceChild(value: (XAnimationNode, XAnimationNode) => XAnimationNode): Self = StObject.set(x, "replaceChild", js.Any.fromFunction2(value))
  }
}
