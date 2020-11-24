package typings.activexLibreoffice.com_.sun.star.style

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** contains settings for the style of paragraphs with complex text layout. */
@js.native
trait ParagraphPropertiesComplex extends js.Object {
  
  /** contains the writing direction, as represented by the {@link com.sun.star.text.WritingMode2} constants */
  var WritingMode: Double = js.native
}
object ParagraphPropertiesComplex {
  
  @scala.inline
  def apply(WritingMode: Double): ParagraphPropertiesComplex = {
    val __obj = js.Dynamic.literal(WritingMode = WritingMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParagraphPropertiesComplex]
  }
  
  @scala.inline
  implicit class ParagraphPropertiesComplexOps[Self <: ParagraphPropertiesComplex] (val x: Self) extends AnyVal {
    
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
    def setWritingMode(value: Double): Self = this.set("WritingMode", value.asInstanceOf[js.Any])
  }
}
