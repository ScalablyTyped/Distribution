package typings.angularFormly.AngularFormly

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFieldConfigurationObject extends IFieldObject {
  /**
    * By default, the model passed to the formly-field directive is the same as the model passed to the
    * formly-form. However, if the field has a model specified, then it is used for that field (and that
    * field only). In addition, a deep watch is added to the formly-field directive's scope to run the
    * expressionProperties when the specified model changes.
    *
    * Note, the formly-form directive will allow you to specify a string which is an (almost) formly
    * expression which allows you to define the model as relative to the scope of the form.
    *
    * see http://docs.angular-formly.com/docs/field-configuration-object#model-object--string
    */
  var model: js.UndefOr[String | StringDictionary[js.Any]] = js.native
}

object IFieldConfigurationObject {
  @scala.inline
  def apply(value: js.UndefOr[js.Function0[_]] with (js.UndefOr[js.Function1[/* val */ js.Any, Unit]])): IFieldConfigurationObject = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFieldConfigurationObject]
  }
  @scala.inline
  implicit class IFieldConfigurationObjectOps[Self <: IFieldConfigurationObject] (val x: Self) extends AnyVal {
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
    def setModel(value: String | StringDictionary[js.Any]): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
  }
  
}

