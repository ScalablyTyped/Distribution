package typings.activexLibreoffice.com_.sun.star.accessibility

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
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
trait XAccessibleContext extends XInterface {
  /**
    * Return the number of children.
    *
    * Returns the number of accessible children of the object.
    * @returns The returned value is non-negative.
    */
  val AccessibleChildCount: Double
  /**
    * Returns the object's description.
    *
    * Returns the object's localized description. The description should complement the more generic descriptions given by an object's role and name.
    * @returns The returned string is the object's localized description.
    */
  val AccessibleDescription: String
  /**
    * Returns the index of this object in its accessible parent.
    *
    * If you call getAccessibeChild on the object's parent with the index returned by this function you get a reference to this object.
    * @returns The returned index is zero based.
    */
  val AccessibleIndexInParent: Double
  /**
    * Return the object's localized name.
    *
    * See {@link XAccessibleContext.getAccessibleRole()} 's documentation for the relation between an object's name and role. Names should be unique, at
    * least between children of the same parent, although the uniqueness is neither enforced nor used inside the API.
    * @returns The returned string is the object's localized name.
    */
  val AccessibleName: String
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
  val AccessibleRole: Double
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
  val Locale: typings.activexLibreoffice.com_.sun.star.lang.Locale
  /**
    * Returns the i-th child of this object.
    *
    * The order in which the children are enumerated is implementation dependent.
    * @param i The index may have any value. If it is outside the range from 0 to n-1, with n being the number of children as returned by {@link XAccessibleCo
    * @returns If the object has an i-th child the returned value is a reference to that child. Otherwise an empty reference is returned.
    * @throws com::sun::star::lang::IndexOutOfBoundsException If no child with the given index exists then an {@link com.sun.star.lang.IndexOutOfBoundsExceptio
    */
  def getAccessibleChild(i: Double): XAccessible
  /**
    * Return the number of children.
    *
    * Returns the number of accessible children of the object.
    * @returns The returned value is non-negative.
    */
  def getAccessibleChildCount(): Double
  /**
    * Returns the object's description.
    *
    * Returns the object's localized description. The description should complement the more generic descriptions given by an object's role and name.
    * @returns The returned string is the object's localized description.
    */
  def getAccessibleDescription(): String
  /**
    * Returns the index of this object in its accessible parent.
    *
    * If you call getAccessibeChild on the object's parent with the index returned by this function you get a reference to this object.
    * @returns The returned index is zero based.
    */
  def getAccessibleIndexInParent(): Double
  /**
    * Return the object's localized name.
    *
    * See {@link XAccessibleContext.getAccessibleRole()} 's documentation for the relation between an object's name and role. Names should be unique, at
    * least between children of the same parent, although the uniqueness is neither enforced nor used inside the API.
    * @returns The returned string is the object's localized name.
    */
  def getAccessibleName(): String
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
  def getAccessibleRole(): Double
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
  def getLocale(): typings.activexLibreoffice.com_.sun.star.lang.Locale
}

object XAccessibleContext {
  @scala.inline
  def apply(
    AccessibleChildCount: Double,
    AccessibleDescription: String,
    AccessibleIndexInParent: Double,
    AccessibleName: String,
    AccessibleParent: XAccessible,
    AccessibleRelationSet: XAccessibleRelationSet,
    AccessibleRole: Double,
    AccessibleStateSet: XAccessibleStateSet,
    Locale: Locale,
    acquire: () => Unit,
    getAccessibleChild: Double => XAccessible,
    getAccessibleChildCount: () => Double,
    getAccessibleDescription: () => String,
    getAccessibleIndexInParent: () => Double,
    getAccessibleName: () => String,
    getAccessibleParent: () => XAccessible,
    getAccessibleRelationSet: () => XAccessibleRelationSet,
    getAccessibleRole: () => Double,
    getAccessibleStateSet: () => XAccessibleStateSet,
    getLocale: () => Locale,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XAccessibleContext = {
    val __obj = js.Dynamic.literal(AccessibleChildCount = AccessibleChildCount.asInstanceOf[js.Any], AccessibleDescription = AccessibleDescription.asInstanceOf[js.Any], AccessibleIndexInParent = AccessibleIndexInParent.asInstanceOf[js.Any], AccessibleName = AccessibleName.asInstanceOf[js.Any], AccessibleParent = AccessibleParent.asInstanceOf[js.Any], AccessibleRelationSet = AccessibleRelationSet.asInstanceOf[js.Any], AccessibleRole = AccessibleRole.asInstanceOf[js.Any], AccessibleStateSet = AccessibleStateSet.asInstanceOf[js.Any], Locale = Locale.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getAccessibleChild = js.Any.fromFunction1(getAccessibleChild), getAccessibleChildCount = js.Any.fromFunction0(getAccessibleChildCount), getAccessibleDescription = js.Any.fromFunction0(getAccessibleDescription), getAccessibleIndexInParent = js.Any.fromFunction0(getAccessibleIndexInParent), getAccessibleName = js.Any.fromFunction0(getAccessibleName), getAccessibleParent = js.Any.fromFunction0(getAccessibleParent), getAccessibleRelationSet = js.Any.fromFunction0(getAccessibleRelationSet), getAccessibleRole = js.Any.fromFunction0(getAccessibleRole), getAccessibleStateSet = js.Any.fromFunction0(getAccessibleStateSet), getLocale = js.Any.fromFunction0(getLocale), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XAccessibleContext]
  }
}

