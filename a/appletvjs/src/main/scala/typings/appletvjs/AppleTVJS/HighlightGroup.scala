package typings.appletvjs.AppleTVJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HighlightGroup extends js.Object {
  
  /** The hightlights in the highlight group. */
  var hightlights: js.Array[Highlight] = js.native
  
  /** The name of the highlight group. */
  var name: String = js.native
}
object HighlightGroup {
  
  @scala.inline
  def apply(hightlights: js.Array[Highlight], name: String): HighlightGroup = {
    val __obj = js.Dynamic.literal(hightlights = hightlights.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightGroup]
  }
  
  @scala.inline
  implicit class HighlightGroupOps[Self <: HighlightGroup] (val x: Self) extends AnyVal {
    
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
    def setHightlightsVarargs(value: Highlight*): Self = this.set("hightlights", js.Array(value :_*))
    
    @scala.inline
    def setHightlights(value: js.Array[Highlight]): Self = this.set("hightlights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
