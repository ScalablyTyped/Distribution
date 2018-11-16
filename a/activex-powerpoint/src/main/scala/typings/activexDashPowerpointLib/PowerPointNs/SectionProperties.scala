package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.SectionProperties")
@js.native
class SectionProperties protected () extends js.Object {
  val Application: Application = js.native
  val Count: scala.Double = js.native
  val Parent: js.Any = js.native
  var `PowerPoint.SectionProperties_typekey`: SectionProperties = js.native
  def AddBeforeSlide(SlideIndex: scala.Double, sectionName: java.lang.String): scala.Double = js.native
  def AddSection(sectionIndex: scala.Double): scala.Double = js.native
  def AddSection(sectionIndex: scala.Double, sectionName: js.Any): scala.Double = js.native
  def Delete(sectionIndex: scala.Double, deleteSlides: scala.Boolean): scala.Unit = js.native
  def FirstSlide(sectionIndex: scala.Double): scala.Double = js.native
  def Move(sectionIndex: scala.Double, toPos: scala.Double): scala.Unit = js.native
  def Name(sectionIndex: scala.Double): java.lang.String = js.native
  def Rename(sectionIndex: scala.Double, sectionName: java.lang.String): scala.Unit = js.native
  def SectionID(sectionIndex: scala.Double): java.lang.String = js.native
  def SlidesCount(sectionIndex: scala.Double): scala.Double = js.native
}

