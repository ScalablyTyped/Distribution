package typings.algoliaClientSearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Extract extends js.Object {
  
  var extract: String = js.native
  
  var extractAttribute: String = js.native
  
  var score: Double = js.native
}
object Extract {
  
  @scala.inline
  def apply(extract: String, extractAttribute: String, score: Double): Extract = {
    val __obj = js.Dynamic.literal(extract = extract.asInstanceOf[js.Any], extractAttribute = extractAttribute.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extract]
  }
  
  @scala.inline
  implicit class ExtractOps[Self <: Extract] (val x: Self) extends AnyVal {
    
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
    def setExtract(value: String): Self = this.set("extract", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtractAttribute(value: String): Self = this.set("extractAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScore(value: Double): Self = this.set("score", value.asInstanceOf[js.Any])
  }
}
