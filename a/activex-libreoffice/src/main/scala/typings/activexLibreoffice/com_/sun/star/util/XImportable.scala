package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to import files into the object. */
trait XImportable extends XInterface {
  /** @returns a descriptor which contains the arguments for an import. */
  def createImportDescriptor(bEmpty: Boolean): SafeArray[PropertyValue]
  /** imports data from an external database. */
  def doImport(aDescriptor: SeqEquiv[PropertyValue]): Unit
}

object XImportable {
  @scala.inline
  def apply(
    acquire: () => Unit,
    createImportDescriptor: Boolean => SafeArray[PropertyValue],
    doImport: SeqEquiv[PropertyValue] => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XImportable = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createImportDescriptor = js.Any.fromFunction1(createImportDescriptor), doImport = js.Any.fromFunction1(doImport), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XImportable]
  }
}

