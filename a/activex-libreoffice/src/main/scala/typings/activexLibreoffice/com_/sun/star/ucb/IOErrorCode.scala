package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.activexLibreofficeInts.`0`
import typings.activexLibreoffice.activexLibreofficeInts.`10`
import typings.activexLibreoffice.activexLibreofficeInts.`11`
import typings.activexLibreoffice.activexLibreofficeInts.`12`
import typings.activexLibreoffice.activexLibreofficeInts.`13`
import typings.activexLibreoffice.activexLibreofficeInts.`14`
import typings.activexLibreoffice.activexLibreofficeInts.`15`
import typings.activexLibreoffice.activexLibreofficeInts.`16`
import typings.activexLibreoffice.activexLibreofficeInts.`17`
import typings.activexLibreoffice.activexLibreofficeInts.`18`
import typings.activexLibreoffice.activexLibreofficeInts.`19`
import typings.activexLibreoffice.activexLibreofficeInts.`1`
import typings.activexLibreoffice.activexLibreofficeInts.`20`
import typings.activexLibreoffice.activexLibreofficeInts.`21`
import typings.activexLibreoffice.activexLibreofficeInts.`22`
import typings.activexLibreoffice.activexLibreofficeInts.`23`
import typings.activexLibreoffice.activexLibreofficeInts.`24`
import typings.activexLibreoffice.activexLibreofficeInts.`25`
import typings.activexLibreoffice.activexLibreofficeInts.`26`
import typings.activexLibreoffice.activexLibreofficeInts.`27`
import typings.activexLibreoffice.activexLibreofficeInts.`28`
import typings.activexLibreoffice.activexLibreofficeInts.`29`
import typings.activexLibreoffice.activexLibreofficeInts.`2`
import typings.activexLibreoffice.activexLibreofficeInts.`30`
import typings.activexLibreoffice.activexLibreofficeInts.`31`
import typings.activexLibreoffice.activexLibreofficeInts.`32`
import typings.activexLibreoffice.activexLibreofficeInts.`33`
import typings.activexLibreoffice.activexLibreofficeInts.`34`
import typings.activexLibreoffice.activexLibreofficeInts.`35`
import typings.activexLibreoffice.activexLibreofficeInts.`3`
import typings.activexLibreoffice.activexLibreofficeInts.`4`
import typings.activexLibreoffice.activexLibreofficeInts.`5`
import typings.activexLibreoffice.activexLibreofficeInts.`6`
import typings.activexLibreoffice.activexLibreofficeInts.`7`
import typings.activexLibreoffice.activexLibreofficeInts.`8`
import typings.activexLibreoffice.activexLibreofficeInts.`9`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Types of input/output errors.
  *
  * See {@link com.sun.star.task.InteractionHandler} for a description of what kinds of arguments {@link InteractiveAugmentedIOException} should use with
  * each of these error codes.
  */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeInts.`0`
  - typings.activexLibreoffice.activexLibreofficeInts.`1`
  - typings.activexLibreoffice.activexLibreofficeInts.`2`
  - typings.activexLibreoffice.activexLibreofficeInts.`3`
  - typings.activexLibreoffice.activexLibreofficeInts.`4`
  - typings.activexLibreoffice.activexLibreofficeInts.`5`
  - typings.activexLibreoffice.activexLibreofficeInts.`6`
  - typings.activexLibreoffice.activexLibreofficeInts.`7`
  - typings.activexLibreoffice.activexLibreofficeInts.`8`
  - typings.activexLibreoffice.activexLibreofficeInts.`9`
  - typings.activexLibreoffice.activexLibreofficeInts.`10`
  - typings.activexLibreoffice.activexLibreofficeInts.`11`
  - typings.activexLibreoffice.activexLibreofficeInts.`12`
  - typings.activexLibreoffice.activexLibreofficeInts.`13`
  - typings.activexLibreoffice.activexLibreofficeInts.`14`
  - typings.activexLibreoffice.activexLibreofficeInts.`15`
  - typings.activexLibreoffice.activexLibreofficeInts.`16`
  - typings.activexLibreoffice.activexLibreofficeInts.`17`
  - typings.activexLibreoffice.activexLibreofficeInts.`18`
  - typings.activexLibreoffice.activexLibreofficeInts.`19`
  - typings.activexLibreoffice.activexLibreofficeInts.`20`
  - typings.activexLibreoffice.activexLibreofficeInts.`21`
  - typings.activexLibreoffice.activexLibreofficeInts.`25`
  - typings.activexLibreoffice.activexLibreofficeInts.`26`
  - typings.activexLibreoffice.activexLibreofficeInts.`22`
  - typings.activexLibreoffice.activexLibreofficeInts.`23`
  - typings.activexLibreoffice.activexLibreofficeInts.`24`
  - typings.activexLibreoffice.activexLibreofficeInts.`27`
  - typings.activexLibreoffice.activexLibreofficeInts.`28`
  - typings.activexLibreoffice.activexLibreofficeInts.`29`
  - typings.activexLibreoffice.activexLibreofficeInts.`30`
  - typings.activexLibreoffice.activexLibreofficeInts.`31`
  - typings.activexLibreoffice.activexLibreofficeInts.`32`
  - typings.activexLibreoffice.activexLibreofficeInts.`33`
  - typings.activexLibreoffice.activexLibreofficeInts.`34`
  - typings.activexLibreoffice.activexLibreofficeInts.`35`
