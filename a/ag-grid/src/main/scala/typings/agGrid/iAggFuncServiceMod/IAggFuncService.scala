package typings.agGrid.iAggFuncServiceMod

import org.scalablytyped.runtime.StringDictionary
import typings.agGrid.colDefMod.IAggFunc
import typings.agGrid.columnMod.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAggFuncService extends js.Object {
  def addAggFunc(key: String, aggFunc: IAggFunc): Unit
  def addAggFuncs(aggFuncs: StringDictionary[IAggFunc]): Unit
  def clear(): Unit
  def getDefaultAggFunc(column: Column): String
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
}

