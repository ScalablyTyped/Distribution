package typings.activexLibreoffice.com_.sun.star.util

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * contains a string and the corresponding registered atom .
  * @see com.sun.star.util.XAtomServer
  */
trait AtomDescription extends StObject {
  
  /** the atom itself */
  var atom: Double
  
  /** the string it stands for */
  var description: String
}
object AtomDescription {
  
  inline def apply(atom: Double, description: String): AtomDescription = {
    val __obj = js.Dynamic.literal(atom = atom.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.asInstanceOf[AtomDescription]
  }
  
  extension [Self <: AtomDescription](x: Self) {
    
    inline def setAtom(value: Double): Self = StObject.set(x, "atom", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
  }
}
