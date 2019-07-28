package typings.adone.adoneNs.utilNs.ltgtNs

import typings.adone.adoneNs.utilNs.ltgtNs.INs.Comparator
import typings.adone.adoneNs.utilNs.ltgtNs.INs.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.util.ltgt")
@js.native
object ^ extends js.Object {
  def contains[T](range: Range[T], key: T): Boolean = js.native
  def contains[T](range: Range[T], key: T, compare: Comparator[T]): Boolean = js.native
  def end[T](range: Range[T]): js.UndefOr[T] = js.native
  def end[T, R](range: Range[T], defaultValue: R): T | R = js.native
  def endInclusive(range: Range[_]): Boolean = js.native
  def filter[T](range: Range[T]): js.Function1[/* key */ T, Boolean] = js.native
  def filter[T](range: Range[T], compare: Comparator[T]): js.Function1[/* key */ T, Boolean] = js.native
  def lowerBound[T](range: Range[T]): js.UndefOr[T] = js.native
  def lowerBound[T, R](range: Range[T], defaultValue: R): T | R = js.native
  def lowerBoundExclusive(range: Range[_]): Boolean = js.native
  def lowerBoundInclusive(range: Range[_]): Boolean = js.native
  def lowerBoundKey[T](range: Range[T]): js.UndefOr[T] = js.native
  def start[T](range: Range[T]): js.UndefOr[T] = js.native
  def start[T, R](range: Range[T], defaultValue: R): T | R = js.native
  def startInclusive[T](range: Range[_]): Boolean = js.native
  @JSName("start")
  def start_TR[T, R](range: Range[T]): T | R = js.native
  def toLtgt[T, R](range: Range[T], _range: js.Object): Range[R] = js.native
  def toLtgt[T, R](
    range: Range[T],
    _range: js.Object,
    map: js.Function2[/* value */ T, /* isUpperBound */ Boolean, R]
  ): Range[R] = js.native
  def toLtgt[T, R](
    range: Range[T],
    _range: js.Object,
    map: js.Function2[/* value */ T, /* isUpperBound */ Boolean, R],
    lowerBound: T
  ): Range[R] = js.native
  def toLtgt[T, R](
    range: Range[T],
    _range: js.Object,
    map: js.Function2[/* value */ T, /* isUpperBound */ Boolean, R],
    lowerBound: T,
    upperBound: T
  ): Range[R] = js.native
  def upperBound[T](range: Range[T]): js.UndefOr[T] = js.native
  def upperBound[T, R](range: Range[T], defaultValue: R): T | R = js.native
  def upperBoundExclusive(range: Range[_]): Boolean = js.native
  def upperBoundInclusive(range: Range[_]): Boolean = js.native
  def upperBoundKey[T](range: Range[T]): js.UndefOr[T] = js.native
}

