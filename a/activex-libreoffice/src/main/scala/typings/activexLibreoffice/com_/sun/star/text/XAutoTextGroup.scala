package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The interface provide methods to insert, rename and delete autotext entries from the current autotext group. */
@js.native
trait XAutoTextGroup extends XNameAccess {
  
  /** returns the titles of all autotext entries. The order of the entries corresponds to the output of the function {@link getElementNames()} . */
  val Titles: SafeArray[String] = js.native
  
  /** returns the titles of all autotext entries. The order of the entries corresponds to the output of the function {@link getElementNames()} . */
  def getTitles(): SafeArray[String] = js.native
  
  /** creates a new {@link AutoTextEntry} entry. */
  def insertNewByName(aName: String, aTitle: String, xTextRange: XTextRange): XAutoTextEntry = js.native
  
  /** removes the specified autotext entry. */
  def removeByName(aEntryName: String): Unit = js.native
  
  /**
    * renames an entry in the autotext group.
    *
    * The position of the autotext entry is not changed.
    */
  def renameByName(aElementName: String, aNewElementName: String, aNewElementTitle: String): Unit = js.native
}
object XAutoTextGroup {
  
  @scala.inline
  def apply(
    ElementNames: SafeArray[String],
    ElementType: `type`,
    Titles: SafeArray[String],
    acquire: () => Unit,
    getByName: String => js.Any,
    getElementNames: () => SafeArray[String],
    getElementType: () => `type`,
    getTitles: () => SafeArray[String],
    hasByName: String => Boolean,
    hasElements: () => Boolean,
    insertNewByName: (String, String, XTextRange) => XAutoTextEntry,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeByName: String => Unit,
    renameByName: (String, String, String) => Unit
  ): XAutoTextGroup = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], Titles = Titles.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getByName = js.Any.fromFunction1(getByName), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), getTitles = js.Any.fromFunction0(getTitles), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), insertNewByName = js.Any.fromFunction3(insertNewByName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeByName = js.Any.fromFunction1(removeByName), renameByName = js.Any.fromFunction3(renameByName))
    __obj.asInstanceOf[XAutoTextGroup]
  }
  
  @scala.inline
  implicit class XAutoTextGroupOps[Self <: XAutoTextGroup] (val x: Self) extends AnyVal {
    
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
    def setTitles(value: SafeArray[String]): Self = this.set("Titles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetTitles(value: () => SafeArray[String]): Self = this.set("getTitles", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInsertNewByName(value: (String, String, XTextRange) => XAutoTextEntry): Self = this.set("insertNewByName", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRemoveByName(value: String => Unit): Self = this.set("removeByName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenameByName(value: (String, String, String) => Unit): Self = this.set("renameByName", js.Any.fromFunction3(value))
  }
}
