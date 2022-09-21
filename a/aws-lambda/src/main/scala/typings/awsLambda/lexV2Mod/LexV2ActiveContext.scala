package typings.awsLambda.lexV2Mod

import typings.awsLambda.anon.TimeToLiveInSeconds
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LexV2ActiveContext extends StObject {
  
  var contextAttributes: Record[String, String]
  
  var name: String
  
  var timeToLive: TimeToLiveInSeconds
}
object LexV2ActiveContext {
  
  inline def apply(contextAttributes: Record[String, String], name: String, timeToLive: TimeToLiveInSeconds): LexV2ActiveContext = {
    val __obj = js.Dynamic.literal(contextAttributes = contextAttributes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], timeToLive = timeToLive.asInstanceOf[js.Any])
    __obj.asInstanceOf[LexV2ActiveContext]
  }
  
  extension [Self <: LexV2ActiveContext](x: Self) {
    
    inline def setContextAttributes(value: Record[String, String]): Self = StObject.set(x, "contextAttributes", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTimeToLive(value: TimeToLiveInSeconds): Self = StObject.set(x, "timeToLive", value.asInstanceOf[js.Any])
  }
}
