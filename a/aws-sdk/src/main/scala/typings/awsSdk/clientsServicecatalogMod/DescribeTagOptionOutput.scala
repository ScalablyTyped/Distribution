package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTagOptionOutput extends StObject {
  
  /**
    * Information about the TagOption.
    */
  var TagOptionDetail: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.TagOptionDetail] = js.undefined
}
object DescribeTagOptionOutput {
  
  inline def apply(): DescribeTagOptionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTagOptionOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeTagOptionOutput] (val x: Self) extends AnyVal {
    
    inline def setTagOptionDetail(value: TagOptionDetail): Self = StObject.set(x, "TagOptionDetail", value.asInstanceOf[js.Any])
    
    inline def setTagOptionDetailUndefined: Self = StObject.set(x, "TagOptionDetail", js.undefined)
  }
}
