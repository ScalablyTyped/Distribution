package typings.atlassianCrowdClient.anon

import typings.atlassianCrowdClient.attributesMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Remove extends js.Object {
  
  def list(groupname: String): js.Promise[^] = js.native
  
  def remove(groupname: String, attributename: String): js.Promise[Unit] = js.native
  
  def set(groupname: String, attributes: ^): js.Promise[^] = js.native
}
object Remove {
  
  @scala.inline
  def apply(
    list: String => js.Promise[^],
    remove: (String, String) => js.Promise[Unit],
    set: (String, ^) => js.Promise[^]
  ): Remove = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list), remove = js.Any.fromFunction2(remove), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[Remove]
  }
  
  @scala.inline
  implicit class RemoveOps[Self <: Remove] (val x: Self) extends AnyVal {
    
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
    def setList(value: String => js.Promise[^]): Self = this.set("list", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemove(value: (String, String) => js.Promise[Unit]): Self = this.set("remove", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSet(value: (String, ^) => js.Promise[^]): Self = this.set("set", js.Any.fromFunction2(value))
  }
}
