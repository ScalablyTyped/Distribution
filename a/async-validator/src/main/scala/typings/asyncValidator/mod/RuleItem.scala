package typings.asyncValidator.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuleItem extends js.Object {
  
  var asyncValidator: js.UndefOr[
    js.Function5[
      /* rule */ Rules, 
      /* value */ js.Any, 
      /* callback */ js.Function1[/* error */ String | js.Array[String] | Unit, Unit], 
      /* source */ ValidateSource, 
      /* options */ ValidateOption, 
      Unit | js.Promise[Unit]
    ]
  ] = js.native
  
  var defaultField: js.UndefOr[RuleItem] = js.native
  
   // Length of type 'string' and 'array'
  var enum: js.UndefOr[js.Array[js.UndefOr[String | Double | Boolean | Null]]] = js.native
  
  var fields: js.UndefOr[Rules] = js.native
  
   // Range of type 'string' and 'array'
  var len: js.UndefOr[Double] = js.native
  
   // Range of type 'string' and 'array'
  var max: js.UndefOr[Double] = js.native
  
  var message: js.UndefOr[String | js.Function0[String]] = js.native
  
  var min: js.UndefOr[Double] = js.native
  
   // ignore when without required
  var options: js.UndefOr[ValidateOption] = js.native
  
  var pattern: js.UndefOr[RegExp | String] = js.native
  
   // default type is 'string'
  var required: js.UndefOr[Boolean] = js.native
  
   // 'object' or 'array' containing validation rules
  var transform: js.UndefOr[js.Function1[/* value */ js.Any, _]] = js.native
  
  var `type`: js.UndefOr[RuleType] = js.native
  
  var validator: js.UndefOr[
    js.Function5[
      /* rule */ Rules, 
      /* value */ js.Any, 
      /* callback */ js.Function1[/* error */ String | js.Array[String] | Unit, Unit], 
      /* source */ ValidateSource, 
      /* options */ ValidateOption, 
      Unit
    ]
  ] = js.native
  
   // possible values of type 'enum'
  var whitespace: js.UndefOr[Boolean] = js.native
}
object RuleItem {
  
  @scala.inline
  def apply(): RuleItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleItem]
  }
  
  @scala.inline
  implicit class RuleItemOps[Self <: RuleItem] (val x: Self) extends AnyVal {
    
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
    def setAsyncValidator(
      value: (/* rule */ Rules, /* value */ js.Any, /* callback */ js.Function1[/* error */ String | js.Array[String] | Unit, Unit], /* source */ ValidateSource, /* options */ ValidateOption) => Unit | js.Promise[Unit]
    ): Self = this.set("asyncValidator", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteAsyncValidator: Self = this.set("asyncValidator", js.undefined)
    
    @scala.inline
    def setDefaultField(value: RuleItem): Self = this.set("defaultField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultField: Self = this.set("defaultField", js.undefined)
    
    @scala.inline
    def setEnumVarargs(value: (js.UndefOr[String | Double | Boolean | Null])*): Self = this.set("enum", js.Array(value :_*))
    
    @scala.inline
    def setEnum(value: js.Array[js.UndefOr[String | Double | Boolean | Null]]): Self = this.set("enum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnum: Self = this.set("enum", js.undefined)
    
    @scala.inline
    def setFields(value: Rules): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setLen(value: Double): Self = this.set("len", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLen: Self = this.set("len", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMessageFunction0(value: () => String): Self = this.set("message", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMessage(value: String | js.Function0[String]): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setOptions(value: ValidateOption): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setPattern(value: RegExp | String): Self = this.set("pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePattern: Self = this.set("pattern", js.undefined)
    
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    
    @scala.inline
    def setTransform(value: /* value */ js.Any => _): Self = this.set("transform", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
    
    @scala.inline
    def setType(value: RuleType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setValidator(
      value: (/* rule */ Rules, /* value */ js.Any, /* callback */ js.Function1[/* error */ String | js.Array[String] | Unit, Unit], /* source */ ValidateSource, /* options */ ValidateOption) => Unit
    ): Self = this.set("validator", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteValidator: Self = this.set("validator", js.undefined)
    
    @scala.inline
    def setWhitespace(value: Boolean): Self = this.set("whitespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhitespace: Self = this.set("whitespace", js.undefined)
  }
}
