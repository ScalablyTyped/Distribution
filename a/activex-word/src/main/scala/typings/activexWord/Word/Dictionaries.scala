package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dictionaries extends js.Object {
  var ActiveCustomDictionary: Dictionary
  val Application: typings.activexWord.Word.Application
  val Count: Double
  val Creator: Double
  val Maximum: Double
  val Parent: js.Any
  @JSName("Word.Dictionaries_typekey")
  var WordDotDictionaries_typekey: Dictionaries
  def Add(FileName: String): Dictionary
  def ClearAll(): Unit
  def Item(Index: js.Any): Dictionary
}

object Dictionaries {
  @scala.inline
  def apply(
    ActiveCustomDictionary: Dictionary,
    Add: String => Dictionary,
    Application: Application,
    ClearAll: () => Unit,
    Count: Double,
    Creator: Double,
    Item: js.Any => Dictionary,
    Maximum: Double,
    Parent: js.Any,
    WordDotDictionaries_typekey: Dictionaries
  ): Dictionaries = {
    val __obj = js.Dynamic.literal(ActiveCustomDictionary = ActiveCustomDictionary.asInstanceOf[js.Any], Add = js.Any.fromFunction1(Add), Application = Application.asInstanceOf[js.Any], ClearAll = js.Any.fromFunction0(ClearAll), Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Maximum = Maximum.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Dictionaries_typekey")(WordDotDictionaries_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictionaries]
  }
}

