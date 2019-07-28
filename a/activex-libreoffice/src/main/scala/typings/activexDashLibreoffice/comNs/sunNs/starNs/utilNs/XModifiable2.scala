package typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs

import typings.activexDashLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows to control modifiable state change.
  *
  * This interface allows to prevent changing of the modified state of the object. It is introduced for performance optimizations, to allow to prevent
  * unnecessary updates, for example while importing a document. Please use this interface very carefully.
  */
trait XModifiable2 extends XModifiable {
  /**
    * disable possibility to change modified state of the document
    * @returns the value that says whether the modified state change was enabled before the call `TRUE` the changing of the modified state was already disabled
    */
  def disableSetModified(): Boolean
  /**
    * enable possibility to change modified state of the document
    * @returns the value that says whether the modified state change was enabled before the call `TRUE` the changing of the modified state was disabled `FALSE`
    */
  def enableSetModified(): Boolean
  /** allows to detect whether the modified state change is enabled */
  def isSetModifiedEnabled(): Boolean
}

object XModifiable2 {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addModifyListener: XModifyListener => Unit,
    disableSetModified: () => Boolean,
    enableSetModified: () => Boolean,
    isModified: () => Boolean,
    isSetModifiedEnabled: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeModifyListener: XModifyListener => Unit,
    setModified: Boolean => Unit
  ): XModifiable2 = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addModifyListener = js.Any.fromFunction1(addModifyListener), disableSetModified = js.Any.fromFunction0(disableSetModified), enableSetModified = js.Any.fromFunction0(enableSetModified), isModified = js.Any.fromFunction0(isModified), isSetModifiedEnabled = js.Any.fromFunction0(isSetModifiedEnabled), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeModifyListener = js.Any.fromFunction1(removeModifyListener), setModified = js.Any.fromFunction1(setModified))
  
    __obj.asInstanceOf[XModifiable2]
  }
}

