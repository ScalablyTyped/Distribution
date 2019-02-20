package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a service that allows to get access to a package using storage hierarchy.
  *
  * A root storage should be retrieved by using {@link StorageFactory} service. Substorages are created through {@link XStorage} interface of a parent
  * storage.
  */
trait Storage
  extends BaseStorage
     with XTransactedObject
     with XTransactionBroadcaster
     with XEncryptionProtectedSource {
  /**
    * allows to detect if the storage contains encrypted entries.
    *
    * In case it is set to `TRUE` the storage itself and/or a tree of substorages contain encrypted streams. Usually in case this property is supported the
    * implementation supports {@link XEncryptionProtectedSource} interface.
    */
  var HasEncryptedEntries: scala.Boolean
  /**
    * allows to detect if the storage contains non-encrypted entries.
    *
    * In case it is set to `TRUE` the storage itself and/or a tree of substorages contains non-encrypted streams. Usually in case this property is supported
    * the implementation supports {@link XEncryptionProtectedSource} interface.
    */
  var HasNonEncryptedEntries: scala.Boolean
  /** allows to detect whether the storage is a root one. */
  var IsRoot: scala.Boolean
  /** allows to get and set the media type of the storage. */
  var MediaType: java.lang.String
  /**
    * allows to detect whether mediatype is detected by using fallback approach.
    *
    * Can be set to true if the mediatype can not be detected in standard way, but there is a fallback solution allows to do it.
    *
    * Usually means that the document validity is questionable, although the package itself is not corrupted. The decision about document validity in this
    * case is in application hands. It is up to user of the storage to decide whether he accepts the fallback approach for an implementation of this
    * service, outputs a warning or an error.
    */
  var MediaTypeFallbackIsUsed: scala.Boolean
  /** allows to detect whether storage is open in "repair package" mode or not. */
  var RepairPackage: scala.Boolean
  /** allows to get and set the version of the format related to the MediaType. */
  var Version: java.lang.String
}

