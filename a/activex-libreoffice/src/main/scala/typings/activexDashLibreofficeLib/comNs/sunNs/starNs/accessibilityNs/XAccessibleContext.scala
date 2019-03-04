package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Implement this interface for exposing various aspects of a class's content.
  *
  * This interface serves two purposes: On the one hand it gives access to the tree structure in which all accessible objects are organized. Each node in
  * this tree supports this interface. On the other hand it gives access to objects that expose the represented content. That are role, state, name,
  * description, and relations to other objects. Take an OK button of a dialog as an example. Its role is AccessibleRole::BUTTON, its name is "OK", and
  * its description is something like "Accepts all changes made in the dialog".
  * @since OOo 1.1.2
  */
trait XAccessibleContext
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Return the number of children.
    *
    * Returns the number of accessible children of the object.
    * @returns The returned value is non-negative.
    */
  val AccessibleChildCount: scala.Double
  /**
    * Returns the object's description.
    *
    * Returns the object's localized description. The description should complement the more generic descriptions given by an object's role and name.
    * @returns The returned string is the object's localized description.
    */
  val AccessibleDescription: java.lang.String
  /**
    * Returns the index of this object in its accessible parent.
    *
    * If you call getAccessibeChild on the object's parent with the index returned by this function you get a reference to this object.
    * @returns The returned index is zero based.
    */
  val AccessibleIndexInParent: scala.Double
  /**
    * Return the object's localized name.
    *
    * See {@link XAccessibleContext.getAccessibleRole()} 's documentation for the relation between an object's name and role. Names should be unique, at
    * least between children of the same parent, although the uniqueness is neither enforced nor used inside the API.
    * @returns The returned string is the object's localized name.
    */
  val AccessibleName: java.lang.String
  /**
    * Returns the parent of this object.
    *
    * This function may be called for every node, including the root node, of the accessible tree.
    * @returns The returned reference points to a valid object for all but the root node. If called for the root node an empty reference is returned.
    */
  val AccessibleParent: XAccessible
  /**
    * Returns the set of relations defined for this object.
    *
    * The returned set of relations is a copy of this object's relation set: changing the returned object does not change this object's relations.
    *
    * There are two ways to represent an empty list of relations: Return an empty reference or return a valid object that contains an empty list.
    * @returns The returned value is either an empty reference or a reference to a valid object that represents a copy of the objects list of relations.
    */
  val AccessibleRelationSet: XAccessibleRelationSet
  /**
    * Returns the role of this object.
    *
    * The role is a generic description of an objects function. The relation between role and name is similar to the relation between class and object.
    * @returns The returned value is a role defined in the enumeration {@link AccessibleRole} .
    * @see AccessibleRole for a list of the available roles.
    */
  val AccessibleRole: scala.Double
  /**
    * Returns the set of states that are currently active for this object.
    *
    * The returned state set is a copy: Changing the returned state set will not be reflected by changing the object's set of states. See the documentation
    * of {@link XAccessibleStateSet} for a description of the individual states.
    * @returns A reference to this object's state set or an empty reference if states are not supported.
    * @see XAccessibleStateSet
    */
  val AccessibleStateSet: XAccessibleStateSet
  /**
    * Returns the locale of the component.
    *
    * This locale is used for example to determine the language to use for the name and description texts.
    * @returns If this object does not have a locale, the locale of its parent is returned. If it does not have (yet) a parent it throws the exception {@link Il
    * @throws IllegalAccessibleComponentStateException when this object does not (yet) have a parent.
    */
  val Locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale
  /**
    * Returns the i-th child of this object.
    *
    * The order in which the children are enumerated is implementation dependent.
    * @param i The index may have any value. If it is outside the range from 0 to n-1, with n being the number of children as returned by {@link XAccessibleCo
    * @returns If the object has an i-th child the returned value is a reference to that child. Otherwise an empty reference is returned.
    * @throws com::sun::star::lang::IndexOutOfBoundsException If no child with the given index exists then an {@link com.sun.star.lang.IndexOutOfBoundsExceptio
    */
  def getAccessibleChild(i: scala.Double): XAccessible
  /**
    * Return the number of children.
    *
    * Returns the number of accessible children of the object.
    * @returns The returned value is non-negative.
    */
  def getAccessibleChildCount(): scala.Double
  /**
    * Returns the object's description.
    *
    * Returns the object's localized description. The description should complement the more generic descriptions given by an object's role and name.
    * @returns The returned string is the object's localized description.
    */
  def getAccessibleDescription(): java.lang.String
  /**
    * Returns the index of this object in its accessible parent.
    *
    * If you call getAccessibeChild on the object's parent with the index returned by this function you get a reference to this object.
    * @returns The returned index is zero based.
    */
  def getAccessibleIndexInParent(): scala.Double
  /**
    * Return the object's localized name.
    *
    * See {@link XAccessibleContext.getAccessibleRole()} 's documentation for the relation between an object's name and role. Names should be unique, at
    * least between children of the same parent, although the uniqueness is neither enforced nor used inside the API.
    * @returns The returned string is the object's localized name.
    */
  def getAccessibleName(): java.lang.String
  /**
    * Returns the parent of this object.
    *
    * This function may be called for every node, including the root node, of the accessible tree.
    * @returns The returned reference points to a valid object for all but the root node. If called for the root node an empty reference is returned.
    */
  def getAccessibleParent(): XAccessible
  /**
    * Returns the set of relations defined for this object.
    *
    * The returned set of relations is a copy of this object's relation set: changing the returned object does not change this object's relations.
    *
    * There are two ways to represent an empty list of relations: Return an empty reference or return a valid object that contains an empty list.
    * @returns The returned value is either an empty reference or a reference to a valid object that represents a copy of the objects list of relations.
    */
  def getAccessibleRelationSet(): XAccessibleRelationSet
  /**
    * Returns the role of this object.
    *
    * The role is a generic description of an objects function. The relation between role and name is similar to the relation between class and object.
    * @returns The returned value is a role defined in the enumeration {@link AccessibleRole} .
    * @see AccessibleRole for a list of the available roles.
    */
  def getAccessibleRole(): scala.Double
  /**
    * Returns the set of states that are currently active for this object.
    *
    * The returned state set is a copy: Changing the returned state set will not be reflected by changing the object's set of states. See the documentation
    * of {@link XAccessibleStateSet} for a description of the individual states.
    * @returns A reference to this object's state set or an empty reference if states are not supported.
    * @see XAccessibleStateSet
    */
  def getAccessibleStateSet(): XAccessibleStateSet
  /**
    * Returns the locale of the component.
    *
    * This locale is used for example to determine the language to use for the name and description texts.
    * @returns If this object does not have a locale, the locale of its parent is returned. If it does not have (yet) a parent it throws the exception {@link Il
    * @throws IllegalAccessibleComponentStateException when this object does not (yet) have a parent.
    */
  def getLocale(): activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale
}

