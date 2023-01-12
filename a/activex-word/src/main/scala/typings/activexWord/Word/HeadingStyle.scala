package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeadingStyle extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Creator: Double
  
  def Delete(): Unit
  
  var Level: Double
  
  val Parent: Any
  
  var Style: Any
  
  /* private */ @JSName("Word.HeadingStyle_typekey")
  var WordDotHeadingStyle_typekey: HeadingStyle
}
object HeadingStyle {
  
  inline def apply(
    Application: Application,
    Creator: Double,
    Delete: () => Unit,
    Level: Double,
    Parent: Any,
    Style: Any,
    WordDotHeadingStyle_typekey: HeadingStyle
  ): HeadingStyle = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Level = Level.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Style = Style.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.HeadingStyle_typekey")(WordDotHeadingStyle_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeadingStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HeadingStyle] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    inline def setLevel(value: Double): Self = StObject.set(x, "Level", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: Any): Self = StObject.set(x, "Style", value.asInstanceOf[js.Any])
    
    inline def setWordDotHeadingStyle_typekey(value: HeadingStyle): Self = StObject.set(x, "Word.HeadingStyle_typekey", value.asInstanceOf[js.Any])
  }
}
