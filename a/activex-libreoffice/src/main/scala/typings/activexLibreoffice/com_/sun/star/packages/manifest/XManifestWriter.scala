package typings.activexLibreoffice.com_.sun.star.packages.manifest

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.io.XOutputStream
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface writes the manifest data to a file. The user calls {@link writeManifestSequence()} with the XOutputStream to write the data to and the
  * sequence of manifest entries to be written passed as parameters. Each manifest entry is represented by a sequence of PropertyValues.
  */
@js.native
trait XManifestWriter extends XInterface {
  /** Writes the supplied sequence of manifest entries to the supplied XOutputStream */
  def writeManifestSequence(rStream: XOutputStream, rSequence: SeqEquiv[SeqEquiv[PropertyValue]]): Unit = js.native
}

object XManifestWriter {
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    writeManifestSequence: (XOutputStream, SeqEquiv[SeqEquiv[PropertyValue]]) => Unit
  ): XManifestWriter = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), writeManifestSequence = js.Any.fromFunction2(writeManifestSequence))
    __obj.asInstanceOf[XManifestWriter]
  }
  @scala.inline
  implicit class XManifestWriterOps[Self <: XManifestWriter] (val x: Self) extends AnyVal {
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
    def setWriteManifestSequence(value: (XOutputStream, SeqEquiv[SeqEquiv[PropertyValue]]) => Unit): Self = this.set("writeManifestSequence", js.Any.fromFunction2(value))
  }
  
}

