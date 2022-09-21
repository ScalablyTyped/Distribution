package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NamedSlideShows extends StObject {
  
  def Add(Name: String, safeArrayOfSlideIDs: Any): NamedSlideShow
  
  val Application: typings.activexPowerpoint.PowerPoint.Application
  
  val Count: Double
  
  def Item(Index: Any): NamedSlideShow
  
  val Parent: Any
  
  /* private */ @JSName("PowerPoint.NamedSlideShows_typekey")
  var PowerPointDotNamedSlideShows_typekey: NamedSlideShows
}
object NamedSlideShows {
  
  inline def apply(
    Add: (String, Any) => NamedSlideShow,
    Application: Application,
    Count: Double,
    Item: Any => NamedSlideShow,
    Parent: Any,
    PowerPointDotNamedSlideShows_typekey: NamedSlideShows
  ): NamedSlideShows = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.NamedSlideShows_typekey")(PowerPointDotNamedSlideShows_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamedSlideShows]
  }
  
  extension [Self <: NamedSlideShows](x: Self) {
    
    inline def setAdd(value: (String, Any) => NamedSlideShow): Self = StObject.set(x, "Add", js.Any.fromFunction2(value))
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Any => NamedSlideShow): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotNamedSlideShows_typekey(value: NamedSlideShows): Self = StObject.set(x, "PowerPoint.NamedSlideShows_typekey", value.asInstanceOf[js.Any])
  }
}
