package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropCap extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  def Clear(): Unit
  
  val Creator: Double
  
  var DistanceFromText: Double
  
  def Enable(): Unit
  
  var FontName: String
  
  var LinesToDrop: Double
  
  val Parent: js.Any
  
  var Position: WdDropPosition
  
  /* private */ @JSName("Word.DropCap_typekey")
  var WordDotDropCap_typekey: DropCap
}
object DropCap {
  
  inline def apply(
    Application: Application,
    Clear: () => Unit,
    Creator: Double,
    DistanceFromText: Double,
    Enable: () => Unit,
    FontName: String,
    LinesToDrop: Double,
    Parent: js.Any,
    Position: WdDropPosition,
    WordDotDropCap_typekey: DropCap
  ): DropCap = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Clear = js.Any.fromFunction0(Clear), Creator = Creator.asInstanceOf[js.Any], DistanceFromText = DistanceFromText.asInstanceOf[js.Any], Enable = js.Any.fromFunction0(Enable), FontName = FontName.asInstanceOf[js.Any], LinesToDrop = LinesToDrop.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.DropCap_typekey")(WordDotDropCap_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropCap]
  }
  
  extension [Self <: DropCap](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setClear(value: () => Unit): Self = StObject.set(x, "Clear", js.Any.fromFunction0(value))
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDistanceFromText(value: Double): Self = StObject.set(x, "DistanceFromText", value.asInstanceOf[js.Any])
    
    inline def setEnable(value: () => Unit): Self = StObject.set(x, "Enable", js.Any.fromFunction0(value))
    
    inline def setFontName(value: String): Self = StObject.set(x, "FontName", value.asInstanceOf[js.Any])
    
    inline def setLinesToDrop(value: Double): Self = StObject.set(x, "LinesToDrop", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: WdDropPosition): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
    
    inline def setWordDotDropCap_typekey(value: DropCap): Self = StObject.set(x, "Word.DropCap_typekey", value.asInstanceOf[js.Any])
  }
}
