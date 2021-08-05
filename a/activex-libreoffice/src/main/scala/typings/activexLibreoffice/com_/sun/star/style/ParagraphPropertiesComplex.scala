package typings.activexLibreoffice.com_.sun.star.style

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** contains settings for the style of paragraphs with complex text layout. */
trait ParagraphPropertiesComplex extends StObject {
  
  /** contains the writing direction, as represented by the {@link com.sun.star.text.WritingMode2} constants */
  var WritingMode: Double
}
object ParagraphPropertiesComplex {
  
  inline def apply(WritingMode: Double): ParagraphPropertiesComplex = {
    val __obj = js.Dynamic.literal(WritingMode = WritingMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParagraphPropertiesComplex]
  }
  
  extension [Self <: ParagraphPropertiesComplex](x: Self) {
    
    inline def setWritingMode(value: Double): Self = StObject.set(x, "WritingMode", value.asInstanceOf[js.Any])
  }
}
