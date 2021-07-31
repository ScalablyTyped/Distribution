package typings.activexExcel.anon

import typings.activexExcel.Excel.Range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelTarget extends StObject {
  
  var Cancel: Boolean
  
  def Target(Address: String): Range
  def Target(RowIndex: Double): Range
  def Target(RowIndex: Double, ColumnIndex: Double): Range
  @JSName("Target")
  val Target_Original: Range
}
object CancelTarget {
  
  @scala.inline
  def apply(Cancel: Boolean, Target: Range): CancelTarget = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelTarget]
  }
  
  @scala.inline
  implicit class CancelTargetMutableBuilder[Self <: CancelTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: Boolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: Range): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
  }
}
