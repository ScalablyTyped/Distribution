package typings
package agDashGridLib.distLibInterfacesIAggFuncServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAggFuncService extends js.Object {
  def addAggFunc(key: java.lang.String, aggFunc: agDashGridLib.distLibEntitiesColDefMod.IAggFunc): scala.Unit
  def addAggFuncs(
    aggFuncs: org.scalablytyped.runtime.StringDictionary[agDashGridLib.distLibEntitiesColDefMod.IAggFunc]
  ): scala.Unit
  def clear(): scala.Unit
  def getDefaultAggFunc(column: agDashGridLib.distLibEntitiesColumnMod.Column): java.lang.String
}

object IAggFuncService {
  @scala.inline
  def apply(
    addAggFunc: (java.lang.String, agDashGridLib.distLibEntitiesColDefMod.IAggFunc) => scala.Unit,
    addAggFuncs: org.scalablytyped.runtime.StringDictionary[agDashGridLib.distLibEntitiesColDefMod.IAggFunc] => scala.Unit,
    clear: () => scala.Unit,
    getDefaultAggFunc: agDashGridLib.distLibEntitiesColumnMod.Column => java.lang.String
  ): IAggFuncService = {
    val __obj = js.Dynamic.literal(addAggFunc = js.Any.fromFunction2(addAggFunc), addAggFuncs = js.Any.fromFunction1(addAggFuncs), clear = js.Any.fromFunction0(clear), getDefaultAggFunc = js.Any.fromFunction1(getDefaultAggFunc))
  
    __obj.asInstanceOf[IAggFuncService]
  }
}

