package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseHeaderType extends StObject {
  
  var `cache-control`: js.UndefOr[String] = js.undefined
  
  var `content-disposition`: js.UndefOr[String] = js.undefined
  
  var `content-type`: js.UndefOr[String] = js.undefined
}
object ResponseHeaderType {
  
  inline def apply(): ResponseHeaderType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseHeaderType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseHeaderType] (val x: Self) extends AnyVal {
    
    inline def `setCache-control`(value: String): Self = StObject.set(x, "cache-control", value.asInstanceOf[js.Any])
    
    inline def `setCache-controlUndefined`: Self = StObject.set(x, "cache-control", js.undefined)
    
    inline def `setContent-disposition`(value: String): Self = StObject.set(x, "content-disposition", value.asInstanceOf[js.Any])
    
    inline def `setContent-dispositionUndefined`: Self = StObject.set(x, "content-disposition", js.undefined)
    
    inline def `setContent-type`(value: String): Self = StObject.set(x, "content-type", value.asInstanceOf[js.Any])
    
    inline def `setContent-typeUndefined`: Self = StObject.set(x, "content-type", js.undefined)
  }
}
