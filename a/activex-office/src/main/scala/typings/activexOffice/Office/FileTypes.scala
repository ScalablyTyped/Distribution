package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileTypes extends js.Object {
  
  def apply(Index: Double): MsoFileType = js.native
  
  def Add(FileType: MsoFileType): Unit = js.native
  
  val Application: js.Any = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: Double): MsoFileType = js.native
  
  def Remove(Index: Double): Unit = js.native
}
