package typings.angular.angularMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * form.FormController - type in module ng
  * see https://docs.angularjs.org/api/ng/type/form.FormController
  */
@js.native
trait IFormController
  extends /**
  * Indexer which should return ng.INgModelController for most properties but cannot because of "All named properties must be assignable to string indexer type" constraint - see https://github.com/Microsoft/TypeScript/issues/272
  */
/* name */ StringDictionary[js.Any] {
  @JSName("$dirty")
  var $dirty: Boolean = js.native
  @JSName("$error")
  var $error: StringDictionary[js.Array[INgModelController | IFormController]] = js.native
  @JSName("$invalid")
  var $invalid: Boolean = js.native
  @JSName("$name")
  var $name: js.UndefOr[String] = js.native
  @JSName("$pending")
  var $pending: js.UndefOr[StringDictionary[js.Array[INgModelController | IFormController]]] = js.native
  @JSName("$pristine")
  var $pristine: Boolean = js.native
  @JSName("$submitted")
  var $submitted: Boolean = js.native
  @JSName("$valid")
  var $valid: Boolean = js.native
  @JSName("$addControl")
  def $addControl(control: IFormController): Unit = js.native
  @JSName("$addControl")
  def $addControl(control: INgModelController): Unit = js.native
  @JSName("$commitViewValue")
  def $commitViewValue(): Unit = js.native
  @JSName("$removeControl")
  def $removeControl(control: IFormController): Unit = js.native
  @JSName("$removeControl")
  def $removeControl(control: INgModelController): Unit = js.native
  @JSName("$rollbackViewValue")
  def $rollbackViewValue(): Unit = js.native
  @JSName("$setDirty")
  def $setDirty(): Unit = js.native
  @JSName("$setPristine")
  def $setPristine(): Unit = js.native
  @JSName("$setSubmitted")
  def $setSubmitted(): Unit = js.native
  @JSName("$setUntouched")
  def $setUntouched(): Unit = js.native
  @JSName("$setValidity")
  def $setValidity(validationErrorKey: String, isValid: Boolean, control: IFormController): Unit = js.native
  @JSName("$setValidity")
  def $setValidity(validationErrorKey: String, isValid: Boolean, control: INgModelController): Unit = js.native
}

