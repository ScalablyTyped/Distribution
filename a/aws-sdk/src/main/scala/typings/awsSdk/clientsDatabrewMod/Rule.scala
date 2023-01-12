package typings.awsSdk.clientsDatabrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rule extends StObject {
  
  /**
    * The expression which includes column references, condition names followed by variable references, possibly grouped and combined with other conditions. For example, (:col1 starts_with :prefix1 or :col1 starts_with :prefix2) and (:col1 ends_with :suffix1 or :col1 ends_with :suffix2). Column and value references are substitution variables that should start with the ':' symbol. Depending on the context, substitution variables' values can be either an actual value or a column name. These values are defined in the SubstitutionMap. If a CheckExpression starts with a column reference, then ColumnSelectors in the rule should be null. If ColumnSelectors has been defined, then there should be no column reference in the left side of a condition, for example, is_between :val1 and :val2. For more information, see Available checks 
    */
  var CheckExpression: Expression
  
  /**
    * List of column selectors. Selectors can be used to select columns using a name or regular expression from the dataset. Rule will be applied to selected columns.
    */
  var ColumnSelectors: js.UndefOr[ColumnSelectorList] = js.undefined
  
  /**
    * A value that specifies whether the rule is disabled. Once a rule is disabled, a profile job will not validate it during a job run. Default value is false.
    */
  var Disabled: js.UndefOr[typings.awsSdk.clientsDatabrewMod.Disabled] = js.undefined
  
  /**
    * The name of the rule.
    */
  var Name: RuleName
  
  /**
    * The map of substitution variable names to their values used in a check expression. Variable names should start with a ':' (colon). Variable values can either be actual values or column names. To differentiate between the two, column names should be enclosed in backticks, for example, ":col1": "`Column A`". 
    */
  var SubstitutionMap: js.UndefOr[ValuesMap] = js.undefined
  
  /**
    * The threshold used with a non-aggregate check expression. Non-aggregate check expressions will be applied to each row in a specific column, and the threshold will be used to determine whether the validation succeeds.
    */
  var Threshold: js.UndefOr[typings.awsSdk.clientsDatabrewMod.Threshold] = js.undefined
}
object Rule {
  
  inline def apply(CheckExpression: Expression, Name: RuleName): Rule = {
    val __obj = js.Dynamic.literal(CheckExpression = CheckExpression.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Rule] (val x: Self) extends AnyVal {
    
    inline def setCheckExpression(value: Expression): Self = StObject.set(x, "CheckExpression", value.asInstanceOf[js.Any])
    
    inline def setColumnSelectors(value: ColumnSelectorList): Self = StObject.set(x, "ColumnSelectors", value.asInstanceOf[js.Any])
    
    inline def setColumnSelectorsUndefined: Self = StObject.set(x, "ColumnSelectors", js.undefined)
    
    inline def setColumnSelectorsVarargs(value: ColumnSelector*): Self = StObject.set(x, "ColumnSelectors", js.Array(value*))
    
    inline def setDisabled(value: Disabled): Self = StObject.set(x, "Disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "Disabled", js.undefined)
    
    inline def setName(value: RuleName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setSubstitutionMap(value: ValuesMap): Self = StObject.set(x, "SubstitutionMap", value.asInstanceOf[js.Any])
    
    inline def setSubstitutionMapUndefined: Self = StObject.set(x, "SubstitutionMap", js.undefined)
    
    inline def setThreshold(value: Threshold): Self = StObject.set(x, "Threshold", value.asInstanceOf[js.Any])
    
    inline def setThresholdUndefined: Self = StObject.set(x, "Threshold", js.undefined)
  }
}
