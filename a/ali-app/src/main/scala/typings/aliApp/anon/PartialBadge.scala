package typings.aliApp.anon

import typings.aliApp.aliAppStrings.more
import typings.aliApp.aliAppStrings.none
import typings.aliApp.aliAppStrings.num
import typings.aliApp.aliAppStrings.point
import typings.aliApp.aliAppStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<ali-app.my.Badge> */
@js.native
trait PartialBadge extends StObject {
  
  var index: js.UndefOr[Double] = js.native
  
  var text: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[none | point | num | text | more | String] = js.native
}
object PartialBadge {
  
  @scala.inline
  def apply(): PartialBadge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialBadge]
  }
  
  @scala.inline
  implicit class PartialBadgeMutableBuilder[Self <: PartialBadge] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setType(value: none | point | num | text | more | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
