package typings.ajv.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.ajv.mod.RefParams
  - typings.ajv.mod.LimitParams
  - typings.ajv.mod.AdditionalPropertiesParams
  - typings.ajv.mod.DependenciesParams
  - typings.ajv.mod.FormatParams
  - typings.ajv.mod.ComparisonParams
  - typings.ajv.mod.MultipleOfParams
  - typings.ajv.mod.PatternParams
  - typings.ajv.mod.RequiredParams
  - typings.ajv.mod.TypeParams
  - typings.ajv.mod.UniqueItemsParams
  - typings.ajv.mod.CustomParams
  - typings.ajv.mod.PatternRequiredParams
  - typings.ajv.mod.PropertyNamesParams
  - typings.ajv.mod.IfParams
  - typings.ajv.mod.SwitchParams
  - typings.ajv.mod.NoParams
  - typings.ajv.mod.EnumParams
*/
trait ErrorParameters extends js.Object

object ErrorParameters {
  @scala.inline
  def LimitParams(limit: Double): ErrorParameters = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ErrorParameters]
  }
  @scala.inline
  def RefParams(ref: String): ErrorParameters = {
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ErrorParameters]
  }
  @scala.inline
  def FormatParams(format: String): ErrorParameters = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ErrorParameters]
  }
  @scala.inline
  def PatternRequiredParams(missingPattern: String): ErrorParameters = {
    val __obj = js.Dynamic.literal(missingPattern = missingPattern.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ErrorParameters]
  }
  @scala.inline
  def TypeParams(`type`: String): ErrorParameters = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorParameters]
  }
  @scala.inline
  def UniqueItemsParams(i: Double, j: Double): ErrorParameters = {
    val __obj = js.Dynamic.literal(i = i.asInstanceOf[js.Any], j = j.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ErrorParameters]
  }
  @scala.inline
  def EnumParams(allowedValues: js.Array[_]): ErrorParameters = {
    val __obj = js.Dynamic.literal(allowedValues = allowedValues.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ErrorParameters]
  }
  @scala.inline
  def DependenciesParams(deps: String, depsCount: Double, missingProperty: String, property: String): ErrorParameters = {
    val __obj = js.Dynamic.literal(deps = deps.asInstanceOf[js.Any], depsCount = depsCount.asInstanceOf[js.Any], missingProperty = missingProperty.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ErrorParameters]
  }
  @scala.inline
  def CustomParams(keyword: String): ErrorParameters = {
    val __obj = js.Dynamic.literal(keyword = keyword.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ErrorParameters]
  }
  @scala.inline
  def PropertyNamesParams(propertyName: String): ErrorParameters = {
    val __obj = js.Dynamic.literal(propertyName = propertyName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ErrorParameters]
  }
  @scala.inline
  def RequiredParams(missingProperty: String): ErrorParameters = {
    val __obj = js.Dynamic.literal(missingProperty = missingProperty.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ErrorParameters]
  }
  @scala.inline
  def IfParams(failingKeyword: String): ErrorParameters = {
    val __obj = js.Dynamic.literal(failingKeyword = failingKeyword.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ErrorParameters]
  }
  @scala.inline
  def AdditionalPropertiesParams(additionalProperty: String): ErrorParameters = {
    val __obj = js.Dynamic.literal(additionalProperty = additionalProperty.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ErrorParameters]
  }
  @scala.inline
  def MultipleOfParams(multipleOf: Double): ErrorParameters = {
    val __obj = js.Dynamic.literal(multipleOf = multipleOf.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ErrorParameters]
  }
  @scala.inline
  def PatternParams(pattern: String): ErrorParameters = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ErrorParameters]
  }
  @scala.inline
  def ComparisonParams(comparison: String, exclusive: Boolean, limit: Double | String): ErrorParameters = {
    val __obj = js.Dynamic.literal(comparison = comparison.asInstanceOf[js.Any], exclusive = exclusive.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ErrorParameters]
  }
  @scala.inline
  def SwitchParams(caseIndex: Double): ErrorParameters = {
    val __obj = js.Dynamic.literal(caseIndex = caseIndex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ErrorParameters]
  }
}

