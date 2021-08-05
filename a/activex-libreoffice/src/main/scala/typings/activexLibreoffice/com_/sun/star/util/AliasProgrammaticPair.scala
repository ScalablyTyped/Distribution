package typings.activexLibreoffice.com_.sun.star.util

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** represents an entry from a component which implements the {@link XLocalizedAliases} . */
trait AliasProgrammaticPair extends StObject {
  
  /** determines the name which is registered as an alias for a programmatic name. */
  var Alias: String
  
  /**
    * determines which programmatic name belongs to the alias.
    * @see com.sun.star.util.XLocalizedAliases
    */
  var ProgrammaticName: String
}
object AliasProgrammaticPair {
  
  inline def apply(Alias: String, ProgrammaticName: String): AliasProgrammaticPair = {
    val __obj = js.Dynamic.literal(Alias = Alias.asInstanceOf[js.Any], ProgrammaticName = ProgrammaticName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AliasProgrammaticPair]
  }
  
  extension [Self <: AliasProgrammaticPair](x: Self) {
    
    inline def setAlias(value: String): Self = StObject.set(x, "Alias", value.asInstanceOf[js.Any])
    
    inline def setProgrammaticName(value: String): Self = StObject.set(x, "ProgrammaticName", value.asInstanceOf[js.Any])
  }
}
