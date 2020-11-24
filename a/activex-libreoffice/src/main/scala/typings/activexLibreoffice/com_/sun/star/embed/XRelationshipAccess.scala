package typings.activexLibreoffice.com_.sun.star.embed

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.StringPair
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface allows to get access to relationship data.
  *
  * The relationship data is organized as a set of entries. Each of entry is represented by a set of tags, where each tag has unique for this entry name
  * and a string value. An entry must contain at least one tag named "ID", the value of this tag must be unique for the whole set of entries, this tag is
  * used as a unique identifier of an entry.
  */
@js.native
trait XRelationshipAccess extends XInterface {
  
  /**
    * retrieves the sequence containing all the entries controlled by the object.
    * @returns sequence of entries, each entry is represented by sequence, each element of the sequence represents tag, {@link com.sun.star.beans.StringPair.Fir
    * @throws com::sun::star::io::IOException in case there is a problem reading the relations info
    */
  val AllRelationships: SafeArray[SafeArray[StringPair]] = js.native
  
  /**
    * allows to clear the set of entries.
    * @throws com::sun::star::io::IOException in case there is a problem reading/writing the relations info
    */
  def clearRelationships(): Unit = js.native
  
  /**
    * retrieves the sequence containing all the entries controlled by the object.
    * @returns sequence of entries, each entry is represented by sequence, each element of the sequence represents tag, {@link com.sun.star.beans.StringPair.Fir
    * @throws com::sun::star::io::IOException in case there is a problem reading the relations info
    */
  def getAllRelationships(): SafeArray[SafeArray[StringPair]] = js.native
  
  /**
    * retrieves the sequence containing all the tags from the entry with specified value of "ID" tag.
    * @param sID the value of "ID" tag
    * @returns sequence, each element of the sequence represents tag, {@link com.sun.star.beans.StringPair.First} represents the tag name and {@link com.sun.sta
    * @throws com::sun::star::container::NoSuchElementException in case there is no entry with specified tag
    * @throws com::sun::star::io::IOException in case there is a problem reading the relations info
    */
  def getRelationshipByID(sID: String): SafeArray[StringPair] = js.native
  
  /**
    * retrieves the sequence containing all the entries which "Type" tag takes the specified value.
    * @param sType specified value of "Type" tag, the parameter can contain an empty string, in this case all the entries that have empty "Type" tag or no suc
    * @returns sequence of entries, each entry is represented by sequence, each element of the sequence represents tag, {@link com.sun.star.beans.StringPair.Fir
    * @throws com::sun::star::io::IOException in case there is a problem reading the relations info
    */
  def getRelationshipsByType(sType: String): SafeArray[SafeArray[StringPair]] = js.native
  
  /**
    * retrieves the value of "Target" tag from the entry with specified "ID" tag.
    *
    * If the entry has no "Target" tag an empty string is returned.
    * @param sID the value of "ID" tag
    * @throws com::sun::star::container::NoSuchElementException in case there is no entry with specified tag
    * @throws com::sun::star::io::IOException in case there is a problem reading the relations info
    */
  def getTargetByID(sID: String): String = js.native
  
  /**
    * retrieves the value of "Type" tag from the entry with specified "ID" tag.
    *
    * If the entry has no "Type" tag an empty string is returned.
    * @param sID the value of "ID" tag
    * @throws com::sun::star::container::NoSuchElementException in case there is no entry with specified tag
    * @throws com::sun::star::io::IOException in case there is a problem reading the relations info
    */
  def getTypeByID(sID: String): String = js.native
  
  /**
    * allows to detect whether there is an entry with specified value of "ID" tag.
    * @param sID the value of "ID" tag
    * @throws com::sun::star::io::IOException in case there is a problem reading the relations info
    */
  def hasByID(sID: String): Boolean = js.native
  
