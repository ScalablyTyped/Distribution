package typings.aceBuilds.mod.Ace

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fold extends js.Object {
  
  def addSubFold(fold: Fold): Fold = js.native
  
  var end: Point = js.native
  
  var foldLine: js.UndefOr[FoldLine] = js.native
  
  var range: Range = js.native
  
  def restoreRange(range: Range): Unit = js.native
  
  var sameRow: Boolean = js.native
  
  def setFoldLine(foldLine: FoldLine): Unit = js.native
  
  var start: Point = js.native
  
  var subFolds: js.Array[Fold] = js.native
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
    subFolds: js.Array[Fold]
  ): Fold = {
    val __obj = js.Dynamic.literal(addSubFold = js.Any.fromFunction1(addSubFold), end = end.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], restoreRange = js.Any.fromFunction1(restoreRange), sameRow = sameRow.asInstanceOf[js.Any], setFoldLine = js.Any.fromFunction1(setFoldLine), start = start.asInstanceOf[js.Any], subFolds = subFolds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fold]
  }
  
  @scala.inline
  implicit class FoldOps[Self <: Fold] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddSubFold(value: Fold => Fold): Self = this.set("addSubFold", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEnd(value: Point): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: Range): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestoreRange(value: Range => Unit): Self = this.set("restoreRange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSameRow(value: Boolean): Self = this.set("sameRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetFoldLine(value: FoldLine => Unit): Self = this.set("setFoldLine", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStart(value: Point): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubFoldsVarargs(value: Fold*): Self = this.set("subFolds", js.Array(value :_*))
    
    @scala.inline
    def setSubFolds(value: js.Array[Fold]): Self = this.set("subFolds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFoldLine(value: FoldLine): Self = this.set("foldLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFoldLine: Self = this.set("foldLine", js.undefined)
  }
}
