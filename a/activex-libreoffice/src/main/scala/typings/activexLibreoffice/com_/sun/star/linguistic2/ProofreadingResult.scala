package typings.activexLibreoffice.com_.sun.star.linguistic2

import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.activexLibreoffice.com_.sun.star.text.XFlatParagraph
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * holds the results from proofreading a sentence.
  * @since OOo 3.0.1
  */
@js.native
trait ProofreadingResult extends StObject {
  
  var aDocumentIdentifier: String = js.native
  
  var aErrors: SafeArray[SingleProofreadingError] = js.native
  
  var aLocale: Locale = js.native
  
  var aProperties: SafeArray[PropertyValue] = js.native
  
  var aText: String = js.native
  
  var nBehindEndOfSentencePosition: Double = js.native
  
  var nStartOfNextSentencePosition: Double = js.native
  
  var nStartOfSentencePosition: Double = js.native
  
  var xFlatParagraph: XFlatParagraph = js.native
  
  var xProofreader: XProofreader = js.native
}
object ProofreadingResult {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class ProofreadingResultMutableBuilder[Self <: ProofreadingResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setADocumentIdentifier(value: String): Self = StObject.set(x, "aDocumentIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAErrors(value: SafeArray[SingleProofreadingError]): Self = StObject.set(x, "aErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setALocale(value: Locale): Self = StObject.set(x, "aLocale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAProperties(value: SafeArray[PropertyValue]): Self = StObject.set(x, "aProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAText(value: String): Self = StObject.set(x, "aText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNBehindEndOfSentencePosition(value: Double): Self = StObject.set(x, "nBehindEndOfSentencePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNStartOfNextSentencePosition(value: Double): Self = StObject.set(x, "nStartOfNextSentencePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNStartOfSentencePosition(value: Double): Self = StObject.set(x, "nStartOfSentencePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXFlatParagraph(value: XFlatParagraph): Self = StObject.set(x, "xFlatParagraph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXProofreader(value: XProofreader): Self = StObject.set(x, "xProofreader", value.asInstanceOf[js.Any])
  }
}
