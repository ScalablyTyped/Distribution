package typings.antvDataSet.transformTagCloudMod

import typings.antvDataSet.antvDataSetStrings.archimedean
import typings.antvDataSet.antvDataSetStrings.rectangular
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var fields: js.UndefOr[js.Tuple2[String, String]] = js.native
  
  var font: js.UndefOr[String | (js.Function1[/* row */ DataItem, String])] = js.native
  
  var fontSize: js.UndefOr[Double | (js.Function1[/* row */ DataItem, Double])] = js.native
  
  var fontWeight: js.UndefOr[FontWeight | (js.Function1[/* row */ DataItem, FontWeight])] = js.native
  
  var imageMask: js.UndefOr[HTMLImageElement] = js.native
  
  var padding: js.UndefOr[Double | (js.Function1[/* row */ DataItem, Double])] = js.native
  
  var rotate: js.UndefOr[Double | (js.Function1[/* row */ DataItem, Double])] = js.native
  
  var size: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  
  var spiral: js.UndefOr[
    archimedean | rectangular | (js.Function1[
      /* size */ js.Tuple2[Double, Double], 
      js.Function1[/* t */ Double, js.Array[Double]]
    ])
  ] = js.native
  
  var timeInterval: js.UndefOr[Double] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
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
    def setFields(value: js.Tuple2[String, String]): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setFontFunction1(value: /* row */ DataItem => String): Self = this.set("font", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFont(value: String | (js.Function1[/* row */ DataItem, String])): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    
    @scala.inline
    def setFontSizeFunction1(value: /* row */ DataItem => Double): Self = this.set("fontSize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFontSize(value: Double | (js.Function1[/* row */ DataItem, Double])): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    
    @scala.inline
    def setFontWeightFunction1(value: /* row */ DataItem => FontWeight): Self = this.set("fontWeight", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFontWeight(value: FontWeight | (js.Function1[/* row */ DataItem, FontWeight])): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontWeight: Self = this.set("fontWeight", js.undefined)
    
    @scala.inline
    def setImageMask(value: HTMLImageElement): Self = this.set("imageMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageMask: Self = this.set("imageMask", js.undefined)
    
    @scala.inline
    def setPaddingFunction1(value: /* row */ DataItem => Double): Self = this.set("padding", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPadding(value: Double | (js.Function1[/* row */ DataItem, Double])): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setRotateFunction1(value: /* row */ DataItem => Double): Self = this.set("rotate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRotate(value: Double | (js.Function1[/* row */ DataItem, Double])): Self = this.set("rotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotate: Self = this.set("rotate", js.undefined)
    
    @scala.inline
    def setSize(value: js.Tuple2[Double, Double]): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setSpiralFunction1(value: /* size */ js.Tuple2[Double, Double] => js.Function1[/* t */ Double, js.Array[Double]]): Self = this.set("spiral", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSpiral(
      value: archimedean | rectangular | (js.Function1[
          /* size */ js.Tuple2[Double, Double], 
          js.Function1[/* t */ Double, js.Array[Double]]
        ])
    ): Self = this.set("spiral", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpiral: Self = this.set("spiral", js.undefined)
    
    @scala.inline
    def setTimeInterval(value: Double): Self = this.set("timeInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeInterval: Self = this.set("timeInterval", js.undefined)
  }
}
