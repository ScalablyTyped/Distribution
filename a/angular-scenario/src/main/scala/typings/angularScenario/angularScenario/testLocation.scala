package typings.angularScenario.angularScenario

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait testLocation extends js.Object {
  
  def hash(): Future = js.native
  
  def path(): Future = js.native
  
  def search(): Future = js.native
  
  def url(): Future = js.native
}
object testLocation {
  
  @scala.inline
  def apply(hash: () => Future, path: () => Future, search: () => Future, url: () => Future): testLocation = {
    val __obj = js.Dynamic.literal(hash = js.Any.fromFunction0(hash), path = js.Any.fromFunction0(path), search = js.Any.fromFunction0(search), url = js.Any.fromFunction0(url))
    __obj.asInstanceOf[testLocation]
  }
  
  @scala.inline
  implicit class testLocationOps[Self <: testLocation] (val x: Self) extends AnyVal {
    
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
    def setHash(value: () => Future): Self = this.set("hash", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPath(value: () => Future): Self = this.set("path", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSearch(value: () => Future): Self = this.set("search", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUrl(value: () => Future): Self = this.set("url", js.Any.fromFunction0(value))
  }
}
