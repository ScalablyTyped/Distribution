package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SectionProperties extends StObject {
  
  def AddBeforeSlide(SlideIndex: Double, sectionName: String): Double = js.native
  
  def AddSection(sectionIndex: Double): Double = js.native
  def AddSection(sectionIndex: Double, sectionName: js.Any): Double = js.native
  
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  val Count: Double = js.native
  
  def Delete(sectionIndex: Double, deleteSlides: Boolean): Unit = js.native
  
  def FirstSlide(sectionIndex: Double): Double = js.native
  
  def Move(sectionIndex: Double, toPos: Double): Unit = js.native
  
  def Name(sectionIndex: Double): String = js.native
  
  val Parent: js.Any = js.native
  
  /* private */ @JSName("PowerPoint.SectionProperties_typekey")
  var PowerPointDotSectionProperties_typekey: SectionProperties = js.native
  
  def Rename(sectionIndex: Double, sectionName: String): Unit = js.native
  
  def SectionID(sectionIndex: Double): String = js.native
  
  def SlidesCount(sectionIndex: Double): Double = js.native
}
