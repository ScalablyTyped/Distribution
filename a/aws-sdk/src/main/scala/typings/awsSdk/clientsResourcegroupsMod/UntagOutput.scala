package typings.awsSdk.clientsResourcegroupsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UntagOutput extends StObject {
  
  /**
    * The ARN of the resource group from which tags have been removed.
    */
  var Arn: js.UndefOr[GroupArn] = js.undefined
  
  /**
    * The keys of the tags that were removed.
    */
  var Keys: js.UndefOr[TagKeyList] = js.undefined
}
object UntagOutput {
  
  inline def apply(): UntagOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UntagOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UntagOutput] (val x: Self) extends AnyVal {
    
    inline def setArn(value: GroupArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setKeys(value: TagKeyList): Self = StObject.set(x, "Keys", value.asInstanceOf[js.Any])
    
    inline def setKeysUndefined: Self = StObject.set(x, "Keys", js.undefined)
    
    inline def setKeysVarargs(value: TagKey*): Self = StObject.set(x, "Keys", js.Array(value*))
  }
}
