package typings.activexLibreoffice.com_.sun.star.accessibility

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Implement this interface to represent a selection of accessible objects.
  *
  * This interface is the standard mechanism to obtain and modify the currently selected children. Every object that has children that can be selected
  * should support this interface.
  *
  * The {@link XAccessibleSelection} interface has to be implemented in conjunction with the {@link XAccessibleContext} interface that provides the
  * children on which the first operates.
  *
  * It depends on the class implementing this interface, whether it supports single or multi selection.
  * @since OOo 1.1.2
  */
trait XAccessibleSelection
  extends StObject
     with XInterface {
  
  /**
    * Returns the number of {@link Accessible} children that are currently selected.
    *
    * This number specifies the valid interval of indices that can be used as arguments for the methods XAccessibleSelection::getSelectedChild() and
    * XAccessibleSelection::deselectSelectedChild().
    * @returns Returns the number of selected children of this object or 0 if no child is selected.
    */
  val SelectedAccessibleChildCount: Double
  
  /** Clears the selection, so that no children of the object are selected. */
  def clearAccessibleSelection(): Unit
  
  /**
    * Removes the specified child from the set of this object's selected children. Note that not all applications support deselection: calls to this method
    * may be silently ignored.
    * @param nChildIndex This index refers to all children not just the selected ones. If the specified child is not selected or it can not be deselected for
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the given index does not lie in the valid range of 0 up to, but not including, the result of {
    */
  def deselectAccessibleChild(nChildIndex: Double): Unit
  
  /**
    * Returns the specified selected {@link Accessible} child.
    * @param nSelectedChildIndex This index refers only to the selected children, not to all the children of this object. Even if all children are selected, t
    * @returns If the index is valid, i.e. not negative and lower than the number of selected children, then a valid reference to the corresponding {@link XAcce
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the given index does not lie in the valid range of 0 up to the result of XAccessibleRelationSe
    */
  def getSelectedAccessibleChild(nSelectedChildIndex: Double): XAccessible
  
  /**
    * Returns the number of {@link Accessible} children that are currently selected.
    *
    * This number specifies the valid interval of indices that can be used as arguments for the methods XAccessibleSelection::getSelectedChild() and
    * XAccessibleSelection::deselectSelectedChild().
    * @returns Returns the number of selected children of this object or 0 if no child is selected.
    */
  def getSelectedAccessibleChildCount(): Double
  
  /**
    * Determines if the specified child of this object is selected.
    * @param nChildIndex Index of the child for which to detect whether it is selected. This index refers to all the children of this object.
    * @returns Returns `TRUE` if the specified child is selected and `FALSE` if it is not selected.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the given index does not lie in the valid range of 0 up to the result of {@link XAccessibleCon
    */
  def isAccessibleChildSelected(nChildIndex: Double): Boolean
  
  /**
    * Selects the specified {@link Accessible} child of the object.
    *
    * Depending on the implementing class the child is added to the current set a selected children (multi selection) or a previously selected child is
    * deselected first (single selection).
    * @param nChildIndex Index of the child which is to add to the selection. This index refers to all the children of this object.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the given index does not lie in the valid range of 0 up to the result of {@link XAccessibleCon
    */
  def selectAccessibleChild(nChildIndex: Double): Unit
  
  /**
    * Select all children.
    *
    * Causes every child of the object to be selected if the object supports multiple selections. If multiple selection is not supported then the first
    * child, if it exists, is selected and all other children are deselected.
    */
  def selectAllAccessibleChildren(): Unit
}
object XAccessibleSelection {
  
  inline def apply(
    SelectedAccessibleChildCount: Double,
    acquire: () => Unit,
    clearAccessibleSelection: () => Unit,
    deselectAccessibleChild: Double => Unit,
    getSelectedAccessibleChild: Double => XAccessible,
    getSelectedAccessibleChildCount: () => Double,
    isAccessibleChildSelected: Double => Boolean,
    queryInterface: `type` => Any,
    release: () => Unit,
    selectAccessibleChild: Double => Unit,
    selectAllAccessibleChildren: () => Unit
  ): XAccessibleSelection = {
    val __obj = js.Dynamic.literal(SelectedAccessibleChildCount = SelectedAccessibleChildCount.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), clearAccessibleSelection = js.Any.fromFunction0(clearAccessibleSelection), deselectAccessibleChild = js.Any.fromFunction1(deselectAccessibleChild), getSelectedAccessibleChild = js.Any.fromFunction1(getSelectedAccessibleChild), getSelectedAccessibleChildCount = js.Any.fromFunction0(getSelectedAccessibleChildCount), isAccessibleChildSelected = js.Any.fromFunction1(isAccessibleChildSelected), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), selectAccessibleChild = js.Any.fromFunction1(selectAccessibleChild), selectAllAccessibleChildren = js.Any.fromFunction0(selectAllAccessibleChildren))
    __obj.asInstanceOf[XAccessibleSelection]
  }
  
  extension [Self <: XAccessibleSelection](x: Self) {
    
    inline def setClearAccessibleSelection(value: () => Unit): Self = StObject.set(x, "clearAccessibleSelection", js.Any.fromFunction0(value))
    
    inline def setDeselectAccessibleChild(value: Double => Unit): Self = StObject.set(x, "deselectAccessibleChild", js.Any.fromFunction1(value))
    
    inline def setGetSelectedAccessibleChild(value: Double => XAccessible): Self = StObject.set(x, "getSelectedAccessibleChild", js.Any.fromFunction1(value))
    
    inline def setGetSelectedAccessibleChildCount(value: () => Double): Self = StObject.set(x, "getSelectedAccessibleChildCount", js.Any.fromFunction0(value))
    
    inline def setIsAccessibleChildSelected(value: Double => Boolean): Self = StObject.set(x, "isAccessibleChildSelected", js.Any.fromFunction1(value))
    
    inline def setSelectAccessibleChild(value: Double => Unit): Self = StObject.set(x, "selectAccessibleChild", js.Any.fromFunction1(value))
    
    inline def setSelectAllAccessibleChildren(value: () => Unit): Self = StObject.set(x, "selectAllAccessibleChildren", js.Any.fromFunction0(value))
    
    inline def setSelectedAccessibleChildCount(value: Double): Self = StObject.set(x, "SelectedAccessibleChildCount", value.asInstanceOf[js.Any])
  }
}
