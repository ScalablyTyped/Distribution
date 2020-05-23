package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HangulHanjaConversionDictionaries extends js.Object {
  var ActiveCustomDictionary: Dictionary
  val Application: typings.activexWord.Word.Application
  val BuiltinDictionary: Dictionary
  val Count: Double
  val Creator: Double
  val Maximum: Double
  val Parent: js.Any
  @JSName("Word.HangulHanjaConversionDictionaries_typekey")
  var WordDotHangulHanjaConversionDictionaries_typekey: HangulHanjaConversionDictionaries
  def Add(FileName: String): Dictionary
  def ClearAll(): Unit
  def Item(Index: js.Any): Dictionary
}

object HangulHanjaConversionDictionaries {
  @scala.inline
  def apply(
    ActiveCustomDictionary: Dictionary,
    Add: String => Dictionary,
    Application: Application,
    BuiltinDictionary: Dictionary,
    ClearAll: () => Unit,
    Count: Double,
    Creator: Double,
    Item: js.Any => Dictionary,
    Maximum: Double,
    Parent: js.Any,
    WordDotHangulHanjaConversionDictionaries_typekey: HangulHanjaConversionDictionaries
  ): HangulHanjaConversionDictionaries = {
    val __obj = js.Dynamic.literal(ActiveCustomDictionary = ActiveCustomDictionary.asInstanceOf[js.Any], Add = js.Any.fromFunction1(Add), Application = Application.asInstanceOf[js.Any], BuiltinDictionary = BuiltinDictionary.asInstanceOf[js.Any], ClearAll = js.Any.fromFunction0(ClearAll), Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Maximum = Maximum.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.HangulHanjaConversionDictionaries_typekey")(WordDotHangulHanjaConversionDictionaries_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HangulHanjaConversionDictionaries]
  }
}

