package typings.aceBuilds.mod.Ace

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fold extends js.Object {
  var end: Point
  var foldLine: js.UndefOr[FoldLine] = js.undefined
  var range: Range
  var sameRow: Boolean
  var start: Point
  var subFolds: js.Array[Fold]
  def addSubFold(fold: Fold): Fold
  def restoreRange(range: Range): Unit
  def setFoldLine(foldLine: FoldLine): Unit
}

object Fold {
  @scala.inline
  def apply(
    addSubFold: Fold => Fold,
    end: Point,
    range: Range,
    restoreRange: Range => Unit,
    sameRow: Boolean,
    setFoldLine: FoldLine => Unit,
    start: Point,
    subFolds: js.Array[Fold],
    foldLine: FoldLine = null
  ): Fold = {
    val __obj = js.Dynamic.literal(addSubFold = js.Any.fromFunction1(addSubFold), end = end.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], restoreRange = js.Any.fromFunction1(restoreRange), sameRow = sameRow.asInstanceOf[js.Any], setFoldLine = js.Any.fromFunction1(setFoldLine), start = start.asInstanceOf[js.Any], subFolds = subFolds.asInstanceOf[js.Any])
    if (foldLine != null) __obj.updateDynamic("foldLine")(foldLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fold]
  }
}

