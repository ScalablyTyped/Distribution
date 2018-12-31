package typings
package activexDashInfopathLib.InfoPathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("InfoPath.ErrorsCollection")
@js.native
class ErrorsCollection protected () extends js.Object {
  val Count: scala.Double = js.native
  var `InfoPath.ErrorsCollection_typekey`: ErrorsCollection = js.native
  /**
    * @param string [bstrDetailedErrorMessage='']
    * @param number [lErrorCode=0]
    * @param string [bstrType='modeless']
    */
  def Add(varNode: js.Any, bstrConditionName: java.lang.String, bstrShortErrorMessage: java.lang.String): activexDashAdodbLib.ADODBNs.Error = js.native
  def Add(
    varNode: js.Any,
    bstrConditionName: java.lang.String,
    bstrShortErrorMessage: java.lang.String,
    bstrDetailedErrorMessage: java.lang.String
  ): activexDashAdodbLib.ADODBNs.Error = js.native
  def Add(
    varNode: js.Any,
    bstrConditionName: java.lang.String,
    bstrShortErrorMessage: java.lang.String,
    bstrDetailedErrorMessage: java.lang.String,
    lErrorCode: scala.Double
  ): activexDashAdodbLib.ADODBNs.Error = js.native
  def Add(
    varNode: js.Any,
    bstrConditionName: java.lang.String,
    bstrShortErrorMessage: java.lang.String,
    bstrDetailedErrorMessage: java.lang.String,
    lErrorCode: scala.Double,
    bstrType: java.lang.String
  ): activexDashAdodbLib.ADODBNs.Error = js.native
  def Delete(varNode: js.Any, bstrConditionName: java.lang.String): scala.Unit = js.native
  def DeleteAll(): scala.Unit = js.native
  def Item(index: scala.Double): activexDashAdodbLib.ADODBNs.Error = js.native
}

