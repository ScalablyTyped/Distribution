package typings.angular.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

///////////////////////////////////////////////////////////////////////////
// NgModelController
// see http://docs.angularjs.org/api/ng/type/ngModel.NgModelController
///////////////////////////////////////////////////////////////////////////
@js.native
trait INgModelController extends StObject {
  
  @JSName("$asyncValidators")
  var $asyncValidators: IAsyncModelValidators = js.native
  
  @JSName("$commitViewValue")
  def $commitViewValue(): Unit = js.native
  
  @JSName("$dirty")
  var $dirty: Boolean = js.native
  
  @JSName("$error")
  var $error: StringDictionary[Boolean] = js.native
  
  @JSName("$formatters")
  var $formatters: js.Array[IModelFormatter] = js.native
  
  @JSName("$invalid")
  var $invalid: Boolean = js.native
  
  @JSName("$isEmpty")
  def $isEmpty(value: js.Any): Boolean = js.native
  
  @JSName("$modelValue")
  var $modelValue: js.Any = js.native
  
  @JSName("$name")
  var $name: js.UndefOr[String] = js.native
  
  @JSName("$overrideModelOptions")
  def $overrideModelOptions(options: INgModelOptions): Unit = js.native
  
  @JSName("$parsers")
  var $parsers: js.Array[IModelParser] = js.native
  
  @JSName("$pending")
  var $pending: js.UndefOr[StringDictionary[Boolean]] = js.native
  
  @JSName("$pristine")
  var $pristine: Boolean = js.native
  
  @JSName("$processModelValue")
  def $processModelValue(): Unit = js.native
  
  @JSName("$render")
  def $render(): Unit = js.native
  
  @JSName("$rollbackViewValue")
  def $rollbackViewValue(): Unit = js.native
  
  @JSName("$setDirty")
  def $setDirty(): Unit = js.native
  
  @JSName("$setPristine")
  def $setPristine(): Unit = js.native
  
  @JSName("$setTouched")
  def $setTouched(): Unit = js.native
  
  @JSName("$setUntouched")
  def $setUntouched(): Unit = js.native
  
  @JSName("$setValidity")
  def $setValidity(validationErrorKey: String, isValid: Boolean): Unit = js.native
  
  // Documentation states viewValue and modelValue to be a string but other
  // types do work and it's common to use them.
  @JSName("$setViewValue")
  def $setViewValue(value: js.Any): Unit = js.native
  @JSName("$setViewValue")
  def $setViewValue(value: js.Any, trigger: String): Unit = js.native
  
  @JSName("$touched")
  var $touched: Boolean = js.native
  
  @JSName("$untouched")
  var $untouched: Boolean = js.native
  
  @JSName("$valid")
  var $valid: Boolean = js.native
  
  @JSName("$validate")
  def $validate(): Unit = js.native
  
  @JSName("$validators")
  var $validators: IModelValidators = js.native
  
  @JSName("$viewChangeListeners")
  var $viewChangeListeners: js.Array[IModelViewChangeListener] = js.native
  
  @JSName("$viewValue")
  var $viewValue: js.Any = js.native
}
