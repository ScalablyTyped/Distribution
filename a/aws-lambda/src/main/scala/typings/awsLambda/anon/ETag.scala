package typings.awsLambda.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ETag extends StObject {
  
  var eTag: String
  
  var key: String
  
  var sequencer: String
  
  var size: Double
  
  var versionId: js.UndefOr[String] = js.undefined
}
object ETag {
  
  @scala.inline
  def apply(eTag: String, key: String, sequencer: String, size: Double): ETag = {
    val __obj = js.Dynamic.literal(eTag = eTag.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], sequencer = sequencer.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ETag]
  }
  
  @scala.inline
  implicit class ETagMutableBuilder[Self <: ETag] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setETag(value: String): Self = StObject.set(x, "eTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSequencer(value: String): Self = StObject.set(x, "sequencer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionId(value: String): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionIdUndefined: Self = StObject.set(x, "versionId", js.undefined)
  }
}
