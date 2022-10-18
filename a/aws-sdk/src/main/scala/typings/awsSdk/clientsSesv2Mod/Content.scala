package typings.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content extends StObject {
  
  /**
    * The character set for the content. Because of the constraints of the SMTP protocol, Amazon SES uses 7-bit ASCII by default. If the text includes characters outside of the ASCII range, you have to specify a character set. For example, you could specify UTF-8, ISO-8859-1, or Shift_JIS.
    */
  var Charset: js.UndefOr[typings.awsSdk.clientsSesv2Mod.Charset] = js.undefined
  
  /**
    * The content of the message itself.
    */
  var Data: MessageData
}
object Content {
  
  inline def apply(Data: MessageData): Content = {
    val __obj = js.Dynamic.literal(Data = Data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content]
  }
  
  extension [Self <: Content](x: Self) {
    
    inline def setCharset(value: Charset): Self = StObject.set(x, "Charset", value.asInstanceOf[js.Any])
    
    inline def setCharsetUndefined: Self = StObject.set(x, "Charset", js.undefined)
    
    inline def setData(value: MessageData): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
  }
}
