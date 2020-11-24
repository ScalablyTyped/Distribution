package typings.angularfire

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AngularFireSimpleObject
  extends /* key */ StringDictionary[js.Any] {
  
  @JSName("$id")
  var $id: String = js.native
  
  @JSName("$priority")
  var $priority: Double = js.native
  
  @JSName("$value")
  var $value: js.Any = js.native
}
object AngularFireSimpleObject {
  
  @scala.inline
  def apply($id: String, $priority: Double, $value: js.Any): AngularFireSimpleObject = {
    val __obj = js.Dynamic.literal($id = $id.asInstanceOf[js.Any], $priority = $priority.asInstanceOf[js.Any], $value = $value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AngularFireSimpleObject]
  }
  
  @scala.inline
  implicit class AngularFireSimpleObjectOps[Self <: AngularFireSimpleObject] (val x: Self) extends AnyVal {
    
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
    def set$id(value: String): Self = this.set("$id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$priority(value: Double): Self = this.set("$priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$value(value: js.Any): Self = this.set("$value", value.asInstanceOf[js.Any])
  }
}
