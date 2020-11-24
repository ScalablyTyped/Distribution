package typings.antvDataSet.aggregateMod

import typings.antvDataSet.antvDataSetStrings.average
import typings.antvDataSet.antvDataSetStrings.count
import typings.antvDataSet.antvDataSetStrings.max
import typings.antvDataSet.antvDataSetStrings.mean
import typings.antvDataSet.antvDataSetStrings.median
import typings.antvDataSet.antvDataSetStrings.min
import typings.antvDataSet.antvDataSetStrings.mode
import typings.antvDataSet.antvDataSetStrings.product
import typings.antvDataSet.antvDataSetStrings.standardDeviation
import typings.antvDataSet.antvDataSetStrings.sum
import typings.antvDataSet.antvDataSetStrings.sumSimple
import typings.antvDataSet.antvDataSetStrings.variance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var as: js.UndefOr[js.Array[String]] = js.native
  
  var fields: js.UndefOr[js.Array[String]] = js.native
  
  var groupBy: js.UndefOr[String | js.Array[String] | (js.Function1[/* item */ js.Any, String])] = js.native
  
  var operations: js.UndefOr[
    js.Array[
      count | max | min | mean | average | median | mode | product | standardDeviation | sum | sumSimple | variance
    ]
  ] = js.native
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
    def setAsVarargs(value: String*): Self = this.set("as", js.Array(value :_*))
    
    @scala.inline
    def setAs(value: js.Array[String]): Self = this.set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: String*): Self = this.set("fields", js.Array(value :_*))
    
    @scala.inline
    def setFields(value: js.Array[String]): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setGroupByVarargs(value: String*): Self = this.set("groupBy", js.Array(value :_*))
    
    @scala.inline
    def setGroupByFunction1(value: /* item */ js.Any => String): Self = this.set("groupBy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGroupBy(value: String | js.Array[String] | (js.Function1[/* item */ js.Any, String])): Self = this.set("groupBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupBy: Self = this.set("groupBy", js.undefined)
    
    @scala.inline
    def setOperationsVarargs(
      value: (count | max | min | mean | average | median | mode | product | standardDeviation | sum | sumSimple | variance)*
    ): Self = this.set("operations", js.Array(value :_*))
    
    @scala.inline
    def setOperations(
      value: js.Array[
          count | max | min | mean | average | median | mode | product | standardDeviation | sum | sumSimple | variance
        ]
    ): Self = this.set("operations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperations: Self = this.set("operations", js.undefined)
  }
}
