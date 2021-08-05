package typings.awsLambda.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Deeplink extends StObject {
  
  var `deep-link`: String
  
  var `group-name`: String
  
  var `stream-name`: String
}
object Deeplink {
  
  inline def apply(`deep-link`: String, `group-name`: String, `stream-name`: String): Deeplink = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deep-link")(`deep-link`.asInstanceOf[js.Any])
    __obj.updateDynamic("group-name")(`group-name`.asInstanceOf[js.Any])
    __obj.updateDynamic("stream-name")(`stream-name`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deeplink]
  }
  
  extension [Self <: Deeplink](x: Self) {
    
    inline def `setDeep-link`(value: String): Self = StObject.set(x, "deep-link", value.asInstanceOf[js.Any])
    
    inline def `setGroup-name`(value: String): Self = StObject.set(x, "group-name", value.asInstanceOf[js.Any])
    
    inline def `setStream-name`(value: String): Self = StObject.set(x, "stream-name", value.asInstanceOf[js.Any])
  }
}
