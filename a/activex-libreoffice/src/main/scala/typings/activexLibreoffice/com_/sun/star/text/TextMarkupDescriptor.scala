package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.com_.sun.star.container.XStringKeyMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A descriptor for a single text markup.
  * @since OOo 3.0.1
  */
trait TextMarkupDescriptor extends StObject {
  
  var aIdentifier: String
  
  var nLength: Double
  
  var nOffset: Double
  
  var nType: Double
  
  var xMarkupInfoContainer: XStringKeyMap
}
object TextMarkupDescriptor {
  
  inline def apply(
    aIdentifier: String,
    nLength: Double,
    nOffset: Double,
    nType: Double,
    xMarkupInfoContainer: XStringKeyMap
  ): TextMarkupDescriptor = {
    val __obj = js.Dynamic.literal(aIdentifier = aIdentifier.asInstanceOf[js.Any], nLength = nLength.asInstanceOf[js.Any], nOffset = nOffset.asInstanceOf[js.Any], nType = nType.asInstanceOf[js.Any], xMarkupInfoContainer = xMarkupInfoContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextMarkupDescriptor]
  }
  
  extension [Self <: TextMarkupDescriptor](x: Self) {
    
    inline def setAIdentifier(value: String): Self = StObject.set(x, "aIdentifier", value.asInstanceOf[js.Any])
    
    inline def setNLength(value: Double): Self = StObject.set(x, "nLength", value.asInstanceOf[js.Any])
    
    inline def setNOffset(value: Double): Self = StObject.set(x, "nOffset", value.asInstanceOf[js.Any])
    
    inline def setNType(value: Double): Self = StObject.set(x, "nType", value.asInstanceOf[js.Any])
    
    inline def setXMarkupInfoContainer(value: XStringKeyMap): Self = StObject.set(x, "xMarkupInfoContainer", value.asInstanceOf[js.Any])
  }
}
