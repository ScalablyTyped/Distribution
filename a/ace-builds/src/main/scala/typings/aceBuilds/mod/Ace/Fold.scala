package typings.aceBuilds.mod.Ace

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fold extends StObject {
  
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
  implicit class FoldMutableBuilder[Self <: Fold] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddSubFold(value: Fold => Fold): Self = StObject.set(x, "addSubFold", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEnd(value: Point): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFoldLine(value: FoldLine): Self = StObject.set(x, "foldLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFoldLineUndefined: Self = StObject.set(x, "foldLine", js.undefined)
    
    @scala.inline
    def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestoreRange(value: Range => Unit): Self = StObject.set(x, "restoreRange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSameRow(value: Boolean): Self = StObject.set(x, "sameRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetFoldLine(value: FoldLine => Unit): Self = StObject.set(x, "setFoldLine", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStart(value: Point): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubFolds(value: js.Array[Fold]): Self = StObject.set(x, "subFolds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubFoldsVarargs(value: Fold*): Self = StObject.set(x, "subFolds", js.Array(value :_*))
  }
}
