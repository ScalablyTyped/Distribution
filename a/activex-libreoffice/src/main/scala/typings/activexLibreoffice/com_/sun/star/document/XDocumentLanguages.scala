package typings.activexLibreoffice.com_.sun.star.document

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XDocumentLanguages extends XInterface {
  /**
    * retrieve the list of languages already used in current document
    * @returns sequence
    */
  def getDocumentLanguages(nScriptTypes: Double, nCount: Double): SafeArray[Locale]
}

object XDocumentLanguages {
  @scala.inline
  def apply(
    acquire: () => Unit,
    getDocumentLanguages: (Double, Double) => SafeArray[Locale],
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDocumentLanguages = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getDocumentLanguages = js.Any.fromFunction2(getDocumentLanguages), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDocumentLanguages]
  }
}

