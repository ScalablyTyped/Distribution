package typings.activexInfopath.InfoPath

import typings.activexAdodb.ADODB.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorsCollection extends js.Object {
  val Count: Double = js.native
  @JSName("InfoPath.ErrorsCollection_typekey")
  var InfoPathDotErrorsCollection_typekey: ErrorsCollection = js.native
  /**
    * @param string [bstrDetailedErrorMessage='']
    * @param number [lErrorCode=0]
    * @param string [bstrType='modeless']
    */
  def Add(varNode: js.Any, bstrConditionName: String, bstrShortErrorMessage: String): Error = js.native
  def Add(
    varNode: js.Any,
    bstrConditionName: String,
    bstrShortErrorMessage: String,
    bstrDetailedErrorMessage: js.UndefOr[scala.Nothing],
    lErrorCode: js.UndefOr[scala.Nothing],
    bstrType: String
  ): Error = js.native
  def Add(
    varNode: js.Any,
    bstrConditionName: String,
    bstrShortErrorMessage: String,
    bstrDetailedErrorMessage: js.UndefOr[scala.Nothing],
    lErrorCode: Double
  ): Error = js.native
  def Add(
    varNode: js.Any,
    bstrConditionName: String,
    bstrShortErrorMessage: String,
    bstrDetailedErrorMessage: js.UndefOr[scala.Nothing],
    lErrorCode: Double,
    bstrType: String
  ): Error = js.native
  def Add(
    varNode: js.Any,
    bstrConditionName: String,
    bstrShortErrorMessage: String,
    bstrDetailedErrorMessage: String
  ): Error = js.native
  def Add(
    varNode: js.Any,
    bstrConditionName: String,
    bstrShortErrorMessage: String,
    bstrDetailedErrorMessage: String,
    lErrorCode: js.UndefOr[scala.Nothing],
    bstrType: String
  ): Error = js.native
  def Add(
    varNode: js.Any,
    bstrConditionName: String,
    bstrShortErrorMessage: String,
    bstrDetailedErrorMessage: String,
    lErrorCode: Double
  ): Error = js.native
  def Add(
    varNode: js.Any,
    bstrConditionName: String,
    bstrShortErrorMessage: String,
    bstrDetailedErrorMessage: String,
    lErrorCode: Double,
    bstrType: String
  ): Error = js.native
  def Delete(varNode: js.Any, bstrConditionName: String): Unit = js.native
  def DeleteAll(): Unit = js.native
  def Item(index: Double): Error = js.native
}

