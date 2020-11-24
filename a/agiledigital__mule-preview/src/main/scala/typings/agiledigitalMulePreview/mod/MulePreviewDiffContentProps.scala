package typings.agiledigitalMulePreview.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MulePreviewDiffContentProps extends js.Object {
  
  val contentRoot: String = js.native
  
  val contentStrings: js.Tuple2[js.UndefOr[String], js.UndefOr[String]] = js.native
}
object MulePreviewDiffContentProps {
  
  @scala.inline
  def apply(contentRoot: String, contentStrings: js.Tuple2[js.UndefOr[String], js.UndefOr[String]]): MulePreviewDiffContentProps = {
    val __obj = js.Dynamic.literal(contentRoot = contentRoot.asInstanceOf[js.Any], contentStrings = contentStrings.asInstanceOf[js.Any])
    __obj.asInstanceOf[MulePreviewDiffContentProps]
  }
  
  @scala.inline
  implicit class MulePreviewDiffContentPropsOps[Self <: MulePreviewDiffContentProps] (val x: Self) extends AnyVal {
    
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
    def setContentRoot(value: String): Self = this.set("contentRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentStrings(value: js.Tuple2[js.UndefOr[String], js.UndefOr[String]]): Self = this.set("contentStrings", value.asInstanceOf[js.Any])
  }
}
