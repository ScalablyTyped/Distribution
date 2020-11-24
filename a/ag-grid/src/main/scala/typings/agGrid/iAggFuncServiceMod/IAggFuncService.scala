package typings.agGrid.iAggFuncServiceMod

import org.scalablytyped.runtime.StringDictionary
import typings.agGrid.colDefMod.IAggFunc
import typings.agGrid.columnMod.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAggFuncService extends js.Object {
  
  def addAggFunc(key: String, aggFunc: IAggFunc): Unit = js.native
  
  def addAggFuncs(aggFuncs: StringDictionary[IAggFunc]): Unit = js.native
  
  def clear(): Unit = js.native
  
  def getDefaultAggFunc(column: Column): String = js.native
}
object IAggFuncService {
  
  @scala.inline
  def apply(
    addAggFunc: (String, IAggFunc) => Unit,
    addAggFuncs: StringDictionary[IAggFunc] => Unit,
    clear: () => Unit,
    getDefaultAggFunc: Column => String
  ): IAggFuncService = {
    val __obj = js.Dynamic.literal(addAggFunc = js.Any.fromFunction2(addAggFunc), addAggFuncs = js.Any.fromFunction1(addAggFuncs), clear = js.Any.fromFunction0(clear), getDefaultAggFunc = js.Any.fromFunction1(getDefaultAggFunc))
    __obj.asInstanceOf[IAggFuncService]
  }
  
  @scala.inline
  implicit class IAggFuncServiceOps[Self <: IAggFuncService] (val x: Self) extends AnyVal {
    
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
    def setAddAggFunc(value: (String, IAggFunc) => Unit): Self = this.set("addAggFunc", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAddAggFuncs(value: StringDictionary[IAggFunc] => Unit): Self = this.set("addAggFuncs", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDefaultAggFunc(value: Column => String): Self = this.set("getDefaultAggFunc", js.Any.fromFunction1(value))
  }
}
