package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListUploadsQuery extends StObject {
  
  var `key-marker`: js.UndefOr[String] = js.undefined
  
  var `max-uploads`: js.UndefOr[Double] = js.undefined
  
  var prefix: js.UndefOr[String] = js.undefined
  
  var `upload-id-marker`: js.UndefOr[String] = js.undefined
}
object ListUploadsQuery {
  
  @scala.inline
  def apply(): ListUploadsQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListUploadsQuery]
  }
  
  @scala.inline
  implicit class ListUploadsQueryMutableBuilder[Self <: ListUploadsQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setKey-marker`(value: String): Self = StObject.set(x, "key-marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setKey-markerUndefined`: Self = StObject.set(x, "key-marker", js.undefined)
    
    @scala.inline
    def `setMax-uploads`(value: Double): Self = StObject.set(x, "max-uploads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMax-uploadsUndefined`: Self = StObject.set(x, "max-uploads", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    @scala.inline
    def `setUpload-id-marker`(value: String): Self = StObject.set(x, "upload-id-marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setUpload-id-markerUndefined`: Self = StObject.set(x, "upload-id-marker", js.undefined)
  }
}
