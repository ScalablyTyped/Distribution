package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportLabelsTaskRunProperties extends StObject {
  
  /**
    * The Amazon Simple Storage Service (Amazon S3) path where you will export the labels.
    */
  var OutputS3Path: js.UndefOr[UriString] = js.undefined
}
object ExportLabelsTaskRunProperties {
  
  inline def apply(): ExportLabelsTaskRunProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportLabelsTaskRunProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExportLabelsTaskRunProperties] (val x: Self) extends AnyVal {
    
    inline def setOutputS3Path(value: UriString): Self = StObject.set(x, "OutputS3Path", value.asInstanceOf[js.Any])
    
    inline def setOutputS3PathUndefined: Self = StObject.set(x, "OutputS3Path", js.undefined)
  }
}
