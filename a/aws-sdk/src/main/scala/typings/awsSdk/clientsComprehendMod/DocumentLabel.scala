package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentLabel extends StObject {
  
  /**
    * The name of the label.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * Page number where the label occurs. This field is present in the response only if your request includes the Byte parameter. 
    */
  var Page: js.UndefOr[Integer] = js.undefined
  
  /**
    * The confidence score that Amazon Comprehend has this label correctly attributed.
    */
  var Score: js.UndefOr[Float] = js.undefined
}
object DocumentLabel {
  
  inline def apply(): DocumentLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentLabel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocumentLabel] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setPage(value: Integer): Self = StObject.set(x, "Page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "Page", js.undefined)
    
    inline def setScore(value: Float): Self = StObject.set(x, "Score", value.asInstanceOf[js.Any])
    
    inline def setScoreUndefined: Self = StObject.set(x, "Score", js.undefined)
  }
}
