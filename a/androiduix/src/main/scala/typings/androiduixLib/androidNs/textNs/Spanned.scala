package typings
package androiduixLib.androidNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Spanned
  extends stdLib.String {
  def getSpanEnd(tag: js.Any): scala.Double = js.native
  def getSpanFlags(tag: js.Any): scala.Double = js.native
  def getSpanStart(tag: js.Any): scala.Double = js.native
  def getSpans[T](start: scala.Double, end: scala.Double, `type`: js.Any): js.Array[T] = js.native
  def nextSpanTransition(start: scala.Double, limit: scala.Double, `type`: js.Any): scala.Double = js.native
}

