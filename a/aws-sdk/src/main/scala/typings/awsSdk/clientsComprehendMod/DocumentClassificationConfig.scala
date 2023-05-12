package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentClassificationConfig extends StObject {
  
  /**
    * One or more labels to associate with the custom classifier.
    */
  var Labels: js.UndefOr[LabelsList] = js.undefined
  
  /**
    * Classification mode indicates whether the documents are MULTI_CLASS or MULTI_LABEL.
    */
  var Mode: DocumentClassifierMode
}
object DocumentClassificationConfig {
  
  inline def apply(Mode: DocumentClassifierMode): DocumentClassificationConfig = {
    val __obj = js.Dynamic.literal(Mode = Mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentClassificationConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocumentClassificationConfig] (val x: Self) extends AnyVal {
    
    inline def setLabels(value: LabelsList): Self = StObject.set(x, "Labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "Labels", js.undefined)
    
    inline def setLabelsVarargs(value: LabelListItem*): Self = StObject.set(x, "Labels", js.Array(value*))
    
    inline def setMode(value: DocumentClassifierMode): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
  }
}
