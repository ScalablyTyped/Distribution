package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StyleSheets extends js.Object {
  
  def Add(
    FileName: String,
    LinkType: WdStyleSheetLinkType,
    Title: String,
    Precedence: WdStyleSheetPrecedence
  ): StyleSheet = js.native
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: js.Any): StyleSheet = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("Word.StyleSheets_typekey")
  var WordDotStyleSheets_typekey: StyleSheets = js.native
}
object StyleSheets {
  
  @scala.inline
  def apply(
    Add: (String, WdStyleSheetLinkType, String, WdStyleSheetPrecedence) => StyleSheet,
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: js.Any => StyleSheet,
    Parent: js.Any,
    WordDotStyleSheets_typekey: StyleSheets
  ): StyleSheets = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction4(Add), Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.StyleSheets_typekey")(WordDotStyleSheets_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleSheets]
  }
  
  @scala.inline
  implicit class StyleSheetsOps[Self <: StyleSheets] (val x: Self) extends AnyVal {
    
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
    def setAdd(value: (String, WdStyleSheetLinkType, String, WdStyleSheetPrecedence) => StyleSheet): Self = this.set("Add", js.Any.fromFunction4(value))
    
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: js.Any => StyleSheet): Self = this.set("Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotStyleSheets_typekey(value: StyleSheets): Self = this.set("Word.StyleSheets_typekey", value.asInstanceOf[js.Any])
  }
}
