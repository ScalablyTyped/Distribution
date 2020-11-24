package typings.angularRouter.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dictk
  extends /* k */ StringDictionary[js.Any] {
  
  var navigationId: Double = js.native
}
object Dictk {
  
  @scala.inline
  def apply(navigationId: Double): Dictk = {
    val __obj = js.Dynamic.literal(navigationId = navigationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictk]
  }
  
  @scala.inline
  implicit class DictkOps[Self <: Dictk] (val x: Self) extends AnyVal {
    
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
    def setNavigationId(value: Double): Self = this.set("navigationId", value.asInstanceOf[js.Any])
  }
}
