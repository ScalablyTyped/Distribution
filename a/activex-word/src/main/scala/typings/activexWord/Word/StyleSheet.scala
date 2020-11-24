package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StyleSheet extends js.Object {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Creator: Double = js.native
  
  def Delete(): Unit = js.native
  
  val FullName: String = js.native
  
  val Index: Double = js.native
  
  def Move(Precedence: WdStyleSheetPrecedence): Unit = js.native
  
  val Name: String = js.native
  
  val Parent: js.Any = js.native
  
  val Path: String = js.native
  
  var Title: String = js.native
  
  var Type: WdStyleSheetLinkType = js.native
  
  @JSName("Word.StyleSheet_typekey")
  var WordDotStyleSheet_typekey: StyleSheet = js.native
}
object StyleSheet {
  
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Delete: () => Unit,
    FullName: String,
    Index: Double,
    Move: WdStyleSheetPrecedence => Unit,
    Name: String,
    Parent: js.Any,
    Path: String,
    Title: String,
    Type: WdStyleSheetLinkType,
    WordDotStyleSheet_typekey: StyleSheet
  ): StyleSheet = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), FullName = FullName.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], Move = js.Any.fromFunction1(Move), Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.StyleSheet_typekey")(WordDotStyleSheet_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleSheet]
  }
  
  @scala.inline
  implicit class StyleSheetOps[Self <: StyleSheet] (val x: Self) extends AnyVal {
    
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
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => Unit): Self = this.set("Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFullName(value: String): Self = this.set("FullName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("Index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMove(value: WdStyleSheetPrecedence => Unit): Self = this.set("Move", js.Any.fromFunction1(value))
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("Title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: WdStyleSheetLinkType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotStyleSheet_typekey(value: StyleSheet): Self = this.set("Word.StyleSheet_typekey", value.asInstanceOf[js.Any])
  }
}
