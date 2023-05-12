package typings.awsSdk.clientsSagemakergeospatialMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputConfigInput extends StObject {
  
  /**
    * Path to Amazon S3 storage location for the output configuration file.
    */
  var S3Data: ExportS3DataInput
}
object OutputConfigInput {
  
  inline def apply(S3Data: ExportS3DataInput): OutputConfigInput = {
    val __obj = js.Dynamic.literal(S3Data = S3Data.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputConfigInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OutputConfigInput] (val x: Self) extends AnyVal {
    
    inline def setS3Data(value: ExportS3DataInput): Self = StObject.set(x, "S3Data", value.asInstanceOf[js.Any])
  }
}
