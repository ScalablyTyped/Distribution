package typings.audiosprite.mod

import org.scalablytyped.runtime.StringDictionary
import typings.audiosprite.anon.End
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Result extends js.Object {
  
  var autoplay: js.UndefOr[String] = js.native
  
  var resources: js.Array[String] = js.native
  
  var spritemap: StringDictionary[End] = js.native
}
object Result {
  
  @scala.inline
  def apply(resources: js.Array[String], spritemap: StringDictionary[End]): Result = {
    val __obj = js.Dynamic.literal(resources = resources.asInstanceOf[js.Any], spritemap = spritemap.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
  
  @scala.inline
  implicit class ResultOps[Self <: Result] (val x: Self) extends AnyVal {
    
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
    def setResourcesVarargs(value: String*): Self = this.set("resources", js.Array(value :_*))
    
    @scala.inline
    def setResources(value: js.Array[String]): Self = this.set("resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpritemap(value: StringDictionary[End]): Self = this.set("spritemap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoplay(value: String): Self = this.set("autoplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoplay: Self = this.set("autoplay", js.undefined)
  }
}
