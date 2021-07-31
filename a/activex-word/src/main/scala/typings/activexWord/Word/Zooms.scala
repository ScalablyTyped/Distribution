package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Zooms extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Creator: Double
  
  def Item(Index: WdViewType): Zoom
  
  val Parent: js.Any
  
  @JSName("Word.Zooms_typekey")
  var WordDotZooms_typekey: Zooms
}
object Zooms {
  
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Item: WdViewType => Zoom,
    Parent: js.Any,
    WordDotZooms_typekey: Zooms
  ): Zooms = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Zooms_typekey")(WordDotZooms_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Zooms]
  }
  
  @scala.inline
  implicit class ZoomsMutableBuilder[Self <: Zooms] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: WdViewType => Zoom): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotZooms_typekey(value: Zooms): Self = StObject.set(x, "Word.Zooms_typekey", value.asInstanceOf[js.Any])
  }
}
