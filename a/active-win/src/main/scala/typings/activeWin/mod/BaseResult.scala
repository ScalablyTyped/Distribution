package typings.activeWin.mod

import typings.activeWin.anon.Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseResult extends js.Object {
  
  /**
  		Window position and size.
  		*/
  var bounds: Height = js.native
  
  /**
  		Window identifier.
  		On Windows, there isn't a clear notion of a "Window ID". Instead it returns the memory address of the window "handle" in the `id` property. That "handle" is unique per window, so it can be used to identify them. [Read more…](https://msdn.microsoft.com/en-us/library/windows/desktop/ms632597(v=vs.85).aspx#window_handle).
  		*/
  var id: Double = js.native
  
  /**
  		Memory usage by the window.
  		*/
  var memoryUsage: Double = js.native
  
  /**
  		App that owns the window.
  		*/
  var owner: BaseOwner = js.native
  
  /**
  		Window title.
  		*/
  var title: String = js.native
}
object BaseResult {
  
  @scala.inline
  def apply(bounds: Height, id: Double, memoryUsage: Double, owner: BaseOwner, title: String): BaseResult = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], memoryUsage = memoryUsage.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseResult]
  }
  
  @scala.inline
  implicit class BaseResultOps[Self <: BaseResult] (val x: Self) extends AnyVal {
    
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
    def setBounds(value: Height): Self = this.set("bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemoryUsage(value: Double): Self = this.set("memoryUsage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: BaseOwner): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
}
