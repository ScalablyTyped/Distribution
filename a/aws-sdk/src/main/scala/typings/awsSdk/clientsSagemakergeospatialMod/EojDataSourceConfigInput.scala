package typings.awsSdk.clientsSagemakergeospatialMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EojDataSourceConfigInput extends StObject {
  
  /**
    * The input structure for S3Data; representing the Amazon S3 location of the input data objects.
    */
  var S3Data: js.UndefOr[S3DataInput] = js.undefined
}
object EojDataSourceConfigInput {
  
  inline def apply(): EojDataSourceConfigInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EojDataSourceConfigInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EojDataSourceConfigInput] (val x: Self) extends AnyVal {
    
    inline def setS3Data(value: S3DataInput): Self = StObject.set(x, "S3Data", value.asInstanceOf[js.Any])
    
    inline def setS3DataUndefined: Self = StObject.set(x, "S3Data", js.undefined)
  }
}
