package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * an interface to map between **string** s and **id** s
  *
  * a note on atoms: ;  Atoms are abbreviations for strings. When a string gets registered, it is assigned a numeric id so that said string can always be
  * referred to by this id. This way strings have to be transported only once over remote connections. Valid ids are (in this implementation) non zero,
  * signed 32 bit values. An atom of 0 means that the string in question is not registered
  *
  * Additionally there is the abstraction of atom class: ;  Atoms are grouped into classes, so that an id can be assigned to multiple strings, depending
  * on the class context. The main advantage of this is that atoms in one class may be kept to small numbers, so that bandwidth can be reduced by sending
  * the atoms only as 16 bit values. Note that it is up to the user in this case to handle overflows.
  */
@js.native
trait XAtomServer extends XInterface {
  
  /**
    * registers or searches for a string
    * @param atomClass the class of atoms in question
    * @param description the string in question
    * @param create if true a new atom will be created for an unknown string else the invalid atom (0) will be returned for an unknown string
    * @returns the atom for the string `description`
    */
  def getAtom(atomClass: Double, description: String, create: Boolean): Double = js.native
  
  /**
    * returns the strings for an arbitrary amount of atoms of multiple classes
    * @param atoms describes which strings to return
    * @returns the strings for the requested atoms
    */
  def getAtomDescriptions(atoms: SeqEquiv[AtomClassRequest]): SafeArray[String] = js.native
  
  /**
    * returns a whole atom class
    * @param atomClass which class to return
    * @returns the descriptions for all atoms of class `atomClass`
    */
  def getClass(atomClass: Double): SafeArray[AtomDescription] = js.native
  
  /**
    * returns multiple atom classes
    * @param atomClasses which classes to return
    * @returns the descriptions for all atoms of the requested classes
    */
  def getClasses(atomClasses: SeqEquiv[Double]): SafeArray[SafeArray[AtomDescription]] = js.native
  
  /**
    * returns the atoms that have been registered to a class after an already known atom
    *
    * Hint to implementor: using ascending atoms is the easiest way to decide, which atoms are recent.
    * @param atomClass the class in question
    * @param atom the last known atom
    * @returns all atom description that have been added to class `atomClass` after `atom`
    */
  def getRecentAtoms(atomClass: Double, atom: Double): SafeArray[AtomDescription] = js.native
}
object XAtomServer {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    getAtom: (Double, String, Boolean) => Double,
    getAtomDescriptions: SeqEquiv[AtomClassRequest] => SafeArray[String],
    getClass_ : Double => SafeArray[AtomDescription],
    getClasses: SeqEquiv[Double] => SafeArray[SafeArray[AtomDescription]],
    getRecentAtoms: (Double, Double) => SafeArray[AtomDescription],
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XAtomServer = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getAtom = js.Any.fromFunction3(getAtom), getAtomDescriptions = js.Any.fromFunction1(getAtomDescriptions), getClasses = js.Any.fromFunction1(getClasses), getRecentAtoms = js.Any.fromFunction2(getRecentAtoms), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.updateDynamic("getClass")(js.Any.fromFunction1(getClass_))
    __obj.asInstanceOf[XAtomServer]
  }
  
  @scala.inline
  implicit class XAtomServerMutableBuilder[Self <: XAtomServer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetAtom(value: (Double, String, Boolean) => Double): Self = StObject.set(x, "getAtom", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetAtomDescriptions(value: SeqEquiv[AtomClassRequest] => SafeArray[String]): Self = StObject.set(x, "getAtomDescriptions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetClass_(value: Double => SafeArray[AtomDescription]): Self = StObject.set(x, "getClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetClasses(value: SeqEquiv[Double] => SafeArray[SafeArray[AtomDescription]]): Self = StObject.set(x, "getClasses", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetRecentAtoms(value: (Double, Double) => SafeArray[AtomDescription]): Self = StObject.set(x, "getRecentAtoms", js.Any.fromFunction2(value))
  }
}
