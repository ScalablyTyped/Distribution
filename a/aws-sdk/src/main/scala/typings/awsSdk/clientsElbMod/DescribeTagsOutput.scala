package typings.awsSdk.clientsElbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTagsOutput extends StObject {
  
  /**
    * Information about the tags.
    */
  var TagDescriptions: js.UndefOr[typings.awsSdk.clientsElbMod.TagDescriptions] = js.undefined
}
object DescribeTagsOutput {
  
  inline def apply(): DescribeTagsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTagsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeTagsOutput] (val x: Self) extends AnyVal {
    
    inline def setTagDescriptions(value: TagDescriptions): Self = StObject.set(x, "TagDescriptions", value.asInstanceOf[js.Any])
    
    inline def setTagDescriptionsUndefined: Self = StObject.set(x, "TagDescriptions", js.undefined)
    
    inline def setTagDescriptionsVarargs(value: TagDescription*): Self = StObject.set(x, "TagDescriptions", js.Array(value*))
  }
}
