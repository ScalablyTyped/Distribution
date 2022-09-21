package typings.activexLibreoffice.com_.sun.star.embed

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.StringPair
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface allows to get access to relationship data.
  *
  * The relationship data is organized as a set of entries. Each of entry is represented by a set of tags, where each tag has unique for this entry name
  * and a string value. An entry must contain at least one tag named "ID", the value of this tag must be unique for the whole set of entries, this tag is
  * used as a unique identifier of an entry.
  */
trait XRelationshipAccess
  extends StObject
     with XInterface {
  
  /**
    * retrieves the sequence containing all the entries controlled by the object.
    * @returns sequence of entries, each entry is represented by sequence, each element of the sequence represents tag, {@link com.sun.star.beans.StringPair.Fir
    * @throws com::sun::star::io::IOException in case there is a problem reading the relations info
    */
  val AllRelationships: SafeArray[SafeArray[StringPair]]
  
  /**
    * allows to clear the set of entries.
    * @throws com::sun::star::io::IOException in case there is a problem reading/writing the relations info
    */
  def clearRelationships(): Unit
  
  /**
    * retrieves the sequence containing all the entries controlled by the object.
    * @returns sequence of entries, each entry is represented by sequence, each element of the sequence represents tag, {@link com.sun.star.beans.StringPair.Fir
    * @throws com::sun::star::io::IOException in case there is a problem reading the relations info
    */
  def getAllRelationships(): SafeArray[SafeArray[StringPair]]
  
  /**
    * retrieves the sequence containing all the tags from the entry with specified value of "ID" tag.
    * @param sID the value of "ID" tag
    * @returns sequence, each element of the sequence represents tag, {@link com.sun.star.beans.StringPair.First} represents the tag name and {@link com.sun.sta
    * @throws com::sun::star::container::NoSuchElementException in case there is no entry with specified tag
    * @throws com::sun::star::io::IOException in case there is a problem reading the relations info
    */
  def getRelationshipByID(sID: String): SafeArray[StringPair]
  
  /**
    * retrieves the sequence containing all the entries which "Type" tag takes the specified value.
    * @param sType specified value of "Type" tag, the parameter can contain an empty string, in this case all the entries that have empty "Type" tag or no suc
    * @returns sequence of entries, each entry is represented by sequence, each element of the sequence represents tag, {@link com.sun.star.beans.StringPair.Fir
    * @throws com::sun::star::io::IOException in case there is a problem reading the relations info
    */
  def getRelationshipsByType(sType: String): SafeArray[SafeArray[StringPair]]
  
  /**
    * retrieves the value of "Target" tag from the entry with specified "ID" tag.
    *
    * If the entry has no "Target" tag an empty string is returned.
    * @param sID the value of "ID" tag
    * @throws com::sun::star::container::NoSuchElementException in case there is no entry with specified tag
    * @throws com::sun::star::io::IOException in case there is a problem reading the relations info
    */
  def getTargetByID(sID: String): String
  
  /**
    * retrieves the value of "Type" tag from the entry with specified "ID" tag.
    *
    * If the entry has no "Type" tag an empty string is returned.
    * @param sID the value of "ID" tag
    * @throws com::sun::star::container::NoSuchElementException in case there is no entry with specified tag
    * @throws com::sun::star::io::IOException in case there is a problem reading the relations info
    */
  def getTypeByID(sID: String): String
  
  /**
    * allows to detect whether there is an entry with specified value of "ID" tag.
    * @param sID the value of "ID" tag
    * @throws com::sun::star::io::IOException in case there is a problem reading the relations info
    */
  def hasByID(sID: String): Boolean
  
  /**
    * allows to insert an entry.
    * @param sID the value of "ID" tag
    * @param aEntry a sequence, each element of the sequence represents tag, {@link com.sun.star.beans.StringPair.First} represents the tag name and {@link co
    * @param bReplace specifies whether the replacement of existing entry is allowed
    * @throws com::sun::star::io::IOException in case there is a problem reading/writing the relations info
    * @throws com::sun::star::container::ElementExistException in case an element with the specified "ID" tag exists already, and no replacement is allowed
    */
  def insertRelationshipByID(sID: String, aEntry: SeqEquiv[StringPair], bReplace: Boolean): Unit
  
  /**
    * allows to insert a set of entries
    * @param aEntries sequence of entries, each entry is represented by sequence, each element of the sequence represents tag, {@link com.sun.star.beans.Strin
    * @param bReplace specifies whether the replacement of existing entry is allowed
    * @throws com::sun::star::container::ElementExistException in case an element with the provided "ID" tag exists already, and no replacement is allowed
    * @throws com::sun::star::io::IOException in case there is a problem reading/writing the relations info
    */
  def insertRelationships(aEntries: SeqEquiv[SeqEquiv[StringPair]], bReplace: Boolean): Unit
  
  /**
    * allows to remove an entry.
    * @param sID the value of "ID" tag
    * @throws com::sun::star::container::NoSuchElementException in case there is no entry with specified tag
    * @throws com::sun::star::io::IOException in case there is a problem reading/writing the relations info
    */
  def removeRelationshipByID(sID: String): Unit
}
object XRelationshipAccess {
  
