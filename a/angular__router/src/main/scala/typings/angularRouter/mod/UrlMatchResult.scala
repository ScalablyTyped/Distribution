package typings.angularRouter.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UrlMatchResult extends js.Object {
  
  var consumed: js.Array[UrlSegment] = js.native
  
  var posParams: js.UndefOr[StringDictionary[UrlSegment]] = js.native
}
object UrlMatchResult {
  
  @scala.inline
  def apply(consumed: js.Array[UrlSegment]): UrlMatchResult = {
    val __obj = js.Dynamic.literal(consumed = consumed.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlMatchResult]
  }
  
  @scala.inline
  implicit class UrlMatchResultOps[Self <: UrlMatchResult] (val x: Self) extends AnyVal {
    
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
    def setConsumedVarargs(value: UrlSegment*): Self = this.set("consumed", js.Array(value :_*))
    
    @scala.inline
    def setConsumed(value: js.Array[UrlSegment]): Self = this.set("consumed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosParams(value: StringDictionary[UrlSegment]): Self = this.set("posParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosParams: Self = this.set("posParams", js.undefined)
  }
}
