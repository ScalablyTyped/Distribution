package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.Slides")
@js.native
class Slides protected () extends js.Object {
  val Application: activexDashPowerpointLib.PowerPointNs.Application = js.native
  val Count: scala.Double = js.native
  val Parent: js.Any = js.native
  var `PowerPoint.Slides_typekey`: Slides = js.native
  def Add(Index: scala.Double, Layout: PpSlideLayout): Slide = js.native
  def AddSlide(Index: scala.Double, pCustomLayout: CustomLayout): Slide = js.native
  def FindBySlideID(SlideID: scala.Double): Slide = js.native
  /**
    * @param number [SlideStart=1]
    * @param number [SlideEnd=-1]
    */
  def InsertFromFile(FileName: java.lang.String, Index: scala.Double): scala.Double = js.native
  def InsertFromFile(FileName: java.lang.String, Index: scala.Double, SlideStart: scala.Double): scala.Double = js.native
  def InsertFromFile(FileName: java.lang.String, Index: scala.Double, SlideStart: scala.Double, SlideEnd: scala.Double): scala.Double = js.native
  def Item(Index: js.Any): Slide = js.native
  /** @param number [Index=-1] */
  def Paste(): SlideRange = js.native
  def Paste(Index: scala.Double): SlideRange = js.native
  def Range(): SlideRange = js.native
  def Range(Index: js.Any): SlideRange = js.native
}

