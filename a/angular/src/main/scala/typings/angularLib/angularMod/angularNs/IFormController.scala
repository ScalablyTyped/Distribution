package typings
package angularLib.angularMod.angularNs

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
/* name */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  @JSName("$dirty")
  var $dirty: scala.Boolean = js.native
  @JSName("$error")
  var $error: org.scalablytyped.runtime.StringDictionary[js.Array[INgModelController | IFormController]] = js.native
  @JSName("$invalid")
  var $invalid: scala.Boolean = js.native
  @JSName("$name")
  var $name: js.UndefOr[java.lang.String] = js.native
  @JSName("$pending")
  var $pending: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[js.Array[INgModelController | IFormController]]
  ] = js.native
  @JSName("$pristine")
  var $pristine: scala.Boolean = js.native
  @JSName("$submitted")
  var $submitted: scala.Boolean = js.native
  @JSName("$valid")
  var $valid: scala.Boolean = js.native
  @JSName("$addControl")
  def $addControl(control: IFormController): scala.Unit = js.native
  @JSName("$addControl")
  def $addControl(control: INgModelController): scala.Unit = js.native
  @JSName("$commitViewValue")
  def $commitViewValue(): scala.Unit = js.native
  @JSName("$removeControl")
  def $removeControl(control: IFormController): scala.Unit = js.native
  @JSName("$removeControl")
  def $removeControl(control: INgModelController): scala.Unit = js.native
  @JSName("$rollbackViewValue")
  def $rollbackViewValue(): scala.Unit = js.native
  @JSName("$setDirty")
  def $setDirty(): scala.Unit = js.native
  @JSName("$setPristine")
  def $setPristine(): scala.Unit = js.native
  @JSName("$setSubmitted")
  def $setSubmitted(): scala.Unit = js.native
  @JSName("$setUntouched")
  def $setUntouched(): scala.Unit = js.native
  @JSName("$setValidity")
  def $setValidity(validationErrorKey: java.lang.String, isValid: scala.Boolean, control: IFormController): scala.Unit = js.native
  @JSName("$setValidity")
  def $setValidity(validationErrorKey: java.lang.String, isValid: scala.Boolean, control: INgModelController): scala.Unit = js.native
}

