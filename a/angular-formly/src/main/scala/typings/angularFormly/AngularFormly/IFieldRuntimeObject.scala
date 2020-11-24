package typings.angularFormly.AngularFormly

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFieldRuntimeObject extends IFieldObject {
  
  var model: StringDictionary[js.Any] = js.native
}
object IFieldRuntimeObject {
  
  @scala.inline
  def apply(
    model: StringDictionary[js.Any],
    value: js.UndefOr[js.Function0[_]] with (js.UndefOr[js.Function1[/* val */ js.Any, Unit]])
  ): IFieldRuntimeObject = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFieldRuntimeObject]
  }
  
  @scala.inline
  implicit class IFieldRuntimeObjectOps[Self <: IFieldRuntimeObject] (val x: Self) extends AnyVal {
    
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
    def setModel(value: StringDictionary[js.Any]): Self = this.set("model", value.asInstanceOf[js.Any])
  }
}
