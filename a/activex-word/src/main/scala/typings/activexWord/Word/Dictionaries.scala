package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dictionaries extends js.Object {
  var ActiveCustomDictionary: Dictionary = js.native
  val Application: typings.activexWord.Word.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Maximum: Double = js.native
  val Parent: js.Any = js.native
  @JSName("Word.Dictionaries_typekey")
  var WordDotDictionaries_typekey: Dictionaries = js.native
  def Add(FileName: String): Dictionary = js.native
  def ClearAll(): Unit = js.native
  def Item(Index: js.Any): Dictionary = js.native
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
  @scala.inline
  implicit class DictionariesOps[Self <: Dictionaries] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActiveCustomDictionary(value: Dictionary): Self = this.set("ActiveCustomDictionary", value.asInstanceOf[js.Any])
    @scala.inline
    def setAdd(value: String => Dictionary): Self = this.set("Add", js.Any.fromFunction1(value))
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setClearAll(value: () => Unit): Self = this.set("ClearAll", js.Any.fromFunction0(value))
    @scala.inline
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: js.Any => Dictionary): Self = this.set("Item", js.Any.fromFunction1(value))
    @scala.inline
    def setMaximum(value: Double): Self = this.set("Maximum", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordDotDictionaries_typekey(value: Dictionaries): Self = this.set("Word.Dictionaries_typekey", value.asInstanceOf[js.Any])
  }
  
}

