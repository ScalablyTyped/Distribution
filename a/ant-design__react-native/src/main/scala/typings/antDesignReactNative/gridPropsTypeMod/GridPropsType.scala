package typings.antDesignReactNative.gridPropsTypeMod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridPropsType extends js.Object {
  
  var carouselMaxRow: Double = js.native
  
  var columnNum: Double = js.native
  
  var data: js.UndefOr[js.Array[js.UndefOr[DataItem]]] = js.native
  
  var hasLine: js.UndefOr[Boolean] = js.native
  
  var isCarousel: js.UndefOr[Boolean] = js.native
  
  var onPress: js.UndefOr[js.Function2[/* dataItem */ js.UndefOr[DataItem], /* itemIndex */ Double, Unit]] = js.native
  
  var renderItem: js.UndefOr[
    js.Function2[/* dataItem */ js.UndefOr[DataItem], /* itemIndex */ Double, ReactElement]
  ] = js.native
}
object GridPropsType {
  
  @scala.inline
  def apply(carouselMaxRow: Double, columnNum: Double): GridPropsType = {
    val __obj = js.Dynamic.literal(carouselMaxRow = carouselMaxRow.asInstanceOf[js.Any], columnNum = columnNum.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridPropsType]
  }
  
  @scala.inline
  implicit class GridPropsTypeOps[Self <: GridPropsType] (val x: Self) extends AnyVal {
    
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
    def setCarouselMaxRow(value: Double): Self = this.set("carouselMaxRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnNum(value: Double): Self = this.set("columnNum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: js.UndefOr[DataItem]*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[js.UndefOr[DataItem]]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setHasLine(value: Boolean): Self = this.set("hasLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasLine: Self = this.set("hasLine", js.undefined)
    
    @scala.inline
    def setIsCarousel(value: Boolean): Self = this.set("isCarousel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsCarousel: Self = this.set("isCarousel", js.undefined)
    
    @scala.inline
    def setOnPress(value: (/* dataItem */ js.UndefOr[DataItem], /* itemIndex */ Double) => Unit): Self = this.set("onPress", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnPress: Self = this.set("onPress", js.undefined)
    
    @scala.inline
    def setRenderItem(value: (/* dataItem */ js.UndefOr[DataItem], /* itemIndex */ Double) => ReactElement): Self = this.set("renderItem", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRenderItem: Self = this.set("renderItem", js.undefined)
  }
}
