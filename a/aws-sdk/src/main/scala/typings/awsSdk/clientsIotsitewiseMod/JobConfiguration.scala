package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobConfiguration extends StObject {
  
  /**
    * The file format of the data in Amazon S3.
    */
  var fileFormat: FileFormat
}
object JobConfiguration {
  
  inline def apply(fileFormat: FileFormat): JobConfiguration = {
    val __obj = js.Dynamic.literal(fileFormat = fileFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JobConfiguration] (val x: Self) extends AnyVal {
    
    inline def setFileFormat(value: FileFormat): Self = StObject.set(x, "fileFormat", value.asInstanceOf[js.Any])
  }
}
