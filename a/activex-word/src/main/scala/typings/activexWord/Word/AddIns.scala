package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddIns extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  @JSName("Word.AddIns_typekey")
  var WordDotAddIns_typekey: AddIns = js.native
  def Add(FileName: String): AddIn = js.native
  def Add(FileName: String, Install: js.Any): AddIn = js.native
  def Item(Index: js.Any): AddIn = js.native
  def Unload(RemoveFromList: Boolean): Unit = js.native
}

