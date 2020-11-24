package typings.antd.dropdownDropdownMod

import typings.antd.anon.AdjustX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Align extends js.Object {
  
  var offset: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  
  var overflow: js.UndefOr[AdjustX] = js.native
  
  var points: js.UndefOr[js.Tuple2[String, String]] = js.native
  
  var targetOffset: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  
  var useCssBottom: js.UndefOr[Boolean] = js.native
  
  var useCssRight: js.UndefOr[Boolean] = js.native
  
  var useCssTransform: js.UndefOr[Boolean] = js.native
}
object Align {
  
  @scala.inline
  def apply(): Align = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Align]
  }
  
  @scala.inline
  implicit class AlignOps[Self <: Align] (val x: Self) extends AnyVal {
    
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
    def setOffset(value: js.Tuple2[Double, Double]): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setOverflow(value: AdjustX): Self = this.set("overflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverflow: Self = this.set("overflow", js.undefined)
    
    @scala.inline
    def setPoints(value: js.Tuple2[String, String]): Self = this.set("points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoints: Self = this.set("points", js.undefined)
    
    @scala.inline
    def setTargetOffset(value: js.Tuple2[Double, Double]): Self = this.set("targetOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetOffset: Self = this.set("targetOffset", js.undefined)
    
    @scala.inline
    def setUseCssBottom(value: Boolean): Self = this.set("useCssBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseCssBottom: Self = this.set("useCssBottom", js.undefined)
    
    @scala.inline
    def setUseCssRight(value: Boolean): Self = this.set("useCssRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseCssRight: Self = this.set("useCssRight", js.undefined)
    
    @scala.inline
    def setUseCssTransform(value: Boolean): Self = this.set("useCssTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseCssTransform: Self = this.set("useCssTransform", js.undefined)
  }
}
