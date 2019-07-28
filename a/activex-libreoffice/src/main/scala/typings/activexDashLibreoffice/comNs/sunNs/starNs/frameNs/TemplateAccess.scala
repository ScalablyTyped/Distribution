package typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.Locale
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XLocalizable
import typings.activexDashLibreoffice.comNs.sunNs.starNs.ucbNs.XContent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides a high level API to organize document templates */
trait TemplateAccess
  extends XDocumentTemplates
     with XLocalizable

object TemplateAccess {
  @scala.inline
  def apply(
    Content: XContent,
    Locale: Locale,
    acquire: () => Unit,
    addGroup: String => Boolean,
    addTemplate: (String, String, String) => Boolean,
    getContent: () => XContent,
    getLocale: () => Locale,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeGroup: String => Boolean,
    removeTemplate: (String, String) => Boolean,
    renameGroup: (String, String) => Boolean,
    renameTemplate: (String, String, String) => Boolean,
    setLocale: Locale => Unit,
    storeTemplate: (String, String, XStorable) => Boolean,
    update: () => Unit
  ): TemplateAccess = {
    val __obj = js.Dynamic.literal(Content = Content, Locale = Locale, acquire = js.Any.fromFunction0(acquire), addGroup = js.Any.fromFunction1(addGroup), addTemplate = js.Any.fromFunction3(addTemplate), getContent = js.Any.fromFunction0(getContent), getLocale = js.Any.fromFunction0(getLocale), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeGroup = js.Any.fromFunction1(removeGroup), removeTemplate = js.Any.fromFunction2(removeTemplate), renameGroup = js.Any.fromFunction2(renameGroup), renameTemplate = js.Any.fromFunction3(renameTemplate), setLocale = js.Any.fromFunction1(setLocale), storeTemplate = js.Any.fromFunction3(storeTemplate), update = js.Any.fromFunction0(update))
  
    __obj.asInstanceOf[TemplateAccess]
  }
}

