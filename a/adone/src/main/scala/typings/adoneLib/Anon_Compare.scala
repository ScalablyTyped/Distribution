package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Compare extends js.Object {
  val INs: js.Any = js.native
  def contains[T](range: adoneLib.adoneNs.utilNs.ltgtNs.INs.Range[T], key: T): scala.Boolean = js.native
  def contains[T](
    range: adoneLib.adoneNs.utilNs.ltgtNs.INs.Range[T],
    key: T,
    compare: adoneLib.adoneNs.utilNs.ltgtNs.INs.Comparator[T]
  ): scala.Boolean = js.native
  def end[T](range: adoneLib.adoneNs.utilNs.ltgtNs.INs.Range[T]): js.UndefOr[T] = js.native
  def end[T, R](range: adoneLib.adoneNs.utilNs.ltgtNs.INs.Range[T], defaultValue: R): T | R = js.native
  def endInclusive(range: adoneLib.adoneNs.utilNs.ltgtNs.INs.Range[_]): scala.Boolean = js.native
  def filter[T](range: adoneLib.adoneNs.utilNs.ltgtNs.INs.Range[T]): js.Function1[/* key */ T, scala.Boolean] = js.native
  def filter[T](
    range: adoneLib.adoneNs.utilNs.ltgtNs.INs.Range[T],
    compare: adoneLib.adoneNs.utilNs.ltgtNs.INs.Comparator[T]
  ): js.Function1[/* key */ T, scala.Boolean] = js.native
  def lowerBound[T](range: adoneLib.adoneNs.utilNs.ltgtNs.INs.Range[T]): js.UndefOr[T] = js.native
  def lowerBound[T, R](range: adoneLib.adoneNs.utilNs.ltgtNs.INs.Range[T], defaultValue: R): T | R = js.native
  def lowerBoundExclusive(range: adoneLib.adoneNs.utilNs.ltgtNs.INs.Range[_]): scala.Boolean = js.native
  def lowerBoundInclusive(range: adoneLib.adoneNs.utilNs.ltgtNs.INs.Range[_]): scala.Boolean = js.native
  def lowerBoundKey[T](range: adoneLib.adoneNs.utilNs.ltgtNs.INs.Range[T]): js.UndefOr[T] = js.native
  def start[T](range: adoneLib.adoneNs.utilNs.ltgtNs.INs.Range[T]): js.UndefOr[T] = js.native
  def start[T, R](range: adoneLib.adoneNs.utilNs.ltgtNs.INs.Range[T], defaultValue: R): T | R = js.native
  def startInclusive[T](range: adoneLib.adoneNs.utilNs.ltgtNs.INs.Range[_]): scala.Boolean = js.native
  @JSName("start")
  def `start_TR<union>`[T, R](range: adoneLib.adoneNs.utilNs.ltgtNs.INs.Range[T]): T | R = js.native
  def toLtgt[T, R](range: adoneLib.adoneNs.utilNs.ltgtNs.INs.Range[T], _range: js.Object): adoneLib.adoneNs.utilNs.ltgtNs.INs.Range[R] = js.native
  def toLtgt[T, R](
    range: adoneLib.adoneNs.utilNs.ltgtNs.INs.Range[T],
    _range: js.Object,
    map: js.Function2[/* value */ T, /* isUpperBound */ scala.Boolean, R]
  ): adoneLib.adoneNs.utilNs.ltgtNs.INs.Range[R] = js.native
  def toLtgt[T, R](
    range: adoneLib.adoneNs.utilNs.ltgtNs.INs.Range[T],
    _range: js.Object,
    map: js.Function2[/* value */ T, /* isUpperBound */ scala.Boolean, R],
    lowerBound: T
  ): adoneLib.adoneNs.utilNs.ltgtNs.INs.Range[R] = js.native
  def toLtgt[T, R](
    range: adoneLib.adoneNs.utilNs.ltgtNs.INs.Range[T],
    _range: js.Object,
    map: js.Function2[/* value */ T, /* isUpperBound */ scala.Boolean, R],
    lowerBound: T,
    upperBound: T
  ): adoneLib.adoneNs.utilNs.ltgtNs.INs.Range[R] = js.native
  def upperBound[T](range: adoneLib.adoneNs.utilNs.ltgtNs.INs.Range[T]): js.UndefOr[T] = js.native
  def upperBound[T, R](range: adoneLib.adoneNs.utilNs.ltgtNs.INs.Range[T], defaultValue: R): T | R = js.native
  def upperBoundExclusive(range: adoneLib.adoneNs.utilNs.ltgtNs.INs.Range[_]): scala.Boolean = js.native
  def upperBoundInclusive(range: adoneLib.adoneNs.utilNs.ltgtNs.INs.Range[_]): scala.Boolean = js.native
  def upperBoundKey[T](range: adoneLib.adoneNs.utilNs.ltgtNs.INs.Range[T]): js.UndefOr[T] = js.native
}

