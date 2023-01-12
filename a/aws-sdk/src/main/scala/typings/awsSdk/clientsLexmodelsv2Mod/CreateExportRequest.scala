package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateExportRequest extends StObject {
  
  /**
    * The file format of the bot or bot locale definition files.
    */
  var fileFormat: ImportExportFileFormat
  
  /**
    * An password to use to encrypt the exported archive. Using a password is optional, but you should encrypt the archive to protect the data in transit between Amazon Lex and your local computer.
    */
  var filePassword: js.UndefOr[ImportExportFilePassword] = js.undefined
  
  /**
    * Specifies the type of resource to export, either a bot or a bot locale. You can only specify one type of resource to export.
    */
  var resourceSpecification: ExportResourceSpecification
}
object CreateExportRequest {
  
  inline def apply(fileFormat: ImportExportFileFormat, resourceSpecification: ExportResourceSpecification): CreateExportRequest = {
    val __obj = js.Dynamic.literal(fileFormat = fileFormat.asInstanceOf[js.Any], resourceSpecification = resourceSpecification.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateExportRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateExportRequest] (val x: Self) extends AnyVal {
    
    inline def setFileFormat(value: ImportExportFileFormat): Self = StObject.set(x, "fileFormat", value.asInstanceOf[js.Any])
    
    inline def setFilePassword(value: ImportExportFilePassword): Self = StObject.set(x, "filePassword", value.asInstanceOf[js.Any])
    
    inline def setFilePasswordUndefined: Self = StObject.set(x, "filePassword", js.undefined)
    
    inline def setResourceSpecification(value: ExportResourceSpecification): Self = StObject.set(x, "resourceSpecification", value.asInstanceOf[js.Any])
  }
}
