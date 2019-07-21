package typings
package activeDashWinLib.activeDashWinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseResult extends js.Object {
  /**
  		Window position and size.
  		*/
  var bounds: activeDashWinLib.Anon_Height
  /**
  		Window identifier.
  		On Windows, there isn't a clear notion of a "Window ID". Instead it returns the memory address of the window "handle" in the `id` property. That "handle" is unique per window, so it can be used to identify them. [Read more…](https://msdn.microsoft.com/en-us/library/windows/desktop/ms632597(v=vs.85).aspx#window_handle).
  		*/
  var id: scala.Double
  /**
  		Memory usage by the window.
  		*/
  var memoryUsage: scala.Double
  /**
  		App that owns the window.
  		*/
  var owner: BaseOwner
  /**
  		Window title.
  		*/
  var title: java.lang.String
}

object BaseResult {
  @scala.inline
  def apply(
    bounds: activeDashWinLib.Anon_Height,
    id: scala.Double,
    memoryUsage: scala.Double,
    owner: BaseOwner,
    title: java.lang.String
  ): BaseResult = {
    val __obj = js.Dynamic.literal(bounds = bounds, id = id, memoryUsage = memoryUsage, owner = owner, title = title)
  
    __obj.asInstanceOf[BaseResult]
  }
}

