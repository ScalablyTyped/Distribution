package typings.activeDashWin.activeDashWinMod

import typings.activeDashWin.Anon_Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseResult extends js.Object {
  /**
  		Window position and size.
  		*/
  var bounds: Anon_Height
  /**
  		Window identifier.
  		On Windows, there isn't a clear notion of a "Window ID". Instead it returns the memory address of the window "handle" in the `id` property. That "handle" is unique per window, so it can be used to identify them. [Read more…](https://msdn.microsoft.com/en-us/library/windows/desktop/ms632597(v=vs.85).aspx#window_handle).
  		*/
  var id: Double
  /**
  		Memory usage by the window.
  		*/
  var memoryUsage: Double
  /**
  		App that owns the window.
  		*/
  var owner: BaseOwner
  /**
  		Window title.
  		*/
  var title: String
}

object BaseResult {
  @scala.inline
  def apply(bounds: Anon_Height, id: Double, memoryUsage: Double, owner: BaseOwner, title: String): BaseResult = {
    val __obj = js.Dynamic.literal(bounds = bounds, id = id, memoryUsage = memoryUsage, owner = owner, title = title)
  
    __obj.asInstanceOf[BaseResult]
  }
}

