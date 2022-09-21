package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Zooms extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Creator: Double
  
  def Item(Index: WdViewType): Zoom
  
  val Parent: Any
  
  /* private */ @JSName("Word.Zooms_typekey")
  var WordDotZooms_typekey: Zooms
}
object Zooms {
  
  inline def apply(
    Application: Application,
    Creator: Double,
    Item: WdViewType => Zoom,
    Parent: Any,
    WordDotZooms_typekey: Zooms
  ): Zooms = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Zooms_typekey")(WordDotZooms_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Zooms]
  }
  
  extension [Self <: Zooms](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setItem(value: WdViewType => Zoom): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setWordDotZooms_typekey(value: Zooms): Self = StObject.set(x, "Word.Zooms_typekey", value.asInstanceOf[js.Any])
  }
}
