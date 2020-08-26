package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTemplates extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  @JSName("Word.ListTemplates_typekey")
  var WordDotListTemplates_typekey: ListTemplates = js.native
  def Add(): ListTemplate = js.native
  def Add(OutlineNumbered: js.UndefOr[scala.Nothing], Name: js.Any): ListTemplate = js.native
  def Add(OutlineNumbered: js.Any): ListTemplate = js.native
  def Add(OutlineNumbered: js.Any, Name: js.Any): ListTemplate = js.native
  def Item(Index: js.Any): ListTemplate = js.native
}

