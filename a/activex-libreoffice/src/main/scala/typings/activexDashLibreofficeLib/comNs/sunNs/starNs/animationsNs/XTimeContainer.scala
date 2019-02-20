package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.animationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Supported modules BasicInlineTimingEventTimingFillDefaultMultiArcTimingRepeatTiming ** The deprecated repeat is not supported.
  * **RestartDefaultRestartTimingTimeContainerAttributes
  * @see http://www.w3.org/TR/smil20/smil-timing.html
  * @see http://www.w3.org/TR/smil20/smil-timing.html#Timing-TimingConcepts
  */
trait XTimeContainer extends XAnimationNode {
  def appendChild(newChild: XAnimationNode): XAnimationNode
  def insertAfter(newChild: XAnimationNode, refChild: XAnimationNode): XAnimationNode
  def insertBefore(newChild: XAnimationNode, refChild: XAnimationNode): XAnimationNode
  def removeChild(oldChild: XAnimationNode): XAnimationNode
  def replaceChild(newChild: XAnimationNode, oldChild: XAnimationNode): XAnimationNode
}

