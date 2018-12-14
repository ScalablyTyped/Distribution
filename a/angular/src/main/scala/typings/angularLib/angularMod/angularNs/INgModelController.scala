package typings
package angularLib.angularMod.angularNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

///////////////////////////////////////////////////////////////////////////
// NgModelController
// see http://docs.angularjs.org/api/ng.directive:ngModel.NgModelController
///////////////////////////////////////////////////////////////////////////
@js.native
trait INgModelController extends js.Object {
  @JSName("$asyncValidators")
  var $asyncValidators: IAsyncModelValidators = js.native
  @JSName("$dirty")
  var $dirty: scala.Boolean = js.native
  @JSName("$error")
  var $error: org.scalablytyped.runtime.StringDictionary[scala.Boolean] = js.native
  @JSName("$formatters")
  var $formatters: js.Array[IModelFormatter] = js.native
  @JSName("$invalid")
  var $invalid: scala.Boolean = js.native
  @JSName("$modelValue")
  var $modelValue: js.Any = js.native
  @JSName("$name")
  var $name: js.UndefOr[java.lang.String] = js.native
  @JSName("$parsers")
  var $parsers: js.Array[IModelParser] = js.native
  @JSName("$pending")
  var $pending: js.UndefOr[org.scalablytyped.runtime.StringDictionary[scala.Boolean]] = js.native
  @JSName("$pristine")
  var $pristine: scala.Boolean = js.native
  @JSName("$touched")
  var $touched: scala.Boolean = js.native
  @JSName("$untouched")
  var $untouched: scala.Boolean = js.native
  @JSName("$valid")
  var $valid: scala.Boolean = js.native
  @JSName("$validators")
  var $validators: IModelValidators = js.native
  @JSName("$viewChangeListeners")
  var $viewChangeListeners: js.Array[IModelViewChangeListener] = js.native
  @JSName("$viewValue")
  var $viewValue: js.Any = js.native
  @JSName("$commitViewValue")
  def $commitViewValue(): scala.Unit = js.native
  @JSName("$isEmpty")
  def $isEmpty(value: js.Any): scala.Boolean = js.native
  @JSName("$overrideModelOptions")
  def $overrideModelOptions(options: INgModelOptions): scala.Unit = js.native
  @JSName("$processModelValue")
  def $processModelValue(): scala.Unit = js.native
  @JSName("$render")
  def $render(): scala.Unit = js.native
  @JSName("$rollbackViewValue")
  def $rollbackViewValue(): scala.Unit = js.native
  @JSName("$setDirty")
  def $setDirty(): scala.Unit = js.native
  @JSName("$setPristine")
  def $setPristine(): scala.Unit = js.native
  @JSName("$setTouched")
  def $setTouched(): scala.Unit = js.native
  @JSName("$setUntouched")
  def $setUntouched(): scala.Unit = js.native
  @JSName("$setValidity")
  def $setValidity(validationErrorKey: java.lang.String, isValid: scala.Boolean): scala.Unit = js.native
  // Documentation states viewValue and modelValue to be a string but other
  // types do work and it's common to use them.
  @JSName("$setViewValue")
  def $setViewValue(value: js.Any): scala.Unit = js.native
  // Documentation states viewValue and modelValue to be a string but other
  // types do work and it's common to use them.
  @JSName("$setViewValue")
  def $setViewValue(value: js.Any, trigger: java.lang.String): scala.Unit = js.native
  @JSName("$validate")
  def $validate(): scala.Unit = js.native
}