*/
trait IOErrorCode extends StObject
object IOErrorCode {
  
  /** An operation was aborted. */
  inline def ABORT: `0` = 0.asInstanceOf[`0`]
  
  /** An object cannot be accessed due to insufficient user rights. */
  inline def ACCESS_DENIED: `1` = 1.asInstanceOf[`1`]
  
  /** An object already exists. */
  inline def ALREADY_EXISTING: `2` = 2.asInstanceOf[`2`]
  
  /** A bad checksum. */
  inline def BAD_CRC: `3` = 3.asInstanceOf[`3`]
  
  /** An object could not be created. */
  inline def CANT_CREATE: `4` = 4.asInstanceOf[`4`]
  
  /** Data could not be read from a file. */
  inline def CANT_READ: `5` = 5.asInstanceOf[`5`]
  
  /** A seek operation could not be run. */
  inline def CANT_SEEK: `6` = 6.asInstanceOf[`6`]
  
  /** A tell operation could not be run. */
  inline def CANT_TELL: `7` = 7.asInstanceOf[`7`]
  
  /** Data could not be written to a file. */
  inline def CANT_WRITE: `8` = 8.asInstanceOf[`8`]
  
  /** A function is not possible because the path contains the current directory. */
  inline def CURRENT_DIRECTORY: `9` = 9.asInstanceOf[`9`]
  
  /** A device (drive) not ready. */
  inline def DEVICE_NOT_READY: `10` = 10.asInstanceOf[`10`]
  
  /** A function is not possible because the devices (drives) are not identical. */
  inline def DIFFERENT_DEVICES: `11` = 11.asInstanceOf[`11`]
  
  /** A general input/output error. */
  inline def GENERAL: `12` = 12.asInstanceOf[`12`]
  
  /** An invalid attempt was made to access an object. */
  inline def INVALID_ACCESS: `13` = 13.asInstanceOf[`13`]
  
  /** A file name contains invalid characters. */
  inline def INVALID_CHARACTER: `14` = 14.asInstanceOf[`14`]
  
  /** A specified device is invalid. */
  inline def INVALID_DEVICE: `15` = 15.asInstanceOf[`15`]
  
  /** Invalid data length. */
  inline def INVALID_LENGTH: `16` = 16.asInstanceOf[`16`]
  
  /** An operation was started with an invalid parameter. */
  inline def INVALID_PARAMETER: `17` = 17.asInstanceOf[`17`]
  
  /** An operation cannot be run on file names containing wildcards. */
  inline def IS_WILDCARD: `18` = 18.asInstanceOf[`18`]
  
  /** A locking problem. */
  inline def LOCKING_VIOLATION: `19` = 19.asInstanceOf[`19`]
  
  /** An invalid file name. */
  inline def MISPLACED_CHARACTER: `20` = 20.asInstanceOf[`20`]
  
  /** A file name is too long. */
  inline def NAME_TOO_LONG: `21` = 21.asInstanceOf[`21`]
  
  /** A nonexistent object. */
  inline def NOT_EXISTING: `22` = 22.asInstanceOf[`22`]
  
  /** The path to a file does not exist. */
  inline def NOT_EXISTING_PATH: `23` = 23.asInstanceOf[`23`]
  
  /** An action is not supported. */
  inline def NOT_SUPPORTED: `24` = 24.asInstanceOf[`24`]
  
  /** An object is not a directory. */
  inline def NO_DIRECTORY: `25` = 25.asInstanceOf[`25`]
  
  /** An object is not a file. */
  inline def NO_FILE: `26` = 26.asInstanceOf[`26`]
  
  /** No more space on a device. */
  inline def OUT_OF_DISK_SPACE: `27` = 27.asInstanceOf[`27`]
  
  /** No more file handles available. */
  inline def OUT_OF_FILE_HANDLES: `28` = 28.asInstanceOf[`28`]
  
  /** An operation could not be run due to insufficient memory. */
  inline def OUT_OF_MEMORY: `29` = 29.asInstanceOf[`29`]
  
  /** An operation is still pending. */
  inline def PENDING: `30` = 30.asInstanceOf[`30`]
  
  /** An object cannot be copied into itself. */
  inline def RECURSIVE: `31` = 31.asInstanceOf[`31`]
  
  /**
    * Unknown.
    *
    * An unknown I/O error has occurred.
    */
  inline def UNKNOWN: `32` = 32.asInstanceOf[`32`]
  
  /** A function is not possible because the object is write protected. */
  inline def WRITE_PROTECTED: `33` = 33.asInstanceOf[`33`]
  
  /** An incorrect file format. */
  inline def WRONG_FORMAT: `34` = 34.asInstanceOf[`34`]
  
  /** An incorrect file version. */
  inline def WRONG_VERSION: `35` = 35.asInstanceOf[`35`]
}
