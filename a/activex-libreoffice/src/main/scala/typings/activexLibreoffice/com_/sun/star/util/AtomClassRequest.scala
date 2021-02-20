package typings.activexLibreoffice.com_.sun.star.util

import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is used to describe which atoms the user wants to know about.
  * @see com.sun.star.util.XAtomServer
  */
@js.native
trait AtomClassRequest extends StObject {
  
  /** the class of the atoms described in member {@link AtomClassRequest.atoms()} . */
  var atomClass: Double = js.native
  
  /** the atoms requested from class {@link AtomClassRequest.atomClass()} . */
  var atoms: SafeArray[Double] = js.native
}
object AtomClassRequest {
  
  @scala.inline
  def apply(atomClass: Double, atoms: SafeArray[Double]): AtomClassRequest = {
    val __obj = js.Dynamic.literal(atomClass = atomClass.asInstanceOf[js.Any], atoms = atoms.asInstanceOf[js.Any])
    __obj.asInstanceOf[AtomClassRequest]
  }
  
  @scala.inline
  implicit class AtomClassRequestMutableBuilder[Self <: AtomClassRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAtomClass(value: Double): Self = StObject.set(x, "atomClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAtoms(value: SafeArray[Double]): Self = StObject.set(x, "atoms", value.asInstanceOf[js.Any])
  }
}
