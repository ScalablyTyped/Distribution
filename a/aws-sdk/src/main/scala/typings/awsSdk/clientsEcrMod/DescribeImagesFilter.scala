package typings.awsSdk.clientsEcrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeImagesFilter extends StObject {
  
  /**
    * The tag status with which to filter your DescribeImages results. You can filter results based on whether they are TAGGED or UNTAGGED.
    */
  var tagStatus: js.UndefOr[TagStatus] = js.undefined
}
object DescribeImagesFilter {
  
  inline def apply(): DescribeImagesFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeImagesFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeImagesFilter] (val x: Self) extends AnyVal {
    
    inline def setTagStatus(value: TagStatus): Self = StObject.set(x, "tagStatus", value.asInstanceOf[js.Any])
    
    inline def setTagStatusUndefined: Self = StObject.set(x, "tagStatus", js.undefined)
  }
}
