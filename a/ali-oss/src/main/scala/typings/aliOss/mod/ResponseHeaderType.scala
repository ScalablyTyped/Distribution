package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponseHeaderType extends StObject {
  
  var `cache-control`: js.UndefOr[String] = js.native
  
  var `content-disposition`: js.UndefOr[String] = js.native
  
  var `content-type`: js.UndefOr[String] = js.native
}
object ResponseHeaderType {
  
  @scala.inline
  def apply(): ResponseHeaderType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseHeaderType]
  }
  
  @scala.inline
  implicit class ResponseHeaderTypeMutableBuilder[Self <: ResponseHeaderType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setCache-control`(value: String): Self = StObject.set(x, "cache-control", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCache-controlUndefined`: Self = StObject.set(x, "cache-control", js.undefined)
    
    @scala.inline
    def `setContent-disposition`(value: String): Self = StObject.set(x, "content-disposition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setContent-dispositionUndefined`: Self = StObject.set(x, "content-disposition", js.undefined)
    
    @scala.inline
    def `setContent-type`(value: String): Self = StObject.set(x, "content-type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setContent-typeUndefined`: Self = StObject.set(x, "content-type", js.undefined)
  }
}
