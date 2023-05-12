package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplicationRuleFilter extends StObject {
  
  /**
    * A container for specifying rule filters. The filters determine the subset of objects that the rule applies to. This element is required only if you specify more than one filter. For example:    If you specify both a Prefix and a Tag filter, wrap these filters in an And element.   If you specify a filter based on multiple tags, wrap the Tag elements in an And element.  
    */
  var And: js.UndefOr[ReplicationRuleAndOperator] = js.undefined
  
  /**
    * An object key name prefix that identifies the subset of objects that the rule applies to.  When you're using XML requests, you must replace special characters (such as carriage returns) in object keys with their equivalent XML entity codes. For more information, see  XML-related object key constraints in the Amazon S3 User Guide. 
    */
  var Prefix: js.UndefOr[typings.awsSdk.clientsS3controlMod.Prefix] = js.undefined
  
  var Tag: js.UndefOr[S3Tag] = js.undefined
}
object ReplicationRuleFilter {
  
  inline def apply(): ReplicationRuleFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicationRuleFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReplicationRuleFilter] (val x: Self) extends AnyVal {
    
    inline def setAnd(value: ReplicationRuleAndOperator): Self = StObject.set(x, "And", value.asInstanceOf[js.Any])
    
    inline def setAndUndefined: Self = StObject.set(x, "And", js.undefined)
    
    inline def setPrefix(value: Prefix): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
    
    inline def setTag(value: S3Tag): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
  }
}
