package typings.antvDataSet.treemapMod

import typings.antvDataSet.antvDataSetStrings.treemapBinary
import typings.antvDataSet.antvDataSetStrings.treemapDice
import typings.antvDataSet.antvDataSetStrings.treemapResquarify
import typings.antvDataSet.antvDataSetStrings.treemapSlice
import typings.antvDataSet.antvDataSetStrings.treemapSliceDice
import typings.antvDataSet.antvDataSetStrings.treemapSquarify
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var as: js.Tuple2[String, String] = js.native
  
  /**
    * 字段名 默认为 value
    */
  var field: js.UndefOr[String] = js.native
  
  var padding: js.UndefOr[Double] = js.native
  
  var paddingBottom: js.UndefOr[Double] = js.native
  
  var paddingInner: js.UndefOr[Double] = js.native
  
  var paddingLeft: js.UndefOr[Double] = js.native
  
  var paddingOuter: js.UndefOr[Double] = js.native
  
  var paddingRight: js.UndefOr[Double] = js.native
  
  var paddingTop: js.UndefOr[Double] = js.native
  
  var ratio: js.UndefOr[Double] = js.native
  
  var round: js.UndefOr[Boolean] = js.native
  
  var size: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  
  var tile: js.UndefOr[
    treemapBinary | treemapDice | treemapSlice | treemapSliceDice | treemapSquarify | treemapResquarify
  ] = js.native
}
object Options {
  
  @scala.inline
  def apply(as: js.Tuple2[String, String]): Options = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setAs(value: js.Tuple2[String, String]): Self = this.set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    
    @scala.inline
    def setPadding(value: Double): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setPaddingBottom(value: Double): Self = this.set("paddingBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaddingBottom: Self = this.set("paddingBottom", js.undefined)
    
    @scala.inline
    def setPaddingInner(value: Double): Self = this.set("paddingInner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaddingInner: Self = this.set("paddingInner", js.undefined)
    
    @scala.inline
    def setPaddingLeft(value: Double): Self = this.set("paddingLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaddingLeft: Self = this.set("paddingLeft", js.undefined)
    
    @scala.inline
    def setPaddingOuter(value: Double): Self = this.set("paddingOuter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaddingOuter: Self = this.set("paddingOuter", js.undefined)
    
    @scala.inline
    def setPaddingRight(value: Double): Self = this.set("paddingRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaddingRight: Self = this.set("paddingRight", js.undefined)
    
    @scala.inline
    def setPaddingTop(value: Double): Self = this.set("paddingTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaddingTop: Self = this.set("paddingTop", js.undefined)
    
    @scala.inline
    def setRatio(value: Double): Self = this.set("ratio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRatio: Self = this.set("ratio", js.undefined)
    
    @scala.inline
    def setRound(value: Boolean): Self = this.set("round", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRound: Self = this.set("round", js.undefined)
    
    @scala.inline
    def setSize(value: js.Tuple2[Double, Double]): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setTile(
      value: treemapBinary | treemapDice | treemapSlice | treemapSliceDice | treemapSquarify | treemapResquarify
    ): Self = this.set("tile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTile: Self = this.set("tile", js.undefined)
  }
}
