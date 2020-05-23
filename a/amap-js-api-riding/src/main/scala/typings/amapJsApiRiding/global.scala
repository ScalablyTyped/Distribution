package typings.amapJsApiRiding

import typings.amapJsApiRiding.AMap.Riding.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object AMap extends js.Object {
    @js.native
    class Riding ()
      extends typings.amapJsApiRiding.AMap.Riding {
      def this(options: Options) = this()
    }
    
    @js.native
    object RidingPolicy extends js.Object {
      /* 0 */ val DEFAULT: typings.amapJsApiRiding.AMap.RidingPolicy.DEFAULT with Double = js.native
      /* 2 */ val FASTEST: typings.amapJsApiRiding.AMap.RidingPolicy.FASTEST with Double = js.native
      /* 1 */ val RECOMMENDED: typings.amapJsApiRiding.AMap.RidingPolicy.RECOMMENDED with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.amapJsApiRiding.AMap.RidingPolicy with Double] = js.native
    }
    
  }
  
}

