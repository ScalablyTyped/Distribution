package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorScale
  extends StObject
     with XConditionEntry {
  
  var ColorScaleEntries: SafeArray[XColorScaleEntry]
}
object ColorScale {
  
  inline def apply(
    ColorScaleEntries: SafeArray[XColorScaleEntry],
    Type: Double,
    acquire: () => Unit,
    getType: () => Double,
    queryInterface: `type` => Any,
    release: () => Unit
  ): ColorScale = {
    val __obj = js.Dynamic.literal(ColorScaleEntries = ColorScaleEntries.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getType = js.Any.fromFunction0(getType), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[ColorScale]
  }
  
  extension [Self <: ColorScale](x: Self) {
    
    inline def setColorScaleEntries(value: SafeArray[XColorScaleEntry]): Self = StObject.set(x, "ColorScaleEntries", value.asInstanceOf[js.Any])
  }
}
