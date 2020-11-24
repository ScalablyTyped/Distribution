package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NamedSlideShows extends js.Object {
  
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
  implicit class NamedSlideShowsOps[Self <: NamedSlideShows] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdd(value: (String, js.Any) => NamedSlideShow): Self = this.set("Add", js.Any.fromFunction2(value))
    
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: js.Any => NamedSlideShow): Self = this.set("Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotNamedSlideShows_typekey(value: NamedSlideShows): Self = this.set("PowerPoint.NamedSlideShows_typekey", value.asInstanceOf[js.Any])
  }
}
