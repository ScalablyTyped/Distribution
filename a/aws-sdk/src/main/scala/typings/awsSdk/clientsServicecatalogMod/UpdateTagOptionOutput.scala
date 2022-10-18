package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTagOptionOutput extends StObject {
  
  /**
    * Information about the TagOption.
    */
  var TagOptionDetail: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.TagOptionDetail] = js.undefined
}
object UpdateTagOptionOutput {
  
  inline def apply(): UpdateTagOptionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateTagOptionOutput]
  }
  
  extension [Self <: UpdateTagOptionOutput](x: Self) {
    
    inline def setTagOptionDetail(value: TagOptionDetail): Self = StObject.set(x, "TagOptionDetail", value.asInstanceOf[js.Any])
    
    inline def setTagOptionDetailUndefined: Self = StObject.set(x, "TagOptionDetail", js.undefined)
  }
}