object XAccessibleContext {
  @scala.inline
  def apply(
    AccessibleChildCount: scala.Double,
    AccessibleDescription: java.lang.String,
    AccessibleIndexInParent: scala.Double,
    AccessibleName: java.lang.String,
    AccessibleParent: XAccessible,
    AccessibleRelationSet: XAccessibleRelationSet,
    AccessibleRole: scala.Double,
    AccessibleStateSet: XAccessibleStateSet,
    Locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    acquire: js.Function0[scala.Unit],
    getAccessibleChild: js.Function1[scala.Double, XAccessible],
    getAccessibleChildCount: js.Function0[scala.Double],
    getAccessibleDescription: js.Function0[java.lang.String],
    getAccessibleIndexInParent: js.Function0[scala.Double],
    getAccessibleName: js.Function0[java.lang.String],
    getAccessibleParent: js.Function0[XAccessible],
    getAccessibleRelationSet: js.Function0[XAccessibleRelationSet],
    getAccessibleRole: js.Function0[scala.Double],
    getAccessibleStateSet: js.Function0[XAccessibleStateSet],
    getLocale: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XAccessibleContext = {
    val __obj = js.Dynamic.literal(AccessibleChildCount = AccessibleChildCount, AccessibleDescription = AccessibleDescription, AccessibleIndexInParent = AccessibleIndexInParent, AccessibleName = AccessibleName, AccessibleParent = AccessibleParent, AccessibleRelationSet = AccessibleRelationSet, AccessibleRole = AccessibleRole, AccessibleStateSet = AccessibleStateSet, Locale = Locale, acquire = acquire, getAccessibleChild = getAccessibleChild, getAccessibleChildCount = getAccessibleChildCount, getAccessibleDescription = getAccessibleDescription, getAccessibleIndexInParent = getAccessibleIndexInParent, getAccessibleName = getAccessibleName, getAccessibleParent = getAccessibleParent, getAccessibleRelationSet = getAccessibleRelationSet, getAccessibleRole = getAccessibleRole, getAccessibleStateSet = getAccessibleStateSet, getLocale = getLocale, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XAccessibleContext]
  }
}

