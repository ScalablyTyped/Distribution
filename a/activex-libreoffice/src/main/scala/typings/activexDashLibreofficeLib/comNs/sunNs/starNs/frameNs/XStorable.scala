package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

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
trait XStorable
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * After {@link XStorable.storeAsURL()} it returns the URL the object was stored to.
    * @returns the URL of the resource which is represented by this object.
    */
  val Location: java.lang.String
  /**
    * After {@link XStorable.storeAsURL()} it returns the URL the object was stored to.
    * @returns the URL of the resource which is represented by this object.
    */
  def getLocation(): java.lang.String
  /**
    * The object may know the location because it was loaded from there, or because it is stored there.
    * @returns `TRUE` if the object knows a location where it is persistent `FALSE` otherwise
    */
  def hasLocation(): scala.Boolean
  /**
    * It is not possible to call {@link XStorable.store()} successfully when the data store is read-only.
    * @returns `TRUE` if the data store is readonly or opened readonly `FALSE` otherwise
    */
  def isReadonly(): scala.Boolean
  /**
    * stores the data to the URL from which it was loaded.
    *
    * Only objects which know their locations can be stored.
    * @see XStorable.storeAsURL
    * @see XStorable.storeToURL
    * @throws com::sun::star::io::IOException if an IO error occurred during save operation (may the location is unknown)
    */
  def store(): scala.Unit
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
  def storeAsURL(
    sURL: java.lang.String,
    lArguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): scala.Unit
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
  def storeToURL(
    sURL: java.lang.String,
    lArguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): scala.Unit
}

object XStorable {
  @scala.inline
  def apply(
    Location: java.lang.String,
    acquire: js.Function0[scala.Unit],
    getLocation: js.Function0[java.lang.String],
    hasLocation: js.Function0[scala.Boolean],
    isReadonly: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    store: js.Function0[scala.Unit],
    storeAsURL: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      scala.Unit
    ],
    storeToURL: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      scala.Unit
    ]
  ): XStorable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Location")(Location)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getLocation")(getLocation)
    __obj.updateDynamic("hasLocation")(hasLocation)
    __obj.updateDynamic("isReadonly")(isReadonly)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("store")(store)
    __obj.updateDynamic("storeAsURL")(storeAsURL)
    __obj.updateDynamic("storeToURL")(storeToURL)
    __obj.asInstanceOf[XStorable]
  }
}

