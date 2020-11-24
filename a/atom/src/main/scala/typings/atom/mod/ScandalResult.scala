package typings.atom.mod

import typings.atom.anon.LeadingContextLines
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScandalResult extends js.Object {
  
  var filePath: String = js.native
  
  var matches: js.Array[LeadingContextLines] = js.native
}
object ScandalResult {
  
  @scala.inline
  def apply(filePath: String, matches: js.Array[LeadingContextLines]): ScandalResult = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], matches = matches.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScandalResult]
  }
  
  @scala.inline
  implicit class ScandalResultOps[Self <: ScandalResult] (val x: Self) extends AnyVal {
    
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
    def setFilePath(value: String): Self = this.set("filePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchesVarargs(value: LeadingContextLines*): Self = this.set("matches", js.Array(value :_*))
    
    @scala.inline
    def setMatches(value: js.Array[LeadingContextLines]): Self = this.set("matches", value.asInstanceOf[js.Any])
  }
}
