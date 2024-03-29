package typings.activexWia.WIA

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Rational object is a container for the rational values found in Exif tags. It is a supported element type of the Vector object and may be created
  * using "WIA.Rational" in a call to CreateObject.
  */
trait Rational extends StObject {
  
  /** Returns/Sets the Rational Value Denominator */
  var Denominator: Double
  
  /** Returns/Sets the Rational Value Numerator */
  var Numerator: Double
  
  /** Returns the Rational Value as a Double */
  val Value: Double
  
  /* private */ @JSName("WIA.Rational_typekey")
  var WIADotRational_typekey: Rational
}
object Rational {
  
  inline def apply(Denominator: Double, Numerator: Double, Value: Double, WIADotRational_typekey: Rational): Rational = {
    val __obj = js.Dynamic.literal(Denominator = Denominator.asInstanceOf[js.Any], Numerator = Numerator.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("WIA.Rational_typekey")(WIADotRational_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rational]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Rational] (val x: Self) extends AnyVal {
    
    inline def setDenominator(value: Double): Self = StObject.set(x, "Denominator", value.asInstanceOf[js.Any])
    
    inline def setNumerator(value: Double): Self = StObject.set(x, "Numerator", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setWIADotRational_typekey(value: Rational): Self = StObject.set(x, "WIA.Rational_typekey", value.asInstanceOf[js.Any])
  }
}
