package typings.angularCore.anon

import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Directives extends js.Object {
  
  var directives: Set[_] = js.native
  
  var pipes: Set[_] = js.native
}
object Directives {
  
  @scala.inline
  def apply(directives: Set[_], pipes: Set[_]): Directives = {
    val __obj = js.Dynamic.literal(directives = directives.asInstanceOf[js.Any], pipes = pipes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Directives]
  }
  
  @scala.inline
  implicit class DirectivesOps[Self <: Directives] (val x: Self) extends AnyVal {
    
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
    def setDirectives(value: Set[_]): Self = this.set("directives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPipes(value: Set[_]): Self = this.set("pipes", value.asInstanceOf[js.Any])
  }
}
