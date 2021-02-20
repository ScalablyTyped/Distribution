package typings.amapJsApiRiding

import typings.amapJsApiRiding.AMap.Riding.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object AMap {
    
    @JSGlobal("AMap.Riding")
    @js.native
    class Riding ()
      extends typings.amapJsApiRiding.AMap.Riding {
      def this(options: Options) = this()
    }
    
    @JSGlobal("AMap.RidingPolicy")
    @js.native
    object RidingPolicy extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.amapJsApiRiding.AMap.RidingPolicy with Double] = js.native
      
      /* 0 */ val DEFAULT: typings.amapJsApiRiding.AMap.RidingPolicy.DEFAULT with Double = js.native
      
      /* 2 */ val FASTEST: typings.amapJsApiRiding.AMap.RidingPolicy.FASTEST with Double = js.native
      
      /* 1 */ val RECOMMENDED: typings.amapJsApiRiding.AMap.RidingPolicy.RECOMMENDED with Double = js.native
    }
  }
}
