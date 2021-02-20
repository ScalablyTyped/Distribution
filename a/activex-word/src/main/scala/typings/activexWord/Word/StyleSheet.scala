package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StyleSheet extends StObject {
  
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
  implicit class StyleSheetMutableBuilder[Self <: StyleSheet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFullName(value: String): Self = StObject.set(x, "FullName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMove(value: WdStyleSheetPrecedence => Unit): Self = StObject.set(x, "Move", js.Any.fromFunction1(value))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: WdStyleSheetLinkType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotStyleSheet_typekey(value: StyleSheet): Self = StObject.set(x, "Word.StyleSheet_typekey", value.asInstanceOf[js.Any])
  }
}
