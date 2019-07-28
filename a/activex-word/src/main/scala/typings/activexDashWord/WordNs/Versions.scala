package typings.activexDashWord.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Versions")
@js.native
class Versions protected () extends js.Object {
  val Application: typings.activexDashWord.WordNs.Application = js.native
  var AutoVersion: WdAutoVersions = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  var `Word.Versions_typekey`: Versions = js.native
  def Item(Index: Double): Version = js.native
  def Save(): Unit = js.native
  def Save(Comment: js.Any): Unit = js.native
}

