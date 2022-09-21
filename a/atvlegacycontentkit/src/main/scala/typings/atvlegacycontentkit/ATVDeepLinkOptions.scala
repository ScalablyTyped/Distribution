package typings.atvlegacycontentkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options supplied with onOpenURL. We only know about one parameter, but there is definitely more.
  */
// tslint:disable-next-line:strict-export-declare-modifiers
trait ATVDeepLinkOptions extends StObject {
  
  /**
    * The URL to show the page for.
    */
  var openURL: String
}
object ATVDeepLinkOptions {
  
  inline def apply(openURL: String): ATVDeepLinkOptions = {
    val __obj = js.Dynamic.literal(openURL = openURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[ATVDeepLinkOptions]
  }
  
  extension [Self <: ATVDeepLinkOptions](x: Self) {
    
    inline def setOpenURL(value: String): Self = StObject.set(x, "openURL", value.asInstanceOf[js.Any])
  }
}
