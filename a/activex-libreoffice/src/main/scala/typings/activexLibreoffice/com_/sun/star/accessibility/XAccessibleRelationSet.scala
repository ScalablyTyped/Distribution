package typings.activexLibreoffice.com_.sun.star.accessibility

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Implement this interface to give access to an object's set of relations.
  *
  * Such relation are modeled with the {@link AccessibleRelation} structure. This interface is used for representing sets of relations between {@link
  * Accessible} objects. Most of the convenience methods of the corresponding AccessibleRelationSet interface of the Java Accessibility API have been
  * removed from this interface in order to clean it up. These methods are add(), addAll(), clear(), and remove(). The other methods have been renamed to
  * achieve a greater conformance with the other accessibility interfaces.
  * @since OOo 1.1.2
  */
trait XAccessibleRelationSet
  extends StObject
     with XInterface {
  
  /**
    * Returns the number of relations in this relation set.
    * @returns Returns the number of relations or zero if there are none.
    */
  val RelationCount: Double
  
  /**
    * Tests whether the relation set contains a relation matching the specified key.
    * @param aRelationType The type of relation to look for in this set of relations. This has to be one of the constants of {@link AccessibleRelationType} .
    * @returns Returns `TRUE` if there is a (at least one) relation of the given type and `FALSE` if there is no such relation in the set.
    */
  def containsRelation(aRelationType: Double): Boolean
  
  /**
    * Returns the relation of this relation set that is specified by the given index.
    * @param nIndex This index specifies the relation to return.
    * @returns For a valid index, i.e. inside the range 0 to the number of relations minus one, the returned value is the requested relation. If the index is in
    */
  def getRelation(nIndex: Double): AccessibleRelation
  
  /**
    * Retrieve and return the relation with the given relation type.
    * @param aRelationType The type of the relation to return. This has to be one of the constants of {@link AccessibleRelationType} .
    * @returns If a relation with the given type could be found than (a copy of) this relation is returned. Otherwise a relation with the type INVALID is returned.
    */
  def getRelationByType(aRelationType: Double): AccessibleRelation
  
  /**
    * Returns the number of relations in this relation set.
    * @returns Returns the number of relations or zero if there are none.
    */
  def getRelationCount(): Double
}
object XAccessibleRelationSet {
  
  inline def apply(
    RelationCount: Double,
    acquire: () => Unit,
    containsRelation: Double => Boolean,
    getRelation: Double => AccessibleRelation,
    getRelationByType: Double => AccessibleRelation,
    getRelationCount: () => Double,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XAccessibleRelationSet = {
    val __obj = js.Dynamic.literal(RelationCount = RelationCount.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), containsRelation = js.Any.fromFunction1(containsRelation), getRelation = js.Any.fromFunction1(getRelation), getRelationByType = js.Any.fromFunction1(getRelationByType), getRelationCount = js.Any.fromFunction0(getRelationCount), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XAccessibleRelationSet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XAccessibleRelationSet] (val x: Self) extends AnyVal {
    
    inline def setContainsRelation(value: Double => Boolean): Self = StObject.set(x, "containsRelation", js.Any.fromFunction1(value))
    
    inline def setGetRelation(value: Double => AccessibleRelation): Self = StObject.set(x, "getRelation", js.Any.fromFunction1(value))
    
    inline def setGetRelationByType(value: Double => AccessibleRelation): Self = StObject.set(x, "getRelationByType", js.Any.fromFunction1(value))
    
    inline def setGetRelationCount(value: () => Double): Self = StObject.set(x, "getRelationCount", js.Any.fromFunction0(value))
    
    inline def setRelationCount(value: Double): Self = StObject.set(x, "RelationCount", value.asInstanceOf[js.Any])
  }
}
