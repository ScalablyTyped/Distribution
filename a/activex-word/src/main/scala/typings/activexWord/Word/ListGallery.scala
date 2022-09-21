package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListGallery extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Creator: Double
  
  val ListTemplates: typings.activexWord.Word.ListTemplates
  
  def Modified(Index: Double): Boolean
  
  val Parent: Any
  
  def Reset(Index: Double): Unit
  
  /* private */ @JSName("Word.ListGallery_typekey")
  var WordDotListGallery_typekey: ListGallery
}
object ListGallery {
  
  inline def apply(
    Application: Application,
    Creator: Double,
    ListTemplates: ListTemplates,
    Modified: Double => Boolean,
    Parent: Any,
    Reset: Double => Unit,
    WordDotListGallery_typekey: ListGallery
  ): ListGallery = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], ListTemplates = ListTemplates.asInstanceOf[js.Any], Modified = js.Any.fromFunction1(Modified), Parent = Parent.asInstanceOf[js.Any], Reset = js.Any.fromFunction1(Reset))
    __obj.updateDynamic("Word.ListGallery_typekey")(WordDotListGallery_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListGallery]
  }
  
  extension [Self <: ListGallery](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setListTemplates(value: ListTemplates): Self = StObject.set(x, "ListTemplates", value.asInstanceOf[js.Any])
    
    inline def setModified(value: Double => Boolean): Self = StObject.set(x, "Modified", js.Any.fromFunction1(value))
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setReset(value: Double => Unit): Self = StObject.set(x, "Reset", js.Any.fromFunction1(value))
    
    inline def setWordDotListGallery_typekey(value: ListGallery): Self = StObject.set(x, "Word.ListGallery_typekey", value.asInstanceOf[js.Any])
  }
}
