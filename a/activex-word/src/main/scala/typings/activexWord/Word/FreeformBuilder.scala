package typings.activexWord.Word

import typings.activexOffice.Office.MsoEditingType
import typings.activexOffice.Office.MsoSegmentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FreeformBuilder extends StObject {
  
  /**
    * @param number [X2=0]
    * @param number [Y2=0]
    * @param number [X3=0]
    * @param number [Y3=0]
    */
  def AddNodes(SegmentType: MsoSegmentType, EditingType: MsoEditingType, X1: Double, Y1: Double): Unit = js.native
  def AddNodes(SegmentType: MsoSegmentType, EditingType: MsoEditingType, X1: Double, Y1: Double, X2: Double): Unit = js.native
  def AddNodes(
    SegmentType: MsoSegmentType,
    EditingType: MsoEditingType,
    X1: Double,
    Y1: Double,
    X2: Double,
    Y2: Double
  ): Unit = js.native
  def AddNodes(
    SegmentType: MsoSegmentType,
    EditingType: MsoEditingType,
    X1: Double,
    Y1: Double,
    X2: Double,
    Y2: Double,
    X3: Double
  ): Unit = js.native
  def AddNodes(
    SegmentType: MsoSegmentType,
    EditingType: MsoEditingType,
    X1: Double,
    Y1: Double,
    X2: Double,
    Y2: Double,
    X3: Double,
    Y3: Double
  ): Unit = js.native
  def AddNodes(
    SegmentType: MsoSegmentType,
    EditingType: MsoEditingType,
    X1: Double,
    Y1: Double,
    X2: Double,
    Y2: Double,
    X3: Unit,
    Y3: Double
  ): Unit = js.native
  def AddNodes(
    SegmentType: MsoSegmentType,
    EditingType: MsoEditingType,
    X1: Double,
    Y1: Double,
    X2: Double,
    Y2: Unit,
    X3: Double
  ): Unit = js.native
  def AddNodes(
    SegmentType: MsoSegmentType,
    EditingType: MsoEditingType,
    X1: Double,
    Y1: Double,
    X2: Double,
    Y2: Unit,
    X3: Double,
    Y3: Double
  ): Unit = js.native
  def AddNodes(
    SegmentType: MsoSegmentType,
    EditingType: MsoEditingType,
    X1: Double,
    Y1: Double,
    X2: Double,
    Y2: Unit,
    X3: Unit,
    Y3: Double
  ): Unit = js.native
  def AddNodes(
    SegmentType: MsoSegmentType,
    EditingType: MsoEditingType,
    X1: Double,
    Y1: Double,
    X2: Unit,
    Y2: Double
  ): Unit = js.native
  def AddNodes(
    SegmentType: MsoSegmentType,
    EditingType: MsoEditingType,
    X1: Double,
    Y1: Double,
    X2: Unit,
    Y2: Double,
    X3: Double
  ): Unit = js.native
  def AddNodes(
    SegmentType: MsoSegmentType,
    EditingType: MsoEditingType,
    X1: Double,
    Y1: Double,
    X2: Unit,
    Y2: Double,
    X3: Double,
    Y3: Double
  ): Unit = js.native
  def AddNodes(
    SegmentType: MsoSegmentType,
    EditingType: MsoEditingType,
    X1: Double,
    Y1: Double,
    X2: Unit,
    Y2: Double,
    X3: Unit,
    Y3: Double
  ): Unit = js.native
  def AddNodes(
    SegmentType: MsoSegmentType,
    EditingType: MsoEditingType,
    X1: Double,
    Y1: Double,
    X2: Unit,
    Y2: Unit,
    X3: Double
  ): Unit = js.native
  def AddNodes(
    SegmentType: MsoSegmentType,
    EditingType: MsoEditingType,
    X1: Double,
    Y1: Double,
    X2: Unit,
    Y2: Unit,
    X3: Double,
    Y3: Double
  ): Unit = js.native
  def AddNodes(
    SegmentType: MsoSegmentType,
    EditingType: MsoEditingType,
    X1: Double,
    Y1: Double,
    X2: Unit,
    Y2: Unit,
    X3: Unit,
    Y3: Double
  ): Unit = js.native
  
  val Application: typings.activexWord.Word.Application = js.native
  
  def ConvertToShape(): Shape = js.native
  def ConvertToShape(Anchor: Any): Shape = js.native
  
  val Creator: Double = js.native
  
  val Parent: Any = js.native
  
  /* private */ @JSName("Word.FreeformBuilder_typekey")
  var WordDotFreeformBuilder_typekey: FreeformBuilder = js.native
}
