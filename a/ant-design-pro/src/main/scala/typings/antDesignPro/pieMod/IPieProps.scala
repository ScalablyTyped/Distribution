package typings.antDesignPro.pieMod

import typings.antDesignPro.anon.X
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPieProps extends js.Object {
  
  var animate: js.UndefOr[Boolean] = js.native
  
  var color: js.UndefOr[String] = js.native
  
  var colors: js.UndefOr[js.Array[String]] = js.native
  
  var data: js.UndefOr[js.Array[X]] = js.native
  
  var hasLegend: js.UndefOr[Boolean] = js.native
  
  var height: Double = js.native
  
  var padding: js.UndefOr[js.Tuple4[Double, Double, Double, Double]] = js.native
  
  var percent: js.UndefOr[Double] = js.native
  
  var subTitle: js.UndefOr[ReactNode] = js.native
  
  var title: js.UndefOr[ReactNode] = js.native
  
  var tooltip: js.UndefOr[Boolean] = js.native
  
  var total: js.UndefOr[ReactNode | Double | (js.Function0[ReactNode | Double])] = js.native
  
  var valueFormat: js.UndefOr[js.Function1[/* value */ String, String | ReactNode]] = js.native
}
object IPieProps {
  
  @scala.inline
  def apply(height: Double): IPieProps = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPieProps]
  }
  
  @scala.inline
  implicit class IPiePropsOps[Self <: IPieProps] (val x: Self) extends AnyVal {
    
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimate(value: Boolean): Self = this.set("animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimate: Self = this.set("animate", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setColorsVarargs(value: String*): Self = this.set("colors", js.Array(value :_*))
    
    @scala.inline
    def setColors(value: js.Array[String]): Self = this.set("colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: X*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[X]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setHasLegend(value: Boolean): Self = this.set("hasLegend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasLegend: Self = this.set("hasLegend", js.undefined)
    
    @scala.inline
    def setPadding(value: js.Tuple4[Double, Double, Double, Double]): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setPercent(value: Double): Self = this.set("percent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePercent: Self = this.set("percent", js.undefined)
    
    @scala.inline
    def setSubTitle(value: ReactNode): Self = this.set("subTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubTitle: Self = this.set("subTitle", js.undefined)
    
    @scala.inline
    def setTitle(value: ReactNode): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTooltip(value: Boolean): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    
    @scala.inline
    def setTotalFunction0(value: () => ReactNode | Double): Self = this.set("total", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTotal(value: ReactNode | Double | (js.Function0[ReactNode | Double])): Self = this.set("total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotal: Self = this.set("total", js.undefined)
    
    @scala.inline
    def setValueFormat(value: /* value */ String => String | ReactNode): Self = this.set("valueFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteValueFormat: Self = this.set("valueFormat", js.undefined)
  }
}
