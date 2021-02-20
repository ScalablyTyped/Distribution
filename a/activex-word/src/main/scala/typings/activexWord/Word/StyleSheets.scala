package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StyleSheets extends StObject {
  
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
  implicit class StyleSheetsMutableBuilder[Self <: StyleSheets] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: (String, WdStyleSheetLinkType, String, WdStyleSheetPrecedence) => StyleSheet): Self = StObject.set(x, "Add", js.Any.fromFunction4(value))
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: js.Any => StyleSheet): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotStyleSheets_typekey(value: StyleSheets): Self = StObject.set(x, "Word.StyleSheets_typekey", value.asInstanceOf[js.Any])
  }
}
