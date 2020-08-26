package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides a method to add a DDE link to a spreadsheet.
  * @see com.sun.star.sheet.DDELinks
  * @since OOo 3.0
  */
@js.native
trait XDDELinks extends XNameAccess {
  /**
    * adds a DDE link to the spreadsheet without updating it.
    *
    * If a DDE link with the specified parameters already exists, the existing DDE link will be returned. Otherwise a new DDE link will be created.
    * @param aApplication the DDE server application from which data are requested.
    * @param aTopic the DDE topic from which data are requested.
    * @param aItem the DDE item from which data are requested.
    * @param nMode the DDE link mode.
    * @returns the DDE link.
    */
  def addDDELink(aApplication: String, aTopic: String, aItem: String, nMode: DDELinkMode): XDDELink = js.native
}

object XDDELinks {
  @scala.inline
  def apply(
    ElementNames: SafeArray[String],
    ElementType: `type`,
    acquire: () => Unit,
    addDDELink: (String, String, String, DDELinkMode) => XDDELink,
    getByName: String => js.Any,
    getElementNames: () => SafeArray[String],
    getElementType: () => `type`,
    hasByName: String => Boolean,
    hasElements: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDDELinks = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addDDELink = js.Any.fromFunction4(addDDELink), getByName = js.Any.fromFunction1(getByName), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDDELinks]
  }
  @scala.inline
  implicit class XDDELinksOps[Self <: XDDELinks] (val x: Self) extends AnyVal {
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
    def setAddDDELink(value: (String, String, String, DDELinkMode) => XDDELink): Self = this.set("addDDELink", js.Any.fromFunction4(value))
  }
  
}

