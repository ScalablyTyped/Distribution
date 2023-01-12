package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaBookmarks extends StObject {
  
  def Add(Position: Double, Name: String): MediaBookmark
  
  val Count: Double
  
  def Item(Index: Double): MediaBookmark
  
  /* private */ @JSName("PowerPoint.MediaBookmarks_typekey")
  var PowerPointDotMediaBookmarks_typekey: MediaBookmarks
}
object MediaBookmarks {
  
  inline def apply(
    Add: (Double, String) => MediaBookmark,
    Count: Double,
    Item: Double => MediaBookmark,
    PowerPointDotMediaBookmarks_typekey: MediaBookmarks
  ): MediaBookmarks = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.updateDynamic("PowerPoint.MediaBookmarks_typekey")(PowerPointDotMediaBookmarks_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaBookmarks]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaBookmarks] (val x: Self) extends AnyVal {
    
    inline def setAdd(value: (Double, String) => MediaBookmark): Self = StObject.set(x, "Add", js.Any.fromFunction2(value))
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => MediaBookmark): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setPowerPointDotMediaBookmarks_typekey(value: MediaBookmarks): Self = StObject.set(x, "PowerPoint.MediaBookmarks_typekey", value.asInstanceOf[js.Any])
  }
}
