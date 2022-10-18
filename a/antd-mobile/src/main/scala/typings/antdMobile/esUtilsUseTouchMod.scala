package typings.antdMobile

import typings.antdMobile.anon.DeltaX
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilsUseTouchMod {
  
  @JSImport("antd-mobile/es/utils/use-touch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useTouch(): DeltaX = ^.asInstanceOf[js.Dynamic].applyDynamic("useTouch")().asInstanceOf[DeltaX]
  
  /* Rewritten from type alias, can be one of: 
    - typings.antdMobile.antdMobileStrings._empty
    - typings.antdMobile.antdMobileStrings.vertical
    - typings.antdMobile.antdMobileStrings.horizontal
  */
  trait Direction extends StObject
  object Direction {
    
    inline def _empty: typings.antdMobile.antdMobileStrings._empty = "".asInstanceOf[typings.antdMobile.antdMobileStrings._empty]
    
    inline def horizontal: typings.antdMobile.antdMobileStrings.horizontal = "horizontal".asInstanceOf[typings.antdMobile.antdMobileStrings.horizontal]
    
    inline def vertical: typings.antdMobile.antdMobileStrings.vertical = "vertical".asInstanceOf[typings.antdMobile.antdMobileStrings.vertical]
  }
}
