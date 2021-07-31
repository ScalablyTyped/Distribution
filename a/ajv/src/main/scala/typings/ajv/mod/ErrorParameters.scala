package typings.ajv.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait ErrorParameters extends StObject
object ErrorParameters {
  
  @scala.inline
  def AdditionalPropertiesParams(additionalProperty: String): typings.ajv.mod.AdditionalPropertiesParams = {
    val __obj = js.Dynamic.literal(additionalProperty = additionalProperty.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ajv.mod.AdditionalPropertiesParams]
  }
  
  @scala.inline
  def ComparisonParams(comparison: String, exclusive: Boolean, limit: Double | String): typings.ajv.mod.ComparisonParams = {
    val __obj = js.Dynamic.literal(comparison = comparison.asInstanceOf[js.Any], exclusive = exclusive.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ajv.mod.ComparisonParams]
  }
  
  @scala.inline
  def CustomParams(keyword: String): typings.ajv.mod.CustomParams = {
    val __obj = js.Dynamic.literal(keyword = keyword.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ajv.mod.CustomParams]
  }
  
  @scala.inline
  def DependenciesParams(deps: String, depsCount: Double, missingProperty: String, property: String): typings.ajv.mod.DependenciesParams = {
    val __obj = js.Dynamic.literal(deps = deps.asInstanceOf[js.Any], depsCount = depsCount.asInstanceOf[js.Any], missingProperty = missingProperty.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ajv.mod.DependenciesParams]
  }
  
  @scala.inline
  def EnumParams(allowedValues: js.Array[js.Any]): typings.ajv.mod.EnumParams = {
    val __obj = js.Dynamic.literal(allowedValues = allowedValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ajv.mod.EnumParams]
  }
  
  @scala.inline
  def FormatParams(format: String): typings.ajv.mod.FormatParams = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ajv.mod.FormatParams]
  }
  
  @scala.inline
  def IfParams(failingKeyword: String): typings.ajv.mod.IfParams = {
    val __obj = js.Dynamic.literal(failingKeyword = failingKeyword.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ajv.mod.IfParams]
  }
  
  @scala.inline
  def LimitParams(limit: Double): typings.ajv.mod.LimitParams = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ajv.mod.LimitParams]
  }
  
  @scala.inline
  def MultipleOfParams(multipleOf: Double): typings.ajv.mod.MultipleOfParams = {
    val __obj = js.Dynamic.literal(multipleOf = multipleOf.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ajv.mod.MultipleOfParams]
  }
  
  @scala.inline
  def PatternParams(pattern: String): typings.ajv.mod.PatternParams = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ajv.mod.PatternParams]
  }
  
  @scala.inline
  def PatternRequiredParams(missingPattern: String): typings.ajv.mod.PatternRequiredParams = {
    val __obj = js.Dynamic.literal(missingPattern = missingPattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ajv.mod.PatternRequiredParams]
  }
  
  @scala.inline
  def PropertyNamesParams(propertyName: String): typings.ajv.mod.PropertyNamesParams = {
    val __obj = js.Dynamic.literal(propertyName = propertyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ajv.mod.PropertyNamesParams]
  }
  
  @scala.inline
  def RefParams(ref: String): typings.ajv.mod.RefParams = {
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ajv.mod.RefParams]
  }
  
  @scala.inline
  def RequiredParams(missingProperty: String): typings.ajv.mod.RequiredParams = {
    val __obj = js.Dynamic.literal(missingProperty = missingProperty.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ajv.mod.RequiredParams]
  }
  
  @scala.inline
  def SwitchParams(caseIndex: Double): typings.ajv.mod.SwitchParams = {
    val __obj = js.Dynamic.literal(caseIndex = caseIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ajv.mod.SwitchParams]
  }
  
  @scala.inline
  def TypeParams(`type`: String): typings.ajv.mod.TypeParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ajv.mod.TypeParams]
  }
  
  @scala.inline
  def UniqueItemsParams(i: Double, j: Double): typings.ajv.mod.UniqueItemsParams = {
    val __obj = js.Dynamic.literal(i = i.asInstanceOf[js.Any], j = j.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ajv.mod.UniqueItemsParams]
  }
}
