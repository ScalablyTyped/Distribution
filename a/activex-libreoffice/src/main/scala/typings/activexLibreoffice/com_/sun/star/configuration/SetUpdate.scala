package typings.activexLibreoffice.com_.sun.star.configuration

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.com_.sun.star.beans.PropertyState
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides write access to a dynamic homogeneous set of values or nested trees within a hierarchy.
  *
  * Allows adding and removing elements. Helps creates new elements to be added.
  *
  * This service extends {@link SetAccess} to support modifying the container.
  *
  * Any child and descendant objects support modifying access as well, unless they represent a read-only tree element (as indicated by {@link
  * com.sun.star.beans.PropertyAttribute.READONLY} ).
  */
@js.native
trait SetUpdate
  extends SimpleSetUpdate
     with HierarchyAccess {
  /**
    * @param aPropertyName contains the sequence of property names.
    * @returns a sequence of the states of the properties which are specified by their names.  The order of the states is correlating to the order of the given
    * @throws UnknownPropertyException if one property does not exist.
    */
  /* InferMemberOverrides */
  override def getPropertyStates(aPropertyName: SeqEquiv[String]): SafeArray[PropertyState] = js.native
}

