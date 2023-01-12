package typings.adobePdfservicesNodeSdk.pdfservicesSdkMod

import typings.adobePdfservicesNodeSdk.adobePdfservicesNodeSdkStrings.applicationSlashpdf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PdfFormat extends StObject {
  
  /**
    * Represents "application/pdf" media type
    */
  var pdf: applicationSlashpdf
}
object PdfFormat {
  
  inline def apply(): PdfFormat = {
    val __obj = js.Dynamic.literal(pdf = "application/pdf")
    __obj.asInstanceOf[PdfFormat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PdfFormat] (val x: Self) extends AnyVal {
    
    inline def setPdf(value: applicationSlashpdf): Self = StObject.set(x, "pdf", value.asInstanceOf[js.Any])
  }
}
