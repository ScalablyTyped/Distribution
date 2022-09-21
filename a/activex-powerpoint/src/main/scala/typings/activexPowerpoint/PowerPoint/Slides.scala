package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Slides extends StObject {
  
  def Add(Index: Double, Layout: PpSlideLayout): Slide = js.native
  
  def AddSlide(Index: Double, pCustomLayout: CustomLayout): Slide = js.native
  
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  val Count: Double = js.native
  
  def FindBySlideID(SlideID: Double): Slide = js.native
  
  /**
    * @param number [SlideStart=1]
    * @param number [SlideEnd=-1]
    */
  def InsertFromFile(FileName: String, Index: Double): Double = js.native
  def InsertFromFile(FileName: String, Index: Double, SlideStart: Double): Double = js.native
  def InsertFromFile(FileName: String, Index: Double, SlideStart: Double, SlideEnd: Double): Double = js.native
  def InsertFromFile(FileName: String, Index: Double, SlideStart: Unit, SlideEnd: Double): Double = js.native
  
  def Item(Index: Any): Slide = js.native
  
  val Parent: Any = js.native
  
  /** @param number [Index=-1] */
  def Paste(): SlideRange = js.native
  def Paste(Index: Double): SlideRange = js.native
  
  /* private */ @JSName("PowerPoint.Slides_typekey")
  var PowerPointDotSlides_typekey: Slides = js.native
  
  def Range(): SlideRange = js.native
  def Range(Index: Any): SlideRange = js.native
}
