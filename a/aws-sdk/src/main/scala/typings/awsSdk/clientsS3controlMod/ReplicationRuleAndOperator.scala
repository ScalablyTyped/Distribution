package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplicationRuleAndOperator extends StObject {
  
  /**
    * An object key name prefix that identifies the subset of objects that the rule applies to.
    */
  var Prefix: js.UndefOr[typings.awsSdk.clientsS3controlMod.Prefix] = js.undefined
  
  /**
    * An array of tags that contain key and value pairs.
    */
  var Tags: js.UndefOr[S3TagSet] = js.undefined
}
object ReplicationRuleAndOperator {
  
  inline def apply(): ReplicationRuleAndOperator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicationRuleAndOperator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReplicationRuleAndOperator] (val x: Self) extends AnyVal {
    
    inline def setPrefix(value: Prefix): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
    
    inline def setTags(value: S3TagSet): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: S3Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
