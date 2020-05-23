package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OMathArgs extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  @JSName("Word.OMathArgs_typekey")
  var WordDotOMathArgs_typekey: OMathArgs = js.native
  def Add(): OMath = js.native
  def Add(BeforeArg: js.Any): OMath = js.native
  def Item(Index: Double): OMath = js.native
}

