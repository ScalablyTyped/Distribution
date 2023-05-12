package typings.awsSdk.clientsSagemakergeospatialMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputBand extends StObject {
  
  /**
    * The name of the band.
    */
  var BandName: String
  
  /**
    * The datatype of the output band.
    */
  var OutputDataType: OutputType
}
object OutputBand {
  
  inline def apply(BandName: String, OutputDataType: OutputType): OutputBand = {
    val __obj = js.Dynamic.literal(BandName = BandName.asInstanceOf[js.Any], OutputDataType = OutputDataType.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputBand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OutputBand] (val x: Self) extends AnyVal {
    
    inline def setBandName(value: String): Self = StObject.set(x, "BandName", value.asInstanceOf[js.Any])
    
    inline def setOutputDataType(value: OutputType): Self = StObject.set(x, "OutputDataType", value.asInstanceOf[js.Any])
  }
}
