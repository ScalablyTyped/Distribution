package typings.androiduix.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("goog")
@js.native
object goog extends js.Object {
  
  @js.native
  object math extends js.Object {
    
    @js.native
    class Long protected ()
      extends typings.androiduix.goog.math.Long {
      def this(low: Double, high: Double) = this()
    }
    /* static members */
    @js.native
    object Long extends js.Object {
      
      var IntCache_ : js.Any = js.native
      
      var MAX_VALUE: typings.androiduix.goog.math.Long = js.native
      
      var MIN_VALUE: typings.androiduix.goog.math.Long = js.native
      
      var NEG_ONE: typings.androiduix.goog.math.Long = js.native
      
      var ONE: typings.androiduix.goog.math.Long = js.native
      
      var TWO_PWR_16_DBL_ : js.Any = js.native
      
      var TWO_PWR_24_ : js.Any = js.native
      
      var TWO_PWR_24_DBL_ : js.Any = js.native
      
      var TWO_PWR_31_DBL_ : js.Any = js.native
      
      var TWO_PWR_32_DBL_ : js.Any = js.native
      
      var TWO_PWR_48_DBL_ : js.Any = js.native
      
      var TWO_PWR_63_DBL_ : js.Any = js.native
      
      var TWO_PWR_64_DBL_ : js.Any = js.native
      
      var ZERO: typings.androiduix.goog.math.Long = js.native
      
      def fromBits(lowBits: Double, highBits: Double): typings.androiduix.goog.math.Long = js.native
      
      def fromInt(value: Double): typings.androiduix.goog.math.Long = js.native
      
      def fromNumber(value: Double): typings.androiduix.goog.math.Long = js.native
      
      def fromString(str: String, opt_radix: Double): typings.androiduix.goog.math.Long = js.native
    }
  }
}
