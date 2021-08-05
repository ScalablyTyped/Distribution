package typings.amqplib.propertiesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessagePropertyHeaders
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var `x-death`: js.UndefOr[js.Array[XDeath]] = js.undefined
  
  var `x-first-death-exchange`: js.UndefOr[String] = js.undefined
  
  var `x-first-death-queue`: js.UndefOr[String] = js.undefined
  
  var `x-first-death-reason`: js.UndefOr[String] = js.undefined
}
object MessagePropertyHeaders {
  
  inline def apply(): MessagePropertyHeaders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessagePropertyHeaders]
  }
  
  extension [Self <: MessagePropertyHeaders](x: Self) {
    
    inline def `setX-death`(value: js.Array[XDeath]): Self = StObject.set(x, "x-death", value.asInstanceOf[js.Any])
    
    inline def `setX-deathUndefined`: Self = StObject.set(x, "x-death", js.undefined)
    
    inline def `setX-deathVarargs`(value: XDeath*): Self = StObject.set(x, "x-death", js.Array(value :_*))
    
    inline def `setX-first-death-exchange`(value: String): Self = StObject.set(x, "x-first-death-exchange", value.asInstanceOf[js.Any])
    
    inline def `setX-first-death-exchangeUndefined`: Self = StObject.set(x, "x-first-death-exchange", js.undefined)
    
    inline def `setX-first-death-queue`(value: String): Self = StObject.set(x, "x-first-death-queue", value.asInstanceOf[js.Any])
    
    inline def `setX-first-death-queueUndefined`: Self = StObject.set(x, "x-first-death-queue", js.undefined)
    
    inline def `setX-first-death-reason`(value: String): Self = StObject.set(x, "x-first-death-reason", value.asInstanceOf[js.Any])
    
    inline def `setX-first-death-reasonUndefined`: Self = StObject.set(x, "x-first-death-reason", js.undefined)
  }
}