  inline def apply(
    AllRelationships: SafeArray[SafeArray[StringPair]],
    acquire: () => Unit,
    clearRelationships: () => Unit,
    getAllRelationships: () => SafeArray[SafeArray[StringPair]],
    getRelationshipByID: String => SafeArray[StringPair],
    getRelationshipsByType: String => SafeArray[SafeArray[StringPair]],
    getTargetByID: String => String,
    getTypeByID: String => String,
    hasByID: String => Boolean,
    insertRelationshipByID: (String, SeqEquiv[StringPair], Boolean) => Unit,
    insertRelationships: (SeqEquiv[SeqEquiv[StringPair]], Boolean) => Unit,
    queryInterface: `type` => Any,
    release: () => Unit,
    removeRelationshipByID: String => Unit
  ): XRelationshipAccess = {
    val __obj = js.Dynamic.literal(AllRelationships = AllRelationships.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), clearRelationships = js.Any.fromFunction0(clearRelationships), getAllRelationships = js.Any.fromFunction0(getAllRelationships), getRelationshipByID = js.Any.fromFunction1(getRelationshipByID), getRelationshipsByType = js.Any.fromFunction1(getRelationshipsByType), getTargetByID = js.Any.fromFunction1(getTargetByID), getTypeByID = js.Any.fromFunction1(getTypeByID), hasByID = js.Any.fromFunction1(hasByID), insertRelationshipByID = js.Any.fromFunction3(insertRelationshipByID), insertRelationships = js.Any.fromFunction2(insertRelationships), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeRelationshipByID = js.Any.fromFunction1(removeRelationshipByID))
    __obj.asInstanceOf[XRelationshipAccess]
  }
  
  extension [Self <: XRelationshipAccess](x: Self) {
    
    inline def setAllRelationships(value: SafeArray[SafeArray[StringPair]]): Self = StObject.set(x, "AllRelationships", value.asInstanceOf[js.Any])
    
    inline def setClearRelationships(value: () => Unit): Self = StObject.set(x, "clearRelationships", js.Any.fromFunction0(value))
    
    inline def setGetAllRelationships(value: () => SafeArray[SafeArray[StringPair]]): Self = StObject.set(x, "getAllRelationships", js.Any.fromFunction0(value))
    
    inline def setGetRelationshipByID(value: String => SafeArray[StringPair]): Self = StObject.set(x, "getRelationshipByID", js.Any.fromFunction1(value))
    
    inline def setGetRelationshipsByType(value: String => SafeArray[SafeArray[StringPair]]): Self = StObject.set(x, "getRelationshipsByType", js.Any.fromFunction1(value))
    
    inline def setGetTargetByID(value: String => String): Self = StObject.set(x, "getTargetByID", js.Any.fromFunction1(value))
    
    inline def setGetTypeByID(value: String => String): Self = StObject.set(x, "getTypeByID", js.Any.fromFunction1(value))
    
    inline def setHasByID(value: String => Boolean): Self = StObject.set(x, "hasByID", js.Any.fromFunction1(value))
    
    inline def setInsertRelationshipByID(value: (String, SeqEquiv[StringPair], Boolean) => Unit): Self = StObject.set(x, "insertRelationshipByID", js.Any.fromFunction3(value))
    
    inline def setInsertRelationships(value: (SeqEquiv[SeqEquiv[StringPair]], Boolean) => Unit): Self = StObject.set(x, "insertRelationships", js.Any.fromFunction2(value))
    
    inline def setRemoveRelationshipByID(value: String => Unit): Self = StObject.set(x, "removeRelationshipByID", js.Any.fromFunction1(value))
  }
}
