package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaStreamAttributes extends StObject {
  
  /**
    * A set of parameters that define the media stream.
    */
  var Fmtp: typings.awsSdk.clientsMediaconnectMod.Fmtp
  
  /**
    * The audio language, in a format that is recognized by the receiver.
    */
  var Lang: js.UndefOr[string] = js.undefined
}
object MediaStreamAttributes {
  
  inline def apply(Fmtp: Fmtp): MediaStreamAttributes = {
    val __obj = js.Dynamic.literal(Fmtp = Fmtp.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStreamAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaStreamAttributes] (val x: Self) extends AnyVal {
    
    inline def setFmtp(value: Fmtp): Self = StObject.set(x, "Fmtp", value.asInstanceOf[js.Any])
    
    inline def setLang(value: string): Self = StObject.set(x, "Lang", value.asInstanceOf[js.Any])
    
    inline def setLangUndefined: Self = StObject.set(x, "Lang", js.undefined)
  }
}
