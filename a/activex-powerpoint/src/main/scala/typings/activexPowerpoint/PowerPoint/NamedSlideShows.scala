package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NamedSlideShows extends StObject {
  
  def Add(Name: String, safeArrayOfSlideIDs: js.Any): NamedSlideShow = js.native
  
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  val Count: Double = js.native
  
  def Item(Index: js.Any): NamedSlideShow = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("PowerPoint.NamedSlideShows_typekey")
  var PowerPointDotNamedSlideShows_typekey: NamedSlideShows = js.native
}
object NamedSlideShows {
  
  @scala.inline
  def apply(
    Add: (String, js.Any) => NamedSlideShow,
    Application: Application,
    Count: Double,
    Item: js.Any => NamedSlideShow,
    Parent: js.Any,
    PowerPointDotNamedSlideShows_typekey: NamedSlideShows
  ): NamedSlideShows = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.NamedSlideShows_typekey")(PowerPointDotNamedSlideShows_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamedSlideShows]
  }
  
  @scala.inline
  implicit class NamedSlideShowsMutableBuilder[Self <: NamedSlideShows] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: (String, js.Any) => NamedSlideShow): Self = StObject.set(x, "Add", js.Any.fromFunction2(value))
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: js.Any => NamedSlideShow): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotNamedSlideShows_typekey(value: NamedSlideShows): Self = StObject.set(x, "PowerPoint.NamedSlideShows_typekey", value.asInstanceOf[js.Any])
  }
}
