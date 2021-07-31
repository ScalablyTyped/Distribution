package typings.activexExcel.anon

import typings.activexExcel.Excel.Range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetRange extends StObject {
  
  def Target(Address: String): Range
  def Target(RowIndex: Double): Range
  def Target(RowIndex: Double, ColumnIndex: Double): Range
  @JSName("Target")
  val Target_Original: Range
}
object TargetRange {
  
  @scala.inline
  def apply(Target: Range): TargetRange = {
    val __obj = js.Dynamic.literal(Target = Target.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetRange]
  }
  
  @scala.inline
  implicit class TargetRangeMutableBuilder[Self <: TargetRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTarget(value: Range): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
  }
}
