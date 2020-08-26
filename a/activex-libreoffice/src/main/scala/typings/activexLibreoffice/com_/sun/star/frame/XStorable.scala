package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * offers a simple way to store a component to an URL.
  *
  * It is usually only useful for two cases:
  *
  *  1. Large components which are wrapped up in UNO interfaces and for which distinct filters are not available separately as components. 2. Very small
  * components for which only one or very few hard coded file format filters make sense or even exist.
  */
@js.native
trait XStorable extends XInterface {
  /**
    * After {@link XStorable.storeAsURL()} it returns the URL the object was stored to.
    * @returns the URL of the resource which is represented by this object.
    */
  val Location: String = js.native
  /**
    * After {@link XStorable.storeAsURL()} it returns the URL the object was stored to.
    * @returns the URL of the resource which is represented by this object.
    */
  def getLocation(): String = js.native
  /**
    * The object may know the location because it was loaded from there, or because it is stored there.
    * @returns `TRUE` if the object knows a location where it is persistent `FALSE` otherwise
    */
  def hasLocation(): Boolean = js.native
  /**
    * It is not possible to call {@link XStorable.store()} successfully when the data store is read-only.
    * @returns `TRUE` if the data store is readonly or opened readonly `FALSE` otherwise
    */
  def isReadonly(): Boolean = js.native
  /**
    * stores the data to the URL from which it was loaded.
    *
    * Only objects which know their locations can be stored.
    * @see XStorable.storeAsURL
    * @see XStorable.storeToURL
    * @throws com::sun::star::io::IOException if an IO error occurred during save operation (may the location is unknown)
    */
  def store(): Unit = js.native
  /**
    * stores the object's persistent data to a URL and makes this URL the new location of the object.
    *
    * This is the normal behavior for UI's "save-as" feature.
    *
    * The change of the location makes it necessary to store the document in a format that the object can load. For this reason the implementation of {@link
    * XStorable.storeAsURL()} will throw an exception if a pure export filter is used, it will accept only combined import/export filters. For such filters
    * the method {@link XStorable.storeToURL()} must be used that does not change the location of the object.
    * @param sURL specifies the new location of this component
    * @param lArguments optional parameters for saving (see {@link com.sun.star.document.MediaDescriptor} for further details)
    * @see XStorable.store
    * @see XStorable.storeToURL
    * @see com.sun.star.document.MediaDescriptor
    * @throws com::sun::star::io::IOException if an IO error occurred during save operation (may the location is unknown)
    */
  def storeAsURL(sURL: String, lArguments: SeqEquiv[PropertyValue]): Unit = js.native
  /**
    * stores the object's persistent data to a URL and continues to be a representation of the old URL.
    *
    * This is the normal behavior for UI's export feature.
    *
    * This method accepts all kinds of export filters, not only combined import/export filters because it implements an exporting capability, not a
    * persistence capability.
    * @param sURL specifies the location where to store the object
    * @param lArguments optional parameters for saving (see {@link com.sun.star.document.MediaDescriptor} for further details)
    * @see XStorable.store
    * @see XStorable.storeAsURL
    * @see com.sun.star.document.MediaDescriptor
    * @throws com::sun::star::io::IOException if an IO error occurred during save operation (may the location is unknown)
    */
  def storeToURL(sURL: String, lArguments: SeqEquiv[PropertyValue]): Unit = js.native
}

object XStorable {
  @scala.inline
  def apply(
    Location: String,
    acquire: () => Unit,
    getLocation: () => String,
    hasLocation: () => Boolean,
    isReadonly: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    store: () => Unit,
    storeAsURL: (String, SeqEquiv[PropertyValue]) => Unit,
    storeToURL: (String, SeqEquiv[PropertyValue]) => Unit
  ): XStorable = {
    val __obj = js.Dynamic.literal(Location = Location.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getLocation = js.Any.fromFunction0(getLocation), hasLocation = js.Any.fromFunction0(hasLocation), isReadonly = js.Any.fromFunction0(isReadonly), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), store = js.Any.fromFunction0(store), storeAsURL = js.Any.fromFunction2(storeAsURL), storeToURL = js.Any.fromFunction2(storeToURL))
    __obj.asInstanceOf[XStorable]
  }
  @scala.inline
  implicit class XStorableOps[Self <: XStorable] (val x: Self) extends AnyVal {
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
    def setLocation(value: String): Self = this.set("Location", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetLocation(value: () => String): Self = this.set("getLocation", js.Any.fromFunction0(value))
    @scala.inline
    def setHasLocation(value: () => Boolean): Self = this.set("hasLocation", js.Any.fromFunction0(value))
    @scala.inline
    def setIsReadonly(value: () => Boolean): Self = this.set("isReadonly", js.Any.fromFunction0(value))
    @scala.inline
    def setStore(value: () => Unit): Self = this.set("store", js.Any.fromFunction0(value))
    @scala.inline
    def setStoreAsURL(value: (String, SeqEquiv[PropertyValue]) => Unit): Self = this.set("storeAsURL", js.Any.fromFunction2(value))
    @scala.inline
    def setStoreToURL(value: (String, SeqEquiv[PropertyValue]) => Unit): Self = this.set("storeToURL", js.Any.fromFunction2(value))
  }
  
}

