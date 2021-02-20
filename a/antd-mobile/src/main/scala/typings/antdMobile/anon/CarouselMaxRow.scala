package typings.antdMobile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CarouselMaxRow extends StObject {
  
  var carouselMaxRow: Double = js.native
  
  var columnNum: Double = js.native
  
  var data: js.Array[scala.Nothing] = js.native
  
  var hasLine: Boolean = js.native
  
  var isCarousel: Boolean = js.native
  
  var prefixCls: String = js.native
  
  var square: Boolean = js.native
}
object CarouselMaxRow {
  
  @scala.inline
  def apply(
    carouselMaxRow: Double,
    columnNum: Double,
    data: js.Array[scala.Nothing],
    hasLine: Boolean,
    isCarousel: Boolean,
    prefixCls: String,
    square: Boolean
  ): CarouselMaxRow = {
    val __obj = js.Dynamic.literal(carouselMaxRow = carouselMaxRow.asInstanceOf[js.Any], columnNum = columnNum.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], hasLine = hasLine.asInstanceOf[js.Any], isCarousel = isCarousel.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], square = square.asInstanceOf[js.Any])
    __obj.asInstanceOf[CarouselMaxRow]
  }
  
  @scala.inline
  implicit class CarouselMaxRowMutableBuilder[Self <: CarouselMaxRow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCarouselMaxRow(value: Double): Self = StObject.set(x, "carouselMaxRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnNum(value: Double): Self = StObject.set(x, "columnNum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: js.Array[scala.Nothing]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: scala.Nothing*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setHasLine(value: Boolean): Self = StObject.set(x, "hasLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCarousel(value: Boolean): Self = StObject.set(x, "isCarousel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSquare(value: Boolean): Self = StObject.set(x, "square", value.asInstanceOf[js.Any])
  }
}
