package typings.activexLibreoffice.com_.sun.star.report

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XChild
import typings.activexLibreoffice.com_.sun.star.container.XContainer
import typings.activexLibreoffice.com_.sun.star.container.XContainerListener
import typings.activexLibreoffice.com_.sun.star.container.XIndexContainer
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface specifies the groups collections of the report definition.
  * @see XGroup
  * @see XReportDefinition
  */
trait XGroups
  extends StObject
     with XContainer
     with XIndexContainer
     with XChild
     with XComponent {
  
  var ReportDefinition: XReportDefinition
  
  /** factory method for {@link XGroup} . */
  def createGroup(): XGroup
}
object XGroups {
  
  inline def apply(
    Count: Double,
    ElementType: `type`,
    Parent: XInterface,
    ReportDefinition: XReportDefinition,
    acquire: () => Unit,
    addContainerListener: XContainerListener => Unit,
    addEventListener: XEventListener => Unit,
    createGroup: () => XGroup,
    dispose: () => Unit,
    getByIndex: Double => Any,
    getCount: () => Double,
    getElementType: () => `type`,
    getParent: () => XInterface,
    hasElements: () => Boolean,
    insertByIndex: (Double, Any) => Unit,
    queryInterface: `type` => Any,
    release: () => Unit,
    removeByIndex: Double => Unit,
    removeContainerListener: XContainerListener => Unit,
    removeEventListener: XEventListener => Unit,
    replaceByIndex: (Double, Any) => Unit,
    setParent: XInterface => Unit
  ): XGroups = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ReportDefinition = ReportDefinition.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addContainerListener = js.Any.fromFunction1(addContainerListener), addEventListener = js.Any.fromFunction1(addEventListener), createGroup = js.Any.fromFunction0(createGroup), dispose = js.Any.fromFunction0(dispose), getByIndex = js.Any.fromFunction1(getByIndex), getCount = js.Any.fromFunction0(getCount), getElementType = js.Any.fromFunction0(getElementType), getParent = js.Any.fromFunction0(getParent), hasElements = js.Any.fromFunction0(hasElements), insertByIndex = js.Any.fromFunction2(insertByIndex), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeByIndex = js.Any.fromFunction1(removeByIndex), removeContainerListener = js.Any.fromFunction1(removeContainerListener), removeEventListener = js.Any.fromFunction1(removeEventListener), replaceByIndex = js.Any.fromFunction2(replaceByIndex), setParent = js.Any.fromFunction1(setParent))
    __obj.asInstanceOf[XGroups]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XGroups] (val x: Self) extends AnyVal {
    
    inline def setCreateGroup(value: () => XGroup): Self = StObject.set(x, "createGroup", js.Any.fromFunction0(value))
    
    inline def setReportDefinition(value: XReportDefinition): Self = StObject.set(x, "ReportDefinition", value.asInstanceOf[js.Any])
  }
}
