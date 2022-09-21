package typings.atvlegacycontentkit

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A wrapper object that is used to explain the only recognised property of the configuration.
  */
// tslint:disable-next-line:strict-export-declare-modifiers
trait ATVJSConfig
  extends StObject
     with /**
  * Any other arbitary property is allowed here.
  */
/* x */ StringDictionary[Any] {
  
  /**
    * Whether atv.onAppEntry loads the first page, or if the first page is loaded based on the root plist (and likely modified by atv.onGenerateRequest)
    */
  var doesJavaScriptLoadRoot: js.UndefOr[Boolean] = js.undefined
}
object ATVJSConfig {
  
  inline def apply(): ATVJSConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ATVJSConfig]
  }
  
  extension [Self <: ATVJSConfig](x: Self) {
    
    inline def setDoesJavaScriptLoadRoot(value: Boolean): Self = StObject.set(x, "doesJavaScriptLoadRoot", value.asInstanceOf[js.Any])
    
    inline def setDoesJavaScriptLoadRootUndefined: Self = StObject.set(x, "doesJavaScriptLoadRoot", js.undefined)
  }
}
