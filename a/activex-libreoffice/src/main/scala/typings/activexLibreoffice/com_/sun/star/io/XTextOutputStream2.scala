package typings.activexLibreoffice.com_.sun.star.io

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides a unified interface for the new-style service {@link TextOutputStream} .
  * @since LibreOffice 4.1
  */
trait XTextOutputStream2
  extends StObject
     with XTextOutputStream
     with XActiveDataSource
object XTextOutputStream2 {
  
  inline def apply(
    OutputStream: XOutputStream,
    acquire: () => Unit,
    closeOutput: () => Unit,
    flush: () => Unit,
    getOutputStream: () => XOutputStream,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setEncoding: String => Unit,
    setOutputStream: XOutputStream => Unit,
    writeBytes: SeqEquiv[Double] => Unit,
    writeString: String => Unit
  ): XTextOutputStream2 = {
    val __obj = js.Dynamic.literal(OutputStream = OutputStream.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), closeOutput = js.Any.fromFunction0(closeOutput), flush = js.Any.fromFunction0(flush), getOutputStream = js.Any.fromFunction0(getOutputStream), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setEncoding = js.Any.fromFunction1(setEncoding), setOutputStream = js.Any.fromFunction1(setOutputStream), writeBytes = js.Any.fromFunction1(writeBytes), writeString = js.Any.fromFunction1(writeString))
    __obj.asInstanceOf[XTextOutputStream2]
  }
}
