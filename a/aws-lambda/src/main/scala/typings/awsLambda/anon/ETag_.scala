package typings.awsLambda.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ETag_ extends StObject {
  
  var eTag: String
  
  var key: String
  
  var sequencer: String
  
  var size: Double
  
  var versionId: js.UndefOr[String] = js.undefined
}
object ETag_ {
  
  inline def apply(eTag: String, key: String, sequencer: String, size: Double): ETag_ = {
    val __obj = js.Dynamic.literal(eTag = eTag.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], sequencer = sequencer.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ETag_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ETag_] (val x: Self) extends AnyVal {
    
    inline def setETag(value: String): Self = StObject.set(x, "eTag", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setSequencer(value: String): Self = StObject.set(x, "sequencer", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setVersionId(value: String): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
    
    inline def setVersionIdUndefined: Self = StObject.set(x, "versionId", js.undefined)
  }
}
