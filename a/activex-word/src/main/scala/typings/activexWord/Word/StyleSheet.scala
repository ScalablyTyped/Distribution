package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StyleSheet extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Creator: Double
  
  def Delete(): Unit
  
  val FullName: String
  
  val Index: Double
  
  def Move(Precedence: WdStyleSheetPrecedence): Unit
  
  val Name: String
  
  val Parent: js.Any
  
  val Path: String
  
  var Title: String
  
  var Type: WdStyleSheetLinkType
  
  /* private */ @JSName("Word.StyleSheet_typekey")
  var WordDotStyleSheet_typekey: StyleSheet
}
object StyleSheet {
  
  inline def apply(
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
  
  extension [Self <: StyleSheet](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    inline def setFullName(value: String): Self = StObject.set(x, "FullName", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    inline def setMove(value: WdStyleSheetPrecedence => Unit): Self = StObject.set(x, "Move", js.Any.fromFunction1(value))
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
    
    inline def setType(value: WdStyleSheetLinkType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setWordDotStyleSheet_typekey(value: StyleSheet): Self = StObject.set(x, "Word.StyleSheet_typekey", value.asInstanceOf[js.Any])
  }
}
