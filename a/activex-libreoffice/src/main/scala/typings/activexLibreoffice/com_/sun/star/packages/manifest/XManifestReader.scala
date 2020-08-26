package typings.activexLibreoffice.com_.sun.star.packages.manifest

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.io.XInputStream
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface reads the manifest data from a file. The user must supply an XInputStream when calling {@link readManifestSequence()} to receive a
  * sequence of manifest entries. Each manifest entry is represented by a sequence of PropertyValues.
  */
@js.native
trait XManifestReader extends XInterface {
  /** Supplies the {@link XManifestReader} with an XInputStream to read from, reads the data and returns it to the caller. */
  def readManifestSequence(rStream: XInputStream): SafeArray[SafeArray[PropertyValue]] = js.native
}

object XManifestReader {
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    readManifestSequence: XInputStream => SafeArray[SafeArray[PropertyValue]],
    release: () => Unit
  ): XManifestReader = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), readManifestSequence = js.Any.fromFunction1(readManifestSequence), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XManifestReader]
  }
  @scala.inline
  implicit class XManifestReaderOps[Self <: XManifestReader] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setReadManifestSequence(value: XInputStream => SafeArray[SafeArray[PropertyValue]]): Self = this.set("readManifestSequence", js.Any.fromFunction1(value))
  }
  
}

