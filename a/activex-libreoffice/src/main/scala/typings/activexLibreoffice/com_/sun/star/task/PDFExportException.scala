package typings.activexLibreoffice.com_.sun.star.task

import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** is an exception that provides information on an error during PDF export. */
trait PDFExportException
  extends StObject
     with Exception {
  
  /** contains a number of errors that occurred during PDFExport */
  var ErrorCodes: SafeArray[Double]
}
object PDFExportException {
  
  inline def apply(Context: XInterface, ErrorCodes: SafeArray[Double], Message: String): PDFExportException = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], ErrorCodes = ErrorCodes.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDFExportException]
  }
  
  extension [Self <: PDFExportException](x: Self) {
    
    inline def setErrorCodes(value: SafeArray[Double]): Self = StObject.set(x, "ErrorCodes", value.asInstanceOf[js.Any])
  }
}
