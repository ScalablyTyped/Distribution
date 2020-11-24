package typings.activexLibreoffice.com_.sun.star

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object embed {
  
  /** @since LibreOffice 4.1 */
  type EmbeddedObjectCreator = typings.activexLibreoffice.com_.sun.star.embed.XEmbeddedObjectCreator
  
  /** This is a service that allows to get access to a file system folder using storage hierarchy. */
  type FileSystemStorage = typings.activexLibreoffice.com_.sun.star.embed.BaseStorage
  
  /**
    * The {@link FileSystemStorageFactory} is a service that allows to create a {@link FileSystemStorage} based on URL. The URL must point to a folder.
    *
    * In case {@link com.sun.star.lang.XSingleServiceFactory.createInstance()} call is used the result storage will be open in read-write mode based on an
    * arbitrary file system folder.
    *
    * In case {@link com.sun.star.lang.XSingleServiceFactory.createInstanceWithArguments()} call is used a sequence of the following parameters can be used:
    *
    * **parameter 1 **: specifies source of the object, it must be a string containing URL.;
    *
    * **parameter 2 **: specifies mode the storage should be open in, can take values from {@link ElementModes} constant set.;
    *
    * **parameter 3 **: allows to provide com::sun::star::document::MediaDescryptor to the storage so some parts can be used for initialization, it can be
    * for example {@link com.sun.star.task.XInteractionHandler} implementation.
    *
    *
    *
    * The parameters are optional, that means that sequence can be empty or contain only first parameter, or first and second one. In case no parameters are
    * provided the call works the same way as {@link com.sun.star.lang.XSingleServiceFactory.createInstance()} . In case only first parameter is provided,
    * the storage is opened in readonly mode.
    *
    * The opened storages can support read access in addition to specified one.
    */
  type FileSystemStorageFactory = typings.activexLibreoffice.com_.sun.star.lang.XSingleServiceFactory
  
  /** @since LibreOffice 4.1 */
  type HatchWindowFactory = typings.activexLibreoffice.com_.sun.star.embed.XHatchWindowFactory
  
  /**
    * This exception can be thrown in case a storage is invalid.
    *
    * For example in case it is broken one.
    */
  type InvalidStorageException = typings.activexLibreoffice.com_.sun.star.io.IOException
  
  /**
    * This exception can be thrown in case a linked object is misused.
    *
    * Or if embedded object is misused as a linked object.
    */
  type LinkageMisuseException = typings.activexLibreoffice.com_.sun.star.uno.Exception
  
  /** @since LibreOffice 4.1 */
  type MSOLEObjectSystemCreator = typings.activexLibreoffice.com_.sun.star.embed.XEmbedObjectClipboardCreator
  
  /**
    * This exception can be thrown in case a list of accepted verbs of states is requested and the object is in loaded state and this information can be
    * retrieved only when the object is in running state.
    *
    * This exception means that the object supports at least running state in addition to the loaded state. Other states and possible verbs can be detected
    * only after object is switched to running state.
    */
  type NeedsRunningStateException = typings.activexLibreoffice.com_.sun.star.embed.WrongStateException
  
  /** This exception can be thrown in case the object can not provide own visual area currently. */
  type NoVisualAreaSizeException = typings.activexLibreoffice.com_.sun.star.uno.Exception
  
  /** @since LibreOffice 4.1 */
  type OLEEmbeddedObjectFactory = typings.activexLibreoffice.com_.sun.star.embed.XEmbeddedObjectCreator
  
  /** @since LibreOffice 4.1 */
  type OOoEmbeddedObjectFactory = typings.activexLibreoffice.com_.sun.star.embed.XEmbeddedObjectCreator
  
  /**
    * This exception can be thrown in case container wants to avoid objects saving.
    * @see XEmbeddedClient
    */
  type ObjectSaveVetoException = typings.activexLibreoffice.com_.sun.star.uno.Exception
  
  /**
    * The {@link StorageFactory} is a service that allows to create a storage based on either stream or URL.
    *
    * In case {@link com.sun.star.lang.XSingleServiceFactory.createInstance()} call is used the result storage will be open in read-write mode based on an
    * arbitrary medium.
    *
    * In case {@link com.sun.star.lang.XSingleServiceFactory.createInstanceWithArguments()} call is used a sequence of the following parameters can be used:
    *
    * **parameter 1 **: specifies source of the object, it can be a string containing URL, an {@link com.sun.star.io.XStream} implementation or {@link
    * com.sun.star.io.XInputStream} ; in case of {@link com.sun.star.io.XStream} implementation the {@link com.sun.star.io.XSeekable} interface must be
    * supported.;
    *
    * **parameter 2 **: specifies mode the storage should be open in, can take values from {@link ElementModes} constant set.;
    *
    * **parameter 3 **: this parameter represents `any` containing a sequence of {@link com.sun.star.beans.PropertyValue} . ;  The parameter can contain
    * entries from com::sun::star::document::MediaDescryptor to transport some document info during the storage initialization, it can be for example {@link
    * com.sun.star.task.XInteractionHandler} implementation, password for the storage and repair package flag. ;  Additionally the parameter might contain
    * property with the name "StorageFormat" that can take values from {@link com.sun.star.embed.StorageFormats} . If the property is not provided a storage
    * of package format is created.
    *
    *
    *
    * The parameters are optional, that means that sequence can be empty or contain only first parameter, or first and second one. In case no parameters are
    * provided the call works the same way as {@link com.sun.star.lang.XSingleServiceFactory.createInstance()} . In case only first parameter is provided,
    * the storage is opened in readonly mode.
    *
    * The opened root storage can support read access in addition to specified one.
    */
  type StorageFactory = typings.activexLibreoffice.com_.sun.star.lang.XSingleServiceFactory
  
  /** This exception can wrap an exception thrown during {@link XStorage} methods execution. */
  type StorageWrappedTargetException = typings.activexLibreoffice.com_.sun.star.lang.WrappedTargetException
  
  /** This exception can be thrown in case the object's state does not allow to call requested functionality. */
  type WrongStateException = typings.activexLibreoffice.com_.sun.star.uno.Exception
  
  /**
    * Represents a marker for embedded OLE objects.
    * @since LibreOffice 5.2
    */
  type XEmbeddedOleObject = js.Any
}
