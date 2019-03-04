package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait XAtomServer
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * registers or searches for a string
    * @param atomClass the class of atoms in question
    * @param description the string in question
    * @param create if true a new atom will be created for an unknown string else the invalid atom (0) will be returned for an unknown string
    * @returns the atom for the string `description`
    */
  def getAtom(atomClass: scala.Double, description: java.lang.String, create: scala.Boolean): scala.Double
  /**
    * returns the strings for an arbitrary amount of atoms of multiple classes
    * @param atoms describes which strings to return
    * @returns the strings for the requested atoms
    */
  def getAtomDescriptions(atoms: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[AtomClassRequest]): activexDashInteropLib.SafeArray[java.lang.String]
  /**
    * returns a whole atom class
    * @param atomClass which class to return
    * @returns the descriptions for all atoms of class `atomClass`
    */
  def getClass(atomClass: scala.Double): activexDashInteropLib.SafeArray[AtomDescription]
  /**
    * returns multiple atom classes
    * @param atomClasses which classes to return
    * @returns the descriptions for all atoms of the requested classes
    */
  def getClasses(atomClasses: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]): activexDashInteropLib.SafeArray[activexDashInteropLib.SafeArray[AtomDescription]]
  /**
    * returns the atoms that have been registered to a class after an already known atom
    *
    * Hint to implementor: using ascending atoms is the easiest way to decide, which atoms are recent.
    * @param atomClass the class in question
    * @param atom the last known atom
    * @returns all atom description that have been added to class `atomClass` after `atom`
    */
  def getRecentAtoms(atomClass: scala.Double, atom: scala.Double): activexDashInteropLib.SafeArray[AtomDescription]
}

object XAtomServer {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    getAtom: js.Function3[scala.Double, java.lang.String, scala.Boolean, scala.Double],
    getAtomDescriptions: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[AtomClassRequest], 
      activexDashInteropLib.SafeArray[java.lang.String]
    ],
    getClass: js.Function1[scala.Double, activexDashInteropLib.SafeArray[AtomDescription]],
    getClasses: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], 
      activexDashInteropLib.SafeArray[activexDashInteropLib.SafeArray[AtomDescription]]
    ],
    getRecentAtoms: js.Function2[scala.Double, scala.Double, activexDashInteropLib.SafeArray[AtomDescription]],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XAtomServer = {
    val __obj = js.Dynamic.literal(acquire = acquire, getAtom = getAtom, getAtomDescriptions = getAtomDescriptions, getClass = getClass, getClasses = getClasses, getRecentAtoms = getRecentAtoms, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XAtomServer]
  }
}

