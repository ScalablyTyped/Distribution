package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomNarrativeOptions extends StObject {
  
  /**
    * The string input of custom narrative.
    */
  var Narrative: NarrativeString
}
object CustomNarrativeOptions {
  
  inline def apply(Narrative: NarrativeString): CustomNarrativeOptions = {
    val __obj = js.Dynamic.literal(Narrative = Narrative.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomNarrativeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomNarrativeOptions] (val x: Self) extends AnyVal {
    
    inline def setNarrative(value: NarrativeString): Self = StObject.set(x, "Narrative", value.asInstanceOf[js.Any])
  }
}
