package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NamedSlideShow extends js.Object {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  val Count: Double = js.native
  
  def Delete(): Unit = js.native
  
  val Name: String = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("PowerPoint.NamedSlideShow_typekey")
  var PowerPointDotNamedSlideShow_typekey: NamedSlideShow = js.native
  
  val SlideIDs: js.Any = js.native
}
object NamedSlideShow {
  
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Delete: () => Unit,
    Name: String,
    Parent: js.Any,
    PowerPointDotNamedSlideShow_typekey: NamedSlideShow,
    SlideIDs: js.Any
  ): NamedSlideShow = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], SlideIDs = SlideIDs.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.NamedSlideShow_typekey")(PowerPointDotNamedSlideShow_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamedSlideShow]
  }
  
  @scala.inline
  implicit class NamedSlideShowOps[Self <: NamedSlideShow] (val x: Self) extends AnyVal {
    
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
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => Unit): Self = this.set("Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotNamedSlideShow_typekey(value: NamedSlideShow): Self = this.set("PowerPoint.NamedSlideShow_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlideIDs(value: js.Any): Self = this.set("SlideIDs", value.asInstanceOf[js.Any])
  }
}
