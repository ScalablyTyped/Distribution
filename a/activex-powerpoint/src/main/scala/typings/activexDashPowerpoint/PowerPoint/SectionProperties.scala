package typings.activexDashPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.SectionProperties")
@js.native
class SectionProperties protected () extends js.Object {
  val Application: typings.activexDashPowerpoint.PowerPoint.Application = js.native
  val Count: Double = js.native
  val Parent: js.Any = js.native
  var `PowerPoint.SectionProperties_typekey`: SectionProperties = js.native
  def AddBeforeSlide(SlideIndex: Double, sectionName: String): Double = js.native
  def AddSection(sectionIndex: Double): Double = js.native
  def AddSection(sectionIndex: Double, sectionName: js.Any): Double = js.native
  def Delete(sectionIndex: Double, deleteSlides: Boolean): Unit = js.native
  def FirstSlide(sectionIndex: Double): Double = js.native
  def Move(sectionIndex: Double, toPos: Double): Unit = js.native
  def Name(sectionIndex: Double): String = js.native
  def Rename(sectionIndex: Double, sectionName: String): Unit = js.native
  def SectionID(sectionIndex: Double): String = js.native
  def SlidesCount(sectionIndex: Double): Double = js.native
}

