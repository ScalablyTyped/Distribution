package typings.atom.anon

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllowPrevious extends js.Object {
  
  var allowPrevious: js.UndefOr[Boolean] = js.native
  
  var includeNonWordCharacters: js.UndefOr[Boolean] = js.native
  
  var wordRegex: js.UndefOr[RegExp] = js.native
}
object AllowPrevious {
  
  @scala.inline
  def apply(): AllowPrevious = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowPrevious]
  }
  
  @scala.inline
  implicit class AllowPreviousOps[Self <: AllowPrevious] (val x: Self) extends AnyVal {
    
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
    def setAllowPrevious(value: Boolean): Self = this.set("allowPrevious", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowPrevious: Self = this.set("allowPrevious", js.undefined)
    
    @scala.inline
    def setIncludeNonWordCharacters(value: Boolean): Self = this.set("includeNonWordCharacters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeNonWordCharacters: Self = this.set("includeNonWordCharacters", js.undefined)
    
    @scala.inline
    def setWordRegex(value: RegExp): Self = this.set("wordRegex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWordRegex: Self = this.set("wordRegex", js.undefined)
  }
}
