package typings.activexLibreoffice.com_.sun.star.embed

import typings.activexLibreoffice.com_.sun.star.frame.XDispatchProviderInterceptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes properties of an embedded object
  *
  * This service may be represented by a com::sun::star::beansPropertyValue[]. Such descriptors will be passed to different functions, included into
  * possible load/save processes. Every member of such process can use this descriptor and may change it to actualize the information about the object. So
  * this descriptor should be used as an in/out parameter.
  * @see com.sun.star.beans.PropertyValue
  */
trait EmbeddedObjectDescriptor extends js.Object {
  /** allows to provide a dispatch interceptor for outplace activation. */
  var OutplaceDispatchInterceptor: XDispatchProviderInterceptor
  /**
    * denotes the storage from which the embedded object is to be recovered.
    *
    * Upon activating the embedded object, it is normally loaded from a storage as denoted by the parameters to the {@link XEmbedObjectCreator} method
    * calls.
    *
    * You can pass a non- `NULL``RecoveryStorage` in the object descriptor if you wish to load the embedded object from an alternate storage.
    *
    * The object will still be based on the storage denoted in the `XEmbedObjectCreator` method call, i.e., subsequent save operations will still use that
    * storage. `RecoveryStorage` is used at loading time only, and then discarded.
    */
  var RecoveryStorage: XStorage
  /**
    * lets the graphical representation of embedded document be stored.
    *
    * Setting of this property to true tells the embedded object that controls the document to store or not to store the graphical representation of the
    * document in to the object persistence. If this property is not set the object makes the decision itself.
    */
  var StoreVisualReplacement: Boolean
}

object EmbeddedObjectDescriptor {
  @scala.inline
  def apply(
    OutplaceDispatchInterceptor: XDispatchProviderInterceptor,
    RecoveryStorage: XStorage,
    StoreVisualReplacement: Boolean
  ): EmbeddedObjectDescriptor = {
    val __obj = js.Dynamic.literal(OutplaceDispatchInterceptor = OutplaceDispatchInterceptor.asInstanceOf[js.Any], RecoveryStorage = RecoveryStorage.asInstanceOf[js.Any], StoreVisualReplacement = StoreVisualReplacement.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmbeddedObjectDescriptor]
  }
}

