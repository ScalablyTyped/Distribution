package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.com_.sun.star.io.XInputStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The argument for the command "insert" augmented with some properties */
trait InsertCommandArgument2
  extends StObject
     with InsertCommandArgument {
  
  /** contains the Document Id of the document to insert */
  var DocumentId: String
  
  /** contains the MIME type of the document to insert */
  var MimeType: String
}
object InsertCommandArgument2 {
  
  inline def apply(Data: XInputStream, DocumentId: String, MimeType: String, ReplaceExisting: Boolean): InsertCommandArgument2 = {
    val __obj = js.Dynamic.literal(Data = Data.asInstanceOf[js.Any], DocumentId = DocumentId.asInstanceOf[js.Any], MimeType = MimeType.asInstanceOf[js.Any], ReplaceExisting = ReplaceExisting.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertCommandArgument2]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InsertCommandArgument2] (val x: Self) extends AnyVal {
    
    inline def setDocumentId(value: String): Self = StObject.set(x, "DocumentId", value.asInstanceOf[js.Any])
    
    inline def setMimeType(value: String): Self = StObject.set(x, "MimeType", value.asInstanceOf[js.Any])
  }
}
