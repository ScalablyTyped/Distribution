package typings.antvDataSet.imputeMod

import typings.antvDataSet.antvDataSetStrings.max
import typings.antvDataSet.antvDataSetStrings.mean
import typings.antvDataSet.antvDataSetStrings.median
import typings.antvDataSet.antvDataSetStrings.min
import typings.antvDataSet.antvDataSetStrings.value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var field: String = js.native
  
  var groupBy: js.UndefOr[String | js.Array[String] | (js.Function1[/* item */ js.Any, String])] = js.native
  
  var method: mean | median | max | min | value | (js.Function4[
    /* row */ js.Any, 
    /* values */ js.Array[_], 
    /* value */ js.Any, 
    /* group */ js.Array[_], 
    _
  ]) = js.native
  
  var value: js.UndefOr[js.Any] = js.native
}
object Options {
  
  @scala.inline
  def apply(
    field: String,
    method: mean | median | max | min | value | (js.Function4[
      /* row */ js.Any, 
      /* values */ js.Array[_], 
      /* value */ js.Any, 
      /* group */ js.Array[_], 
      _
    ])
  ): Options = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
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
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodFunction4(
      value: (/* row */ js.Any, /* values */ js.Array[_], /* value */ js.Any, /* group */ js.Array[_]) => _
    ): Self = this.set("method", js.Any.fromFunction4(value))
    
    @scala.inline
    def setMethod(
      value: mean | median | max | min | value | (js.Function4[
          /* row */ js.Any, 
          /* values */ js.Array[_], 
          /* value */ js.Any, 
          /* group */ js.Array[_], 
          _
        ])
    ): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupByVarargs(value: String*): Self = this.set("groupBy", js.Array(value :_*))
    
    @scala.inline
    def setGroupByFunction1(value: /* item */ js.Any => String): Self = this.set("groupBy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGroupBy(value: String | js.Array[String] | (js.Function1[/* item */ js.Any, String])): Self = this.set("groupBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupBy: Self = this.set("groupBy", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
