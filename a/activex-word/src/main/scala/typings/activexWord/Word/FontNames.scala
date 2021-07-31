package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontNames extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Count: Double
  
  val Creator: Double
  
  def Item(Index: Double): String
  
  val Parent: js.Any
  
  @JSName("Word.FontNames_typekey")
  var WordDotFontNames_typekey: FontNames
}
object FontNames {
  
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: Double => String,
    Parent: js.Any,
    WordDotFontNames_typekey: FontNames
  ): FontNames = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.FontNames_typekey")(WordDotFontNames_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontNames]
  }
  
  @scala.inline
  implicit class FontNamesMutableBuilder[Self <: FontNames] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Double => String): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotFontNames_typekey(value: FontNames): Self = StObject.set(x, "Word.FontNames_typekey", value.asInstanceOf[js.Any])
  }
}
