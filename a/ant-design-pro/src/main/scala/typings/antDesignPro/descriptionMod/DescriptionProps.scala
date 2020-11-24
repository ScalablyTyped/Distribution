package typings.antDesignPro.descriptionMod

import typings.antd.gridColMod.ColProps
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescriptionProps extends ColProps {
  
  var column: js.UndefOr[Double] = js.native
  
  var key: js.UndefOr[String | Double] = js.native
  
  var term: js.UndefOr[ReactNode] = js.native
}
object DescriptionProps {
  
  @scala.inline
  def apply(): DescriptionProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescriptionProps]
  }
  
  @scala.inline
  implicit class DescriptionPropsOps[Self <: DescriptionProps] (val x: Self) extends AnyVal {
    
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
    def setColumn(value: Double): Self = this.set("column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumn: Self = this.set("column", js.undefined)
    
    @scala.inline
    def setKey(value: String | Double): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setTerm(value: ReactNode): Self = this.set("term", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTerm: Self = this.set("term", js.undefined)
  }
}