  /**
    * allows to insert an entry.
    * @param sID the value of "ID" tag
    * @param aEntry a sequence, each element of the sequence represents tag, {@link com.sun.star.beans.StringPair.First} represents the tag name and {@link co
    * @param bReplace specifies whether the replacement of existing entry is allowed
    * @throws com::sun::star::io::IOException in case there is a problem reading/writing the relations info
    * @throws com::sun::star::container::ElementExistException in case an element with the specified "ID" tag exists already, and no replacement is allowed
    */
  def insertRelationshipByID(sID: String, aEntry: SeqEquiv[StringPair], bReplace: Boolean): Unit = js.native
  
  /**
    * allows to insert a set of entries
    * @param aEntries sequence of entries, each entry is represented by sequence, each element of the sequence represents tag, {@link com.sun.star.beans.Strin
    * @param bReplace specifies whether the replacement of existing entry is allowed
    * @throws com::sun::star::container::ElementExistException in case an element with the provided "ID" tag exists already, and no replacement is allowed
    * @throws com::sun::star::io::IOException in case there is a problem reading/writing the relations info
    */
  def insertRelationships(aEntries: SeqEquiv[SeqEquiv[StringPair]], bReplace: Boolean): Unit = js.native
  
  /**
    * allows to remove an entry.
    * @param sID the value of "ID" tag
    * @throws com::sun::star::container::NoSuchElementException in case there is no entry with specified tag
    * @throws com::sun::star::io::IOException in case there is a problem reading/writing the relations info
    */
  def removeRelationshipByID(sID: String): Unit = js.native
}
object XRelationshipAccess {
  
  @scala.inline
  def apply(
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
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeRelationshipByID: String => Unit
  ): XRelationshipAccess = {
    val __obj = js.Dynamic.literal(AllRelationships = AllRelationships.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), clearRelationships = js.Any.fromFunction0(clearRelationships), getAllRelationships = js.Any.fromFunction0(getAllRelationships), getRelationshipByID = js.Any.fromFunction1(getRelationshipByID), getRelationshipsByType = js.Any.fromFunction1(getRelationshipsByType), getTargetByID = js.Any.fromFunction1(getTargetByID), getTypeByID = js.Any.fromFunction1(getTypeByID), hasByID = js.Any.fromFunction1(hasByID), insertRelationshipByID = js.Any.fromFunction3(insertRelationshipByID), insertRelationships = js.Any.fromFunction2(insertRelationships), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeRelationshipByID = js.Any.fromFunction1(removeRelationshipByID))
    __obj.asInstanceOf[XRelationshipAccess]
  }
  
  @scala.inline
  implicit class XRelationshipAccessOps[Self <: XRelationshipAccess] (val x: Self) extends AnyVal {
    
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
    def setAllRelationships(value: SafeArray[SafeArray[StringPair]]): Self = this.set("AllRelationships", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearRelationships(value: () => Unit): Self = this.set("clearRelationships", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAllRelationships(value: () => SafeArray[SafeArray[StringPair]]): Self = this.set("getAllRelationships", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRelationshipByID(value: String => SafeArray[StringPair]): Self = this.set("getRelationshipByID", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetRelationshipsByType(value: String => SafeArray[SafeArray[StringPair]]): Self = this.set("getRelationshipsByType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetTargetByID(value: String => String): Self = this.set("getTargetByID", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetTypeByID(value: String => String): Self = this.set("getTypeByID", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHasByID(value: String => Boolean): Self = this.set("hasByID", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInsertRelationshipByID(value: (String, SeqEquiv[StringPair], Boolean) => Unit): Self = this.set("insertRelationshipByID", js.Any.fromFunction3(value))
    
    @scala.inline
    def setInsertRelationships(value: (SeqEquiv[SeqEquiv[StringPair]], Boolean) => Unit): Self = this.set("insertRelationships", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemoveRelationshipByID(value: String => Unit): Self = this.set("removeRelationshipByID", js.Any.fromFunction1(value))
  }
}
