package typings.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LifecycleRuleAndOperator extends StObject {
  
  /**
    * Minimum object size to which the rule applies.
    */
  var ObjectSizeGreaterThan: js.UndefOr[ObjectSizeGreaterThanBytes] = js.undefined
  
  /**
    * Maximum object size to which the rule applies.
    */
  var ObjectSizeLessThan: js.UndefOr[ObjectSizeLessThanBytes] = js.undefined
  
  /**
    * Prefix identifying one or more objects to which the rule applies.
    */
  var Prefix: js.UndefOr[typings.awsSdk.clientsS3Mod.Prefix] = js.undefined
  
  /**
    * All of these tags must exist in the object's tag set in order for the rule to apply.
    */
  var Tags: js.UndefOr[TagSet] = js.undefined
}
object LifecycleRuleAndOperator {
  
  inline def apply(): LifecycleRuleAndOperator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LifecycleRuleAndOperator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LifecycleRuleAndOperator] (val x: Self) extends AnyVal {
    
    inline def setObjectSizeGreaterThan(value: ObjectSizeGreaterThanBytes): Self = StObject.set(x, "ObjectSizeGreaterThan", value.asInstanceOf[js.Any])
    
    inline def setObjectSizeGreaterThanUndefined: Self = StObject.set(x, "ObjectSizeGreaterThan", js.undefined)
    
    inline def setObjectSizeLessThan(value: ObjectSizeLessThanBytes): Self = StObject.set(x, "ObjectSizeLessThan", value.asInstanceOf[js.Any])
    
    inline def setObjectSizeLessThanUndefined: Self = StObject.set(x, "ObjectSizeLessThan", js.undefined)
    
    inline def setPrefix(value: Prefix): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
    
    inline def setTags(value: TagSet): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
