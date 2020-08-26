package typings.activexLibreoffice.com_.sun.star.configuration

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.Property
import typings.activexLibreoffice.com_.sun.star.beans.PropertyState
import typings.activexLibreoffice.com_.sun.star.container.XContainerListener
import typings.activexLibreoffice.com_.sun.star.util.XStringEscape
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to a dynamic, homogeneous set of values or nested trees within a hierarchy.
  *
  * Also provides information about the template for elements. Allows normalizing externally generated names.
  *
  * **Sets** are dynamic containers within the hierarchy.
  *
  * The number and names of contained elements are not fixed in advance, but all elements have to be of one predetermined type.
  * @see com.sun.star.configuration.SetElement Child objects of this service generally implement SetElement. The template name returned by the child from
  * @see com.sun.star.configuration.GroupAccess A complementary service that provides for static heterogeneous groups of elements within the hierarchy.
  */
@js.native
trait SetAccess
  extends HierarchyAccess
     with XTemplateContainer
     with XStringEscape {
  /**
    * @param aPropertyName contains the sequence of property names.
    * @returns a sequence of the states of the properties which are specified by their names.  The order of the states is correlating to the order of the given
    * @throws UnknownPropertyException if one property does not exist.
    */
  /* InferMemberOverrides */
  override def getPropertyStates(aPropertyName: SeqEquiv[String]): SafeArray[PropertyState] = js.native
}

object SetAccess {
  @scala.inline
  def apply(
    ElementNames: SafeArray[String],
    ElementTemplateName: String,
    ElementType: `type`,
    Properties: SafeArray[Property],
    acquire: () => Unit,
    addContainerListener: XContainerListener => Unit,
    escapeString: String => String,
    getByHierarchicalName: String => js.Any,
    getByName: String => js.Any,
    getElementNames: () => SafeArray[String],
    getElementTemplateName: () => String,
    getElementType: () => `type`,
    getExactName: String => String,
    getProperties: () => SafeArray[Property],
    getPropertyByName: String => Property,
    getPropertyDefault: String => js.Any,
    getPropertyDefaults: SeqEquiv[String] => SafeArray[_],
    getPropertyState: String => PropertyState,
    getPropertyStates: SeqEquiv[String] => SafeArray[PropertyState],
    hasByHierarchicalName: String => Boolean,
    hasByName: String => Boolean,
    hasElements: () => Boolean,
    hasPropertyByName: String => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeContainerListener: XContainerListener => Unit,
    setAllPropertiesToDefault: () => Unit,
    setPropertiesToDefault: SeqEquiv[String] => Unit,
    setPropertyToDefault: String => Unit,
    unescapeString: String => String
  ): SetAccess = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames.asInstanceOf[js.Any], ElementTemplateName = ElementTemplateName.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], Properties = Properties.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addContainerListener = js.Any.fromFunction1(addContainerListener), escapeString = js.Any.fromFunction1(escapeString), getByHierarchicalName = js.Any.fromFunction1(getByHierarchicalName), getByName = js.Any.fromFunction1(getByName), getElementNames = js.Any.fromFunction0(getElementNames), getElementTemplateName = js.Any.fromFunction0(getElementTemplateName), getElementType = js.Any.fromFunction0(getElementType), getExactName = js.Any.fromFunction1(getExactName), getProperties = js.Any.fromFunction0(getProperties), getPropertyByName = js.Any.fromFunction1(getPropertyByName), getPropertyDefault = js.Any.fromFunction1(getPropertyDefault), getPropertyDefaults = js.Any.fromFunction1(getPropertyDefaults), getPropertyState = js.Any.fromFunction1(getPropertyState), getPropertyStates = js.Any.fromFunction1(getPropertyStates), hasByHierarchicalName = js.Any.fromFunction1(hasByHierarchicalName), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), hasPropertyByName = js.Any.fromFunction1(hasPropertyByName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeContainerListener = js.Any.fromFunction1(removeContainerListener), setAllPropertiesToDefault = js.Any.fromFunction0(setAllPropertiesToDefault), setPropertiesToDefault = js.Any.fromFunction1(setPropertiesToDefault), setPropertyToDefault = js.Any.fromFunction1(setPropertyToDefault), unescapeString = js.Any.fromFunction1(unescapeString))
    __obj.asInstanceOf[SetAccess]
  }
  @scala.inline
  implicit class SetAccessOps[Self <: SetAccess] (val x: Self) extends AnyVal {
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
    def setGetPropertyStates(value: SeqEquiv[String] => SafeArray[PropertyState]): Self = this.set("getPropertyStates", js.Any.fromFunction1(value))
  }
  
}

