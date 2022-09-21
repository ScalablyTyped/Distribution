package typings.awsLambda.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sequencer extends StObject {
  
  var etag: String
  
  var key: String
  
  var sequencer: String
  
  var size: Double
  
  var `version-id`: String
}
object Sequencer {
  
  inline def apply(etag: String, key: String, sequencer: String, size: Double, `version-id`: String): Sequencer = {
    val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], sequencer = sequencer.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("version-id")(`version-id`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sequencer]
  }
  
  extension [Self <: Sequencer](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setSequencer(value: String): Self = StObject.set(x, "sequencer", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def `setVersion-id`(value: String): Self = StObject.set(x, "version-id", value.asInstanceOf[js.Any])
  }
}
