package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides a high level API to organize document templates */
trait TemplateAccess
  extends XDocumentTemplates
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XLocalizable

object TemplateAccess {
  @scala.inline
  def apply(
    Content: activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XContent,
    Locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    acquire: () => scala.Unit,
    addGroup: java.lang.String => scala.Boolean,
    addTemplate: (java.lang.String, java.lang.String, java.lang.String) => scala.Boolean,
    getContent: () => activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XContent,
    getLocale: () => activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeGroup: java.lang.String => scala.Boolean,
    removeTemplate: (java.lang.String, java.lang.String) => scala.Boolean,
    renameGroup: (java.lang.String, java.lang.String) => scala.Boolean,
    renameTemplate: (java.lang.String, java.lang.String, java.lang.String) => scala.Boolean,
    setLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale => scala.Unit,
    storeTemplate: (java.lang.String, java.lang.String, XStorable) => scala.Boolean,
    update: () => scala.Unit
  ): TemplateAccess = {
    val __obj = js.Dynamic.literal(Content = Content, Locale = Locale, acquire = js.Any.fromFunction0(acquire), addGroup = js.Any.fromFunction1(addGroup), addTemplate = js.Any.fromFunction3(addTemplate), getContent = js.Any.fromFunction0(getContent), getLocale = js.Any.fromFunction0(getLocale), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeGroup = js.Any.fromFunction1(removeGroup), removeTemplate = js.Any.fromFunction2(removeTemplate), renameGroup = js.Any.fromFunction2(renameGroup), renameTemplate = js.Any.fromFunction3(renameTemplate), setLocale = js.Any.fromFunction1(setLocale), storeTemplate = js.Any.fromFunction3(storeTemplate), update = js.Any.fromFunction0(update))
  
    __obj.asInstanceOf[TemplateAccess]
  }
}

