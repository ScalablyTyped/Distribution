package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.activexLibreofficeNumbers.`0`
import typings.activexLibreoffice.activexLibreofficeNumbers.`10`
import typings.activexLibreoffice.activexLibreofficeNumbers.`11`
import typings.activexLibreoffice.activexLibreofficeNumbers.`12`
import typings.activexLibreoffice.activexLibreofficeNumbers.`13`
import typings.activexLibreoffice.activexLibreofficeNumbers.`14`
import typings.activexLibreoffice.activexLibreofficeNumbers.`15`
import typings.activexLibreoffice.activexLibreofficeNumbers.`16`
import typings.activexLibreoffice.activexLibreofficeNumbers.`17`
import typings.activexLibreoffice.activexLibreofficeNumbers.`18`
import typings.activexLibreoffice.activexLibreofficeNumbers.`19`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1`
import typings.activexLibreoffice.activexLibreofficeNumbers.`20`
import typings.activexLibreoffice.activexLibreofficeNumbers.`21`
import typings.activexLibreoffice.activexLibreofficeNumbers.`22`
import typings.activexLibreoffice.activexLibreofficeNumbers.`23`
import typings.activexLibreoffice.activexLibreofficeNumbers.`24`
import typings.activexLibreoffice.activexLibreofficeNumbers.`25`
import typings.activexLibreoffice.activexLibreofficeNumbers.`26`
import typings.activexLibreoffice.activexLibreofficeNumbers.`27`
import typings.activexLibreoffice.activexLibreofficeNumbers.`28`
import typings.activexLibreoffice.activexLibreofficeNumbers.`29`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2`
import typings.activexLibreoffice.activexLibreofficeNumbers.`30`
import typings.activexLibreoffice.activexLibreofficeNumbers.`31`
import typings.activexLibreoffice.activexLibreofficeNumbers.`32`
import typings.activexLibreoffice.activexLibreofficeNumbers.`33`
import typings.activexLibreoffice.activexLibreofficeNumbers.`34`
import typings.activexLibreoffice.activexLibreofficeNumbers.`35`
import typings.activexLibreoffice.activexLibreofficeNumbers.`3`
import typings.activexLibreoffice.activexLibreofficeNumbers.`4`
import typings.activexLibreoffice.activexLibreofficeNumbers.`5`
import typings.activexLibreoffice.activexLibreofficeNumbers.`6`
import typings.activexLibreoffice.activexLibreofficeNumbers.`7`
import typings.activexLibreoffice.activexLibreofficeNumbers.`8`
import typings.activexLibreoffice.activexLibreofficeNumbers.`9`
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
  - typings.activexLibreoffice.activexLibreofficeNumbers.`0`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`1`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`2`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`3`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`4`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`5`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`6`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`7`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`8`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`9`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`10`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`11`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`12`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`13`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`14`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`15`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`16`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`17`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`18`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`19`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`20`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`21`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`25`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`26`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`22`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`23`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`24`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`27`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`28`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`29`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`30`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`31`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`32`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`33`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`34`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`35`
*/
trait IOErrorCode extends StObject
object IOErrorCode {
  
  /** An operation was aborted. */
  @scala.inline
  def ABORT: `0` = 0.asInstanceOf[`0`]
  
  /** An object cannot be accessed due to insufficient user rights. */
  @scala.inline
  def ACCESS_DENIED: `1` = 1.asInstanceOf[`1`]
  
  /** An object already exists. */
  @scala.inline
  def ALREADY_EXISTING: `2` = 2.asInstanceOf[`2`]
  
  /** A bad checksum. */
  @scala.inline
  def BAD_CRC: `3` = 3.asInstanceOf[`3`]
  
  /** An object could not be created. */
  @scala.inline
  def CANT_CREATE: `4` = 4.asInstanceOf[`4`]
  
  /** Data could not be read from a file. */
  @scala.inline
  def CANT_READ: `5` = 5.asInstanceOf[`5`]
  
  /** A seek operation could not be run. */
  @scala.inline
  def CANT_SEEK: `6` = 6.asInstanceOf[`6`]
  
  /** A tell operation could not be run. */
  @scala.inline
  def CANT_TELL: `7` = 7.asInstanceOf[`7`]
  
