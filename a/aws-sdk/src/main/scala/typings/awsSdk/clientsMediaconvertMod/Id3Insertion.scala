package typings.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Id3Insertion extends StObject {
  
  /**
    * Use ID3 tag (Id3) to provide a fully formed ID3 tag in base64-encode format.
    */
  var Id3: js.UndefOr[stringPatternAZaZ0902] = js.undefined
  
  /**
    * Provide a Timecode (TimeCode) in HH:MM:SS:FF or HH:MM:SS;FF format.
    */
  var Timecode: js.UndefOr[stringPattern010920405090509092] = js.undefined
}
object Id3Insertion {
  
  inline def apply(): Id3Insertion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Id3Insertion]
  }
  
  extension [Self <: Id3Insertion](x: Self) {
    
    inline def setId3(value: stringPatternAZaZ0902): Self = StObject.set(x, "Id3", value.asInstanceOf[js.Any])
    
    inline def setId3Undefined: Self = StObject.set(x, "Id3", js.undefined)
    
    inline def setTimecode(value: stringPattern010920405090509092): Self = StObject.set(x, "Timecode", value.asInstanceOf[js.Any])
    
    inline def setTimecodeUndefined: Self = StObject.set(x, "Timecode", js.undefined)
  }
}
