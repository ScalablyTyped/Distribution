package typings.activexInfopath.InfoPath

import typings.activexAdodb.ADODB.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorsCollection extends StObject {
  
  /**
    * @param string [bstrDetailedErrorMessage='']
    * @param number [lErrorCode=0]
    * @param string [bstrType='modeless']
    */
  def Add(varNode: Any, bstrConditionName: String, bstrShortErrorMessage: String): Error = js.native
  def Add(
    varNode: Any,
    bstrConditionName: String,
    bstrShortErrorMessage: String,
    bstrDetailedErrorMessage: String
  ): Error = js.native
  def Add(
    varNode: Any,
    bstrConditionName: String,
    bstrShortErrorMessage: String,
    bstrDetailedErrorMessage: String,
    lErrorCode: Double
  ): Error = js.native
  def Add(
    varNode: Any,
    bstrConditionName: String,
    bstrShortErrorMessage: String,
    bstrDetailedErrorMessage: String,
    lErrorCode: Double,
    bstrType: String
  ): Error = js.native
  def Add(
    varNode: Any,
    bstrConditionName: String,
    bstrShortErrorMessage: String,
    bstrDetailedErrorMessage: String,
    lErrorCode: Unit,
    bstrType: String
  ): Error = js.native
  def Add(
    varNode: Any,
    bstrConditionName: String,
    bstrShortErrorMessage: String,
    bstrDetailedErrorMessage: Unit,
    lErrorCode: Double
  ): Error = js.native
  def Add(
    varNode: Any,
    bstrConditionName: String,
    bstrShortErrorMessage: String,
    bstrDetailedErrorMessage: Unit,
    lErrorCode: Double,
    bstrType: String
  ): Error = js.native
  def Add(
    varNode: Any,
    bstrConditionName: String,
    bstrShortErrorMessage: String,
    bstrDetailedErrorMessage: Unit,
    lErrorCode: Unit,
    bstrType: String
  ): Error = js.native
  
  val Count: Double = js.native
  
  def Delete(varNode: Any, bstrConditionName: String): Unit = js.native
  
  def DeleteAll(): Unit = js.native
  
  /* private */ @JSName("InfoPath.ErrorsCollection_typekey")
  var InfoPathDotErrorsCollection_typekey: ErrorsCollection = js.native
  
  def Item(index: Double): Error = js.native
}
