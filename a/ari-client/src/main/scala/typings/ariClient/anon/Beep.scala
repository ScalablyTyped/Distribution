package typings.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Beep extends StObject {
  
  var beep: js.UndefOr[Boolean] = js.undefined
  
  var bridgeId: String
  
  var format: String
  
  var ifExists: js.UndefOr[String] = js.undefined
  
  var maxDurationSeconds: js.UndefOr[Double] = js.undefined
  
  var maxSilenceSeconds: js.UndefOr[Double] = js.undefined
  
  var name: String
  
  var terminateOn: js.UndefOr[String] = js.undefined
}
object Beep {
  
  inline def apply(bridgeId: String, format: String, name: String): Beep = {
    val __obj = js.Dynamic.literal(bridgeId = bridgeId.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Beep]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Beep] (val x: Self) extends AnyVal {
    
    inline def setBeep(value: Boolean): Self = StObject.set(x, "beep", value.asInstanceOf[js.Any])
    
    inline def setBeepUndefined: Self = StObject.set(x, "beep", js.undefined)
    
    inline def setBridgeId(value: String): Self = StObject.set(x, "bridgeId", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setIfExists(value: String): Self = StObject.set(x, "ifExists", value.asInstanceOf[js.Any])
    
    inline def setIfExistsUndefined: Self = StObject.set(x, "ifExists", js.undefined)
    
    inline def setMaxDurationSeconds(value: Double): Self = StObject.set(x, "maxDurationSeconds", value.asInstanceOf[js.Any])
    
    inline def setMaxDurationSecondsUndefined: Self = StObject.set(x, "maxDurationSeconds", js.undefined)
    
    inline def setMaxSilenceSeconds(value: Double): Self = StObject.set(x, "maxSilenceSeconds", value.asInstanceOf[js.Any])
    
    inline def setMaxSilenceSecondsUndefined: Self = StObject.set(x, "maxSilenceSeconds", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTerminateOn(value: String): Self = StObject.set(x, "terminateOn", value.asInstanceOf[js.Any])
    
    inline def setTerminateOnUndefined: Self = StObject.set(x, "terminateOn", js.undefined)
  }
}
