package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioDolbyEDecode extends StObject {
  
  /**
    * Applies only to Dolby E. Enter the program ID (according to the metadata in the audio) of the Dolby E program to extract from the specified track. One program extracted per audio selector. To select multiple programs, create multiple selectors with the same Track and different Program numbers. “All channels” means to ignore the program IDs and include all the channels in this selector; useful if metadata is known to be incorrect.
    */
  var ProgramSelection: DolbyEProgramSelection
}
object AudioDolbyEDecode {
  
  inline def apply(ProgramSelection: DolbyEProgramSelection): AudioDolbyEDecode = {
    val __obj = js.Dynamic.literal(ProgramSelection = ProgramSelection.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioDolbyEDecode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AudioDolbyEDecode] (val x: Self) extends AnyVal {
    
    inline def setProgramSelection(value: DolbyEProgramSelection): Self = StObject.set(x, "ProgramSelection", value.asInstanceOf[js.Any])
  }
}
