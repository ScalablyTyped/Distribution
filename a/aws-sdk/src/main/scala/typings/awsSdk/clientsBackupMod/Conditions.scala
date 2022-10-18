package typings.awsSdk.clientsBackupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Conditions extends StObject {
  
  /**
    * Filters the values of your tagged resources for only those resources that you tagged with the same value. Also called "exact matching."
    */
  var StringEquals: js.UndefOr[ConditionParameters] = js.undefined
  
  /**
    * Filters the values of your tagged resources for matching tag values with the use of a wildcard character (*) anywhere in the string. For example, "prod*" or "*rod*" matches the tag value "production".
    */
  var StringLike: js.UndefOr[ConditionParameters] = js.undefined
  
  /**
    * Filters the values of your tagged resources for only those resources that you tagged that do not have the same value. Also called "negated matching."
    */
  var StringNotEquals: js.UndefOr[ConditionParameters] = js.undefined
  
  /**
    * Filters the values of your tagged resources for non-matching tag values with the use of a wildcard character (*) anywhere in the string.
    */
  var StringNotLike: js.UndefOr[ConditionParameters] = js.undefined
}
object Conditions {
  
  inline def apply(): Conditions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Conditions]
  }
  
  extension [Self <: Conditions](x: Self) {
    
    inline def setStringEquals(value: ConditionParameters): Self = StObject.set(x, "StringEquals", value.asInstanceOf[js.Any])
    
    inline def setStringEqualsUndefined: Self = StObject.set(x, "StringEquals", js.undefined)
    
    inline def setStringEqualsVarargs(value: ConditionParameter*): Self = StObject.set(x, "StringEquals", js.Array(value*))
    
    inline def setStringLike(value: ConditionParameters): Self = StObject.set(x, "StringLike", value.asInstanceOf[js.Any])
    
    inline def setStringLikeUndefined: Self = StObject.set(x, "StringLike", js.undefined)
    
    inline def setStringLikeVarargs(value: ConditionParameter*): Self = StObject.set(x, "StringLike", js.Array(value*))
    
    inline def setStringNotEquals(value: ConditionParameters): Self = StObject.set(x, "StringNotEquals", value.asInstanceOf[js.Any])
    
    inline def setStringNotEqualsUndefined: Self = StObject.set(x, "StringNotEquals", js.undefined)
    
    inline def setStringNotEqualsVarargs(value: ConditionParameter*): Self = StObject.set(x, "StringNotEquals", js.Array(value*))
    
    inline def setStringNotLike(value: ConditionParameters): Self = StObject.set(x, "StringNotLike", value.asInstanceOf[js.Any])
    
    inline def setStringNotLikeUndefined: Self = StObject.set(x, "StringNotLike", js.undefined)
    
    inline def setStringNotLikeVarargs(value: ConditionParameter*): Self = StObject.set(x, "StringNotLike", js.Array(value*))
  }
}
