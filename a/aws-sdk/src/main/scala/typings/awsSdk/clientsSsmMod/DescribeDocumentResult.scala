package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDocumentResult extends StObject {
  
  /**
    * Information about the SSM document.
    */
  var Document: js.UndefOr[DocumentDescription] = js.undefined
}
object DescribeDocumentResult {
  
  inline def apply(): DescribeDocumentResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDocumentResult]
  }
  
  extension [Self <: DescribeDocumentResult](x: Self) {
    
    inline def setDocument(value: DocumentDescription): Self = StObject.set(x, "Document", value.asInstanceOf[js.Any])
    
    inline def setDocumentUndefined: Self = StObject.set(x, "Document", js.undefined)
  }
}
