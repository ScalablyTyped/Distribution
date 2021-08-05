package typings.activexLibreoffice.com_.sun.star.linguistic2

import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.activexLibreoffice.com_.sun.star.text.XFlatParagraph
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * holds the results from proofreading a sentence.
  * @since OOo 3.0.1
  */
trait ProofreadingResult extends StObject {
  
  var aDocumentIdentifier: String
  
  var aErrors: SafeArray[SingleProofreadingError]
  
  var aLocale: Locale
  
  var aProperties: SafeArray[PropertyValue]
  
  var aText: String
  
  var nBehindEndOfSentencePosition: Double
  
  var nStartOfNextSentencePosition: Double
  
  var nStartOfSentencePosition: Double
  
  var xFlatParagraph: XFlatParagraph
  
  var xProofreader: XProofreader
}
object ProofreadingResult {
  
  inline def apply(
    aDocumentIdentifier: String,
    aErrors: SafeArray[SingleProofreadingError],
    aLocale: Locale,
    aProperties: SafeArray[PropertyValue],
    aText: String,
    nBehindEndOfSentencePosition: Double,
    nStartOfNextSentencePosition: Double,
    nStartOfSentencePosition: Double,
    xFlatParagraph: XFlatParagraph,
    xProofreader: XProofreader
  ): ProofreadingResult = {
    val __obj = js.Dynamic.literal(aDocumentIdentifier = aDocumentIdentifier.asInstanceOf[js.Any], aErrors = aErrors.asInstanceOf[js.Any], aLocale = aLocale.asInstanceOf[js.Any], aProperties = aProperties.asInstanceOf[js.Any], aText = aText.asInstanceOf[js.Any], nBehindEndOfSentencePosition = nBehindEndOfSentencePosition.asInstanceOf[js.Any], nStartOfNextSentencePosition = nStartOfNextSentencePosition.asInstanceOf[js.Any], nStartOfSentencePosition = nStartOfSentencePosition.asInstanceOf[js.Any], xFlatParagraph = xFlatParagraph.asInstanceOf[js.Any], xProofreader = xProofreader.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProofreadingResult]
  }
  
  extension [Self <: ProofreadingResult](x: Self) {
    
    inline def setADocumentIdentifier(value: String): Self = StObject.set(x, "aDocumentIdentifier", value.asInstanceOf[js.Any])
    
    inline def setAErrors(value: SafeArray[SingleProofreadingError]): Self = StObject.set(x, "aErrors", value.asInstanceOf[js.Any])
    
    inline def setALocale(value: Locale): Self = StObject.set(x, "aLocale", value.asInstanceOf[js.Any])
    
    inline def setAProperties(value: SafeArray[PropertyValue]): Self = StObject.set(x, "aProperties", value.asInstanceOf[js.Any])
    
    inline def setAText(value: String): Self = StObject.set(x, "aText", value.asInstanceOf[js.Any])
    
    inline def setNBehindEndOfSentencePosition(value: Double): Self = StObject.set(x, "nBehindEndOfSentencePosition", value.asInstanceOf[js.Any])
    
    inline def setNStartOfNextSentencePosition(value: Double): Self = StObject.set(x, "nStartOfNextSentencePosition", value.asInstanceOf[js.Any])
    
    inline def setNStartOfSentencePosition(value: Double): Self = StObject.set(x, "nStartOfSentencePosition", value.asInstanceOf[js.Any])
    
    inline def setXFlatParagraph(value: XFlatParagraph): Self = StObject.set(x, "xFlatParagraph", value.asInstanceOf[js.Any])
    
    inline def setXProofreader(value: XProofreader): Self = StObject.set(x, "xProofreader", value.asInstanceOf[js.Any])
  }
}
