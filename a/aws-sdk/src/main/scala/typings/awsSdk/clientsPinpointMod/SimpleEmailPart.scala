package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimpleEmailPart extends StObject {
  
  /**
    * The applicable character set for the message content.
    */
  var Charset: js.UndefOr[string] = js.undefined
  
  /**
    * The textual data of the message content.
    */
  var Data: js.UndefOr[string] = js.undefined
}
object SimpleEmailPart {
  
  inline def apply(): SimpleEmailPart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimpleEmailPart]
  }
  
  extension [Self <: SimpleEmailPart](x: Self) {
    
    inline def setCharset(value: string): Self = StObject.set(x, "Charset", value.asInstanceOf[js.Any])
    
    inline def setCharsetUndefined: Self = StObject.set(x, "Charset", js.undefined)
    
    inline def setData(value: string): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "Data", js.undefined)
  }
}
