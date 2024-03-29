package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LifecycleRuleFilter extends StObject {
  
  /**
    * The container for the AND condition for the lifecycle rule.
    */
  var And: js.UndefOr[LifecycleRuleAndOperator] = js.undefined
  
  /**
    * Minimum object size to which the rule applies.
    */
  var ObjectSizeGreaterThan: js.UndefOr[ObjectSizeGreaterThanBytes] = js.undefined
  
  /**
    * Maximum object size to which the rule applies.
    */
  var ObjectSizeLessThan: js.UndefOr[ObjectSizeLessThanBytes] = js.undefined
  
  /**
    * Prefix identifying one or more objects to which the rule applies.  When you're using XML requests, you must replace special characters (such as carriage returns) in object keys with their equivalent XML entity codes. For more information, see  XML-related object key constraints in the Amazon S3 User Guide. 
    */
  var Prefix: js.UndefOr[typings.awsSdk.clientsS3controlMod.Prefix] = js.undefined
  
  var Tag: js.UndefOr[S3Tag] = js.undefined
}
object LifecycleRuleFilter {
  
  inline def apply(): LifecycleRuleFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LifecycleRuleFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LifecycleRuleFilter] (val x: Self) extends AnyVal {
    
    inline def setAnd(value: LifecycleRuleAndOperator): Self = StObject.set(x, "And", value.asInstanceOf[js.Any])
    
    inline def setAndUndefined: Self = StObject.set(x, "And", js.undefined)
    
    inline def setObjectSizeGreaterThan(value: ObjectSizeGreaterThanBytes): Self = StObject.set(x, "ObjectSizeGreaterThan", value.asInstanceOf[js.Any])
    
    inline def setObjectSizeGreaterThanUndefined: Self = StObject.set(x, "ObjectSizeGreaterThan", js.undefined)
    
    inline def setObjectSizeLessThan(value: ObjectSizeLessThanBytes): Self = StObject.set(x, "ObjectSizeLessThan", value.asInstanceOf[js.Any])
    
    inline def setObjectSizeLessThanUndefined: Self = StObject.set(x, "ObjectSizeLessThan", js.undefined)
    
    inline def setPrefix(value: Prefix): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
    
    inline def setTag(value: S3Tag): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
  }
}
