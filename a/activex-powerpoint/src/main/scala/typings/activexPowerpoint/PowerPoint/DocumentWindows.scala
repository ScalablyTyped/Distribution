package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentWindows extends StObject {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  /** @param PowerPoint.PpArrangeStyle [arrangeStyle=1] */
  def Arrange(): Unit = js.native
  def Arrange(arrangeStyle: PpArrangeStyle): Unit = js.native
  
  val Count: Double = js.native
  
  def Item(Index: Double): DocumentWindow = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("PowerPoint.DocumentWindows_typekey")
  var PowerPointDotDocumentWindows_typekey: DocumentWindows = js.native
}
