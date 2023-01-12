package typings.awsSdk.clientsIotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputFileUriValue extends StObject {
  
  /**
    * The URI of the location where dataset contents are stored, usually the URI of a file in an S3 bucket.
    */
  var fileName: OutputFileName
}
object OutputFileUriValue {
  
  inline def apply(fileName: OutputFileName): OutputFileUriValue = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputFileUriValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OutputFileUriValue] (val x: Self) extends AnyVal {
    
    inline def setFileName(value: OutputFileName): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
  }
}
