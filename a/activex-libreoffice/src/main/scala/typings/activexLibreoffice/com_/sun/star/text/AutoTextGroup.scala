package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typings.activexLibreoffice.com_.sun.star.container.XNamed
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to text blocks in a group.
  * @see com.sun.star.text.AutoTextContainer
  */
trait AutoTextGroup
  extends StObject
     with XAutoTextGroup
     with XIndexAccess
     with XNamed {
  
  /** The path to the file containing the {@link AutoTextEntry} 's in this group */
  var FilePath: String
  
  /** The title of this {@link AutoTextGroup} */
  var Title: String
}
object AutoTextGroup {
  
  inline def apply(
    Count: Double,
    ElementNames: SafeArray[String],
    ElementType: `type`,
    FilePath: String,
    Name: String,
    Title: String,
    Titles: SafeArray[String],
    acquire: () => Unit,
    getByIndex: Double => Any,
    getByName: String => Any,
    getCount: () => Double,
    getElementNames: () => SafeArray[String],
    getElementType: () => `type`,
    getName: () => String,
    getTitles: () => SafeArray[String],
    hasByName: String => Boolean,
    hasElements: () => Boolean,
    insertNewByName: (String, String, XTextRange) => XAutoTextEntry,
    queryInterface: `type` => Any,
    release: () => Unit,
    removeByName: String => Unit,
    renameByName: (String, String, String) => Unit,
    setName: String => Unit
  ): AutoTextGroup = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], FilePath = FilePath.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], Titles = Titles.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getByIndex = js.Any.fromFunction1(getByIndex), getByName = js.Any.fromFunction1(getByName), getCount = js.Any.fromFunction0(getCount), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), getName = js.Any.fromFunction0(getName), getTitles = js.Any.fromFunction0(getTitles), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), insertNewByName = js.Any.fromFunction3(insertNewByName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeByName = js.Any.fromFunction1(removeByName), renameByName = js.Any.fromFunction3(renameByName), setName = js.Any.fromFunction1(setName))
    __obj.asInstanceOf[AutoTextGroup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutoTextGroup] (val x: Self) extends AnyVal {
    
    inline def setFilePath(value: String): Self = StObject.set(x, "FilePath", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
  }
}