  /** Data could not be written to a file. */
  @scala.inline
  def CANT_WRITE: `8` = 8.asInstanceOf[`8`]
  
  /** A function is not possible because the path contains the current directory. */
  @scala.inline
  def CURRENT_DIRECTORY: `9` = 9.asInstanceOf[`9`]
  
  /** A device (drive) not ready. */
  @scala.inline
  def DEVICE_NOT_READY: `10` = 10.asInstanceOf[`10`]
  
  /** A function is not possible because the devices (drives) are not identical. */
  @scala.inline
  def DIFFERENT_DEVICES: `11` = 11.asInstanceOf[`11`]
  
  /** A general input/output error. */
  @scala.inline
  def GENERAL: `12` = 12.asInstanceOf[`12`]
  
  /** An invalid attempt was made to access an object. */
  @scala.inline
  def INVALID_ACCESS: `13` = 13.asInstanceOf[`13`]
  
  /** A file name contains invalid characters. */
  @scala.inline
  def INVALID_CHARACTER: `14` = 14.asInstanceOf[`14`]
  
  /** A specified device is invalid. */
  @scala.inline
  def INVALID_DEVICE: `15` = 15.asInstanceOf[`15`]
  
  /** Invalid data length. */
  @scala.inline
  def INVALID_LENGTH: `16` = 16.asInstanceOf[`16`]
  
  /** An operation was started with an invalid parameter. */
  @scala.inline
  def INVALID_PARAMETER: `17` = 17.asInstanceOf[`17`]
  
  /** An operation cannot be run on file names containing wildcards. */
  @scala.inline
  def IS_WILDCARD: `18` = 18.asInstanceOf[`18`]
  
  /** A locking problem. */
  @scala.inline
  def LOCKING_VIOLATION: `19` = 19.asInstanceOf[`19`]
  
  /** An invalid file name. */
  @scala.inline
  def MISPLACED_CHARACTER: `20` = 20.asInstanceOf[`20`]
  
  /** A file name is too long. */
  @scala.inline
  def NAME_TOO_LONG: `21` = 21.asInstanceOf[`21`]
  
  /** A nonexistent object. */
  @scala.inline
  def NOT_EXISTING: `22` = 22.asInstanceOf[`22`]
  
  /** The path to a file does not exist. */
  @scala.inline
  def NOT_EXISTING_PATH: `23` = 23.asInstanceOf[`23`]
  
  /** An action is not supported. */
  @scala.inline
  def NOT_SUPPORTED: `24` = 24.asInstanceOf[`24`]
  
  /** An object is not a directory. */
  @scala.inline
  def NO_DIRECTORY: `25` = 25.asInstanceOf[`25`]
  
  /** An object is not a file. */
  @scala.inline
  def NO_FILE: `26` = 26.asInstanceOf[`26`]
  
  /** No more space on a device. */
  @scala.inline
  def OUT_OF_DISK_SPACE: `27` = 27.asInstanceOf[`27`]
  
  /** No more file handles available. */
  @scala.inline
  def OUT_OF_FILE_HANDLES: `28` = 28.asInstanceOf[`28`]
  
  /** An operation could not be run due to insufficient memory. */
  @scala.inline
  def OUT_OF_MEMORY: `29` = 29.asInstanceOf[`29`]
  
  /** An operation is still pending. */
  @scala.inline
  def PENDING: `30` = 30.asInstanceOf[`30`]
  
  /** An object cannot be copied into itself. */
  @scala.inline
  def RECURSIVE: `31` = 31.asInstanceOf[`31`]
  
  /**
    * Unknown.
    *
    * An unknown I/O error has occurred.
    */
  @scala.inline
  def UNKNOWN: `32` = 32.asInstanceOf[`32`]
  
  /** A function is not possible because the object is write protected. */
  @scala.inline
  def WRITE_PROTECTED: `33` = 33.asInstanceOf[`33`]
  
  /** An incorrect file format. */
  @scala.inline
  def WRONG_FORMAT: `34` = 34.asInstanceOf[`34`]
  
  /** An incorrect file version. */
  @scala.inline
  def WRONG_VERSION: `35` = 35.asInstanceOf[`35`]
}
