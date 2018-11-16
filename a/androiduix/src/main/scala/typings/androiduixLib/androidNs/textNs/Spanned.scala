package typings
package androiduixLib.androidNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Dropped String */ 
trait Spanned extends js.Object {
  def getSpanEnd(tag: js.Any): scala.Double
  def getSpanFlags(tag: js.Any): scala.Double
  def getSpanStart(tag: js.Any): scala.Double
  def getSpans[T](start: scala.Double, end: scala.Double, `type`: js.Any): js.Array[T]
  def nextSpanTransition(start: scala.Double, limit: scala.Double, `type`: js.Any): scala.Double
}

