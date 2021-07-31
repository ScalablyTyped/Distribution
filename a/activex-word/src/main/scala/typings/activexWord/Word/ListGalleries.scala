package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListGalleries extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Count: Double
  
  val Creator: Double
  
  def Item(Index: WdListGalleryType): ListGallery
  
  val Parent: js.Any
  
  @JSName("Word.ListGalleries_typekey")
  var WordDotListGalleries_typekey: ListGalleries
}
object ListGalleries {
  
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: WdListGalleryType => ListGallery,
    Parent: js.Any,
    WordDotListGalleries_typekey: ListGalleries
  ): ListGalleries = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.ListGalleries_typekey")(WordDotListGalleries_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListGalleries]
  }
  
  @scala.inline
  implicit class ListGalleriesMutableBuilder[Self <: ListGalleries] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: WdListGalleryType => ListGallery): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotListGalleries_typekey(value: ListGalleries): Self = StObject.set(x, "Word.ListGalleries_typekey", value.asInstanceOf[js.Any])
  }
}
