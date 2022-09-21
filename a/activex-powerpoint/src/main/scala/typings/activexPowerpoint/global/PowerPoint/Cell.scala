package typings.activexPowerpoint.global.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PowerPoint.Cell")
@js.native
/* private */ open class Cell ()
  extends StObject
     with typings.activexPowerpoint.PowerPoint.Cell {
  
  /* CompleteClass */
  override val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  /* CompleteClass */
  override val Borders: typings.activexPowerpoint.PowerPoint.Borders = js.native
  
  /* CompleteClass */
  override def Merge(MergeTo: typings.activexPowerpoint.PowerPoint.Cell): Unit = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* private */ /* CompleteClass */
  @JSName("PowerPoint.Cell_typekey")
  var PowerPointDotCell_typekey: typings.activexPowerpoint.PowerPoint.Cell = js.native
  
  /* CompleteClass */
  override def Select(): Unit = js.native
  
  /* CompleteClass */
  override val Selected: Boolean = js.native
  
  /* CompleteClass */
  override val Shape: typings.activexPowerpoint.PowerPoint.Shape = js.native
  
  /* CompleteClass */
  override def Split(NumRows: Double, NumColumns: Double): Unit = js.native
}
