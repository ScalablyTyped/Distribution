package typings.antd.formContextMod

import typings.antd.formFormMod.RequiredMark
import typings.antd.gridColMod.ColProps
import typings.antd.interfaceMod.FormLabelAlign
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormContextProps extends js.Object {
  
  var colon: js.UndefOr[Boolean] = js.native
  
  def itemRef(name: js.Array[String | Double]): js.Function1[/* node */ ReactElement, Unit] = js.native
  
  var labelAlign: js.UndefOr[FormLabelAlign] = js.native
  
  var labelCol: js.UndefOr[ColProps] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var requiredMark: js.UndefOr[RequiredMark] = js.native
  
  var vertical: Boolean = js.native
  
  var wrapperCol: js.UndefOr[ColProps] = js.native
}
object FormContextProps {
  
  @scala.inline
  def apply(
    itemRef: js.Array[String | Double] => js.Function1[/* node */ ReactElement, Unit],
    vertical: Boolean
  ): FormContextProps = {
    val __obj = js.Dynamic.literal(itemRef = js.Any.fromFunction1(itemRef), vertical = vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormContextProps]
  }
  
  @scala.inline
  implicit class FormContextPropsOps[Self <: FormContextProps] (val x: Self) extends AnyVal {
    
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
    def setItemRef(value: js.Array[String | Double] => js.Function1[/* node */ ReactElement, Unit]): Self = this.set("itemRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setVertical(value: Boolean): Self = this.set("vertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColon(value: Boolean): Self = this.set("colon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColon: Self = this.set("colon", js.undefined)
    
    @scala.inline
    def setLabelAlign(value: FormLabelAlign): Self = this.set("labelAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelAlign: Self = this.set("labelAlign", js.undefined)
    
    @scala.inline
    def setLabelCol(value: ColProps): Self = this.set("labelCol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelCol: Self = this.set("labelCol", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setRequiredMark(value: RequiredMark): Self = this.set("requiredMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequiredMark: Self = this.set("requiredMark", js.undefined)
    
    @scala.inline
    def setWrapperCol(value: ColProps): Self = this.set("wrapperCol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapperCol: Self = this.set("wrapperCol", js.undefined)
  }
}
