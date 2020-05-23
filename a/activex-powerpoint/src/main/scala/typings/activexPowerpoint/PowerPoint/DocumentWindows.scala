package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentWindows extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  val Count: Double = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.DocumentWindows_typekey")
  var PowerPointDotDocumentWindows_typekey: DocumentWindows = js.native
  /** @param PowerPoint.PpArrangeStyle [arrangeStyle=1] */
  def Arrange(): Unit = js.native
  def Arrange(arrangeStyle: PpArrangeStyle): Unit = js.native
  def Item(Index: Double): DocumentWindow = js.native
}

