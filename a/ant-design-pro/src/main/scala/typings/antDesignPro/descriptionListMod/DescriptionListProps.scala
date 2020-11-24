package typings.antDesignPro.descriptionListMod

import typings.antDesignPro.antDesignProStrings.horizontal
import typings.antDesignPro.antDesignProStrings.large
import typings.antDesignPro.antDesignProStrings.small
import typings.antDesignPro.antDesignProStrings.vertical
import typings.antDesignPro.descriptionMod.DescriptionProps
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescriptionListProps extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
  var col: js.UndefOr[Double] = js.native
  
  var description: js.UndefOr[js.Array[DescriptionProps]] = js.native
  
  var gutter: js.UndefOr[Double] = js.native
  
  var layout: js.UndefOr[horizontal | vertical] = js.native
  
  var size: js.UndefOr[large | small] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var title: js.UndefOr[ReactNode] = js.native
}
object DescriptionListProps {
  
  @scala.inline
  def apply(): DescriptionListProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescriptionListProps]
  }
  
  @scala.inline
  implicit class DescriptionListPropsOps[Self <: DescriptionListProps] (val x: Self) extends AnyVal {
    
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setCol(value: Double): Self = this.set("col", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCol: Self = this.set("col", js.undefined)
    
    @scala.inline
    def setDescriptionVarargs(value: DescriptionProps*): Self = this.set("description", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: js.Array[DescriptionProps]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setGutter(value: Double): Self = this.set("gutter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGutter: Self = this.set("gutter", js.undefined)
    
    @scala.inline
    def setLayout(value: horizontal | vertical): Self = this.set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    
    @scala.inline
    def setSize(value: large | small): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTitle(value: ReactNode): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
